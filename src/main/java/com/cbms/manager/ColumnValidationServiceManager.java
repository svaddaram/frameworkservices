package com.cbms.manager;

import com.cbms.input.domain.ColumnValidation;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ColumnValidationServiceManager {
	public String addColumnValidationObject(ColumnValidation validation,Integer pageLayoutID) throws JsonProcessingException;


	public String getColumnValidationObjects(SearchParameters search) throws JsonProcessingException;



}
