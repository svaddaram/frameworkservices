package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.FieldDAO;
import com.cbms.dao.model.heroku.IDE_FLD;
import com.cbms.input.domain.Field;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Transactional
public class FieldManagerImpl implements FieldManager{

private static final Logger logger = Logger.getLogger(PageLayoutServiceManagerImpl.class);
	
	@Autowired
	FieldDAO fieldDAO;
	
	@Autowired
	ObjectManager objectManager;
	
	
	
	@Override
	@Transactional
	public String addFieldObject(Field field) throws JsonProcessingException {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			Field fld=objectManager.createIDE_FLD(fieldDAO.addFieldObject(objectManager.createIDE_FLD(field),field.getIdeOBJID()));
			return  mapper.writeValueAsString(fld);
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
		return null;
		}

	@Override
	@Transactional
	public String getFieldObjects(SearchParameters search) throws JsonProcessingException {
		logger.debug("inside search object");
		ObjectMapper mapper = new ObjectMapper();
		List<Field> fieldObjects=new ArrayList<Field>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldObjects.add(objectManager.createIDE_FLD(fieldDAO.getFieldtByID(Integer.parseInt(search.getId()))));
		}else if(SearchParameterEnum.NAME.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldObjects.add(objectManager.createIDE_FLD(fieldDAO.getFieldsByFieldLabel(search.getName())));
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_FLD> idePgFieldList=fieldDAO.getAllFieldObjects();
		for(IDE_FLD fld:idePgFieldList) {
			fieldObjects.add(objectManager.createIDE_FLD(fld));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldDAO.deleteFieldByID(Integer.parseInt(search.getId()));
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_FLD> ideFieldsList=fieldDAO.getFieldsByPagination(request);	
			for(IDE_FLD field:ideFieldsList) {
				fieldObjects.add(objectManager.createIDE_FLD(field));
			}
		}
		return  mapper.writeValueAsString(fieldObjects);
	}

}
