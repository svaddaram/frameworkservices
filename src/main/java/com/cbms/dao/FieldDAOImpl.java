package com.cbms.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_FLD;
import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.exceptionhandler.AlreadyInCanvasException;
import com.cbms.input.domain.PaginationRequest;
@Component
public class FieldDAOImpl implements FieldDAO{
	
	private static final Logger logger = Logger.getLogger(FieldDAOImpl.class);
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	ApplicationDAO applicationDAO;
	
	
	private void updateDateandUpdatedBy(String ide_obj_id,String updatedBy) {
		applicationDAO.updateLastUpdatedDateAndTime(ide_obj_id, updatedBy);
	}

	@Override
	public IDE_FLD addFieldObject(IDE_FLD field, String ideObjID) {
		if(ideObjID!=null) {
			IDE_OBJ obj=applicationDAO.getApplicationByID(ideObjID);
		field.setIdeObjFlds(obj);
		updateDateandUpdatedBy(field, obj);
		}
		sessionFactory.getCurrentSession().saveOrUpdate(field);
		return field;
	}

	private void updateDateandUpdatedBy(IDE_FLD field, IDE_OBJ obj) {
		if(obj!=null && field!=null) {
			updateDateandUpdatedBy(obj.getIDE_OBJ_ID(), field.getUpdated_by());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_FLD> getAllFieldObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_FLD").list();
		
	}

	@Override
	public IDE_FLD getFieldsByFieldLabel(String objectName) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_FLD.class);

		criteria.add(Restrictions.like("FIELD_LABEL_S", objectName));
		return (IDE_FLD) criteria.list().get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_FLD> getFieldsByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_FLD.class);
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());

		criteria.setMaxResults(request.getPageSize());

		return (List<IDE_FLD>) criteria.list();

	}

	@Override
	public IDE_FLD getFieldtByID(int fieldSeq) {
		return (IDE_FLD) sessionFactory.getCurrentSession().get(IDE_FLD.class, fieldSeq);

	}

	@Override
	public void deleteFieldByID(Integer fieldSeq) {
		IDE_FLD fld=getFieldtByID(fieldSeq);
		
		
		if(fld!=null) {
			Integer fieldId=null;
			updateDateandUpdatedBy(fld, fld.getIdeObjFlds());
			
			Query query = sessionFactory.getCurrentSession().createQuery(
					"select COL_ID from IDE_FIELD_LAYOUT WHERE COL_ID = :COL_ID");
			query.setParameter("COL_ID", fld.getIDE_FLD_SEQ());
			System.out.println("field id is "+fld.getIDE_FLD_SEQ());
			System.out.println("field1--->"+fieldSeq);
			for(Iterator<Integer> it=query.iterate();it.hasNext();){
	 			Integer row = (Integer) it.next();
				 System.out.println("COL_ID: " + row);
				 fieldId=(Integer)row;
	 		}
			if(fieldId==null) {
				Query query1 = sessionFactory.getCurrentSession().createQuery(
						"select COL_ID from IDE_SECTION_FLD_LAYOUT WHERE COL_ID = :COL_ID");
				query1.setParameter("COL_ID", fld.getIDE_FLD_SEQ());
				System.out.println("field id is "+fld.getIDE_FLD_SEQ());
				System.out.println("field1--->"+fieldSeq);
				for(Iterator<Integer> it=query1.iterate();it.hasNext();){
		 			Integer row = (Integer) it.next();
					 System.out.println("COL_ID: " + row);
					 fieldId=(Integer)row;
		 		}
			}
			logger.debug("fieldID is-->" + fieldId);
			if(fieldId==null || fieldId==0) {
				sessionFactory.getCurrentSession().delete(fld);
			}else {
				throw new AlreadyInCanvasException("Field has been added to canvas. Please delete the field in canvas and try again");
			}
			
		 
		}
					
	}

}
