package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.input.domain.PaginationRequest;

public interface PageSectionDAO {

	public IDE_PG_SECTN addPageSectionObject(IDE_PG_SECTN pgLayout,Integer pgLayoutID);

	public List<IDE_PG_SECTN> getAllPageSectionObjects();

	public List<IDE_PG_SECTN> getPageSectionByPagination(PaginationRequest request);

	public IDE_PG_SECTN getPageSectionByID(int pgSectionID);

	void deletePageSectionByID(Integer pgSectionID);
	
}
