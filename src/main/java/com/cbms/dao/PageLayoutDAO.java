package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PaginationRequest;

public interface PageLayoutDAO {

	public IDE_PG_LAYOUT addPageLayoutObject(IDE_PG_LAYOUT pgLayout, String ideObjID);

	public List<IDE_PG_LAYOUT> getAllPageLayoutObjects();

	public IDE_PG_LAYOUT getPageLayoutByName(String objectName) ;
	
	public List<IDE_PG_LAYOUT> getPageLayoutByPagination(PaginationRequest request);

	public IDE_PG_LAYOUT getPageLayoutByID(int pgLayoutID);

	void deletePageLayoutByID(Integer pgLayoutID);

	public void prepareDBForCanvas(PageLayout pageLayout);
	
	public void prepareCanvasAndUpdateStatus(PageLayout pageLayout);
	
	public IDE_PG_LAYOUT saveCanvas(PageLayout pageLayout);
	
	public String updateApplicationStatus(String ideObjID);
}
