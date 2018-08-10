package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.ApplicationDAO;
import com.cbms.dao.PageLayoutDAO;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
public class PageLayoutServiceManagerImpl implements PageLayoutServiceManager{

private static final Logger logger = Logger.getLogger(PageLayoutServiceManagerImpl.class);
	
	@Autowired
	PageLayoutDAO pageLayoutDAO;
	
	@Autowired
	ObjectManager objectManager;
	
	@Autowired
	ApplicationDAO applicationDAO;
	
	@Override
	@Transactional
	public void updateApplicationStatus(String ideObjID) {
		pageLayoutDAO.updateApplicationStatus(ideObjID);
	}
	
	
	@Override
	@Transactional
	public String addPageLayoutObject(PageLayout pageLayout) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		try{
			if(pageLayout.getIsCanvas()!=null) {
				pageLayoutDAO.prepareDBForCanvas(pageLayout);
				//PageLayout pgLayoutObject=objectManager.createPageLayoutObject(pageLayoutDAO.prepareDBForCanvas(pageLayout),null,Boolean.TRUE);
				return  null;
			}
			PageLayout pgLayoutObject=objectManager.createPageLayoutObject(pageLayoutDAO.addPageLayoutObject(objectManager.createPAGE_LAYOUT(pageLayout,null),pageLayout.getIdeOBJID()),null,Boolean.FALSE);
			//pageLayoutDAO.addPageLayoutObject(pgLayout, pgLayout.getIDE_OBJ_ID__c());
			return  mapper.writeValueAsString(pgLayoutObject);
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	
	@Override
	@Transactional
	public String getPageLayoutObjects(SearchParameters search) throws JsonProcessingException {
		logger.debug("inside search object");
		ObjectMapper mapper = new ObjectMapper();
		List<PageLayout> pageLayoutObjects=new ArrayList<PageLayout>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			PageLayout layout=objectManager.createPageLayoutObject(pageLayoutDAO.getPageLayoutByID(Integer.parseInt(search.getId())),search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE);
			if(layout!=null) {
			pageLayoutObjects.add(layout);
			}
		}else if(SearchParameterEnum.NAME.toString().equalsIgnoreCase(search.getSearchParameter())) {
			PageLayout layout=objectManager.createPageLayoutObject(pageLayoutDAO.getPageLayoutByName(search.getName()),search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE);
			if(layout!=null) {
			pageLayoutObjects.add(layout);
			}
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_PG_LAYOUT> idePgLayoutList=pageLayoutDAO.getAllPageLayoutObjects();
		for(IDE_PG_LAYOUT ideObj:idePgLayoutList) {
			pageLayoutObjects.add(objectManager.createPageLayoutObject(ideObj,search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			pageLayoutDAO.deletePageLayoutByID(Integer.parseInt(search.getId()));
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_PG_LAYOUT> idePgLayoutList=pageLayoutDAO.getPageLayoutByPagination(request);	
			for(IDE_PG_LAYOUT pgLayout:idePgLayoutList) {
				pageLayoutObjects.add(objectManager.createPageLayoutObject(pgLayout,search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE));
			}
		}
		return  mapper.writeValueAsString(pageLayoutObjects);
	}
	
	@Override
	@Transactional
	public String getApplicationObjectForCanvas(String search) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("search id==>"+search);
		Application application=objectManager.createApplicationObject(applicationDAO.getApplicationByID(search),null);
		/*if(application!=null) {
		pageLayoutObjects.add(application);
		}*/
		return  mapper.writeValueAsString(application);

	}
	

	@Override
	@Transactional
	public String getObjectIDForUpdatingApplicationStatus(Integer pgLayoutID) {
		if(pgLayoutID==null) {
			return null;
		}
		IDE_PG_LAYOUT layout=pageLayoutDAO.getPageLayoutByID(pgLayoutID);
		if(layout!=null) {
			return layout.getIDE_OBJ_ID__c();
		}
		return null;
	}
	
	

}
