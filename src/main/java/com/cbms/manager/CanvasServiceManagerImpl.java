package com.cbms.manager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.dao.ApplicationDAO;
import com.cbms.dao.PageLayoutDAO;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.PageLayout;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
public class CanvasServiceManagerImpl implements CanvasServiceManager{
	
private static final Logger logger = Logger.getLogger(CanvasServiceManagerImpl.class);
	
	@Autowired
	PageLayoutDAO pageLayoutDAO;
	
	@Autowired
	ObjectManager objectManager;
	
	@Autowired
	ApplicationDAO applicationDAO;

	@Override
	@Transactional
	public void prepareDBForCanvas(PageLayout pageLayout) {
		pageLayoutDAO.prepareDBForCanvas(pageLayout);
		
	}

	@Override
	@Transactional
	public String saveCanvas(PageLayout pageLayout) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		pageLayoutDAO.saveCanvas(pageLayout);
		Application application=objectManager.createApplicationObject(applicationDAO.getApplicationByID(pageLayout.getIdeOBJID()),null);
		return  mapper.writeValueAsString(application);
	}
	
	@Override
	@Transactional
	public void prepareDBForCanvasAndUpdateStatus(PageLayout pageLayout) {
		pageLayoutDAO.prepareCanvasAndUpdateStatus(pageLayout);
		
	}
	
	

}
