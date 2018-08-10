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
"id",
"name",
"searchParameter",
"pageSize",
"pageNumber",
"objectType",
"is_Canvas"
})
public class SearchParameters {

@JsonProperty("id")
private String id;
@JsonProperty("name")
private String name;
@JsonProperty("searchParameter")
private String searchParameter;
@JsonProperty("pageSize")
private String pageSize;
@JsonProperty("pageNumber")
private String pageNumber;

@JsonProperty("is_Canvas")
private String isCanvas;
@JsonProperty("is_Canvas")
public void setIsCanvas(String isCanvas) {
	this.isCanvas = isCanvas;
}
@JsonProperty("is_Canvas")
public String getIsCanvas() {
	return isCanvas;
}

@JsonProperty("objectType")
private String objectType;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
@JsonProperty("objectType")
public void setObjectType(String objectType) {
	this.objectType = objectType;
}
@JsonProperty("objectType")
public String getObjectType() {
	return objectType;
}


@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("searchParameter")
public String getSearchParameter() {
return searchParameter;
}

@JsonProperty("searchParameter")
public void setSearchParameter(String searchParameter) {
this.searchParameter = searchParameter;
}

@JsonProperty("pageSize")
public String getPageSize() {
return pageSize;
}

@JsonProperty("pageSize")
public void setPageSize(String pageSize) {
this.pageSize = pageSize;
}

@JsonProperty("pageNumber")
public String getPageNumber() {
return pageNumber;
}

@JsonProperty("pageNumber")
public void setPageNumber(String pageNumber) {
this.pageNumber = pageNumber;
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