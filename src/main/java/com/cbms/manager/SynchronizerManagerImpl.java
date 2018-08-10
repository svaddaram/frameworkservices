package com.cbms.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cbms.dao.SynchronizerDAO;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;

@Transactional
public class SynchronizerManagerImpl implements SynchronizerManager {
	@Autowired
	SynchronizerDAO synchronizerDAO;
	
	@Override
	 public void applicationServiceCreateOrUpdateApplication(Application app) {
		 synchronizerDAO.applicationServiceCreateOrUpdateApplication(app);
	 }
	@Override
	 public void canvasServiceCreateOrUpdateApplication(Application app) {
		 synchronizerDAO.canvasServiceCreateOrUpdateApplication(app);
	 }
	@Override
	 public void pageSectionServiceCreateOrUpdatePageSection(PageSection obj) {
		 synchronizerDAO.pageSectionServiceCreateOrUpdatePageSection(obj);
	 }
	@Override
	 public void pageSubSectionServiceCreateOrUpdatePageSubSection(SubSection obj) {
		 synchronizerDAO.pageSubSectionServiceCreateOrUpdatePageSubSection(obj);
	 }
}
