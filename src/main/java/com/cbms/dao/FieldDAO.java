package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_FLD;
import com.cbms.input.domain.PaginationRequest;

public interface FieldDAO {

	public IDE_FLD addFieldObject(IDE_FLD pgLayout, String ideObjID);

	public List<IDE_FLD> getAllFieldObjects();

	public IDE_FLD getFieldsByFieldLabel(String objectName) ;
	
	public List<IDE_FLD> getFieldsByPagination(PaginationRequest request);

	public IDE_FLD getFieldtByID(int fieldSeq);

	public void deleteFieldByID(Integer fieldSeq);
}
