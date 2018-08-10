
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
"type_C",
"col_ORDER_S",
"ide_FLD_SEQ",
"api_NAME_S",
"field_LABEL_S",
"type_S",
"required_S",
"unique_S",
"case_SENSITIVE_S",
"external_ID_S",
"field_DESCRIPTION_S",
"reference_TO_S",
"relationship_LABEL_S",
"relationship_ORDER_S",
"col_FLTR_NAME_C",
"col_FLTR_VAL_C",
"hovr_TXT_C",
"rt_CD_C",
"rt_DSC_C",
"rt_TBL_NM_C",
"label_OVERIDE_S",
"display_ONLY_S",
"col_VISIBLE_S",
"length_S",
"precision_S",
"scale_S",
"list_VIEW_S",
"formula_S",
"row_NUMBER",
"col_NUMBER",
"edit_VAL",
"obj_NAME",
"fld_NAME",
"ena_DIS_RULE_EXP",
"mand_RULE_EXP",
"depnt_FLDS",
"is_DEPNT",
"page_PARAMS",
"depnt_S",
"blankout_FLDS",
"blankout_FLDS_RULE",
"copy_SRC_FLD",
"copy_TARGET_FLD",
"copy_FLDS_RULE",
"copy_SEL_OPT_COLS",
"compute_FLD_RULE",
"default_VALUE",
"copy_DEFAULT_VALUE",
"copy_DEFAULT_TAR",
"copy_DEFAULT_RULE",
"disable_ON_SELECT",
"select_ON_SELECT",
"createdBy",
"updatedBy",
"dispRelLst",
"name",
"defaultValue",
"isParent"

})
public class Field {
	@JsonProperty("defaultValue")
	private String defaultValue;
	@JsonProperty("isParent")
	private String isParent;
		
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("ide_OBJ_ID")
	private String ideOBJID;
	@JsonProperty("dispRelLst")
	private String dispRelLst;

@JsonProperty("type_C")
private String typeC;
@JsonProperty("col_ORDER_S")
private Integer colORDERS;
@JsonProperty("ide_FLD_SEQ")
private Integer ideFLDSEQ;
@JsonProperty("api_NAME_S")
private String apiNAMES;
@JsonProperty("field_LABEL_S")
private String fieldLABELS;
@JsonProperty("type_S")
private String typeS;
@JsonProperty("required_S")
private String requiredS;
@JsonProperty("unique_S")
private String uniqueS;
@JsonProperty("case_SENSITIVE_S")
private String caseSENSITIVES;
@JsonProperty("external_ID_S")
private String externalIDS;
@JsonProperty("field_DESCRIPTION_S")
private String fieldDESCRIPTIONS;
@JsonProperty("reference_TO_S")
private String referenceTOS;
@JsonProperty("relationship_LABEL_S")
private String relationshipLABELS;
@JsonProperty("relationship_ORDER_S")
private String relationshipORDERS;
@JsonProperty("col_FLTR_NAME_C")
private String colFLTRNAMEC;
@JsonProperty("col_FLTR_VAL_C")
private String colFLTRVALC;
@JsonProperty("hovr_TXT_C")
private String hovrTXTC;
@JsonProperty("rt_CD_C")
private String rtCDC;
@JsonProperty("rt_DSC_C")
private String rtDSCC;
@JsonProperty("rt_TBL_NM_C")
private String rtTBLNMC;
@JsonProperty("label_OVERIDE_S")
private String labelOVERIDES;
@JsonProperty("display_ONLY_S")
private String displayONLYS;
@JsonProperty("col_VISIBLE_S")
private String colVISIBLES;
@JsonProperty("length_S")
private Integer lengthS;
@JsonProperty("precision_S")
private Integer precisionS;
@JsonProperty("scale_S")
private Integer scaleS;
@JsonProperty("list_VIEW_S")
private Integer listVIEWS;
@JsonProperty("formula_S")
private String formulaS;
@JsonProperty("row_NUMBER")
private Integer rowNUMBER;
@JsonProperty("col_NUMBER")
private Integer colNUMBER;
@JsonProperty("edit_VAL")
private String editVAL;
@JsonProperty("obj_NAME")
private String objNAME;
@JsonProperty("fld_NAME")
private String fldNAME;
@JsonProperty("ena_DIS_RULE_EXP")
private String enaDISRULEEXP;
@JsonProperty("mand_RULE_EXP")
private String mandRULEEXP;
@JsonProperty("depnt_FLDS")
private String depntFLDS;
@JsonProperty("is_DEPNT")
private String isDEPNT;
@JsonProperty("page_PARAMS")
private String pagePARAMS;
@JsonProperty("depnt_S")
private String depntS;
@JsonProperty("blankout_FLDS")
private String blankoutFLDS;
@JsonProperty("blankout_FLDS_RULE")
private String blankoutFLDSRULE;
@JsonProperty("copy_SRC_FLD")
private String copySRCFLD;
@JsonProperty("copy_TARGET_FLD")
private String copyTARGETFLD;
@JsonProperty("copy_FLDS_RULE")
private String copyFLDSRULE;
@JsonProperty("copy_SEL_OPT_COLS")
private String copySELOPTCOLS;
@JsonProperty("compute_FLD_RULE")
private String computeFLDRULE;

@JsonProperty("copy_DEFAULT_VALUE")
private String copyDEFAULTVALUE;
@JsonProperty("copy_DEFAULT_TAR")
private String copyDEFAULTTAR;
@JsonProperty("copy_DEFAULT_RULE")
private String copyDEFAULTRULE;
@JsonProperty("disable_ON_SELECT")
private String disableONSELECT;
@JsonProperty("select_ON_SELECT")
private String selectONSELECT;
@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();

@JsonProperty("modifiedTimeStamp")
private String modifiedTimeStamp;

@JsonProperty("createdTimeStamp")
private String createdTimeStamp;


@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("updatedBy")
private String updatedBy;

@JsonProperty("defaultValue")
public String getDefaultValue() {
	return defaultValue;
}
@JsonProperty("defaultValue")
public void setDefaultValue(String defaultValue) {
	this.defaultValue = defaultValue;
}
@JsonProperty("isParent")
public String getIsParent() {
	return isParent;
}
@JsonProperty("isParent")
public void setIsParent(String isParent) {
	this.isParent = isParent;
}
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
@JsonProperty("dispRelLst")
public void setDispRelLst(String dispRelLst) {
	this.dispRelLst = dispRelLst;
}
@JsonProperty("dispRelLst")
public String getDispRelLst() {
	return dispRelLst;
}


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
@JsonProperty("ide_OBJ_ID")
public void setIdeOBJID(String ideOBJID) {
	this.ideOBJID = ideOBJID;
}
@JsonProperty("ide_OBJ_ID")
public String getIdeOBJID() {
	return ideOBJID;
}

@JsonProperty("type_C")
public String getTypeC() {
return typeC;
}

@JsonProperty("type_C")
public void setTypeC(String typeC) {
this.typeC = typeC;
}

@JsonProperty("col_ORDER_S")
public Integer getColORDERS() {
return colORDERS;
}

@JsonProperty("col_ORDER_S")
public void setColORDERS(Integer colORDERS) {
this.colORDERS = colORDERS;
}

@JsonProperty("ide_FLD_SEQ")
public Integer getIdeFLDSEQ() {
return ideFLDSEQ;
}

@JsonProperty("ide_FLD_SEQ")
public void setIdeFLDSEQ(Integer ideFLDSEQ) {
this.ideFLDSEQ = ideFLDSEQ;
}

@JsonProperty("api_NAME_S")
public String getApiNAMES() {
return apiNAMES;
}

@JsonProperty("api_NAME_S")
public void setApiNAMES(String apiNAMES) {
this.apiNAMES = apiNAMES;
}

@JsonProperty("field_LABEL_S")
public String getFieldLABELS() {
return fieldLABELS;
}

@JsonProperty("field_LABEL_S")
public void setFieldLABELS(String fieldLABELS) {
this.fieldLABELS = fieldLABELS;
}

@JsonProperty("type_S")
public String getTypeS() {
return typeS;
}

@JsonProperty("type_S")
public void setTypeS(String typeS) {
this.typeS = typeS;
}

@JsonProperty("required_S")
public String getRequiredS() {
return requiredS;
}

@JsonProperty("required_S")
public void setRequiredS(String requiredS) {
this.requiredS = requiredS;
}

@JsonProperty("unique_S")
public String getUniqueS() {
return uniqueS;
}

@JsonProperty("unique_S")
public void setUniqueS(String uniqueS) {
this.uniqueS = uniqueS;
}

@JsonProperty("case_SENSITIVE_S")
public String getCaseSENSITIVES() {
return caseSENSITIVES;
}

@JsonProperty("case_SENSITIVE_S")
public void setCaseSENSITIVES(String caseSENSITIVES) {
this.caseSENSITIVES = caseSENSITIVES;
}

@JsonProperty("external_ID_S")
public String getExternalIDS() {
return externalIDS;
}

@JsonProperty("external_ID_S")
public void setExternalIDS(String externalIDS) {
this.externalIDS = externalIDS;
}

@JsonProperty("field_DESCRIPTION_S")
public String getFieldDESCRIPTIONS() {
return fieldDESCRIPTIONS;
}

@JsonProperty("field_DESCRIPTION_S")
public void setFieldDESCRIPTIONS(String fieldDESCRIPTIONS) {
this.fieldDESCRIPTIONS = fieldDESCRIPTIONS;
}

@JsonProperty("reference_TO_S")
public String getReferenceTOS() {
return referenceTOS;
}

@JsonProperty("reference_TO_S")
public void setReferenceTOS(String referenceTOS) {
this.referenceTOS = referenceTOS;
}

@JsonProperty("relationship_LABEL_S")
public String getRelationshipLABELS() {
return relationshipLABELS;
}

@JsonProperty("relationship_LABEL_S")
public void setRelationshipLABELS(String relationshipLABELS) {
this.relationshipLABELS = relationshipLABELS;
}

@JsonProperty("relationship_ORDER_S")
public String getRelationshipORDERS() {
return relationshipORDERS;
}

@JsonProperty("relationship_ORDER_S")
public void setRelationshipORDERS(String relationshipORDERS) {
this.relationshipORDERS = relationshipORDERS;
}

@JsonProperty("col_FLTR_NAME_C")
public String getColFLTRNAMEC() {
return colFLTRNAMEC;
}

@JsonProperty("col_FLTR_NAME_C")
public void setColFLTRNAMEC(String colFLTRNAMEC) {
this.colFLTRNAMEC = colFLTRNAMEC;
}

@JsonProperty("col_FLTR_VAL_C")
public String getColFLTRVALC() {
return colFLTRVALC;
}

@JsonProperty("col_FLTR_VAL_C")
public void setColFLTRVALC(String colFLTRVALC) {
this.colFLTRVALC = colFLTRVALC;
}

@JsonProperty("hovr_TXT_C")
public String getHovrTXTC() {
return hovrTXTC;
}

@JsonProperty("hovr_TXT_C")
public void setHovrTXTC(String hovrTXTC) {
this.hovrTXTC = hovrTXTC;
}

@JsonProperty("rt_CD_C")
public String getRtCDC() {
return rtCDC;
}

@JsonProperty("rt_CD_C")
public void setRtCDC(String rtCDC) {
this.rtCDC = rtCDC;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

@JsonProperty("rt_DSC_C")
public String getRtDSCC() {
return rtDSCC;
}

@JsonProperty("rt_DSC_C")
public void setRtDSCC(String rtDSCC) {
this.rtDSCC = rtDSCC;
}

@JsonProperty("rt_TBL_NM_C")
public String getRtTBLNMC() {
return rtTBLNMC;
}

@JsonProperty("rt_TBL_NM_C")
public void setRtTBLNMC(String rtTBLNMC) {
this.rtTBLNMC = rtTBLNMC;
}

@JsonProperty("label_OVERIDE_S")
public String getLabelOVERIDES() {
return labelOVERIDES;
}

@JsonProperty("label_OVERIDE_S")
public void setLabelOVERIDES(String labelOVERIDES) {
this.labelOVERIDES = labelOVERIDES;
}

@JsonProperty("display_ONLY_S")
public String getDisplayONLYS() {
return displayONLYS;
}

@JsonProperty("display_ONLY_S")
public void setDisplayONLYS(String displayONLYS) {
this.displayONLYS = displayONLYS;
}

@JsonProperty("col_VISIBLE_S")
public String getColVISIBLES() {
return colVISIBLES;
}

@JsonProperty("col_VISIBLE_S")
public void setColVISIBLES(String colVISIBLES) {
this.colVISIBLES = colVISIBLES;
}

@JsonProperty("length_S")
public Integer getLengthS() {
return lengthS;
}

@JsonProperty("length_S")
public void setLengthS(Integer lengthS) {
this.lengthS = lengthS;
}

@JsonProperty("precision_S")
public Integer getPrecisionS() {
return precisionS;
}

@JsonProperty("precision_S")
public void setPrecisionS(Integer precisionS) {
this.precisionS = precisionS;
}

@JsonProperty("scale_S")
public Integer getScaleS() {
return scaleS;
}

@JsonProperty("scale_S")
public void setScaleS(Integer scaleS) {
this.scaleS = scaleS;
}

@JsonProperty("list_VIEW_S")
public Integer getListVIEWS() {
return listVIEWS;
}

@JsonProperty("list_VIEW_S")
public void setListVIEWS(Integer listVIEWS) {
this.listVIEWS = listVIEWS;
}

@JsonProperty("formula_S")
public String getFormulaS() {
return formulaS;
}

@JsonProperty("formula_S")
public void setFormulaS(String formulaS) {
this.formulaS = formulaS;
}

@JsonProperty("row_NUMBER")
public Integer getRowNUMBER() {
return rowNUMBER;
}

@JsonProperty("row_NUMBER")
public void setRowNUMBER(Integer rowNUMBER) {
this.rowNUMBER = rowNUMBER;
}

@JsonProperty("col_NUMBER")
public Integer getColNUMBER() {
return colNUMBER;
}

@JsonProperty("col_NUMBER")
public void setColNUMBER(Integer colNUMBER) {
this.colNUMBER = colNUMBER;
}

@JsonProperty("edit_VAL")
public String getEditVAL() {
return editVAL;
}

@JsonProperty("edit_VAL")
public void setEditVAL(String editVAL) {
this.editVAL = editVAL;
}

@JsonProperty("obj_NAME")
public String getObjNAME() {
return objNAME;
}

@JsonProperty("obj_NAME")
public void setObjNAME(String objNAME) {
this.objNAME = objNAME;
}

@JsonProperty("fld_NAME")
public String getFldNAME() {
return fldNAME;
}

@JsonProperty("fld_NAME")
public void setFldNAME(String fldNAME) {
this.fldNAME = fldNAME;
}

@JsonProperty("ena_DIS_RULE_EXP")
public String getEnaDISRULEEXP() {
return enaDISRULEEXP;
}

@JsonProperty("ena_DIS_RULE_EXP")
public void setEnaDISRULEEXP(String enaDISRULEEXP) {
this.enaDISRULEEXP = enaDISRULEEXP;
}

@JsonProperty("mand_RULE_EXP")
public String getMandRULEEXP() {
return mandRULEEXP;
}

@JsonProperty("mand_RULE_EXP")
public void setMandRULEEXP(String mandRULEEXP) {
this.mandRULEEXP = mandRULEEXP;
}

@JsonProperty("depnt_FLDS")
public String getDepntFLDS() {
return depntFLDS;
}

@JsonProperty("depnt_FLDS")
public void setDepntFLDS(String depntFLDS) {
this.depntFLDS = depntFLDS;
}

@JsonProperty("is_DEPNT")
public String getIsDEPNT() {
return isDEPNT;
}

@JsonProperty("is_DEPNT")
public void setIsDEPNT(String isDEPNT) {
this.isDEPNT = isDEPNT;
}

@JsonProperty("page_PARAMS")
public String getPagePARAMS() {
return pagePARAMS;
}

@JsonProperty("page_PARAMS")
public void setPagePARAMS(String pagePARAMS) {
this.pagePARAMS = pagePARAMS;
}

@JsonProperty("depnt_S")
public String getDepntS() {
return depntS;
}

@JsonProperty("depnt_S")
public void setDepntS(String depntS) {
this.depntS = depntS;
}

@JsonProperty("blankout_FLDS")
public String getBlankoutFLDS() {
return blankoutFLDS;
}

@JsonProperty("blankout_FLDS")
public void setBlankoutFLDS(String blankoutFLDS) {
this.blankoutFLDS = blankoutFLDS;
}

@JsonProperty("blankout_FLDS_RULE")
public String getBlankoutFLDSRULE() {
return blankoutFLDSRULE;
}

@JsonProperty("blankout_FLDS_RULE")
public void setBlankoutFLDSRULE(String blankoutFLDSRULE) {
this.blankoutFLDSRULE = blankoutFLDSRULE;
}

@JsonProperty("copy_SRC_FLD")
public String getCopySRCFLD() {
return copySRCFLD;
}

@JsonProperty("copy_SRC_FLD")
public void setCopySRCFLD(String copySRCFLD) {
this.copySRCFLD = copySRCFLD;
}

@JsonProperty("copy_TARGET_FLD")
public String getCopyTARGETFLD() {
return copyTARGETFLD;
}

@JsonProperty("copy_TARGET_FLD")
public void setCopyTARGETFLD(String copyTARGETFLD) {
this.copyTARGETFLD = copyTARGETFLD;
}

@JsonProperty("copy_FLDS_RULE")
public String getCopyFLDSRULE() {
return copyFLDSRULE;
}

@JsonProperty("copy_FLDS_RULE")
public void setCopyFLDSRULE(String copyFLDSRULE) {
this.copyFLDSRULE = copyFLDSRULE;
}

@JsonProperty("copy_SEL_OPT_COLS")
public String getCopySELOPTCOLS() {
return copySELOPTCOLS;
}

@JsonProperty("copy_SEL_OPT_COLS")
public void setCopySELOPTCOLS(String copySELOPTCOLS) {
this.copySELOPTCOLS = copySELOPTCOLS;
}

@JsonProperty("compute_FLD_RULE")
public String getComputeFLDRULE() {
return computeFLDRULE;
}

@JsonProperty("compute_FLD_RULE")
public void setComputeFLDRULE(String computeFLDRULE) {
this.computeFLDRULE = computeFLDRULE;
}


@JsonProperty("copy_DEFAULT_VALUE")
public String getCopyDEFAULTVALUE() {
return copyDEFAULTVALUE;
}

@JsonProperty("copy_DEFAULT_VALUE")
public void setCopyDEFAULTVALUE(String copyDEFAULTVALUE) {
this.copyDEFAULTVALUE = copyDEFAULTVALUE;
}

@JsonProperty("copy_DEFAULT_TAR")
public String getCopyDEFAULTTAR() {
return copyDEFAULTTAR;
}

@JsonProperty("copy_DEFAULT_TAR")
public void setCopyDEFAULTTAR(String copyDEFAULTTAR) {
this.copyDEFAULTTAR = copyDEFAULTTAR;
}

@JsonProperty("copy_DEFAULT_RULE")
public String getCopyDEFAULTRULE() {
return copyDEFAULTRULE;
}

@JsonProperty("copy_DEFAULT_RULE")
public void setCopyDEFAULTRULE(String copyDEFAULTRULE) {
this.copyDEFAULTRULE = copyDEFAULTRULE;
}

@JsonProperty("disable_ON_SELECT")
public String getDisableONSELECT() {
return disableONSELECT;
}

@JsonProperty("disable_ON_SELECT")
public void setDisableONSELECT(String disableONSELECT) {
this.disableONSELECT = disableONSELECT;
}

@JsonProperty("select_ON_SELECT")
public String getSelectONSELECT() {
return selectONSELECT;
}

@JsonProperty("select_ON_SELECT")
public void setSelectONSELECT(String selectONSELECT) {
this.selectONSELECT = selectONSELECT;
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