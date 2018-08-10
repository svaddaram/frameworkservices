package com.cbms.manager;

import com.cbms.input.domain.PageLayout;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CanvasServiceManager {
	public void prepareDBForCanvas(PageLayout pageLayout) ;
	
	public String saveCanvas(PageLayout pageLayout) throws JsonProcessingException;
	
	public void prepareDBForCanvasAndUpdateStatus(PageLayout pageLayout);
}
