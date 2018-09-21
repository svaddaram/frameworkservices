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
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.SearchParameters;
import com.cbms.manager.PageLayoutServiceManager;
import com.fasterxml.jackson.databind.ObjectMapper;
 @Component
@Path("/pageLayout")
public class PageLayoutService {
	private static final Logger logger = Logger.getLogger(PageLayoutService.class);
	
	@Autowired
	PageLayoutServiceManager pageLayoutServiceManager;
 
	@POST
	@Path("/createOrUpdatePageLayout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdatePageLayout(String inputJson) {
		PageLayout obj =null;
		Integer pgLayoutID=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			 obj = mapper.readValue(inputJson, PageLayout.class);
			 pgLayoutID=obj.getIdePGLAYOUTID();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 String output=null;
		 //block to get object id for updating application status
		 String objID=null;
		 if(pgLayoutID==null) {
			 objID=obj.getIdeOBJID();
		 }else {
			 objID=pageLayoutServiceManager.getObjectIDForUpdatingApplicationStatus(pgLayoutID);
			 
		}
		 //end of block
		try {
			output = pageLayoutServiceManager.addPageLayoutObject(obj);
			if(output==null) {
				System.out.println("page layout id==>"+pgLayoutID);
				output=pageLayoutServiceManager.getApplicationObjectForCanvas(obj.getIdeOBJID());
			}
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		//update application status
		pageLayoutServiceManager.updateApplicationStatus(objID);
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/findOrDeletePageLayout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOrDeletePageLayout(String inputJson) {
		logger.debug("input string="+inputJson);
		SearchParameters obj =null;
		String objID=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, SearchParameters.class);
			 System.out.println("inside the block"+obj.getSearchParameter());
			 if(obj.getId()!=null)
			 objID=pageLayoutServiceManager.getObjectIDForUpdatingApplicationStatus(Integer.parseInt(obj.getId()));
				
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		} 
		System.out.println("after the block"+objID);
		String output=null;
		try {
			output = pageLayoutServiceManager.getPageLayoutObjects(obj);
		}catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		//block to update application status after deletion of a record
		 if("DELETE".equalsIgnoreCase(obj.getSearchParameter())) {
			 System.out.println("inside delete block with page layout id"+obj.getId());
			if(objID!=null)
			 pageLayoutServiceManager.updateApplicationStatus(objID);
			
		 }
		return Response.status(200).entity(output).build();
	}
	
	
	
 
}