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
import com.cbms.input.domain.Application;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.ApplicationServiceManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 @Component
@Path("/application")
public class ApplicationService {
	private static final Logger logger = Logger.getLogger(ApplicationService.class);
	
	@Autowired
	ApplicationServiceManager applicationServiceManager;

 
	@POST
	@Path("/createOrUpdateApplication")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateApplication(String inputJson)  {
		Application obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, Application.class);
		} catch (Exception e) {
			logger.error("excprion thrown"+e);
			throw new GenericException(e.getMessage());
		} 
		 String output=null;
		try {
			output = applicationServiceManager.addApplicationObject(obj);
		}catch (Exception e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		}
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeleteApplication")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeleteApplication(String inputJson)  {
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
			output = applicationServiceManager.getApplicationObjects(obj);
		} catch (JsonProcessingException e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		}catch (Exception e) {
			logger.error("Exception thrown",e);
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}

	
	
 
}