package com.cbms.exceptionhandler;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.web.bind.annotation.ExceptionHandler;

@Provider
public class AlreadyInCanvasExceptionHandler implements ExceptionMapper<AlreadyInCanvasException> {
		@Override
	    @ExceptionHandler
	    public Response toResponse(AlreadyInCanvasException exception) {
	        ErrorProps errorMessage = new ErrorProps(
	                "405",
	                exception.getMessage()
	        );
	        
	        return Response.status(405).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
	    }

}
