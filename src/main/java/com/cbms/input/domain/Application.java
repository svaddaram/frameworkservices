package com.cbms.input.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"is_CUSTOM",
"object_NAME_S",
"api_S",
"ide_OBJ_ID",
"type_C",
"enable_STRMING_API_S",
"enable_SRCH_S",
"enable_BULK_APL_S",
"enable_SHARING_S",
"plural_NAME_S",
"sharing_MODEL_S",
"enable_ACTVITIES_S",
"enable_FEEDS_S",
"enable_HISTORY_S",
"enable_REPORTS_S",
"description_S",
"seq_TYPE_S",
"label_S",
"display_FORMAT_S",
"modifiedTimeStamp",
"createdTimeStamp",
"generate_C",
"inapp_C",
"ideFlds",
"idePgLayouts",
"createdBy",
"updatedBy",
"name",
"dwName",
"status"
})
public class Application {
	@JsonProperty("status")
	private String status;

@JsonProperty("name")
private String name;
@JsonProperty("dwName")
private String dwName;
@JsonProperty("is_CUSTOM")
private String isCustom;
@JsonProperty("object_NAME_S")
private String objectNames;
@JsonProperty("api_S")
private String apiS;
@JsonProperty("ide_OBJ_ID")
private String ideOBJID;
@JsonProperty("type_C")
private String typeC;
@JsonProperty("enable_STRMING_API_S")
private String enableSTRMINGAPIS;
@JsonProperty("enable_SRCH_S")
private String enableSRCHS;
@JsonProperty("enable_BULK_APL_S")
private String enableBULKAPLS;
@JsonProperty("enable_SHARING_S")
private String enableSHARINGS;
@JsonProperty("plural_NAME_S")
private String pluralNAMES;
@JsonProperty("sharing_MODEL_S")
private String sharingMODELS;
@JsonProperty("enable_ACTVITIES_S")
private String enableACTVITIESS;
@JsonProperty("enable_FEEDS_S")
private String enableFEEDSS;
@JsonProperty("enable_HISTORY_S")
private String enableHISTORYS;
@JsonProperty("enable_REPORTS_S")
private String enableREPORTSS;
@JsonProperty("description_S")
private String descriptionS;
@JsonProperty("seq_TYPE_S")
private String seqTYPES;
@JsonProperty("label_S")
private String labelS;
@JsonProperty("display_FORMAT_S")
private String displayFormat;
@JsonProperty("generate_C")
private String generateC;
@JsonProperty("inapp_C")
private String inappC;
@JsonProperty("ideFlds")
private List<Field> ideFlds = null;
@JsonProperty("idePgLayouts")
private List<PageLayout> idePgLayouts = null;
@JsonProperty("modifiedTimeStamp")
private String modifiedTimeStamp;

@JsonProperty("createdTimeStamp")
private String createdTimeStamp;

@JsonProperty("pageStatusList")
private List<PageLayout> pgStatusList = null;

@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("updatedBy")
private String updatedBy;
@JsonProperty("pageRelatedList")
private List<PageLayout> pageRelatedList = null;

@JsonProperty("addedPageRelatedList")
private List<PageLayout> addedPageRelatedList = null;

@JsonProperty("addedPageRelatedList")
public void setAddedPageRelatedList(List<PageLayout> addedPageRelatedList) {
	this.addedPageRelatedList = addedPageRelatedList;
}

@JsonProperty("pageRelatedList")
public void setPageRelatedList(List<PageLayout> pageRelatedList) {
	this.pageRelatedList = pageRelatedList;
}

@JsonProperty("pageRelatedList")
public List<PageLayout> getPageRelatedList() {
	return pageRelatedList;
}

@JsonProperty("addedPageRelatedList")
public List<PageLayout> getAddedPageRelatedList() {
	return addedPageRelatedList;
}

@JsonProperty("pageStatusList")
public void setPgStatusList(List<PageLayout> pgStatusList) {
	this.pgStatusList = pgStatusList;
}
@JsonProperty("pageStatusList")
public List<PageLayout> getPgStatusList() {
	return pgStatusList;
}
@JsonProperty("status")
public void setStatus(String status) {
	this.status = status;
}
@JsonProperty("status")
public String getStatus() {
	return status;
}
public String getIsCustom() {
	return isCustom;
}
public void setIsCustom(String isCustom) {
	this.isCustom = isCustom;
}
public String getObjectNames() {
	return objectNames;
}
public void setObjectNames(String objectNames) {
	this.objectNames = objectNames;
}




@JsonProperty("api_S")
public String getApiS() {
return apiS;
}

@JsonProperty("api_S")
public void setApiS(String apiS) {
this.apiS = apiS;
}

@JsonProperty("ide_OBJ_ID")
public String getIdeOBJID() {
return ideOBJID;
}

@JsonProperty("ide_OBJ_ID")
public void setIdeOBJID(String ideOBJID) {
this.ideOBJID = ideOBJID;
}

@JsonProperty("type_C")
public String getTypeC() {
return typeC;
}

@JsonProperty("type_C")
public void setTypeC(String typeC) {
this.typeC = typeC;
}

@JsonProperty("enable_STRMING_API_S")
public String getEnableSTRMINGAPIS() {
return enableSTRMINGAPIS;
}

@JsonProperty("enable_STRMING_API_S")
public void setEnableSTRMINGAPIS(String enableSTRMINGAPIS) {
this.enableSTRMINGAPIS = enableSTRMINGAPIS;
}

@JsonProperty("enable_SRCH_S")
public String getEnableSRCHS() {
return enableSRCHS;
}

@JsonProperty("enable_SRCH_S")
public void setEnableSRCHS(String enableSRCHS) {
this.enableSRCHS = enableSRCHS;
}

@JsonProperty("enable_BULK_APL_S")
public String getEnableBULKAPLS() {
return enableBULKAPLS;
}

@JsonProperty("enable_BULK_APL_S")
public void setEnableBULKAPLS(String enableBULKAPLS) {
this.enableBULKAPLS = enableBULKAPLS;
}

@JsonProperty("enable_SHARING_S")
public String getEnableSHARINGS() {
return enableSHARINGS;
}

@JsonProperty("enable_SHARING_S")
public void setEnableSHARINGS(String enableSHARINGS) {
this.enableSHARINGS = enableSHARINGS;
}

@JsonProperty("plural_NAME_S")
public String getPluralNAMES() {
return pluralNAMES;
}

@JsonProperty("plural_NAME_S")
public void setPluralNAMES(String pluralNAMES) {
this.pluralNAMES = pluralNAMES;
}

@JsonProperty("sharing_MODEL_S")
public String getSharingMODELS() {
return sharingMODELS;
}

@JsonProperty("sharing_MODEL_S")
public void setSharingMODELS(String sharingMODELS) {
this.sharingMODELS = sharingMODELS;
}

@JsonProperty("enable_ACTVITIES_S")
public String getEnableACTVITIESS() {
return enableACTVITIESS;
}

@JsonProperty("enable_ACTVITIES_S")
public void setEnableACTVITIESS(String enableACTVITIESS) {
this.enableACTVITIESS = enableACTVITIESS;
}

@JsonProperty("enable_FEEDS_S")
public String getEnableFEEDSS() {
return enableFEEDSS;
}

@JsonProperty("enable_FEEDS_S")
public void setEnableFEEDSS(String enableFEEDSS) {
this.enableFEEDSS = enableFEEDSS;
}

@JsonProperty("enable_HISTORY_S")
public String getEnableHISTORYS() {
return enableHISTORYS;
}

@JsonProperty("enable_HISTORY_S")
public void setEnableHISTORYS(String enableHISTORYS) {
this.enableHISTORYS = enableHISTORYS;
}

@JsonProperty("enable_REPORTS_S")
public String getEnableREPORTSS() {
return enableREPORTSS;
}

@JsonProperty("enable_REPORTS_S")
public void setEnableREPORTSS(String enableREPORTSS) {
this.enableREPORTSS = enableREPORTSS;
}

@JsonProperty("description_S")
public String getDescriptionS() {
return descriptionS;
}

@JsonProperty("description_S")
public void setDescriptionS(String descriptionS) {
this.descriptionS = descriptionS;
}

public List<PageLayout> getIdePgLayouts() {
	return idePgLayouts;
}
public void setIdePgLayouts(List<PageLayout> idePgLayouts) {
	this.idePgLayouts = idePgLayouts;
}
public String getModifiedTimeStamp() {
	return modifiedTimeStamp;
}
public void setModifiedTimeStamp(String modifiedTimeStamp) {
	this.modifiedTimeStamp = modifiedTimeStamp;
}
public String getCreatedTimeStamp() {
	return createdTimeStamp;
}
public void setCreatedTimeStamp(String createdTimeStamp) {
	this.createdTimeStamp = createdTimeStamp;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
@JsonProperty("seq_TYPE_S")
public String getSeqTYPES() {
return seqTYPES;
}

@JsonProperty("seq_TYPE_S")
public void setSeqTYPES(String seqTYPES) {
this.seqTYPES = seqTYPES;
}

@JsonProperty("label_S")
public String getLabelS() {
return labelS;
}

@JsonProperty("label_S")
public void setLabelS(String labelS) {
this.labelS = labelS;
}

@JsonProperty("display_FORMAT_S")
public String getDisplayFORMATS() {
return displayFormat;
}

@JsonProperty("display_FORMAT_S")
public void setDisplayFORMATS(String displayFormat) {
this.displayFormat = displayFormat;
}

@JsonProperty("generate_C")
public String getGenerateC() {
return generateC;
}

@JsonProperty("generate_C")
public void setGenerateC(String generateC) {
this.generateC = generateC;
}

@JsonProperty("inapp_C")
public String getInappC() {
return inappC;
}

@JsonProperty("inapp_C")
public void setInappC(String inappC) {
this.inappC = inappC;
}

@JsonProperty("ideFlds")
public List<Field> getIdeFlds() {
return ideFlds;
}

@JsonProperty("ideFlds")
public void setIdeFlds(List<Field> ideFlds) {
this.ideFlds = ideFlds;
}


public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setDwName(String dwName) {
	this.dwName = dwName;
}

public String getDwName() {
	return dwName;
}


}

