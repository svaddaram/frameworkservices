package com.cbms.dao;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.input.domain.Application;
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;
@Component
public class SynchronizerDAOImpl implements SynchronizerDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	 public void applicationServiceCreateOrUpdateApplication(Application app){
		 String ideObjID=app.getIdeOBJID();
 		for(PageLayout pgLayout:app.getIdePgLayouts()) {
 			Integer pgLayoutId=pgLayout.getIdePGLAYOUTID();
 			for(PageSection section:pgLayout.getIde_PG_SECTN()){
 				Integer sectionId=section.getIdePGSECTNID();
 				Query query = sessionFactory.getCurrentSession()
 						.createQuery("update IDE_PG_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c  where IDE_PG_SECTN_ID = :IDE_PG_SECTN_ID");
 				query.setParameter("IDE_OBJ_ID__c", ideObjID);
 				query.setParameter("IDE_PG_SECTN_ID", section.getIdePGSECTNID());
 				int result = query.executeUpdate();
 				
 				
 				
 				for(FieldLayout layout:section.getIde_field_layout()) {
 					Integer fieldLayoutId=layout.getIdeFieldLayoutId();
 					Query query1 = sessionFactory.getCurrentSession()
     						.createQuery("update IDE_SECTION_FLD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
 					query1.setParameter("IDE_FIELD_LAYOUT_ID", fieldLayoutId);
 					query1.setParameter("IDE_OBJ_ID__c", ideObjID);
 					query1.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
     				int result1 = query1.executeUpdate();
 					
 				}
 				for(SubSection subSection:section.getIdePageSubSectns()) {
 					String subSectionId=subSection.getIdePgSubSectnId();
 					Query query1 = sessionFactory.getCurrentSession()
     						.createQuery("update IDE_PG_SUB_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_PG_SUB_SECTN_ID = :IDE_PG_SUB_SECTN_ID");
 					query1.setParameter("IDE_PG_SUB_SECTN_ID", subSectionId);
 					query1.setParameter("IDE_OBJ_ID__c", ideObjID);
 					query1.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
     				int result1 = query1.executeUpdate();
 					
 					for(FieldLayout layout:subSection.getIde_field_layout()) {
 						Integer fieldLayoutId=layout.getIdeFieldLayoutId();
 						Query query2 = sessionFactory.getCurrentSession()
         						.createQuery("update IDE_FIELD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c,IDE_PG_SECTN_ID=:IDE_PG_SECTN_ID  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
 						query2.setParameter("IDE_FIELD_LAYOUT_ID",fieldLayoutId);
 						query2.setParameter("IDE_OBJ_ID__c", ideObjID);
 						query2.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
 						query2.setParameter("IDE_PG_SECTN_ID", sectionId);
         				int result2 = query2.executeUpdate();
 					}
 				}
 			}
 		}
	}
	 
	@Override
	 public void canvasServiceCreateOrUpdateApplication(Application app) {
		 String ideObjID=app.getIdeOBJID();
 		for(PageLayout pgLayout:app.getIdePgLayouts()) {
 			Integer pgLayoutId=pgLayout.getIdePGLAYOUTID();
 			for(PageSection section:pgLayout.getIde_PG_SECTN()){
 				Integer sectionId=section.getIdePGSECTNID();
 				Query query = sessionFactory.getCurrentSession()
 						.createQuery("update IDE_PG_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c  where IDE_PG_SECTN_ID = :IDE_PG_SECTN_ID");
 				query.setParameter("IDE_OBJ_ID__c", ideObjID);
 				query.setParameter("IDE_PG_SECTN_ID", section.getIdePGSECTNID());
 				 query.executeUpdate();
 				
 				
 				
 				for(FieldLayout layout:section.getIde_field_layout()) {
 					Integer fieldLayoutId=layout.getIdeFieldLayoutId();
 					Query query1 = sessionFactory.getCurrentSession()
     						.createQuery("update IDE_SECTION_FLD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
 					query1.setParameter("IDE_FIELD_LAYOUT_ID", fieldLayoutId);
 					query1.setParameter("IDE_OBJ_ID__c", ideObjID);
 					query1.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
     				query1.executeUpdate();
 					
 				}
 				for(SubSection subSection:section.getIdePageSubSectns()) {
 					String subSectionId=subSection.getIdePgSubSectnId();
 					Query query1 = sessionFactory.getCurrentSession()
     						.createQuery("update IDE_PG_SUB_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_PG_SUB_SECTN_ID = :IDE_PG_SUB_SECTN_ID");
 					query1.setParameter("IDE_PG_SUB_SECTN_ID", subSectionId);
 					query1.setParameter("IDE_OBJ_ID__c", ideObjID);
 					query1.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
     				 query1.executeUpdate();
 					
 					for(FieldLayout layout:subSection.getIde_field_layout()) {
 						Integer fieldLayoutId=layout.getIdeFieldLayoutId();
 						Query query2 = sessionFactory.getCurrentSession()
         						.createQuery("update IDE_FIELD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c,IDE_PG_SECTN_ID=:IDE_PG_SECTN_ID  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
 						query2.setParameter("IDE_FIELD_LAYOUT_ID",fieldLayoutId);
 						query2.setParameter("IDE_OBJ_ID__c", ideObjID);
 						query2.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutId);
 						query2.setParameter("IDE_PG_SECTN_ID", sectionId);
         				query2.executeUpdate();
 					}
 				}
 			}
 		}
	 }
	 
	@Override
	 public void pageSectionServiceCreateOrUpdatePageSection(PageSection obj) {
		 Integer pgLayoutID=obj.getIdePGLAYOUTID();
	    	
 		String ideObjID=null;
 		Query query1 = sessionFactory.getCurrentSession()
					.createQuery("select IDE_OBJ_ID__c from IDE_PG_LAYOUT where IDE_PG_LAYOUT_ID=:IDE_PG_LAYOUT_ID");
 		query1.setParameter("IDE_PG_LAYOUT_ID", pgLayoutID);
 		for(Iterator it=query1.iterate();it.hasNext();){
 			String row = (String) it.next();
 			 System.out.println("IDE_OBJ_ID__c: " + row);
 			 ideObjID=(String)row;
 			 }
 		
 		Integer sectionId=obj.getIdePGSECTNID();
			Query query = sessionFactory.getCurrentSession()
					.createQuery("update IDE_PG_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c  where IDE_PG_SECTN_ID = :IDE_PG_SECTN_ID");
			query.setParameter("IDE_OBJ_ID__c", ideObjID);
			query.setParameter("IDE_PG_SECTN_ID", sectionId);
			query.executeUpdate();
			
			for(FieldLayout layout:obj.getIde_field_layout()) {
				Integer fieldLayoutId=layout.getIdeFieldLayoutId();
				Query query2 = sessionFactory.getCurrentSession()
						.createQuery("update IDE_SECTION_FLD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
				query2.setParameter("IDE_FIELD_LAYOUT_ID", fieldLayoutId);
				query2.setParameter("IDE_OBJ_ID__c", ideObjID);
				query2.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutID);
				query2.executeUpdate();
				
			}
			for(SubSection subSection:obj.getIdePageSubSectns()) {
				String subSectionId=subSection.getIdePgSubSectnId();
				Query query3 = sessionFactory.getCurrentSession()
						.createQuery("update IDE_PG_SUB_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_PG_SUB_SECTN_ID = :IDE_PG_SUB_SECTN_ID");
				query3.setParameter("IDE_PG_SUB_SECTN_ID", subSectionId);
				query3.setParameter("IDE_OBJ_ID__c", ideObjID);
				query3.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutID);
				query3.executeUpdate();
				
				for(FieldLayout layout:subSection.getIde_field_layout()) {
					Integer fieldLayoutId=layout.getIdeFieldLayoutId();
					Query query2 = sessionFactory.getCurrentSession()
 						.createQuery("update IDE_FIELD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c,IDE_PG_SECTN_ID=:IDE_PG_SECTN_ID  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
					query2.setParameter("IDE_FIELD_LAYOUT_ID",fieldLayoutId);
					query2.setParameter("IDE_OBJ_ID__c", ideObjID);
					query2.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutID);
					query2.setParameter("IDE_PG_SECTN_ID", sectionId);
 				query2.executeUpdate();
				}
			}
			 
	 }
	 
	@Override
	 public void pageSubSectionServiceCreateOrUpdatePageSubSection(SubSection obj) {
 		Integer sectionID=obj.getIdePgSectnId();
 		
 		String ideObjID=null;
 		Integer pgLayoutID=null;
 		Query query1 = sessionFactory.getCurrentSession()
					.createQuery("select IDE_PG_LAYOUT_ID__c from IDE_PG_SECTN where IDE_PG_SECTN_ID=:IDE_PG_SECTN_ID");
 		query1.setParameter("IDE_PG_SECTN_ID", sectionID);
 		for(Iterator it=query1.iterate();it.hasNext();){
 			Integer row = (Integer) it.next();
			 System.out.println("IDE_OBJ_ID__c: " + row);
			 pgLayoutID=(Integer)row;
 		}
 		
 		
     	
 		Query query2 = sessionFactory.getCurrentSession()
					.createQuery("select IDE_OBJ_ID__c from IDE_PG_LAYOUT where IDE_PG_LAYOUT_ID=:IDE_PG_LAYOUT_ID");
 		query2.setParameter("IDE_PG_LAYOUT_ID", pgLayoutID);
 		for(Iterator it=query2.iterate();it.hasNext();){
 			String row = (String) it.next();
			 System.out.println("IDE_OBJ_ID__c: " + row);
			 ideObjID=(String)row;
 		}

				Query query3 = sessionFactory.getCurrentSession()
						.createQuery("update IDE_PG_SUB_SECTN set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c  where IDE_PG_SUB_SECTN_ID = :IDE_PG_SUB_SECTN_ID");
				query3.setParameter("IDE_PG_SUB_SECTN_ID", obj.getIdePgSubSectnId());
				query3.setParameter("IDE_OBJ_ID__c", ideObjID);
				query3.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutID);
				query3.executeUpdate();
				
				for(FieldLayout layout:obj.getIde_field_layout()) {
					Integer fieldLayoutId=layout.getIdeFieldLayoutId();
					Query query4 = sessionFactory.getCurrentSession()
 						.createQuery("update IDE_FIELD_LAYOUT set IDE_OBJ_ID__c = :IDE_OBJ_ID__c,IDE_PG_LAYOUT_ID__c=:IDE_PG_LAYOUT_ID__c,IDE_PG_SECTN_ID=:IDE_PG_SECTN_ID  where IDE_FIELD_LAYOUT_ID = :IDE_FIELD_LAYOUT_ID");
					query4.setParameter("IDE_FIELD_LAYOUT_ID",fieldLayoutId);
					query4.setParameter("IDE_OBJ_ID__c", ideObjID);
					query4.setParameter("IDE_PG_LAYOUT_ID__c", pgLayoutID);
					query4.setParameter("IDE_PG_SECTN_ID", sectionID);
					query4.executeUpdate();
				
			}
			
	 }
	 

}
