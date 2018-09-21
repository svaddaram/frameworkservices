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
"precision_s",
"hovr_txt_c",
"obj_name",
"is_parent",
"copy_target_fld",
"external_id_s",
"copy_flds_rule",
"field_label_s",
"page_params",
"field_description_s",
"case_sensitive_s",
"rt_tbl_nm_c",
"blankout_flds_rule",
"ide_obj_id",
"depnt_flds",
"default_value",
"col_order_s",
"copy_src_fld",
"rt_cd_c",
"reference_to_s",
"depnt_s",
"relationship_order_s",
"api_name_s",
"blankout_flds",
"upd_dtm",
"col_fltr_val_c",
"length_s",
"scale_s",
"copy_default_rule",
"label_overide_s",
"copy_default_tar",
"copy_sel_opt_cols",
"row_number",
"ide_fld_seq",
"disable_on_select",
"upd_os_user",
"compute_fld_rule",
"relationship_label_s",
"fld_name",
"type_s",
"copy_default_value",
"edit_val",
"required_s",
"list_view_s",
"col_number",
"ena_dis_rule_exp",
"unique_s",
"mand_rule_exp",
"select_on_select",
"col_visible_s",
"crt_os_usr",
"crt_dtm",
"type_c",
"is_depnt",
"rt_dsc_c",
"disp_rel_lst",
"display_only_s",
"col_fltr_name_c",
"formula_s"
})
public class Field {

@JsonProperty("precision_s")
private Integer precisionS;
@JsonProperty("hovr_txt_c")
private String hovrTxtC;
@JsonProperty("obj_name")
private String objName;
@JsonProperty("is_parent")
private String isParent;
@JsonProperty("copy_target_fld")
private String copyTargetFld;
@JsonProperty("external_id_s")
private String externalIdS;
@JsonProperty("copy_flds_rule")
private String copyFldsRule;
@JsonProperty("field_label_s")
private String fieldLabelS;
@JsonProperty("page_params")
private String pageParams;
@JsonProperty("field_description_s")
private String fieldDescriptionS;
@JsonProperty("case_sensitive_s")
private String caseSensitiveS;
@JsonProperty("rt_tbl_nm_c")
private String rtTblNmC;
@JsonProperty("blankout_flds_rule")
private String blankoutFldsRule;
@JsonProperty("ide_obj_id")
private String ideObjId;
@JsonProperty("depnt_flds")
private String depntFlds;
@JsonProperty("default_value")
private String defaultValue;
@JsonProperty("col_order_s")
private Integer colOrderS;
@JsonProperty("copy_src_fld")
private String copySrcFld;
@JsonProperty("rt_cd_c")
private String rtCdC;
@JsonProperty("reference_to_s")
private String referenceToS;
@JsonProperty("depnt_s")
private String depntS;
@JsonProperty("relationship_order_s")
private String relationshipOrderS;
@JsonProperty("api_name_s")
private String apiNameS;
@JsonProperty("blankout_flds")
private String blankoutFlds;
@JsonProperty("upd_dtm")
private String updDtm;
@JsonProperty("col_fltr_val_c")
private String colFltrValC;
@JsonProperty("length_s")
private Integer lengthS;
@JsonProperty("scale_s")
private Integer scaleS;
@JsonProperty("copy_default_rule")
private String copyDefaultRule;
@JsonProperty("label_overide_s")
private String labelOverideS;
@JsonProperty("copy_default_tar")
private String copyDefaultTar;
@JsonProperty("copy_sel_opt_cols")
private String copySelOptCols;
@JsonProperty("row_number")
private Integer rowNumber;
@JsonProperty("ide_fld_seq")
private Integer ideFldSeq;
@JsonProperty("disable_on_select")
private String disableOnSelect;
@JsonProperty("upd_os_user")
private String updOsUser;
@JsonProperty("compute_fld_rule")
private String computeFldRule;
@JsonProperty("relationship_label_s")
private String relationshipLabelS;
@JsonProperty("fld_name")
private String fldName;
@JsonProperty("type_s")
private String typeS;
@JsonProperty("copy_default_value")
private String copyDefaultValue;
@JsonProperty("edit_val")
private String editVal;
@JsonProperty("required_s")
private String requiredS;
@JsonProperty("list_view_s")
private Integer listViewS;
@JsonProperty("col_number")
private Integer colNumber;
@JsonProperty("ena_dis_rule_exp")
private String enaDisRuleExp;
@JsonProperty("unique_s")
private String uniqueS;
@JsonProperty("mand_rule_exp")
private String mandRuleExp;
@JsonProperty("select_on_select")
private String selectOnSelect;
@JsonProperty("col_visible_s")
private String colVisibleS;
@JsonProperty("crt_os_usr")
private String crtOsUsr;
@JsonProperty("crt_dtm")
private String crtDtm;
@JsonProperty("type_c")
private String typeC;
@JsonProperty("is_depnt")
private String isDepnt;
@JsonProperty("rt_dsc_c")
private String rtDscC;
@JsonProperty("disp_rel_lst")
private String dispRelLst;
@JsonProperty("display_only_s")
private String displayOnlyS;
@JsonProperty("col_fltr_name_c")
private String colFltrNameC;
@JsonProperty("formula_s")
private String formulaS;
@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();

@JsonProperty("precision_s")
public Integer getPrecisionS() {
return precisionS;
}

@JsonProperty("precision_s")
public void setPrecisionS(Integer precisionS) {
this.precisionS = precisionS;
}

@JsonProperty("hovr_txt_c")
public String getHovrTxtC() {
return hovrTxtC;
}

@JsonProperty("hovr_txt_c")
public void setHovrTxtC(String hovrTxtC) {
this.hovrTxtC = hovrTxtC;
}

@JsonProperty("obj_name")
public String getObjName() {
return objName;
}

@JsonProperty("obj_name")
public void setObjName(String objName) {
this.objName = objName;
}

@JsonProperty("is_parent")
public String getIsParent() {
return isParent;
}

@JsonProperty("is_parent")
public void setIsParent(String isParent) {
this.isParent = isParent;
}

@JsonProperty("copy_target_fld")
public String getCopyTargetFld() {
return copyTargetFld;
}

@JsonProperty("copy_target_fld")
public void setCopyTargetFld(String copyTargetFld) {
this.copyTargetFld = copyTargetFld;
}

@JsonProperty("external_id_s")
public String getExternalIdS() {
return externalIdS;
}

@JsonProperty("external_id_s")
public void setExternalIdS(String externalIdS) {
this.externalIdS = externalIdS;
}

@JsonProperty("copy_flds_rule")
public String getCopyFldsRule() {
return copyFldsRule;
}

@JsonProperty("copy_flds_rule")
public void setCopyFldsRule(String copyFldsRule) {
this.copyFldsRule = copyFldsRule;
}

@JsonProperty("field_label_s")
public String getFieldLabelS() {
return fieldLabelS;
}

@JsonProperty("field_label_s")
public void setFieldLabelS(String fieldLabelS) {
this.fieldLabelS = fieldLabelS;
}

@JsonProperty("page_params")
public String getPageParams() {
return pageParams;
}

@JsonProperty("page_params")
public void setPageParams(String pageParams) {
this.pageParams = pageParams;
}

@JsonProperty("field_description_s")
public String getFieldDescriptionS() {
return fieldDescriptionS;
}

@JsonProperty("field_description_s")
public void setFieldDescriptionS(String fieldDescriptionS) {
this.fieldDescriptionS = fieldDescriptionS;
}

@JsonProperty("case_sensitive_s")
public String getCaseSensitiveS() {
return caseSensitiveS;
}

@JsonProperty("case_sensitive_s")
public void setCaseSensitiveS(String caseSensitiveS) {
this.caseSensitiveS = caseSensitiveS;
}

@JsonProperty("rt_tbl_nm_c")
public String getRtTblNmC() {
return rtTblNmC;
}

@JsonProperty("rt_tbl_nm_c")
public void setRtTblNmC(String rtTblNmC) {
this.rtTblNmC = rtTblNmC;
}

@JsonProperty("blankout_flds_rule")
public String getBlankoutFldsRule() {
return blankoutFldsRule;
}

@JsonProperty("blankout_flds_rule")
public void setBlankoutFldsRule(String blankoutFldsRule) {
this.blankoutFldsRule = blankoutFldsRule;
}

@JsonProperty("ide_obj_id")
public String getIdeObjId() {
return ideObjId;
}

@JsonProperty("ide_obj_id")
public void setIdeObjId(String ideObjId) {
this.ideObjId = ideObjId;
}

@JsonProperty("depnt_flds")
public String getDepntFlds() {
return depntFlds;
}

@JsonProperty("depnt_flds")
public void setDepntFlds(String depntFlds) {
this.depntFlds = depntFlds;
}

@JsonProperty("default_value")
public String getDefaultValue() {
return defaultValue;
}

@JsonProperty("default_value")
public void setDefaultValue(String defaultValue) {
this.defaultValue = defaultValue;
}

@JsonProperty("col_order_s")
public Integer getColOrderS() {
return colOrderS;
}

@JsonProperty("col_order_s")
public void setColOrderS(Integer colOrderS) {
this.colOrderS = colOrderS;
}

@JsonProperty("copy_src_fld")
public String getCopySrcFld() {
return copySrcFld;
}

@JsonProperty("copy_src_fld")
public void setCopySrcFld(String copySrcFld) {
this.copySrcFld = copySrcFld;
}

@JsonProperty("rt_cd_c")
public String getRtCdC() {
return rtCdC;
}

@JsonProperty("rt_cd_c")
public void setRtCdC(String rtCdC) {
this.rtCdC = rtCdC;
}

@JsonProperty("reference_to_s")
public String getReferenceToS() {
return referenceToS;
}

@JsonProperty("reference_to_s")
public void setReferenceToS(String referenceToS) {
this.referenceToS = referenceToS;
}

@JsonProperty("depnt_s")
public String getDepntS() {
return depntS;
}

@JsonProperty("depnt_s")
public void setDepntS(String depntS) {
this.depntS = depntS;
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

@JsonProperty("blankout_flds")
public String getBlankoutFlds() {
return blankoutFlds;
}

@JsonProperty("blankout_flds")
public void setBlankoutFlds(String blankoutFlds) {
this.blankoutFlds = blankoutFlds;
}

@JsonProperty("upd_dtm")
public String getUpdDtm() {
return updDtm;
}

@JsonProperty("upd_dtm")
public void setUpdDtm(String updDtm) {
this.updDtm = updDtm;
}

@JsonProperty("col_fltr_val_c")
public String getColFltrValC() {
return colFltrValC;
}

@JsonProperty("col_fltr_val_c")
public void setColFltrValC(String colFltrValC) {
this.colFltrValC = colFltrValC;
}

@JsonProperty("length_s")
public Integer getLengthS() {
return lengthS;
}

@JsonProperty("length_s")
public void setLengthS(Integer lengthS) {
this.lengthS = lengthS;
}

@JsonProperty("scale_s")
public Integer getScaleS() {
return scaleS;
}

@JsonProperty("scale_s")
public void setScaleS(Integer scaleS) {
this.scaleS = scaleS;
}

@JsonProperty("copy_default_rule")
public String getCopyDefaultRule() {
return copyDefaultRule;
}

@JsonProperty("copy_default_rule")
public void setCopyDefaultRule(String copyDefaultRule) {
this.copyDefaultRule = copyDefaultRule;
}

@JsonProperty("label_overide_s")
public String getLabelOverideS() {
return labelOverideS;
}

@JsonProperty("label_overide_s")
public void setLabelOverideS(String labelOverideS) {
this.labelOverideS = labelOverideS;
}

@JsonProperty("copy_default_tar")
public String getCopyDefaultTar() {
return copyDefaultTar;
}

@JsonProperty("copy_default_tar")
public void setCopyDefaultTar(String copyDefaultTar) {
this.copyDefaultTar = copyDefaultTar;
}

@JsonProperty("copy_sel_opt_cols")
public String getCopySelOptCols() {
return copySelOptCols;
}

@JsonProperty("copy_sel_opt_cols")
public void setCopySelOptCols(String copySelOptCols) {
this.copySelOptCols = copySelOptCols;
}

@JsonProperty("row_number")
public Integer getRowNumber() {
return rowNumber;
}

@JsonProperty("row_number")
public void setRowNumber(Integer rowNumber) {
this.rowNumber = rowNumber;
}

@JsonProperty("ide_fld_seq")
public Integer getIdeFldSeq() {
return ideFldSeq;
}

@JsonProperty("ide_fld_seq")
public void setIdeFldSeq(Integer ideFldSeq) {
this.ideFldSeq = ideFldSeq;
}

@JsonProperty("disable_on_select")
public String getDisableOnSelect() {
return disableOnSelect;
}

@JsonProperty("disable_on_select")
public void setDisableOnSelect(String disableOnSelect) {
this.disableOnSelect = disableOnSelect;
}

@JsonProperty("upd_os_user")
public String getUpdOsUser() {
return updOsUser;
}

@JsonProperty("upd_os_user")
public void setUpdOsUser(String updOsUser) {
this.updOsUser = updOsUser;
}

@JsonProperty("compute_fld_rule")
public String getComputeFldRule() {
return computeFldRule;
}

@JsonProperty("compute_fld_rule")
public void setComputeFldRule(String computeFldRule) {
this.computeFldRule = computeFldRule;
}

@JsonProperty("relationship_label_s")
public String getRelationshipLabelS() {
return relationshipLabelS;
}

@JsonProperty("relationship_label_s")
public void setRelationshipLabelS(String relationshipLabelS) {
this.relationshipLabelS = relationshipLabelS;
}

@JsonProperty("fld_name")
public String getFldName() {
return fldName;
}

@JsonProperty("fld_name")
public void setFldName(String fldName) {
this.fldName = fldName;
}

@JsonProperty("type_s")
public String getTypeS() {
return typeS;
}

@JsonProperty("type_s")
public void setTypeS(String typeS) {
this.typeS = typeS;
}

@JsonProperty("copy_default_value")
public String getCopyDefaultValue() {
return copyDefaultValue;
}

@JsonProperty("copy_default_value")
public void setCopyDefaultValue(String copyDefaultValue) {
this.copyDefaultValue = copyDefaultValue;
}

@JsonProperty("edit_val")
public String getEditVal() {
return editVal;
}

@JsonProperty("edit_val")
public void setEditVal(String editVal) {
this.editVal = editVal;
}

@JsonProperty("required_s")
public String getRequiredS() {
return requiredS;
}

@JsonProperty("required_s")
public void setRequiredS(String requiredS) {
this.requiredS = requiredS;
}

@JsonProperty("list_view_s")
public Integer getListViewS() {
return listViewS;
}

@JsonProperty("list_view_s")
public void setListViewS(Integer listViewS) {
this.listViewS = listViewS;
}

@JsonProperty("col_number")
public Integer getColNumber() {
return colNumber;
}

@JsonProperty("col_number")
public void setColNumber(Integer colNumber) {
this.colNumber = colNumber;
}

@JsonProperty("ena_dis_rule_exp")
public String getEnaDisRuleExp() {
return enaDisRuleExp;
}

@JsonProperty("ena_dis_rule_exp")
public void setEnaDisRuleExp(String enaDisRuleExp) {
this.enaDisRuleExp = enaDisRuleExp;
}

@JsonProperty("unique_s")
public String getUniqueS() {
return uniqueS;
}

@JsonProperty("unique_s")
public void setUniqueS(String uniqueS) {
this.uniqueS = uniqueS;
}

@JsonProperty("mand_rule_exp")
public String getMandRuleExp() {
return mandRuleExp;
}

@JsonProperty("mand_rule_exp")
public void setMandRuleExp(String mandRuleExp) {
this.mandRuleExp = mandRuleExp;
}

@JsonProperty("select_on_select")
public String getSelectOnSelect() {
return selectOnSelect;
}

@JsonProperty("select_on_select")
public void setSelectOnSelect(String selectOnSelect) {
this.selectOnSelect = selectOnSelect;
}

@JsonProperty("col_visible_s")
public String getColVisibleS() {
return colVisibleS;
}

@JsonProperty("col_visible_s")
public void setColVisibleS(String colVisibleS) {
this.colVisibleS = colVisibleS;
}

@JsonProperty("crt_os_usr")
public String getCrtOsUsr() {
return crtOsUsr;
}

@JsonProperty("crt_os_usr")
public void setCrtOsUsr(String crtOsUsr) {
this.crtOsUsr = crtOsUsr;
}

@JsonProperty("crt_dtm")
public String getCrtDtm() {
return crtDtm;
}

@JsonProperty("crt_dtm")
public void setCrtDtm(String crtDtm) {
this.crtDtm = crtDtm;
}

@JsonProperty("type_c")
public String getTypeC() {
return typeC;
}

@JsonProperty("type_c")
public void setTypeC(String typeC) {
this.typeC = typeC;
}

@JsonProperty("is_depnt")
public String getIsDepnt() {
return isDepnt;
}

@JsonProperty("is_depnt")
public void setIsDepnt(String isDepnt) {
this.isDepnt = isDepnt;
}

@JsonProperty("rt_dsc_c")
public String getRtDscC() {
return rtDscC;
}

@JsonProperty("rt_dsc_c")
public void setRtDscC(String rtDscC) {
this.rtDscC = rtDscC;
}

@JsonProperty("disp_rel_lst")
public String getDispRelLst() {
return dispRelLst;
}

@JsonProperty("disp_rel_lst")
public void setDispRelLst(String dispRelLst) {
this.dispRelLst = dispRelLst;
}

@JsonProperty("display_only_s")
public String getDisplayOnlyS() {
return displayOnlyS;
}

@JsonProperty("display_only_s")
public void setDisplayOnlyS(String displayOnlyS) {
this.displayOnlyS = displayOnlyS;
}

@JsonProperty("col_fltr_name_c")
public String getColFltrNameC() {
return colFltrNameC;
}

@JsonProperty("col_fltr_name_c")
public void setColFltrNameC(String colFltrNameC) {
this.colFltrNameC = colFltrNameC;
}

@JsonProperty("formula_s")
public String getFormulaS() {
return formulaS;
}

@JsonProperty("formula_s")
public void setFormulaS(String formulaS) {
this.formulaS = formulaS;
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