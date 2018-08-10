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
import com.cbms.manager.CanvasServiceManager;
import com.cbms.manager.PageLayoutServiceManager;
import com.fasterxml.jackson.databind.ObjectMapper;
 @Component
@Path("/canvas")
public class CanvasService {
	private static final Logger logger = Logger.getLogger(CanvasService.class);
	
	@Autowired
	CanvasServiceManager canvasServiceManager;
	
	@Autowired
	PageLayoutServiceManager pageLayoutServiceManager;

 
	@POST
	@Path("/createOrUpdateCanvas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateApplication(String inputJson)  {
		PageLayout obj =null;
		Integer pgLayoutID=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			 obj = mapper.readValue(inputJson, PageLayout.class);
			 pgLayoutID=obj.getIdePGLAYOUTID();
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
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
			canvasServiceManager.prepareDBForCanvas(obj);
			canvasServiceManager.prepareDBForCanvasAndUpdateStatus(obj);
			//update application status
			 pageLayoutServiceManager.updateApplicationStatus(objID);
			output=canvasServiceManager.saveCanvas(obj);
		} catch (Exception e) {
			throw new GenericException(e.getMessage());
		}
		//update application status
		 
			
		return Response.status(200).entity(output).build();
 
	}
	
	

	
	
 
}