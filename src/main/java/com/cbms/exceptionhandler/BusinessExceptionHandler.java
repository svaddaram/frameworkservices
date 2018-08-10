package com.cbms.exceptionhandler;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cbms.exceptionhandler.GenericException;
import com.cbms.exceptionhandler.ErrorProps;

@Provider
public class BusinessExceptionHandler implements ExceptionMapper<GenericException> {
    @Override
    @ExceptionHandler
    public Response toResponse(GenericException exception) {
        ErrorProps errorMessage = new ErrorProps(
                "500",
                exception.getMessage()
        );
        
        return Response.status(500).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
    }
    
    
    
}
