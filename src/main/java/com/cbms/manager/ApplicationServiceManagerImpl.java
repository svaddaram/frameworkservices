package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.ApplicationDAO;
import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Transactional
public class ApplicationServiceManagerImpl implements ApplicationServiceManager {

	private static final Logger logger = Logger.getLogger(ApplicationServiceManagerImpl.class);
	
	@Autowired
	ApplicationDAO applicationDAO;
	
	@Autowired
	ObjectManager objectManager;

	@Override
	@Transactional
	public String addApplicationObject(Application application) {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			Application applicationObject=objectManager.createApplicationObject(applicationDAO.addApplicationObject(objectManager.createIDE_OBJ(application,null)),null);
			return  mapper.writeValueAsString(applicationObject);
		}
	 catch (Exception e) {
			logger.error("Exception thrown",e);
	}
		return null;
	}

	@Override
	@Transactional
	public String getApplicationObjects(SearchParameters search) throws JsonProcessingException {
		logger.debug("inside search object");
		ObjectMapper mapper = new ObjectMapper();
		List<Application> applicationObjects=new ArrayList<Application>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			applicationObjects.add(objectManager.createApplicationObject(applicationDAO.getApplicationByID(search.getId()),search.getObjectType()));
		}else if(SearchParameterEnum.NAME.toString().equalsIgnoreCase(search.getSearchParameter())) {
			applicationObjects.add(objectManager.createApplicationObject(applicationDAO.getApplicationByName(search.getName()),search.getObjectType()));
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_OBJ> ideObjList=applicationDAO.getAllApplicationObjects();
		for(IDE_OBJ ideObj:ideObjList) {
			applicationObjects.add(objectManager.createApplicationObject(ideObj,search.getObjectType()));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			applicationDAO.deleteApplicationByID(search.getId());
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_OBJ> ideObjList=applicationDAO.getApplicationObjectsByPagination(request);	
			for(IDE_OBJ ideObj:ideObjList) {
				applicationObjects.add(objectManager.createApplicationObject(ideObj,search.getObjectType()));
			}
		}
		return  mapper.writeValueAsString(applicationObjects);
	}
	
	
	

	

	

}
