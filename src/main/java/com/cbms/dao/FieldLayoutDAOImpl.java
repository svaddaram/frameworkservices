package com.cbms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.dao.model.heroku.IDE_SECTION_FLD_LAYOUT;
import com.cbms.input.domain.PaginationRequest;
@Component
public class FieldLayoutDAOImpl implements FieldLayoutDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	PageSubSectionDAO pageSubSectionDAO;
	
	@Autowired
	PageSectionDAO pageSectionDAO;
	
	@Autowired
	ApplicationDAO applicationDAO;

	@Override
	public IDE_FIELD_LAYOUT addFieldObject(IDE_FIELD_LAYOUT fieldLayout, String idePgSubSectionID) {
		if(idePgSubSectionID!=null) {
		IDE_PG_SUB_SECTN subsection=pageSubSectionDAO.getPageSubSectionByID(idePgSubSectionID);
		if(subsection!=null) {
		fieldLayout.setIdePgSubSecFldLayouts(subsection);
		fieldLayout.setIDE_OBJ_ID__c(subsection.getIDE_OBJ_ID__c());
		fieldLayout.setIDE_PG_LAYOUT_ID__c(subsection.getIDE_PG_LAYOUT_ID__c());
		fieldLayout.setIDE_PG_SUB_SECTN_ID(subsection.getIDE_PG_SUB_SECTN_ID());
		if(fieldLayout.getIDE_OBJ_ID__c()!=null) {
			updateDateandUpdatedBy(fieldLayout.getIDE_OBJ_ID__c(), fieldLayout.getUpdated_by());	
		}
		
		}
		}
		sessionFactory.getCurrentSession().saveOrUpdate(fieldLayout);
		
		return fieldLayout;
	}
	
	private void updateDateandUpdatedBy(String ide_obj_id,String updatedBy) {
		applicationDAO.updateLastUpdatedDateAndTime(ide_obj_id, updatedBy);
	}
	
	@Override
	public IDE_SECTION_FLD_LAYOUT addFieldObjectToSection(IDE_SECTION_FLD_LAYOUT fieldLayout, Integer idePgSectionID) {
		if(idePgSectionID!=null) {
		IDE_PG_SECTN section=pageSectionDAO.getPageSectionByID(idePgSectionID);
		if(section!=null) {
		fieldLayout.setIdePgSectionLayoutList(section);
		fieldLayout.setIDE_OBJ_ID__c(section.getIDE_OBJ_ID__c());
		fieldLayout.setIDE_PG_LAYOUT_ID__c(section.getIDE_PG_LAYOUT_ID__c());
		if(fieldLayout.getIDE_OBJ_ID__c()!=null) {
			applicationDAO.updateLastUpdatedDateAndTime(fieldLayout.getIDE_OBJ_ID__c(), fieldLayout.getUpdated_by());	
		}
		
		}
		}
		sessionFactory.getCurrentSession().saveOrUpdate(fieldLayout);
		return fieldLayout;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_FIELD_LAYOUT> getAllFieldObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_FIELD_LAYOUT").list();
	}

	@Override
	public IDE_FIELD_LAYOUT getFieldsByFieldLabel(String objectName) {
		return (IDE_FIELD_LAYOUT) sessionFactory.getCurrentSession().get(IDE_FIELD_LAYOUT.class, objectName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_FIELD_LAYOUT> getFieldsByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_FIELD_LAYOUT.class);
		//criteria.addOrder(Order.asc("systemModStamp"));
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());

		criteria.setMaxResults(request.getPageSize());

		return (List<IDE_FIELD_LAYOUT>) criteria.list();
	}

	@Override
	public IDE_FIELD_LAYOUT getFieldtByID(int fieldSeq) {
		return (IDE_FIELD_LAYOUT) sessionFactory.getCurrentSession().get(IDE_FIELD_LAYOUT.class, fieldSeq);
	}

	@Override
	public void deleteFieldByID(Integer fieldSeq) {
		IDE_FIELD_LAYOUT fieldLayout=getFieldtByID(fieldSeq);
		if(fieldLayout.getIDE_OBJ_ID__c()!=null) {
			updateDateandUpdatedBy(fieldLayout.getIDE_OBJ_ID__c(), fieldLayout.getUpdated_by());	
		}	
		if(fieldLayout!=null) {
		 sessionFactory.getCurrentSession().delete(fieldLayout);
		
		}

	}

}
