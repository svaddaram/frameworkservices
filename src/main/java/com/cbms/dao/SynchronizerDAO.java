package com.cbms.dao;

import com.cbms.input.domain.Application;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;

public interface SynchronizerDAO {
	 public void applicationServiceCreateOrUpdateApplication(Application app);
	 public void canvasServiceCreateOrUpdateApplication(Application app);
	 public void pageSectionServiceCreateOrUpdatePageSection(PageSection obj);
	 public void pageSubSectionServiceCreateOrUpdatePageSubSection(SubSection obj);
}
