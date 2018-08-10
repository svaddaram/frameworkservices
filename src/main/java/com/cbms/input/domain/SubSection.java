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
"ide_pg_sectn_id",
"_hc_lastop",
"name",
"ide_pg_sectn",
"ide_pg_sub_sectn_id",
"lst_upd_by",
"_hc_err",
"seq_ord",
"createdBy",
"updatedBy",
"systemmodstamp",
"lbl",
"ide_obj_id",
"createddate",
"ide_pg_sect_nm",
"ide_pg_layout_id",
"sfid",
"id",
"ide_field_layout",
"row",
"column"
})
public class SubSection {

@JsonProperty("ide_pg_sectn_id")
private Integer idePgSectnId;
@JsonProperty("_hc_lastop")
private String hcLastop;
@JsonProperty("name")
private String name;
@JsonProperty("ide_pg_sectn")
private String idePgSectn;
@JsonProperty("ide_pg_sub_sectn_id")
private String idePgSubSectnId;
@JsonProperty("lst_upd_by")
private String lstUpdBy;
@JsonProperty("_hc_err")
private String hcErr;
@JsonProperty("seq_ord")
private Integer seqOrd;

@JsonProperty("createdBy")
private String createdBy;
@JsonProperty("updatedBy")
private String updatedBy;

@JsonProperty("row")
private Integer row;
@JsonProperty("column")
private Integer column;
@JsonProperty("ena_DIS_RULE_EXP")
private String ena_DIS_RULE_EXP;

@JsonProperty("ena_DIS_RULE_EXP")
public String getEna_DIS_RULE_EXP() {
	return ena_DIS_RULE_EXP;
}
@JsonProperty("ena_DIS_RULE_EXP")
public void setEna_DIS_RULE_EXP(String ena_DIS_RULE_EXP) {
	this.ena_DIS_RULE_EXP = ena_DIS_RULE_EXP;
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

@JsonProperty("systemmodstamp")
private String systemmodstamp;
@JsonProperty("lbl")
private String lbl;
@JsonProperty("ide_obj_id")
private String ideObjId;
@JsonProperty("createddate")
private String createddate;
@JsonProperty("ide_pg_sect_nm")
private Integer idePgSectNm;
@JsonProperty("ide_pg_layout_id")
private Integer idePgLayoutId;
@JsonProperty("sfid")
private String sfid;
@JsonProperty("id")
private Integer id;

@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();

@JsonProperty("ide_field_layout")
private List<FieldLayout> ide_field_layout;


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
@JsonProperty("ide_field_layout")
public void setIde_field_layout(List<FieldLayout> ide_field_layout) {
	this.ide_field_layout = ide_field_layout;
}
@JsonProperty("ide_field_layout")
public List<FieldLayout> getIde_field_layout() {
	return ide_field_layout;
}
@JsonProperty("ide_pg_sectn_id")
public Integer getIdePgSectnId() {
return idePgSectnId;
}

@JsonProperty("ide_pg_sectn_id")
public void setIdePgSectnId(Integer idePgSectnId) {
this.idePgSectnId = idePgSectnId;
}

@JsonProperty("_hc_lastop")
public String getHcLastop() {
return hcLastop;
}

@JsonProperty("_hc_lastop")
public void setHcLastop(String hcLastop) {
this.hcLastop = hcLastop;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("ide_pg_sectn")
public String getIdePgSectn() {
return idePgSectn;
}

@JsonProperty("ide_pg_sectn")
public void setIdePgSectn(String idePgSectn) {
this.idePgSectn = idePgSectn;
}

@JsonProperty("ide_pg_sub_sectn_id")
public String getIdePgSubSectnId() {
return idePgSubSectnId;
}

@JsonProperty("ide_pg_sub_sectn_id")
public void setIdePgSubSectnId(String idePgSubSectnId) {
this.idePgSubSectnId = idePgSubSectnId;
}

@JsonProperty("lst_upd_by")
public String getLstUpdBy() {
return lstUpdBy;
}

@JsonProperty("lst_upd_by")
public void setLstUpdBy(String lstUpdBy) {
this.lstUpdBy = lstUpdBy;
}

@JsonProperty("_hc_err")
public String getHcErr() {
return hcErr;
}

@JsonProperty("_hc_err")
public void setHcErr(String hcErr) {
this.hcErr = hcErr;
}

@JsonProperty("seq_ord")
public Integer getSeqOrd() {
return seqOrd;
}

@JsonProperty("seq_ord")
public void setSeqOrd(Integer seqOrd) {
this.seqOrd = seqOrd;
}



@JsonProperty("systemmodstamp")
public String getSystemmodstamp() {
return systemmodstamp;
}

@JsonProperty("systemmodstamp")
public void setSystemmodstamp(String systemmodstamp) {
this.systemmodstamp = systemmodstamp;
}

@JsonProperty("lbl")
public String getLbl() {
return lbl;
}

@JsonProperty("lbl")
public void setLbl(String lbl) {
this.lbl = lbl;
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

@JsonProperty("ide_pg_sect_nm")
public Integer getIdePgSectNm() {
return idePgSectNm;
}

@JsonProperty("ide_pg_sect_nm")
public void setIdePgSectNm(Integer idePgSectNm) {
this.idePgSectNm = idePgSectNm;
}

@JsonProperty("ide_pg_layout_id")
public Integer getIdePgLayoutId() {
return idePgLayoutId;
}

@JsonProperty("ide_pg_layout_id")
public void setIdePgLayoutId(Integer idePgLayoutId) {
this.idePgLayoutId = idePgLayoutId;
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
@JsonAnyGetter
public Map<String, String> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, String value) {
this.additionalProperties.put(name, value);
}

}