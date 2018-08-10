package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.input.domain.PaginationRequest;

public interface ApplicationDAO {

	public IDE_OBJ addApplicationObject(IDE_OBJ ideObj);

	public List<IDE_OBJ> getAllApplicationObjects();

	public IDE_OBJ getApplicationByName(String objectName) ;
	
	public List<IDE_OBJ> getApplicationObjectsByPagination(PaginationRequest request);

	public IDE_OBJ getApplicationByID(String ideObjectID);

	public void deleteApplicationByID(String ideObjectID);
	
	public void updateLastUpdatedDateAndTime(String objID,String updatedBY,String status);
	
	public void updateLastUpdatedDateAndTime(String objID,String updatedBY) ;

}
