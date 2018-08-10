package com.cbms.dao;

import java.util.List;

import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.dao.model.heroku.IDE_SECTION_FLD_LAYOUT;
import com.cbms.input.domain.PaginationRequest;

public interface FieldLayoutDAO {

	public IDE_FIELD_LAYOUT addFieldObject(IDE_FIELD_LAYOUT fieldLayout, String idePgSubSectionID);

	public List<IDE_FIELD_LAYOUT> getAllFieldObjects();

	public IDE_FIELD_LAYOUT getFieldsByFieldLabel(String objectName) ;
	
	public List<IDE_FIELD_LAYOUT> getFieldsByPagination(PaginationRequest request);

	public IDE_FIELD_LAYOUT getFieldtByID(int fieldSeq);

	public void deleteFieldByID(Integer fieldSeq);

	IDE_SECTION_FLD_LAYOUT addFieldObjectToSection(IDE_SECTION_FLD_LAYOUT fieldLayout, Integer idePgSectionID);
}
