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
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.PageSectionManager;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Path("/pageSection")
public class PageSectionService {
	
private static final Logger logger = Logger.getLogger(ApplicationService.class);
	
	@Autowired
	PageSectionManager pageSectionManager;
 
	@POST
	@Path("/createOrUpdatePageSection")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdatePageSection(String inputJson) {
		PageSection obj =null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, PageSection.class);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		} 
		 String output=null;
		try {
			output = pageSectionManager.addPageSectionObject(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
 
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeletePageSection")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeletePageSection(String inputJson) {
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
			output = pageSectionManager.getPageSectionObjects(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		return Response.status(200).entity(output).build();
	}
}
