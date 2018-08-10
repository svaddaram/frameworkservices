package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.FieldLayoutDAO;
import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Transactional
public class FieldLayoutManagerImpl implements FieldLayoutManager {
	
private static final Logger logger = Logger.getLogger(PageLayoutServiceManagerImpl.class);
	
	@Autowired
	FieldLayoutDAO fieldLayoutDAO;
	
	@Autowired
	ObjectManager objectManager;

	@Override
	@Transactional
	public String addFieldLayoutObject(FieldLayout fieldLayout) throws JsonProcessingException {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			FieldLayout fld=objectManager.createFieldLayout(fieldLayoutDAO.addFieldObject(objectManager.createFieldLayout(fieldLayout),fieldLayout.getIdePgSubSectnId()));
			return  mapper.writeValueAsString(fld);
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	@Transactional
	public String getFieldLayoutObjects(SearchParameters search) throws JsonProcessingException {
		logger.debug("inside search object");
		ObjectMapper mapper = new ObjectMapper();
		List<FieldLayout> fieldObjects=new ArrayList<FieldLayout>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldObjects.add(objectManager.createFieldLayout(fieldLayoutDAO.getFieldtByID(Integer.parseInt(search.getId()))));
		}else if(SearchParameterEnum.NAME.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldObjects.add(objectManager.createFieldLayout(fieldLayoutDAO.getFieldsByFieldLabel(search.getName())));
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_FIELD_LAYOUT> idePgFieldList=fieldLayoutDAO.getAllFieldObjects();
		for(IDE_FIELD_LAYOUT fld:idePgFieldList) {
			fieldObjects.add(objectManager.createFieldLayout(fld));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			fieldLayoutDAO.deleteFieldByID(Integer.parseInt(search.getId()));
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_FIELD_LAYOUT> ideFieldsList=fieldLayoutDAO.getFieldsByPagination(request);
			for(IDE_FIELD_LAYOUT field:ideFieldsList) {
				fieldObjects.add(objectManager.createFieldLayout(field));
			}
		}
		return  mapper.writeValueAsString(fieldObjects);

	}

}
