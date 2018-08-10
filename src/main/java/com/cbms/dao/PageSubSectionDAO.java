package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.input.domain.PaginationRequest;

public interface PageSubSectionDAO {

	public IDE_PG_SUB_SECTN addPageSubSectionObject(IDE_PG_SUB_SECTN subSection,Integer sectionId);

	public List<IDE_PG_SUB_SECTN> getAllPageSubSectionObjects();

	public List<IDE_PG_SUB_SECTN> getPageSubSectionByPagination(PaginationRequest request);

	public IDE_PG_SUB_SECTN getPageSubSectionByID(String pgSubSectionID);

	void deletePageSubSectionByID(String pgSubSectionID);
	
}
