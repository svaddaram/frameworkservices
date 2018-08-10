package com.cbms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.dao.SynchronizerDAO;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;
import com.cbms.manager.SynchronizerManager;
import com.fasterxml.jackson.databind.ObjectMapper;
@Aspect
public class CBMSAspect {   
   
	@Autowired
	SynchronizerManager synchronizerManager;
     
    @Around("execution(* com.cbms.webservices.service.ApplicationService.createOrUpdateApplication(..))")
    public Object logAfterV1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Object resp=proceedingJoinPoint.proceed();
    	if(resp instanceof OutboundJaxrsResponse) {
    		OutboundJaxrsResponse response=(OutboundJaxrsResponse)resp;
    		response.bufferEntity();  //need to buffer entity, in order to read the entity multiple times from the Response's InputStream
    		String applicationString = (String)response.getEntity();
    		Application app = (Application)mapper.readValue(applicationString, Application.class);
    		synchronizerManager.applicationServiceCreateOrUpdateApplication(app);
    		}
    	
		return resp;
    }
    
    @Around("execution(* com.cbms.webservices.service.CanvasService.createOrUpdateApplication(..))")
    public Object logAfterV2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Object resp=proceedingJoinPoint.proceed();
    	if(resp instanceof OutboundJaxrsResponse) {
    		OutboundJaxrsResponse response=(OutboundJaxrsResponse)resp;
    		response.bufferEntity();  //need to buffer entity, in order to read the entity multiple times from the Response's InputStream
    		String applicationString = (String)response.getEntity();
    		Application app= (Application)mapper.readValue(applicationString, Application.class);
    		synchronizerManager.canvasServiceCreateOrUpdateApplication(app);
    	}
    	
		return resp;
    }
    
  /*  @Around("execution(* com.cbms.webservices.service.ColumnValidationService.createOrUpdateColumnValidation(..))")
    public Object logAfterV3(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Object resp=proceedingJoinPoint.proceed();
    	if(resp instanceof OutboundJaxrsResponse) {
    		OutboundJaxrsResponse response=(OutboundJaxrsResponse)resp;
    		response.bufferEntity();  //need to buffer entity, in order to read the entity multiple times from the Response's InputStream
    		String applicationString = (String)response.getEntity();
    		ColumnValidation obj = (ColumnValidation)mapper.readValue(applicationString, ColumnValidation.class);
    		Integer pgLayoutID=obj.getIdePgLayoutId();
    		//get ideObjID from query and update
    		
    		}
    	
		return resp;
    }*/
    
    @Around("execution(* com.cbms.webservices.service.PageSectionService.createOrUpdatePageSection(..))")
    public Object logAfterV4(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Object resp=proceedingJoinPoint.proceed();
    	if(resp instanceof OutboundJaxrsResponse) {
    		OutboundJaxrsResponse response=(OutboundJaxrsResponse)resp;
    		response.bufferEntity();  //need to buffer entity, in order to read the entity multiple times from the Response's InputStream
    		String applicationString = (String)response.getEntity();
    		PageSection obj = (PageSection)mapper.readValue(applicationString, PageSection.class);
    		synchronizerManager.pageSectionServiceCreateOrUpdatePageSection(obj);
    		//get ideObjID from query and update field layout's ,subsection and section
    		
    		}
    	
		return resp;
    }
    
    @Around("execution(* com.cbms.webservices.service.PageSubSectionService.createOrUpdatePageSubSection(..))")
    public Object logAfterV5(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
    	ObjectMapper mapper = new ObjectMapper();
    	Object resp=proceedingJoinPoint.proceed();
    	if(resp instanceof OutboundJaxrsResponse) {
    		OutboundJaxrsResponse response=(OutboundJaxrsResponse)resp;
    		response.bufferEntity();  //need to buffer entity, in order to read the entity multiple times from the Response's InputStream
    		String applicationString = (String)response.getEntity();
    		SubSection obj = (SubSection)mapper.readValue(applicationString, SubSection.class);
    		synchronizerManager.pageSubSectionServiceCreateOrUpdatePageSubSection(obj);
			
    		
    		}
    	
		return resp;
    }
     
  
}