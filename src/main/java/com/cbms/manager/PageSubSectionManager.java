package com.cbms.manager;

import com.cbms.input.domain.SearchParameters;
import com.cbms.input.domain.SubSection;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PageSubSectionManager {
	public String addPageSubSectionObject(SubSection subsection) throws JsonProcessingException;


	public String getPageSubSectionObjects(SearchParameters search) throws JsonProcessingException;



}
