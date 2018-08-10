package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.ColumnValidationDAO;
import com.cbms.dao.model.heroku.IDE_COL_VALIDATION;
import com.cbms.input.domain.ColumnValidation;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Transactional
public class ColumnValidationServiceManagerImpl implements ColumnValidationServiceManager {
	
	private static final Logger logger = Logger.getLogger(ApplicationServiceManagerImpl.class);
	
	
	@Autowired
	ColumnValidationDAO columnValidationDAO;
	
	@Autowired
	ObjectManager objectManager;
	


	@Override
	public String addColumnValidationObject(ColumnValidation validation,Integer pageLayoutID) throws JsonProcessingException {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			ColumnValidation colvalidation = objectManager.createColumnValidation(columnValidationDAO.addColumnValidationObject(objectManager.createFieldLayout(validation),pageLayoutID));
			return  mapper.writeValueAsString(colvalidation);
		}
	 catch (Exception e) {
		logger.error("Exception thrown",e);
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public String getColumnValidationObjects(SearchParameters search) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<ColumnValidation> columnValidationList=new ArrayList<ColumnValidation>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			ColumnValidation validation=objectManager.createColumnValidation(columnValidationDAO.getColumnValidationByID(Integer.parseInt(search.getId())));
			if(validation!=null) {
				columnValidationList.add(validation);
			}
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_COL_VALIDATION> columnValidationsList=columnValidationDAO.getAllColumnValidationObjects();
		for(IDE_COL_VALIDATION validation:columnValidationsList) {
			columnValidationList.add(objectManager.createColumnValidation(validation));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			columnValidationDAO.deleteColumnValidationByID(Integer.parseInt(search.getId()));
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_COL_VALIDATION> colValidationList=columnValidationDAO.getColumnValidationByPagination(request);
			for(IDE_COL_VALIDATION validation:colValidationList) {
				columnValidationList.add(objectManager.createColumnValidation(validation));
			}
		}
		return  mapper.writeValueAsString(columnValidationList);
	}

}
