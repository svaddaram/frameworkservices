package com.cbms.webservices.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbms.exceptionhandler.GenericException;
import com.cbms.input.domain.ColumnValidation;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.ColumnValidationServiceManager;
import com.fasterxml.jackson.databind.ObjectMapper;
 @Component
@Path("/columnValidation")
public class ColumnValidationService {
	private static final Logger logger = Logger.getLogger(ColumnValidationService.class);
	
	@Autowired
	ColumnValidationServiceManager columnValidationServiceManager;
 
	@POST
	@Path("/createOrUpdateColumnValidation")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateColumnValidation(String inputJson) {
		ColumnValidation obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			 obj = mapper.readValue(inputJson, ColumnValidation.class);
		} catch (Exception e) {
			logger.error("Exception thrown",e);
			e.printStackTrace();
		} 
		 String output=null;
		try {
			if(obj!=null) {
			output = columnValidationServiceManager.addColumnValidationObject(obj, obj.getIdePgLayoutId());
			}
			
		} catch (Exception e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		}
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeleteColumnValidation")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeleteColumnValidation(String inputJson) {
		logger.debug("input string="+inputJson);
		SearchParameters obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, SearchParameters.class);
		} catch (Exception e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		} 
		String output=null;
		try {
			output = columnValidationServiceManager.getColumnValidationObjects(obj);
		}catch (Exception e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}
	
	
	
 
}
