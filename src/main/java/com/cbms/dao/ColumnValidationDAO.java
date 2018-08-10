package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_COL_VALIDATION;
import com.cbms.input.domain.PaginationRequest;

public interface ColumnValidationDAO {

	public IDE_COL_VALIDATION addColumnValidationObject(IDE_COL_VALIDATION colValidation, Integer pageLayoutID);

	public List<IDE_COL_VALIDATION> getAllColumnValidationObjects();

	public List<IDE_COL_VALIDATION> getColumnValidationByPagination(PaginationRequest request);

	public IDE_COL_VALIDATION getColumnValidationByID(int pgLayoutID);

	public void deleteColumnValidationByID(Integer pgLayoutID);

}
