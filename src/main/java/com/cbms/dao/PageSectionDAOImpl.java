package com.cbms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.exceptionhandler.AlreadyInCanvasException;
import com.cbms.exceptionhandler.GenericException;
import com.cbms.input.domain.PaginationRequest;
@Component
public class PageSectionDAOImpl implements PageSectionDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	PageLayoutDAO pageLayoutDAO;
	
	@Autowired
	ApplicationDAO applicationDAO;

	@Override
	public IDE_PG_SECTN addPageSectionObject(IDE_PG_SECTN section,Integer pgLayoutID) {
		if(pgLayoutID!=null) {
		IDE_PG_LAYOUT pgLayout=pageLayoutDAO.getPageLayoutByID(pgLayoutID);
		if(pgLayout!=null) {
		section.setIdePageSectns(pgLayout);
		section.setIDE_OBJ_ID__c(pgLayout.getIDE_OBJ_ID__c());
		if(pgLayout.getIDE_OBJ_ID__c()!=null) {
			applicationDAO.updateLastUpdatedDateAndTime(pgLayout.getIDE_OBJ_ID__c(), pgLayout.getUpdated_by(),null);
		}
		}
		}
		sessionFactory.getCurrentSession().saveOrUpdate(section);
		return section;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_SECTN> getAllPageSectionObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_PG_SECTN").list();
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_PG_SECTN> getPageSectionByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_PG_SECTN.class);
		//criteria.addOrder(Order.asc("systemModStamp"));
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());

		criteria.setMaxResults(request.getPageSize());

		return (List<IDE_PG_SECTN>) criteria.list();
	}

	@Override
	public IDE_PG_SECTN getPageSectionByID(int pgSectionID) {
		return (IDE_PG_SECTN) sessionFactory.getCurrentSession().get(IDE_PG_SECTN.class, pgSectionID);
}

	@Override
	public void deletePageSectionByID(Integer pgSectionID) {
		IDE_PG_SECTN section=getPageSectionByID(pgSectionID);
		checkIfSectionAddedToCanvas(section);
		
		
		if(section!=null) {
			if(section.getIDE_OBJ_ID__c()!=null) {
				applicationDAO.updateLastUpdatedDateAndTime(section.getIDE_OBJ_ID__c(), section.getUpdated_by());
			}
		 sessionFactory.getCurrentSession().delete(section);
		 
		}
			
	}

	private void checkIfSectionAddedToCanvas(IDE_PG_SECTN section) {
		/*if(section!=null && section.getIdePgSectionLayoutList()!=null && section.getIdePgSectionLayoutList().size()>0) {
			throw new AlreadyInCanvasException("Section has been added to canvas");
		}else if(section!=null && section.getIdePageSubSectns()!=null && section.getIdePageSubSectns().size()>0) {
			for( IDE_PG_SUB_SECTN subSection:section.getIdePageSubSectns()) {
				if(subSection!=null && subSection.getIdePgSubSecFldLayouts()!=null && subSection.getIdePgSubSecFldLayouts().size()>0) {
					throw new AlreadyInCanvasException("Section has been added to canvas. Please delete the section in canvas and try again");
				}
			}
		}*/
		
		if(section!=null && section.getIDE_PG_SECTN_SEQ()!=null) {
			throw new AlreadyInCanvasException("Section has been added to canvas. Please delete the section in canvas and try again");
		}
	}

}
