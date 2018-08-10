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
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.FieldLayoutManager;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("/fieldLayout")
public class FieldLayoutService {
	
	
private static final Logger logger = Logger.getLogger(FieldService.class);
	
	@Autowired
	FieldLayoutManager fieldLayoutManager;
 
	@POST
	@Path("/createOrUpdateFieldLayout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateFieldLayout(String inputJson) {
		FieldLayout obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, FieldLayout.class);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		} 
		 String output=null;
		try {
			output = fieldLayoutManager.addFieldLayoutObject(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeleteFieldLayout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeleteFieldLayout(String inputJson) {
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
			output = fieldLayoutManager.getFieldLayoutObjects(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}

}
