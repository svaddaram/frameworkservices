package com.cbms.manager;

import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PageLayoutServiceManager {
	
	public String addPageLayoutObject(PageLayout pageLayout) throws JsonProcessingException;


	public String getPageLayoutObjects(SearchParameters search) throws JsonProcessingException;
	
	public String getApplicationObjectForCanvas(String search) throws JsonProcessingException;
	
	public String getObjectIDForUpdatingApplicationStatus(Integer pgLayoutID);
	
	public void updateApplicationStatus(String ideObjID);

}
