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
"typ",
"ide_PG_SECTN_ID",
"ide_PG_SECTN_SEQ",
"grp_LABLE",
"allw_DEL",
"vw_DEL",
"vw_HIST",
"ide_PG_GRP_ID",
"type",
"sectn_VISIBLE",
"ide_PG_LAYOUT_ID",
"ide_field_layout",
"idePageSubSectns",
"createdBy",
"updatedBy",
"row",
"column",
"name",
"dwName"
})
public class PageSection {
	

	@JsonProperty("name")
	private String name;
	@JsonProperty("dwName")
	private String dwName;
@JsonProperty("ide_OBJ_ID")
private String ideOBJID;
@JsonProperty("typ")
private String typ;
@JsonProperty("ide_PG_SECTN_ID")
private Integer idePGSECTNID;
@JsonProperty("ide_PG_SECTN_SEQ")
private Integer idePGSECTNSEQ;
@JsonProperty("grp_LABLE")
private String grpLABLE;
@JsonProperty("allw_DEL")
private String allwDEL;
@JsonProperty("vw_DEL")
private String vwDEL;
@JsonProperty("vw_HIST")
private String vwHIST;
@JsonProperty("ide_PG_GRP_ID")
private Integer idePGGRPID;
@JsonProperty("type")
private String type;
@JsonProperty("sectn_VISIBLE")
private String sectnVISIBLE;
@JsonProperty("ide_PG_LAYOUT_ID")
private Integer idePGLAYOUTID;
@JsonProperty("ide_field_layout")
private List<FieldLayout> ide_field_layout;

@JsonProperty("row")
private Integer row;
@JsonProperty("column")
private Integer column;
@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("updatedBy")
private String updatedBy;
@JsonProperty("ena_DIS_RULE_EXP")
private String ena_DIS_RULE_EXP;
@JsonProperty("isSumDetail")
private String isSumDetail;
@JsonProperty("showAdd")
private String showAdd;
@JsonProperty("showActn")
private String showActn;
@JsonProperty("allowEdit")
private String allowEdit;
@JsonProperty("allowView")
private String allowView;
@JsonProperty("showTable")
private String showTable;
@JsonProperty("ena_DIS_RULE_EXP")
public String getEna_DIS_RULE_EXP() {
	return ena_DIS_RULE_EXP;
}
@JsonProperty("ena_DIS_RULE_EXP")
public void setEna_DIS_RULE_EXP(String ena_DIS_RULE_EXP) {
	this.ena_DIS_RULE_EXP = ena_DIS_RULE_EXP;
}
@JsonProperty("showTable")
public String getShowTable() {
	return showTable;
}
@JsonProperty("showTable")
public void setShowTable(String showTable) {
	this.showTable = showTable;
}
@JsonProperty("isSumDetail")
public String getIsSumDetail() {
	return isSumDetail;
}
@JsonProperty("isSumDetail")
public void setIsSumDetail(String isSumDetail) {
	this.isSumDetail = isSumDetail;
}
@JsonProperty("showAdd")
public String getShowAdd() {
	return showAdd;
}
@JsonProperty("showAdd")
public void setShowAdd(String showAdd) {
	this.showAdd = showAdd;
}
@JsonProperty("showActn")
public String getShowActn() {
	return showActn;
}
@JsonProperty("showActn")
public void setShowActn(String showActn) {
	this.showActn = showActn;
}
@JsonProperty("allowEdit")
public String getAllowEdit() {
	return allowEdit;
}
@JsonProperty("allowEdit")
public void setAllowEdit(String allowEdit) {
	this.allowEdit = allowEdit;
}
@JsonProperty("allowView")
public String getAllowView() {
	return allowView;
}
@JsonProperty("allowView")
public void setAllowView(String allowView) {
	this.allowView = allowView;
}
public void setDwName(String dwName) {
	this.dwName = dwName;
}
public String getDwName() {
	return dwName;
}


@JsonProperty("row")
public void setRow(Integer row) {
	this.row = row;
}
@JsonProperty("row")
public Integer getRow() {
	return row;
}
@JsonProperty("column")
public void setColumn(Integer column) {
	this.column = column;
}
@JsonProperty("column")
public Integer getColumn() {
	return column;
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


@JsonProperty("idePageSubSectns")
private List<SubSection> idePageSubSectns;


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

@JsonProperty("idePageSubSectns")
public void setIdePageSubSectns(List<SubSection> idePageSubSectns) {
	this.idePageSubSectns = idePageSubSectns;
}
@JsonProperty("idePageSubSectns")
public List<SubSection> getIdePageSubSectns() {
	return idePageSubSectns;
}

@JsonProperty("ide_field_layout")
public void setIde_field_layout(List<FieldLayout> ide_field_layout) {
	this.ide_field_layout = ide_field_layout;
}

@JsonProperty("ide_field_layout")
public List<FieldLayout> getIde_field_layout() {
	return ide_field_layout;
}
@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();

@JsonProperty("ide_OBJ_ID")
public String getIdeOBJID() {
return ideOBJID;
}

@JsonProperty("ide_OBJ_ID")
public void setIdeOBJID(String ideOBJID) {
this.ideOBJID = ideOBJID;
}

@JsonProperty("typ")
public String getTyp() {
return typ;
}

@JsonProperty("typ")
public void setTyp(String typ) {
this.typ = typ;
}

@JsonProperty("ide_PG_SECTN_ID")
public Integer getIdePGSECTNID() {
return idePGSECTNID;
}

@JsonProperty("ide_PG_SECTN_ID")
public void setIdePGSECTNID(Integer idePGSECTNID) {
this.idePGSECTNID = idePGSECTNID;
}

@JsonProperty("ide_PG_SECTN_SEQ")
public Integer getIdePGSECTNSEQ() {
return idePGSECTNSEQ;
}

@JsonProperty("ide_PG_SECTN_SEQ")
public void setIdePGSECTNSEQ(Integer idePGSECTNSEQ) {
this.idePGSECTNSEQ = idePGSECTNSEQ;
}

@JsonProperty("grp_LABLE")
public String getGrpLABLE() {
return grpLABLE;
}

@JsonProperty("grp_LABLE")
public void setGrpLABLE(String grpLABLE) {
this.grpLABLE = grpLABLE;
}

@JsonProperty("allw_DEL")
public String getAllwDEL() {
return allwDEL;
}

@JsonProperty("allw_DEL")
public void setAllwDEL(String allwDEL) {
this.allwDEL = allwDEL;
}

@JsonProperty("vw_DEL")
public String getVwDEL() {
return vwDEL;
}

@JsonProperty("vw_DEL")
public void setVwDEL(String vwDEL) {
this.vwDEL = vwDEL;
}

@JsonProperty("vw_HIST")
public String getVwHIST() {
return vwHIST;
}

@JsonProperty("vw_HIST")
public void setVwHIST(String vwHIST) {
this.vwHIST = vwHIST;
}

@JsonProperty("ide_PG_GRP_ID")
public Integer getIdePGGRPID() {
return idePGGRPID;
}

@JsonProperty("ide_PG_GRP_ID")
public void setIdePGGRPID(Integer idePGGRPID) {
this.idePGGRPID = idePGGRPID;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("sectn_VISIBLE")
public String getSectnVISIBLE() {
return sectnVISIBLE;
}

@JsonProperty("sectn_VISIBLE")
public void setSectnVISIBLE(String sectnVISIBLE) {
this.sectnVISIBLE = sectnVISIBLE;
}

@JsonProperty("ide_PG_LAYOUT_ID")
public Integer getIdePGLAYOUTID() {
return idePGLAYOUTID;
}

@JsonProperty("ide_PG_LAYOUT_ID")
public void setIdePGLAYOUTID(Integer idePGLAYOUTID) {
this.idePGLAYOUTID = idePGLAYOUTID;
}
@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}


}