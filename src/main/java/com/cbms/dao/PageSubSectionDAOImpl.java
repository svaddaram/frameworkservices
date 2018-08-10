package com.cbms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.exceptionhandler.AlreadyInCanvasException;
import com.cbms.input.domain.PaginationRequest;
@Component
public class PageSubSectionDAOImpl implements PageSubSectionDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Autowired
	PageSectionDAO pageSectionDAO;
	
	@Autowired
	ApplicationDAO applicationDAO;

	@Override
	public IDE_PG_SUB_SECTN addPageSubSectionObject(IDE_PG_SUB_SECTN subSection, Integer sectionId) {
		if(sectionId!=null) {
		IDE_PG_SECTN section=pageSectionDAO.getPageSectionByID(sectionId);
		if(section!=null) {
		subSection.setIdePageSubSectns(section);
		subSection.setIDE_OBJ_ID__c(section.getIDE_OBJ_ID__c());
		subSection.setIDE_PG_LAYOUT_ID__c(subSection.getIDE_PG_LAYOUT_ID__c());
		if(section.getIDE_OBJ_ID__c()!=null) {
			applicationDAO.updateLastUpdatedDateAndTime(section.getIDE_OBJ_ID__c(), section.getUpdated_by());
		}
}
		}
		sessionFactory.getCurrentSession().saveOrUpdate(subSection);
		return subSection;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_SUB_SECTN> getAllPageSubSectionObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_PG_SUB_SECTN").list();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_SUB_SECTN> getPageSubSectionByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_PG_SUB_SECTN.class);
		//criteria.addOrder(Order.asc("systemModStamp"));
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());

		criteria.setMaxResults(request.getPageSize());

		return (List<IDE_PG_SUB_SECTN>) criteria.list();
	}

	@Override
	public IDE_PG_SUB_SECTN getPageSubSectionByID(String pgSubSectionID) {
		return (IDE_PG_SUB_SECTN) sessionFactory.getCurrentSession().get(IDE_PG_SUB_SECTN.class, pgSubSectionID);
	}

	@Override
	public void deletePageSubSectionByID(String pgSubSectionID) {
		// TODO Auto-generated method stub
		IDE_PG_SUB_SECTN subSection=getPageSubSectionByID(pgSubSectionID);
		checkIfSubSectionAddedToCanvas(subSection);
		if(subSection!=null) {
			if(subSection.getIDE_OBJ_ID__c()!=null) {
				applicationDAO.updateLastUpdatedDateAndTime(subSection.getIDE_OBJ_ID__c(), subSection.getUpdated_by());
			}
		 sessionFactory.getCurrentSession().delete(getPageSubSectionByID(pgSubSectionID));
		}
		
	}
	
	private void checkIfSubSectionAddedToCanvas(IDE_PG_SUB_SECTN subSection) {
		if (subSection!=null && subSection.getSEQ_ORD()!=null) {
			throw new AlreadyInCanvasException("SubSection has been added to canvas. Please delete the subsection in canvas and try again");
		}
	}

}
