package com.cbms.input.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"copy_sel_opt_cols",
"relationship_order_s",
"api_name_s",
"rt_cd_c",
"ide_pg_sub_sectn_id",
"depnt_s",
"depnt_flds",
"blankout_flds",
"col_fltr_name_c",
"copy_target_fld",
"col_fltr_val_c",
"fld_name",
"display_only_s",
"sfid",
"id",
"copy_src_fld",
"select_on_select",
"_hc_lastop",
"external_id_s",
"mand_rule_exp",
"hovr_txt_c",
"is_depnt",
"reference_to_s",
"copy_default_value",
"ide_obj_id",
"createddate",
"ide_pg_layout_id",
"rt_tbl_nm_c",
"copy_default_rule",
"ena_dis_rule_exp",
"type_c",
"obj_name",
"fld_col_orders",
"copy_flds_rule",
"length_s",
"compute_fld_rule",
"blankout_flds_rule",
"col_visible_s",
"ide_field_layout_id",
"col_id",
"formula_s",
"ide_obj",
"col_number",
"page_params",
"edit_val",
"label_overide_s",
"ide_pg_sectn_id",
"name",
"rt_dsc_c",
"unique_s",
"copy_default_tar",
"scale_s",
"row_number",
"_hc_err",
"disable_on_select",
"type_s",
"case_sensitive_s",
"systemmodstamp",
"list_view_s",
"default_value",
"field_description_s",
"precision_s",
"relationship_label_s",
"field_label_s",
"required_s",
"operationType",
"createdBy",
"updatedBy",
"cnty_rqrd",
"min_val",
"addr_flds",
"criteria_method",
"min_len",
"search_cond",
"show_icon",
"cond_value",
"trump_all",
"data_pattern",
"extn_rqrd",
"max_val",
"icon_name",
"col_order_s",
"show_link",
"date_comp_fld",
"clr_err_msg_flds",
"clr_err_msg_rule",
"child_relation"
})
public class FieldLayout {
	@JsonProperty("operationType")
	private String operationType;

@JsonProperty("copy_sel_opt_cols")
private String copySelOptCols;
@JsonProperty("relationship_order_s")
private String relationshipOrderS;
@JsonProperty("api_name_s")
private String apiNameS;
@JsonProperty("rt_cd_c")
private String rtCdC;
@JsonProperty("ide_pg_sub_sectn_id")
private String idePgSubSectnId;
@JsonProperty("depnt_s")
private String depntS;
@JsonProperty("depnt_flds")
private String depntFlds;
@JsonProperty("blankout_flds")
private String blankoutFlds;
@JsonProperty("col_fltr_name_c")
private String colFltrNameC;
@JsonProperty("copy_target_fld")
private String copyTargetFld;
@JsonProperty("col_fltr_val_c")
private String colFltrValC;
@JsonProperty("fld_name")
private String fldName;
@JsonProperty("display_only_s")
private String displayOnlyS;
@JsonProperty("sfid")
private String sfid;
@JsonProperty("id")
private Integer id;
@JsonProperty("copy_src_fld")
private String copySrcFld;
@JsonProperty("select_on_select")
private String selectOnSelect;
@JsonProperty("_hc_lastop")
private String hcLastop;
@JsonProperty("external_id_s")
private String externalIdS;
@JsonProperty("mand_rule_exp")
private String mandRuleExp;
@JsonProperty("hovr_txt_c")
private String hovrTxtC;
@JsonProperty("is_depnt")
private String isDepnt;
@JsonProperty("reference_to_s")
private String referenceToS;
@JsonProperty("copy_default_value")
private String copyDefaultValue;
@JsonProperty("ide_obj_id")
private String ideObjId;
@JsonProperty("createddate")
private String createddate;
@JsonProperty("ide_pg_layout_id")
private Integer idePgLayoutId;
@JsonProperty("rt_tbl_nm_c")
private String rtTblNmC;
@JsonProperty("copy_default_rule")
private String copyDefaultRule;
@JsonProperty("ena_dis_rule_exp")
private String enaDisRuleExp;
@JsonProperty("type_c")
private String typeC;
@JsonProperty("obj_name")
private String objName;
@JsonProperty("fld_col_orders")
private Integer fldColOrders;
@JsonProperty("copy_flds_rule")
private String copyFldsRule;
@JsonProperty("length_s")
private Integer lengthS;
@JsonProperty("compute_fld_rule")
private String computeFldRule;
@JsonProperty("blankout_flds_rule")
private String blankoutFldsRule;
@JsonProperty("col_visible_s")
private String colVisibleS;
@JsonProperty("ide_field_layout_id")
private Integer ideFieldLayoutId;
@JsonProperty("col_id")
private Integer colId;
@JsonProperty("formula_s")
private String formulaS;
@JsonProperty("ide_obj")
private String ideObj;
@JsonProperty("col_number")
private Integer colNumber;
@JsonProperty("page_params")
private String pageParams;
@JsonProperty("edit_val")
private String editVal;
@JsonProperty("label_overide_s")
private String labelOverideS;
@JsonProperty("ide_pg_sectn_id")
private Integer idePgSectnId;
@JsonProperty("name")
private String name;
@JsonProperty("rt_dsc_c")
private String rtDscC;
@JsonProperty("unique_s")
private String uniqueS;
@JsonProperty("copy_default_tar")
private String copyDefaultTar;
@JsonProperty("scale_s")
private Integer scaleS;
@JsonProperty("row_number")
private Integer rowNumber;
@JsonProperty("_hc_err")
private String hcErr;
@JsonProperty("disable_on_select")
private String disableOnSelect;
@JsonProperty("type_s")
private String typeS;
@JsonProperty("case_sensitive_s")
private String caseSensitiveS;
@JsonProperty("systemmodstamp")
private String systemmodstamp;
@JsonProperty("list_view_s")
private Integer listViewS;
@JsonProperty("default_value")
private String defaultValue;
@JsonProperty("field_description_s")
private String fieldDescriptionS;
@JsonProperty("precision_s")
private Integer precisionS;
@JsonProperty("relationship_label_s")
private String relationshipLabelS;
@JsonProperty("field_label_s")
private String fieldLabelS;
@JsonProperty("required_s")
private String requiredS;
@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();



@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("updatedBy")
private String updatedBy;
@JsonProperty("createdBy")
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
@JsonProperty("createdBy")
public String getCreatedBy() {
	return createdBy;
}
@JsonProperty("updatedBy")
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
@JsonProperty("updatedBy")
public String getUpdatedBy() {
	return updatedBy;
}

@JsonProperty("modifiedTimeStamp")
private String modifiedTimeStamp;

@JsonProperty("createdTimeStamp")
private String createdTimeStamp;

@JsonProperty("modifiedTimeStamp")
public void setModifiedTimeStamp(String modifiedTimeStamp) {
	this.modifiedTimeStamp = modifiedTimeStamp;
}
@JsonProperty("modifiedTimeStamp")
public String getModifiedTimeStamp() {
	return modifiedTimeStamp;
}
@JsonProperty("createdTimeStamp")
public void setCreatedTimeStamp(String createdTimeStamp) {
	this.createdTimeStamp = createdTimeStamp;
}
@JsonProperty("createdTimeStamp")
public String getCreatedTimeStamp() {
	return createdTimeStamp;
}
@JsonProperty("copy_sel_opt_cols")
public String getCopySelOptCols() {
return copySelOptCols;
}
@JsonProperty("operationType")
public String getOperationType() {
	return operationType;
}
@JsonProperty("operationType")
public void setOperationType(String operationType) {
	this.operationType = operationType;
}

@JsonProperty("copy_sel_opt_cols")
public void setCopySelOptCols(String copySelOptCols) {
this.copySelOptCols = copySelOptCols;
}

@JsonProperty("relationship_order_s")
public String getRelationshipOrderS() {
return relationshipOrderS;
}

@JsonProperty("relationship_order_s")
public void setRelationshipOrderS(String relationshipOrderS) {
this.relationshipOrderS = relationshipOrderS;
}

@JsonProperty("api_name_s")
public String getApiNameS() {
return apiNameS;
}

@JsonProperty("api_name_s")
public void setApiNameS(String apiNameS) {
this.apiNameS = apiNameS;
}

@JsonProperty("rt_cd_c")
public String getRtCdC() {
return rtCdC;
}

@JsonProperty("rt_cd_c")
public void setRtCdC(String rtCdC) {
this.rtCdC = rtCdC;
}

@JsonProperty("ide_pg_sub_sectn_id")
public String getIdePgSubSectnId() {
return idePgSubSectnId;
}

@JsonProperty("ide_pg_sub_sectn_id")
public void setIdePgSubSectnId(String idePgSubSectnId) {
this.idePgSubSectnId = idePgSubSectnId;
}

@JsonProperty("depnt_s")
public String getDepntS() {
return depntS;
}

@JsonProperty("depnt_s")
public void setDepntS(String depntS) {
this.depntS = depntS;
}

@JsonProperty("depnt_flds")
public String getDepntFlds() {
return depntFlds;
}

@JsonProperty("depnt_flds")
public void setDepntFlds(String depntFlds) {
this.depntFlds = depntFlds;
}

@JsonProperty("blankout_flds")
public String getBlankoutFlds() {
return blankoutFlds;
}

@JsonProperty("blankout_flds")
public void setBlankoutFlds(String blankoutFlds) {
this.blankoutFlds = blankoutFlds;
}

@JsonProperty("col_fltr_name_c")
public String getColFltrNameC() {
return colFltrNameC;
}

@JsonProperty("col_fltr_name_c")
public void setColFltrNameC(String colFltrNameC) {
this.colFltrNameC = colFltrNameC;
}

@JsonProperty("copy_target_fld")
public String getCopyTargetFld() {
return copyTargetFld;
}

@JsonProperty("copy_target_fld")
public void setCopyTargetFld(String copyTargetFld) {
this.copyTargetFld = copyTargetFld;
}

@JsonProperty("col_fltr_val_c")
public String getColFltrValC() {
return colFltrValC;
}

@JsonProperty("col_fltr_val_c")
public void setColFltrValC(String colFltrValC) {
this.colFltrValC = colFltrValC;
}

@JsonProperty("fld_name")
public String getFldName() {
return fldName;
}

@JsonProperty("fld_name")
public void setFldName(String fldName) {
this.fldName = fldName;
}

@JsonProperty("display_only_s")
public String getDisplayOnlyS() {
return displayOnlyS;
}

@JsonProperty("display_only_s")
public void setDisplayOnlyS(String displayOnlyS) {
this.displayOnlyS = displayOnlyS;
}

@JsonProperty("sfid")
public String getSfid() {
return sfid;
}

@JsonProperty("sfid")
public void setSfid(String sfid) {
this.sfid = sfid;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("copy_src_fld")
public String getCopySrcFld() {
return copySrcFld;
}

@JsonProperty("copy_src_fld")
public void setCopySrcFld(String copySrcFld) {
this.copySrcFld = copySrcFld;
}

@JsonProperty("select_on_select")
public String getSelectOnSelect() {
return selectOnSelect;
}

@JsonProperty("select_on_select")
public void setSelectOnSelect(String selectOnSelect) {
this.selectOnSelect = selectOnSelect;
}

@JsonProperty("_hc_lastop")
public String getHcLastop() {
return hcLastop;
}

@JsonProperty("_hc_lastop")
public void setHcLastop(String hcLastop) {
this.hcLastop = hcLastop;
}

@JsonProperty("external_id_s")
public String getExternalIdS() {
return externalIdS;
}

@JsonProperty("external_id_s")
public void setExternalIdS(String externalIdS) {
this.externalIdS = externalIdS;
}

@JsonProperty("mand_rule_exp")
public String getMandRuleExp() {
return mandRuleExp;
}

@JsonProperty("mand_rule_exp")
public void setMandRuleExp(String mandRuleExp) {
this.mandRuleExp = mandRuleExp;
}

@JsonProperty("hovr_txt_c")
public String getHovrTxtC() {
return hovrTxtC;
}

@JsonProperty("hovr_txt_c")
public void setHovrTxtC(String hovrTxtC) {
this.hovrTxtC = hovrTxtC;
}

@JsonProperty("is_depnt")
public String getIsDepnt() {
return isDepnt;
}

@JsonProperty("is_depnt")
public void setIsDepnt(String isDepnt) {
this.isDepnt = isDepnt;
}

@JsonProperty("reference_to_s")
public String getReferenceToS() {
return referenceToS;
}

@JsonProperty("reference_to_s")
public void setReferenceToS(String referenceToS) {
this.referenceToS = referenceToS;
}

@JsonProperty("copy_default_value")
public String getCopyDefaultValue() {
return copyDefaultValue;
}

@JsonProperty("copy_default_value")
public void setCopyDefaultValue(String copyDefaultValue) {
this.copyDefaultValue = copyDefaultValue;
}

@JsonProperty("ide_obj_id")
public String getIdeObjId() {
return ideObjId;
}

@JsonProperty("ide_obj_id")
public void setIdeObjId(String ideObjId) {
this.ideObjId = ideObjId;
}

@JsonProperty("createddate")
public String getCreateddate() {
return createddate;
}

@JsonProperty("createddate")
public void setCreateddate(String createddate) {
this.createddate = createddate;
}

@JsonProperty("ide_pg_layout_id")
public Integer getIdePgLayoutId() {
return idePgLayoutId;
}

@JsonProperty("ide_pg_layout_id")
public void setIdePgLayoutId(Integer idePgLayoutId) {
this.idePgLayoutId = idePgLayoutId;
}

@JsonProperty("rt_tbl_nm_c")
public String getRtTblNmC() {
return rtTblNmC;
}

@JsonProperty("rt_tbl_nm_c")
public void setRtTblNmC(String rtTblNmC) {
this.rtTblNmC = rtTblNmC;
}

@JsonProperty("copy_default_rule")
public String getCopyDefaultRule() {
return copyDefaultRule;
}

@JsonProperty("copy_default_rule")
public void setCopyDefaultRule(String copyDefaultRule) {
this.copyDefaultRule = copyDefaultRule;
}

@JsonProperty("ena_dis_rule_exp")
public String getEnaDisRuleExp() {
return enaDisRuleExp;
}

@JsonProperty("ena_dis_rule_exp")
public void setEnaDisRuleExp(String enaDisRuleExp) {
this.enaDisRuleExp = enaDisRuleExp;
}

@JsonProperty("type_c")
public String getTypeC() {
return typeC;
}

@JsonProperty("type_c")
public void setTypeC(String typeC) {
this.typeC = typeC;
}

@JsonProperty("obj_name")
public String getObjName() {
return objName;
}

@JsonProperty("obj_name")
public void setObjName(String objName) {
this.objName = objName;
}

@JsonProperty("fld_col_orders")
public Integer getFldColOrders() {
return fldColOrders;
}

@JsonProperty("fld_col_orders")
public void setFldColOrders(Integer fldColOrders) {
this.fldColOrders = fldColOrders;
}

@JsonProperty("copy_flds_rule")
public String getCopyFldsRule() {
return copyFldsRule;
}

@JsonProperty("copy_flds_rule")
public void setCopyFldsRule(String copyFldsRule) {
this.copyFldsRule = copyFldsRule;
}

@JsonProperty("length_s")
public Integer getLengthS() {
return lengthS;
}

@JsonProperty("length_s")
public void setLengthS(Integer lengthS) {
this.lengthS = lengthS;
}

@JsonProperty("compute_fld_rule")
public String getComputeFldRule() {
return computeFldRule;
}

@JsonProperty("compute_fld_rule")
public void setComputeFldRule(String computeFldRule) {
this.computeFldRule = computeFldRule;
}

@JsonProperty("blankout_flds_rule")
public String getBlankoutFldsRule() {
return blankoutFldsRule;
}

@JsonProperty("blankout_flds_rule")
public void setBlankoutFldsRule(String blankoutFldsRule) {
this.blankoutFldsRule = blankoutFldsRule;
}

@JsonProperty("col_visible_s")
public String getColVisibleS() {
return colVisibleS;
}

@JsonProperty("col_visible_s")
public void setColVisibleS(String colVisibleS) {
this.colVisibleS = colVisibleS;
}

@JsonProperty("ide_field_layout_id")
public Integer getIdeFieldLayoutId() {
return ideFieldLayoutId;
}

@JsonProperty("ide_field_layout_id")
public void setIdeFieldLayoutId(Integer ideFieldLayoutId) {
this.ideFieldLayoutId = ideFieldLayoutId;
}

@JsonProperty("col_id")
public Integer getColId() {
return colId;
}

@JsonProperty("col_id")
public void setColId(Integer colId) {
this.colId = colId;
}

@JsonProperty("formula_s")
public String getFormulaS() {
return formulaS;
}

@JsonProperty("formula_s")
public void setFormulaS(String formulaS) {
this.formulaS = formulaS;
}

@JsonProperty("ide_obj")
public String getIdeObj() {
return ideObj;
}

@JsonProperty("ide_obj")
public void setIdeObj(String ideObj) {
this.ideObj = ideObj;
}

@JsonProperty("col_number")
public Integer getColNumber() {
return colNumber;
}

@JsonProperty("col_number")
public void setColNumber(Integer colNumber) {
this.colNumber = colNumber;
}

@JsonProperty("page_params")
public String getPageParams() {
return pageParams;
}

@JsonProperty("page_params")
public void setPageParams(String pageParams) {
this.pageParams = pageParams;
}

@JsonProperty("edit_val")
public String getEditVal() {
return editVal;
}

@JsonProperty("edit_val")
public void setEditVal(String editVal) {
this.editVal = editVal;
}

@JsonProperty("label_overide_s")
public String getLabelOverideS() {
return labelOverideS;
}

@JsonProperty("label_overide_s")
public void setLabelOverideS(String labelOverideS) {
this.labelOverideS = labelOverideS;
}

@JsonProperty("ide_pg_sectn_id")
public Integer getIdePgSectnId() {
return idePgSectnId;
}

@JsonProperty("ide_pg_sectn_id")
public void setIdePgSectnId(Integer idePgSectnId) {
this.idePgSectnId = idePgSectnId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("rt_dsc_c")
public String getRtDscC() {
return rtDscC;
}

@JsonProperty("rt_dsc_c")
public void setRtDscC(String rtDscC) {
this.rtDscC = rtDscC;
}

@JsonProperty("unique_s")
public String getUniqueS() {
return uniqueS;
}

@JsonProperty("unique_s")
public void setUniqueS(String uniqueS) {
this.uniqueS = uniqueS;
}

@JsonProperty("copy_default_tar")
public String getCopyDefaultTar() {
return copyDefaultTar;
}

@JsonProperty("copy_default_tar")
public void setCopyDefaultTar(String copyDefaultTar) {
this.copyDefaultTar = copyDefaultTar;
}

@JsonProperty("scale_s")
public Integer getScaleS() {
return scaleS;
}

@JsonProperty("scale_s")
public void setScaleS(Integer scaleS) {
this.scaleS = scaleS;
}

@JsonProperty("row_number")
public Integer getRowNumber() {
return rowNumber;
}

@JsonProperty("row_number")
public void setRowNumber(Integer rowNumber) {
this.rowNumber = rowNumber;
}

@JsonProperty("_hc_err")
public String getHcErr() {
return hcErr;
}

@JsonProperty("_hc_err")
public void setHcErr(String hcErr) {
this.hcErr = hcErr;
}

@JsonProperty("disable_on_select")
public String getDisableOnSelect() {
return disableOnSelect;
}

@JsonProperty("disable_on_select")
public void setDisableOnSelect(String disableOnSelect) {
this.disableOnSelect = disableOnSelect;
}

@JsonProperty("type_s")
public String getTypeS() {
return typeS;
}

@JsonProperty("type_s")
public void setTypeS(String typeS) {
this.typeS = typeS;
}

@JsonProperty("case_sensitive_s")
public String getCaseSensitiveS() {
return caseSensitiveS;
}

@JsonProperty("case_sensitive_s")
public void setCaseSensitiveS(String caseSensitiveS) {
this.caseSensitiveS = caseSensitiveS;
}

@JsonProperty("systemmodstamp")
public String getSystemmodstamp() {
return systemmodstamp;
}

@JsonProperty("systemmodstamp")
public void setSystemmodstamp(String systemmodstamp) {
this.systemmodstamp = systemmodstamp;
}

@JsonProperty("list_view_s")
public Integer getListViewS() {
return listViewS;
}

@JsonProperty("list_view_s")
public void setListViewS(Integer listViewS) {
this.listViewS = listViewS;
}

@JsonProperty("default_value")
public String getDefaultValue() {
return defaultValue;
}

@JsonProperty("default_value")
public void setDefaultValue(String defaultValue) {
this.defaultValue = defaultValue;
}

@JsonProperty("field_description_s")
public String getFieldDescriptionS() {
return fieldDescriptionS;
}

@JsonProperty("field_description_s")
public void setFieldDescriptionS(String fieldDescriptionS) {
this.fieldDescriptionS = fieldDescriptionS;
}

@JsonProperty("precision_s")
public Integer getPrecisionS() {
return precisionS;
}

@JsonProperty("precision_s")
public void setPrecisionS(Integer precisionS) {
this.precisionS = precisionS;
}

@JsonProperty("relationship_label_s")
public String getRelationshipLabelS() {
return relationshipLabelS;
}

@JsonProperty("relationship_label_s")
public void setRelationshipLabelS(String relationshipLabelS) {
this.relationshipLabelS = relationshipLabelS;
}

@JsonProperty("field_label_s")
public String getFieldLabelS() {
return fieldLabelS;
}

@JsonProperty("field_label_s")
public void setFieldLabelS(String fieldLabelS) {
this.fieldLabelS = fieldLabelS;
}

@JsonProperty("required_s")
public String getRequiredS() {
return requiredS;
}

@JsonProperty("required_s")
public void setRequiredS(String requiredS) {
this.requiredS = requiredS;
}

@JsonProperty("cnty_rqrd")
private Object cntyRqrd;
@JsonProperty("min_val")
private Object minVal;
@JsonProperty("addr_flds")
private Object addrFlds;
@JsonProperty("criteria_method")
private Object criteriaMethod;
@JsonProperty("min_len")
private Object minLen;
@JsonProperty("search_cond")
private Object searchCond;
@JsonProperty("show_icon")
private Object showIcon;
@JsonProperty("cond_value")
private Object condValue;
@JsonProperty("trump_all")
private Object trumpAll;
@JsonProperty("data_pattern")
private Object dataPattern;
@JsonProperty("extn_rqrd")
private Object extnRqrd;
@JsonProperty("max_val")
private Object maxVal;
@JsonProperty("icon_name")
private Object iconName;
@JsonProperty("col_order_s")
private Object colOrderSC;
@JsonProperty("show_link")
private Object showLink;
@JsonProperty("date_comp_fld")
private Object dateCompFld;
@JsonProperty("clr_err_msg_flds")
private Object clrErrMsgFlds;
@JsonProperty("clr_err_msg_rule")
private Object clrErrMsgRule;
@JsonProperty("child_relation")
private Object childRelation;

@JsonProperty("cnty_rqrd")
public Object getCntyRqrd() {
return cntyRqrd;
}

@JsonProperty("cnty_rqrd")
public void setCntyRqrd(Object cntyRqrd) {
this.cntyRqrd = cntyRqrd;
}

@JsonProperty("min_val")
public Object getMinVal() {
return minVal;
}

@JsonProperty("min_val")
public void setMinVal(Object minVal) {
this.minVal = minVal;
}

@JsonProperty("addr_flds")
public Object getAddrFlds() {
return addrFlds;
}

@JsonProperty("addr_flds")
public void setAddrFlds(Object addrFlds) {
this.addrFlds = addrFlds;
}

@JsonProperty("criteria_method")
public Object getCriteriaMethod() {
return criteriaMethod;
}

@JsonProperty("criteria_method")
public void setCriteriaMethod(Object criteriaMethod) {
this.criteriaMethod = criteriaMethod;
}

@JsonProperty("min_len")
public Object getMinLen() {
return minLen;
}

@JsonProperty("min_len")
public void setMinLen(Object minLen) {
this.minLen = minLen;
}

@JsonProperty("search_cond")
public Object getSearchCond() {
return searchCond;
}

@JsonProperty("search_cond")
public void setSearchCond(Object searchCond) {
this.searchCond = searchCond;
}

@JsonProperty("show_icon")
public Object getShowIcon() {
return showIcon;
}

@JsonProperty("show_icon")
public void setShowIcon(Object showIcon) {
this.showIcon = showIcon;
}

@JsonProperty("cond_value")
public Object getCondValue() {
return condValue;
}

@JsonProperty("cond_value")
public void setCondValue(Object condValue) {
this.condValue = condValue;
}

@JsonProperty("trump_all")
public Object getTrumpAll() {
return trumpAll;
}

@JsonProperty("trump_all")
public void setTrumpAll(Object trumpAll) {
this.trumpAll = trumpAll;
}

@JsonProperty("data_pattern")
public Object getDataPattern() {
return dataPattern;
}

@JsonProperty("data_pattern")
public void setDataPattern(Object dataPattern) {
this.dataPattern = dataPattern;
}

@JsonProperty("extn_rqrd")
public Object getExtnRqrd() {
return extnRqrd;
}

@JsonProperty("extn_rqrd")
public void setExtnRqrd(Object extnRqrd) {
this.extnRqrd = extnRqrd;
}

@JsonProperty("max_val")
public Object getMaxVal() {
return maxVal;
}

@JsonProperty("max_val")
public void setMaxVal(Object maxVal) {
this.maxVal = maxVal;
}

@JsonProperty("icon_name")
public Object getIconName() {
return iconName;
}

@JsonProperty("icon_name")
public void setIconName(Object iconName) {
this.iconName = iconName;
}

@JsonProperty("col_order_s__c")
public Object getColOrderSC() {
return colOrderSC;
}

@JsonProperty("col_order_s__c")
public void setColOrderSC(Object colOrderSC) {
this.colOrderSC = colOrderSC;
}

@JsonProperty("show_link")
public Object getShowLink() {
return showLink;
}

@JsonProperty("show_link")
public void setShowLink(Object showLink) {
this.showLink = showLink;
}

@JsonProperty("date_comp_fld")
public Object getDateCompFld() {
return dateCompFld;
}

@JsonProperty("date_comp_fld")
public void setDateCompFld(Object dateCompFld) {
this.dateCompFld = dateCompFld;
}

@JsonProperty("clr_err_msg_flds")
public Object getClrErrMsgFlds() {
return clrErrMsgFlds;
}

@JsonProperty("clr_err_msg_flds")
public void setClrErrMsgFlds(Object clrErrMsgFlds) {
this.clrErrMsgFlds = clrErrMsgFlds;
}

@JsonProperty("clr_err_msg_rule")
public Object getClrErrMsgRule() {
return clrErrMsgRule;
}

@JsonProperty("clr_err_msg_rule")
public void setClrErrMsgRule(Object clrErrMsgRule) {
this.clrErrMsgRule = clrErrMsgRule;
}

@JsonProperty("child_relation")
public Object getChildRelation() {
return childRelation;
}

@JsonProperty("child_relation")
public void setChildRelation(Object childRelation) {
this.childRelation = childRelation;
}

@JsonAnyGetter
public Map<String, String> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, String value) {
this.additionalProperties.put(name, value);
}

}