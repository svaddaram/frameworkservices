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
import com.cbms.input.domain.SearchParameters;
import com.cbms.input.domain.SubSection;
import com.cbms.manager.PageSubSectionManager;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("/pageSubSection")
public class PageSubSectionService {
	
private static final Logger logger = Logger.getLogger(ApplicationService.class);
	
	@Autowired
	PageSubSectionManager pageSubSectionManager;
 
	@POST
	@Path("/createOrUpdatePageSubSection")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdatePageSubSection(String inputJson) {
		SubSection obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, SubSection.class);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		} 
		 String output=null;
		try {
			output = pageSubSectionManager.addPageSubSectionObject(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeletePageSubSection")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeletePageSubSection(String inputJson) {
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
			output = pageSubSectionManager.getPageSubSectionObjects(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}
}
