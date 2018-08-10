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
import com.cbms.input.domain.Field;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.FieldManager;
import com.fasterxml.jackson.databind.ObjectMapper;
 @Component
@Path("/field")
public class FieldService {
	private static final Logger logger = Logger.getLogger(FieldService.class);
	
	@Autowired
	FieldManager fieldManager;
 
	@POST
	@Path("/createOrUpdateField")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateField(String inputJson) {
		Field obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, Field.class);
		} catch (Exception e) {
			logger.error("error thrown",e);
		} 
		 String output=null;
		try {
			output = fieldManager.addFieldObject(obj);
		}catch (Exception e) {
			logger.error("error thrown",e);
			throw new GenericException(e.getMessage());
		}
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeleteField")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeleteField(String inputJson) {
		logger.debug("input string="+inputJson);
		SearchParameters obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, SearchParameters.class);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		} 
		String output=null;
		try {
			output = fieldManager.getFieldObjects(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}
	
	
	
 
}