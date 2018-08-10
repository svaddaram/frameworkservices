package com.cbms.manager;

import com.cbms.input.domain.Application;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ApplicationServiceManager {
	
	public String addApplicationObject(Application application) throws JsonProcessingException;


	public String getApplicationObjects(SearchParameters search) throws JsonProcessingException;

}
