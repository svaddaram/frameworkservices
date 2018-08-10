package com.cbms;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

public class ApplicationInitiation extends ResourceConfig {
    public ApplicationInitiation() {
        // Define the package which contains the service classes.
         register(RequestContextFilter.class);
         register(JacksonFeature.class); 
     packages("com.cbms.webservices.service");
     packages("com.cbms.exceptionhandler");
        
    }
}
