package com.cbms.webservices.service;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cbms.exceptionhandler.GenericException;
import com.cbms.input.domain.Login;
import com.fasterxml.jackson.databind.ObjectMapper;


 @Component
@Path("/login")
public class LoginService {
	 
	 private static final Logger logger = Logger.getLogger(ApplicationService.class);
	 
	 @POST
		@Path("/authenticate")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response checkPassword(String inputJson)  {
		 Login obj =null;
			ObjectMapper mapper = new ObjectMapper();
			try {
				 obj = mapper.readValue(inputJson, Login.class);
			} catch (Exception e) {
				logger.error("excprion thrown"+e);
				throw new GenericException(e.getMessage());
			} 
			
			if("UIFRAME$123".equals(obj.getPassword())){
				obj.setPassword(null);
				obj.setAutentication("success");
			}else {
				obj.setAutentication("failure");
			}
			return Response.status(200).entity(obj).build();
	 }
		 
	 }

