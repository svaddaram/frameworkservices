package com.cbms.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.PageSectionDAO;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.PaginationRequest;
import com.cbms.input.domain.SearchParameters;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Transactional
public class PageSectionManagerImpl implements PageSectionManager {
	
	@Autowired
	PageSectionDAO pageSectionDAO;
	
	@Autowired
	ObjectManager objectManager;

	@Override
	public String addPageSectionObject(PageSection section) throws JsonProcessingException {
		ObjectMapper mapper =null;
		try{
			mapper = new ObjectMapper();
			PageSection pgSectionObject=objectManager.createPageSection(pageSectionDAO.addPageSectionObject(objectManager.createIDE_PG_SECTN(section,null),section.getIdePGLAYOUTID()),null,Boolean.FALSE);
			return  mapper.writeValueAsString(pgSectionObject);
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public String getPageSectionObjects(SearchParameters search) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<PageSection> pageSectionObjects=new ArrayList<PageSection>();
				
		if(search==null || search.getSearchParameter()==null) {
			return null;
		}else if(SearchParameterEnum.ID.toString().equalsIgnoreCase(search.getSearchParameter())) {
			PageSection pageSection=objectManager.createPageSection(pageSectionDAO.getPageSectionByID(Integer.parseInt(search.getId())),search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE);
			if(pageSection!=null)
			pageSectionObjects.add(pageSection);
		}else if(SearchParameterEnum.ALL.toString().equalsIgnoreCase(search.getSearchParameter())) {
			 List<IDE_PG_SECTN> idePgSectionList=pageSectionDAO.getAllPageSectionObjects();
		for(IDE_PG_SECTN section:idePgSectionList) {
			PageSection pageSection=objectManager.createPageSection(section,search.getObjectType(),search.getIsCanvas()!=null?Boolean.TRUE:Boolean.FALSE);
			if(pageSection!=null)
			pageSectionObjects.add(pageSection);
		}
		}else if(SearchParameterEnum.DELETE.toString().equalsIgnoreCase(search.getSearchParameter())) {
			pageSectionDAO.deletePageSectionByID(Integer.parseInt(search.getId()));
		}else {
			PaginationRequest request=new PaginationRequest();
			request.setPageNumber(Integer.parseInt(search.getPageNumber()));
			request.setPageSize(Integer.parseInt(search.getPageSize()));
			List<IDE_PG_SECTN> idePgSectionList=pageSectionDAO.getPageSectionByPagination(request);	
			for(IDE_PG_SECTN ideObj:idePgSectionList) {
				pageSectionObjects.add(objectManager.createPageSection(ideObj,search.getObjectType(),Boolean.FALSE));
			}
		}
		return  mapper.writeValueAsString(pageSectionObjects);
	}

}
