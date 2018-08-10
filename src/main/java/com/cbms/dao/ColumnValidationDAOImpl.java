package com.cbms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_COL_VALIDATION;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.input.domain.PaginationRequest;
@Component
public class ColumnValidationDAOImpl implements ColumnValidationDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	PageLayoutDAO pageLayoutDAO;
	
	@Autowired
	ApplicationDAO applicationDAO;

	@Override
	public IDE_COL_VALIDATION addColumnValidationObject(IDE_COL_VALIDATION colValidation, Integer pageLayoutID) {
		if(pageLayoutID!=null) {
			IDE_PG_LAYOUT pgLayout=pageLayoutDAO.getPageLayoutByID(pageLayoutID);
			colValidation.setIdeColValidations(pgLayout);
			updateDateandUpdatedBy(colValidation, pgLayout);
			}
			sessionFactory.getCurrentSession().saveOrUpdate(colValidation);
			return colValidation;
	}

	private void updateDateandUpdatedBy(IDE_COL_VALIDATION colValidation, IDE_PG_LAYOUT pgLayout) {
		if(pgLayout!=null) {
			updateDateandUpdatedBy(pgLayout.getIDE_OBJ_ID__c(), colValidation.getUpdated_by());
		}
	}
	
	private void updateDateandUpdatedBy(String ide_obj_id,String updatedBy) {
		applicationDAO.updateLastUpdatedDateAndTime(ide_obj_id, updatedBy);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_COL_VALIDATION> getAllColumnValidationObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_COL_VALIDATION").list();
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_COL_VALIDATION> getColumnValidationByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_COL_VALIDATION.class);
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());
		criteria.setMaxResults(request.getPageSize());
		criteria.addOrder(Order.desc("systemModStamp"));
		return (List<IDE_COL_VALIDATION>) criteria.list();
	}

	@Override
	public IDE_COL_VALIDATION getColumnValidationByID(int columnValidationID) {
		return (IDE_COL_VALIDATION) sessionFactory.getCurrentSession().get(IDE_COL_VALIDATION.class, columnValidationID);
		
	}

	@Override
	public void deleteColumnValidationByID(Integer columnValidationID) {
		IDE_COL_VALIDATION object=getColumnValidationByID(columnValidationID);
		if(object!=null) {
		 sessionFactory.getCurrentSession().delete(object);
		 if(object.getIdeColValidations()!=null)
		 updateDateandUpdatedBy(object.getIdeColValidations().getIDE_OBJ_ID__c(), object.getUpdated_by());
		}
		
	}

}
