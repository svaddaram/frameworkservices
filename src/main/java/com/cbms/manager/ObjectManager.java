package com.cbms.manager;

import com.cbms.dao.model.heroku.IDE_COL_VALIDATION;
import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.dao.model.heroku.IDE_FLD;
import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.dao.model.heroku.IDE_SECTION_FLD_LAYOUT;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.ColumnValidation;
import com.cbms.input.domain.Field;
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;

public interface ObjectManager {
	public IDE_OBJ createIDE_OBJ(Application application,String objectType);
	public Application createApplicationObject(IDE_OBJ ideObj,String objectType);
	public IDE_PG_LAYOUT createPAGE_LAYOUT(PageLayout pageLayout,String objectType);
	public PageLayout createPageLayoutObject(IDE_PG_LAYOUT addPageLayoutObject,String objectType,Boolean isCanvas);
	public IDE_PG_SECTN createIDE_PG_SECTN(PageSection section,String objectType);
	public PageSection createPageSection(IDE_PG_SECTN pagesection,String objectType,Boolean isCanvas);
	public IDE_FLD createIDE_FLD(Field field);
	public Field createIDE_FLD(IDE_FLD field);
	public IDE_PG_SUB_SECTN createIDE_PG_SUB_SECTN(SubSection sub_section,String objectType);
	public SubSection createPageSubSection(IDE_PG_SUB_SECTN sub_section,String objectType,Boolean isCanvas);
	public FieldLayout createFieldLayout(IDE_FIELD_LAYOUT fieldLayout) ;
	public IDE_FIELD_LAYOUT createFieldLayout(FieldLayout fieldLayout);
	public IDE_COL_VALIDATION createFieldLayout(ColumnValidation validation);
	public ColumnValidation createColumnValidation(IDE_COL_VALIDATION validation);
	
	public FieldLayout createSectionFieldLayout(IDE_SECTION_FLD_LAYOUT fieldLayout) ;
	public IDE_SECTION_FLD_LAYOUT createIDE_SECTION_FLD_LAYOUT(FieldLayout fieldLayout);
	
	
}
