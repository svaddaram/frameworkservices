package com.cbms.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.input.domain.PaginationRequest;

@Component
public class ApplicationDAOImpl implements ApplicationDAO {
	
	private static final Logger logger = Logger.getLogger(ApplicationDAOImpl.class);

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public IDE_OBJ addApplicationObject(IDE_OBJ ideObj) {
		logger.debug("saving application object" );
		sessionFactory.getCurrentSession().saveOrUpdate(ideObj);
		logger.debug("done saving application object" );
		return ideObj;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_OBJ> getAllApplicationObjects() {
		return sessionFactory.getCurrentSession().createQuery("from IDE_OBJ").list();
	}

	@Override
	public IDE_OBJ getApplicationByID(String ideObjectID) {
		return (IDE_OBJ) sessionFactory.getCurrentSession().get(IDE_OBJ.class, String.valueOf(ideObjectID));
	}

		
	@Override
	public IDE_OBJ getApplicationByName(String objectName) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_OBJ.class);
		criteria.addOrder(Order.desc("systemModStamp"));
		criteria.add(Restrictions.like("OBJECT_NAME_S", objectName));
		return (IDE_OBJ) criteria.list().get(0);
		}

	@Override
	public void deleteApplicationByID(String ideObjectID) {
		IDE_OBJ object=getApplicationByID(ideObjectID);
		if(object!=null) {
		 sessionFactory.getCurrentSession().delete(object);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IDE_OBJ> getApplicationObjectsByPagination(PaginationRequest request) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(IDE_OBJ.class);	
		criteria.setFirstResult((request.getPageNumber() - 1) * request.getPageSize());	
		criteria.setMaxResults(request.getPageSize());
		return (List<IDE_OBJ>) criteria.list();
	
	}
	@SuppressWarnings("unchecked")
	@Override
	public void updateLastUpdatedDateAndTime(String objID,String updatedBY) {
		updateLastUpdatedDateAndTime(objID,updatedBY,null); 
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updateLastUpdatedDateAndTime(String objID,String updatedBY,String status) {
		Query query =null;
		if(status!=null) {
		query = sessionFactory.getCurrentSession().createQuery(
				"update IDE_OBJ set systemModStamp=:systemModStamp,UPD_OS_USER=:updated_by,status=:status where IDE_OBJ_ID = :IDE_OBJ_ID ");
		query.setParameter("IDE_OBJ_ID", objID);
		query.setParameter("updated_by", updatedBY);
		query.setParameter("status", status);
		query.setTimestamp("systemModStamp", new Timestamp(new Date().getTime()));
		}
		else {
			query = sessionFactory.getCurrentSession().createQuery(
					"update IDE_OBJ set systemModStamp=:systemModStamp,UPD_OS_USER=:updated_by where IDE_OBJ_ID = :IDE_OBJ_ID ");
			query.setParameter("IDE_OBJ_ID", objID);
			query.setParameter("updated_by", updatedBY);
			query.setTimestamp("systemModStamp", new Timestamp(new Date().getTime()));
		}
		
		
		int result = query.executeUpdate();
	}

}