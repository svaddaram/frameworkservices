package com.cbms.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.dao.model.heroku.IDE_REL_FLD;
import com.cbms.dao.model.heroku.IDE_SECTION_FLD_LAYOUT;
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SubSection;
import com.cbms.manager.ObjectManager;

@Component
public class PageLayoutDAOImpl implements PageLayoutDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	ApplicationDAO applicationDAO;
	
	@Autowired
	FieldLayoutDAO fieldLayoutDAO;
	
	@Autowired
	PageLayoutDAO pageLayoutDAO;
	
	@Autowired
	ObjectManager objectManager;
	

	@Override
	public IDE_PG_LAYOUT addPageLayoutObject(IDE_PG_LAYOUT pgLayout, String ideObjID) {
		
		if(ideObjID!=null) {
		IDE_OBJ obj=applicationDAO.getApplicationByID(ideObjID);
		pgLayout.setIdePgLayouts(obj);
		if(obj!=null) {
			applicationDAO.updateLastUpdatedDateAndTime(obj.getIDE_OBJ_ID(), obj.getUpdated_by(),null);
		}
		}
		sessionFactory.getCurrentSession().saveOrUpdate(pgLayout);
		return pgLayout;

	}
	
	
	
	@Override
	public String updateApplicationStatus(String ideObjID) {
		String status=null;
		System.out.println("Application iD="+ideObjID);
		IDE_OBJ obj=applicationDAO.getApplicationByID(ideObjID);
		if(obj==null) {
			return null;
		}
		if(obj.getIdePgLayouts()!=null) {
			System.out.println("size is "+obj.getIdePgLayouts().size());
			obj.setStatus("PENDING");
		for(IDE_PG_LAYOUT pageLayout:obj.getIdePgLayouts()) {
			System.out.println("set to default PUBLISHED");
			obj.setStatus("PUBLISHED");
			  if(pageLayout!=null && pageLayout.getStatus()!=null && pageLayout.getStatus().equalsIgnoreCase("PUBLISHED") ){
				  System.out.println("got published");
				  continue;
			  }else {
				  System.out.println("set to  PENDING");
				  obj.setStatus("PENDING");
				  break;
			  }
		}
		  
		}
		System.out.println("ID of Application is "+ideObjID +" and status is "+obj.getStatus());
		
		applicationDAO.addApplicationObject(obj);
		
		System.out.println("Application Status is "+status);
		return status;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_LAYOUT> getAllPageLayoutObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_PG_LAYOUT").list();
	}

	@Override
	public IDE_PG_LAYOUT getPageLayoutByID(int pgLayoutID) {
		return (IDE_PG_LAYOUT) sessionFactory.getCurrentSession().get(IDE_PG_LAYOUT.class, pgLayoutID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_LAYOUT> getPageLayoutByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_PG_LAYOUT.class);
		//criteria.addOrder(Order.asc("systemModStamp"));
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());

		criteria.setMaxResults(request.getPageSize());

		return (List<IDE_PG_LAYOUT>) criteria.list();

	}
	
	@Override
	public IDE_PG_LAYOUT getPageLayoutByName(String objectName) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_PG_LAYOUT.class);

		criteria.add(Restrictions.like("IDE_PG_LAYOUT_NM", objectName));
		return (IDE_PG_LAYOUT) criteria.list().get(0);
		}
	
	
	@Override
	public void deletePageLayoutByID(Integer pgLayoutID) {
		IDE_PG_LAYOUT pgLayout=getPageLayoutByID(pgLayoutID);
		
		if(pgLayout!=null) {
			String ideObjID=pgLayout.getIDE_OBJ_ID__c();
		 sessionFactory.getCurrentSession().delete(pgLayout);
		 if(pgLayout.getIDE_OBJ_ID__c()!=null) {
				applicationDAO.updateLastUpdatedDateAndTime(pgLayout.getIDE_OBJ_ID__c(), pgLayout.getUpdated_by(),null);
			}
		}
	}
	
	@Override
	public void prepareDBForCanvas(PageLayout pageLayout) {
		IDE_PG_LAYOUT pgLayout=pageLayoutDAO.getPageLayoutByID(pageLayout.getIdePGLAYOUTID());
		//updating status 
		
		for(IDE_PG_SECTN pgSection:pgLayout.getIdePageSectns()) {
			//pgSection.setIDE_PG_SECTN_SEQ(null);
			//pgSection.setSystemModStamp(new Timestamp(new Date().getTime()));
			for(IDE_SECTION_FLD_LAYOUT fldLayout:pgSection.getIdePgSectionLayoutList()) {
				//System.out.println("is inside====>"+pgSection.getIdePgSectionLayoutList().contains(fldLayout));
				Query query = sessionFactory.getCurrentSession().createSQLQuery(
						"delete from salesforce.IDE_FIELD_LAYOUT WHERE IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID__c");
				query.setParameter("IDE_FIELD_LAYOUT_ID__c", fldLayout.getIDE_FIELD_LAYOUT_ID());
				int result = query.executeUpdate();
			
				
				//pgSection.getIdePgSectionLayoutList().remove(fldLayout);
				//fieldLayoutDAO.deleteFieldByID(fldLayout.getIDE_FIELD_LAYOUT_ID());
				//fldLayout.setIsdeleted(true);
			}
			for(IDE_PG_SUB_SECTN subSection:pgSection.getIdePageSubSectns()) {
				//subSection.setSEQ_ORD(null);
				//subSection.setSystemModStamp(new Timestamp(new Date().getTime()));
				for(IDE_FIELD_LAYOUT fldLayout:subSection.getIdePgSubSecFldLayouts()) {
					Query query = sessionFactory.getCurrentSession().createSQLQuery(
							"delete from salesforce.IDE_FIELD_LAYOUT WHERE IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID__c");
					query.setParameter("IDE_FIELD_LAYOUT_ID__c", fldLayout.getIDE_FIELD_LAYOUT_ID());
					int result = query.executeUpdate();
					//subSection.getIdePgSubSecFldLayouts().remove(fldLayout);
					//fieldLayoutDAO.deleteFieldByID(fldLayout.getIDE_FIELD_LAYOUT_ID());
					}
			}
		}
		//pageLayoutDAO.addPageLayoutObject(pgLayout, pgLayout.getIDE_OBJ_ID__c());
	}
	
	@Override
	public void prepareCanvasAndUpdateStatus(PageLayout pageLayout) {
		IDE_PG_LAYOUT pgLayout=pageLayoutDAO.getPageLayoutByID(pageLayout.getIdePGLAYOUTID());
		
		pgLayout.setStatus(pageLayout.getStatus());
		if(null!=pgLayout.getStatus() && "PUBLISHED".equalsIgnoreCase(pgLayout.getStatus())) {
			System.out.println("Time--->");
			pgLayout.setPublishedDate(new Date());
		}else {
			pgLayout.setPublishedDate(null);
		}
		
		for(IDE_PG_SECTN pgSection:pgLayout.getIdePageSectns()) {
			pgSection.setIDE_PG_SECTN_SEQ(null);
			//pgSection.setSystemModStamp(new Timestamp(new Date().getTime()));
			for(IDE_PG_SUB_SECTN subSection:pgSection.getIdePageSubSectns()) {
				subSection.setSEQ_ORD(null);
				//subSection.set(new Timestamp(new Date().getTime()));
			
			}
		}
		pageLayoutDAO.addPageLayoutObject(pgLayout, pgLayout.getIDE_OBJ_ID__c());
	
	}
	
	
	
	
	@Override
	public IDE_PG_LAYOUT saveCanvas(PageLayout pageLayout) {
		if(pageLayout!=null && pageLayout.getRltedListIds()!=null) {
		Query queryForRelatedList = sessionFactory.getCurrentSession()
				.createQuery("update IDE_PG_LAYOUT set RLTED_LST_IDS = :RLTED_LST_IDS  where IDE_PG_LAYOUT_ID = :IDE_PG_LAYOUT_ID");
		queryForRelatedList.setParameter("IDE_PG_LAYOUT_ID", pageLayout.getIdePGLAYOUTID());
		queryForRelatedList.setParameter("RLTED_LST_IDS", pageLayout.getRltedListIds());
		int result = queryForRelatedList.executeUpdate();
		}
		for (PageSection section : pageLayout.getIde_PG_SECTN()) {
			if (section != null) {
				Query query = sessionFactory.getCurrentSession()
						.createQuery("update IDE_PG_SECTN set IDE_PG_SECTN_SEQ = :IDE_PG_SECTN_SEQ  where IDE_PG_SECTN_ID = :IDE_PG_SECTN_ID");
				query.setParameter("IDE_PG_SECTN_SEQ", section.getIdePGSECTNSEQ());
				query.setParameter("IDE_PG_SECTN_ID", section.getIdePGSECTNID());
			//	query.setTimestamp("systemModStamp", new Timestamp(new Date().getTime()));
				int result = query.executeUpdate();
				if(section.getIde_field_layout()!=null) {
				for(FieldLayout fldLayout:section.getIde_field_layout()) {
					if(fldLayout!=null && fldLayout.getOperationType().equalsIgnoreCase("DELETE")) {
												continue;
					}else {
						System.out.println("creating field"+section.getIdePGSECTNID());
						fieldLayoutDAO.addFieldObjectToSection(objectManager.createIDE_SECTION_FLD_LAYOUT(fldLayout),section.getIdePGSECTNID());
					}
				}
				}
				if(section.getIdePageSubSectns()!=null) {
				for(SubSection subSect:section.getIdePageSubSectns() ) {
					if(subSect!=null) {
						query = sessionFactory.getCurrentSession().createQuery(
								"update IDE_PG_SUB_SECTN set SEQ_ORD = :SEQ_ORD where IDE_PG_SUB_SECTN_ID = :IDE_PG_SUB_SECTN_ID ");
						query.setParameter("SEQ_ORD", subSect.getSeqOrd());
						//query.setTimestamp("systemModStamp", new Timestamp(new Date().getTime()));
								query.setParameter("IDE_PG_SUB_SECTN_ID", Integer.parseInt(subSect.getIdePgSubSectnId()));
						result = query.executeUpdate();
						System.out.println("res==>"+result);	
						for(FieldLayout fldLayout:subSect.getIde_field_layout()) {
							if(fldLayout!=null && fldLayout.getOperationType().equalsIgnoreCase("DELETE")) {
											continue;
							}else {
								System.out.println("creating field"+subSect.getIdePgSubSectnId());
								fieldLayoutDAO.addFieldObject(objectManager.createFieldLayout(fldLayout),subSect.getIdePgSubSectnId());
							}
						}
					}
				}
			}
			}
		}
		
		 IDE_PG_LAYOUT pgLayout= getPageLayoutByID(pageLayout.getIdePGLAYOUTID());
		 if(pageLayout.getIdeOBJID()!=null) {
				applicationDAO.updateLastUpdatedDateAndTime(pageLayout.getIdeOBJID(), pageLayout.getUpdatedBy(),null);
		}
		 return pgLayout;
	}
	
	@Override
	public List<IDE_REL_FLD> getRelatedList(IDE_PG_LAYOUT pgLayout) {
		StringBuilder sql = new StringBuilder();
		sql.append("select DISTINCT IDE_OBJ_ID from IDE_FLD where REFERENCE_TO_S=:apiS and TYPE_S='Lookup'");
		Query query = sessionFactory.getCurrentSession().createQuery(sql.toString());
		query.setString("apiS", pgLayout.getIdePgLayouts().getAPI_S());
		List<String> ideList = query.list();
		
		List<IDE_REL_FLD> relatedList = new ArrayList<IDE_REL_FLD>();
		
		for (int i = 0; i < ideList.size(); i++) {
			IDE_REL_FLD fldList = new IDE_REL_FLD();
			sql = new StringBuilder();
			sql.append("select API_NAME_S from IDE_FLD where  IDE_OBJ_ID= :objId and DISP_REL_LST='Y'");
			query = sessionFactory.getCurrentSession().createQuery(sql.toString());
			query.setString("objId", (String)ideList.get(i));
			List<String> resp = query.list();
			if(resp!=null && resp.size()>0) {
				fldList.setRelListFlds(resp);
			}
			
			sql = new StringBuilder();
			sql.append("select OBJECT_NAME_S,API_S from IDE_OBJ where  IDE_OBJ_ID= :objId");
			query = sessionFactory.getCurrentSession().createQuery(sql.toString());
			query.setString("objId", (String)ideList.get(i));
			Object[] objResp = (Object[])query.uniqueResult();
			if(objResp!=null && objResp.length>0) {
				fldList.setRelGrpNm("New_"+(String.valueOf(objResp[0]).split(" ")[0]).replace(" ", "_"));
				fldList.setChldRelNm(String.valueOf(objResp[1])+"."+(((String.valueOf(pgLayout.getIdePgLayouts().getOBJECT_NAME_S())).replace(" ", "_")).concat("__c")));
			}
			
			relatedList.add(fldList);
			
		}
		return relatedList;
	}
	

}