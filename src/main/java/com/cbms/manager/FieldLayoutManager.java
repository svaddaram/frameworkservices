package com.cbms.manager;

import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface FieldLayoutManager {
	
	public String addFieldLayoutObject(FieldLayout fieldLayout) throws JsonProcessingException;


	public String getFieldLayoutObjects(SearchParameters search) throws JsonProcessingException;


}
