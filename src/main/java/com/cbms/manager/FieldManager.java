package com.cbms.manager;

import com.cbms.input.domain.Field;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface FieldManager {
	
	public String addFieldObject(Field pageLayout) throws JsonProcessingException;


	public String getFieldObjects(SearchParameters search) throws JsonProcessingException;

}
