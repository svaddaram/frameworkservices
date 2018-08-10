package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.PageSubSectionDAO;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.cbms.input.domain.SubSection;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Transactional
public class SubSectionManagerImpl implements PageSubSectionManager{
	@Autowired
	PageSubSectionDAO pageSubSectionDAO;
	
	@Autowired
	ObjectManager objectManager;

	
	@Override
	public String addPageSubSectionObject(SubSection subsection) throws JsonProcessingException {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			SubSection pgSubSectionObject=objectManager.createPageSubSection(pageSubSectionDAO.addPageSubSectionObject(objectManager.createIDE_PG_SUB_SECTN(subsection, null),subsection.getIdePgSectnId()),null,Boolean.FALSE);
			return  mapper.writeValueAsString(pgSubSectionObject);
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
		return null;

	}

	@Override
	public String getPageSubSectionObjects(SearchParameters search) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<SubSection> pageSectionObjects=new ArrayList<SubSection>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			SubSection subSection=objectManager.createPageSubSection(pageSubSectionDAO.getPageSubSectionByID(search.getId()),search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE);
			if(subSection!=null) {
			pageSectionObjects.add(subSection);
			}
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_PG_SUB_SECTN> idePgSubSectionList=pageSubSectionDAO.getAllPageSubSectionObjects();
		for(IDE_PG_SUB_SECTN subsection:idePgSubSectionList) {
			pageSectionObjects.add(objectManager.createPageSubSection(subsection,search.getObjectType(),Boolean.FALSE));
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			pageSubSectionDAO.deletePageSubSectionByID(search.getId());
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_PG_SUB_SECTN> idePgSubSectionList=pageSubSectionDAO.getPageSubSectionByPagination(request);	
			for(IDE_PG_SUB_SECTN subSect:idePgSubSectionList) {
				pageSectionObjects.add(objectManager.createPageSubSection(subSect,search.getObjectType(),Boolean.FALSE));
			}
		}
		return  mapper.writeValueAsString(pageSectionObjects);
		}

}
