package com.cbms.manager;

import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PageSectionManager {
	public String addPageSectionObject(PageSection section) throws JsonProcessingException;


	public String getPageSectionObjects(SearchParameters search) throws JsonProcessingException;



}
