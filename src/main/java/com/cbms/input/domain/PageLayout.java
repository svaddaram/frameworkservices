package com.cbms.input.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ide_OBJ_ID",
"ide_PG_LAYOUT_NM",
"ide_PG_LAYOUT_ID",
"ide_PG_SECTN",
"is_Canvas",
"createdBy",
"updatedBy",
"name",
"publishedDate",


"rltedListIds",
"isParent",
"pageRedirect",
"pageId",
"scrnType",
"showTitle",
"relatedList"


})
public class PageLayout {
	
	@JsonProperty("rltedListIds")
	private String rltedListIds;	
	@JsonProperty("isParent")
	private String isParent;
	@JsonProperty("pageRedirect")
	private String pageRedirect;
	@JsonProperty("pageId")
	private String pageId;
	@JsonProperty("scrnType")
	private String scrnType;
	@JsonProperty("showTitle")
	private String showTitle;

	@JsonProperty("relatedList")
	private List<PageLayout> relatedList ;
	
	@JsonProperty("name")
	private String name;	
	@JsonProperty("status")
	private String status;
@JsonProperty("ide_OBJ_ID")
private String ideOBJID;
@JsonProperty("ide_PG_LAYOUT_NM")
private String idePGLAYOUTNM;
@JsonProperty("ide_PG_LAYOUT_ID")
private Integer idePGLAYOUTID;
@JsonProperty("ide_PG_SECTN")
private List<PageSection> ide_PG_SECTN;
@JsonProperty("columnValidation")
private List<ColumnValidation> columnValidation;
@JsonProperty("publishedDate")
private String publishedDate;
@JsonProperty("is_Canvas")
private String isCanvas;
@JsonProperty("publishedDate")
public void setPublishedDate(String publishedDate) {
	this.publishedDate = publishedDate;
}
@JsonProperty("publishedDate")
public String getPublishedDate() {
	return publishedDate;
}
@JsonProperty("relatedList")
public void setRelatedList(List<PageLayout> relatedList) {
	this.relatedList = relatedList;
}
@JsonProperty("relatedList")
public List<PageLayout> getRelatedList() {
	return relatedList;
}


@JsonProperty("columnValidation")
public void setColumnValidation(List<ColumnValidation> columnValidation) {
	this.columnValidation = columnValidation;
}
@JsonProperty("columnValidation")
public List<ColumnValidation> getColumnValidation() {
	return columnValidation;
}
@JsonProperty("status")
public void setStatus(String status) {
	this.status = status;
}
@JsonProperty("status")
public String getStatus() {
	return status;
}
@JsonProperty("name")
public void setName(String name) {
	this.name = name;
}
@JsonProperty("name")
public String getName() {
	return name;
}


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


@JsonProperty("is_Canvas")
public String getIsCanvas() {
	return isCanvas;
}
@JsonProperty("is_Canvas")
public void setIsCanvas(String isCanvas) {
	this.isCanvas = isCanvas;
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
@JsonProperty("ide_PG_SECTN")
public void setIde_PG_SECTN(List<PageSection> ide_PG_SECTN) {
	this.ide_PG_SECTN = ide_PG_SECTN;
}
@JsonProperty("ide_PG_SECTN")
public List<PageSection> getIde_PG_SECTN() {
	return ide_PG_SECTN;
}
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ide_OBJ_ID")
public String getIdeOBJID() {
return ideOBJID;
}

@JsonProperty("ide_OBJ_ID")
public void setIdeOBJID(String ideOBJID) {
this.ideOBJID = ideOBJID;
}

@JsonProperty("ide_PG_LAYOUT_NM")
public String getIdePGLAYOUTNM() {
return idePGLAYOUTNM;
}

@JsonProperty("ide_PG_LAYOUT_NM")
public void setIdePGLAYOUTNM(String idePGLAYOUTNM) {
this.idePGLAYOUTNM = idePGLAYOUTNM;
}

@JsonProperty("ide_PG_LAYOUT_ID")
public Integer getIdePGLAYOUTID() {
return idePGLAYOUTID;
}

@JsonProperty("ide_PG_LAYOUT_ID")
public void setIdePGLAYOUTID(Integer idePGLAYOUTID) {
this.idePGLAYOUTID = idePGLAYOUTID;
}

@JsonProperty("rltedListIds")
public String getRltedListIds() {
	return rltedListIds;
}
@JsonProperty("rltedListIds")
public void setRltedListIds(String rltedListIds) {
	this.rltedListIds = rltedListIds;
}
@JsonProperty("isParent")
public String getIsParent() {
	return isParent;
}
@JsonProperty("isParent")
public void setIsParent(String isParent) {
	this.isParent = isParent;
}
@JsonProperty("pageRedirect")
public String getPageRedirect() {
	return pageRedirect;
}
@JsonProperty("pageRedirect")
public void setPageRedirect(String pageRedirect) {
	this.pageRedirect = pageRedirect;
}
@JsonProperty("pageId")
public String getPageId() {
	return pageId;
}
@JsonProperty("pageId")
public void setPageId(String pageId) {
	this.pageId = pageId;
}
@JsonProperty("scrnType")
public String getScrnType() {
	return scrnType;
}
@JsonProperty("scrnType")
public void setScrnType(String scrnType) {
	this.scrnType = scrnType;
}
@JsonProperty("showTitle")
public String getShowTitle() {
	return showTitle;
}
@JsonProperty("showTitle")
public void setShowTitle(String showTitle) {
	this.showTitle = showTitle;
}
@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}