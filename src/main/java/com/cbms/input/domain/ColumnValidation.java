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
"is_numeric",
"compare_dates",
"format_currency",
"validate_eed",
"copy_flds",
"validate_vrf_end_date",
"join_three_fields",
"join_four_fields",
"blankout_flds",
"past_date",
"id",
"validate_date",
"is_complete",
"is_alpha_numeric",
"validate_dob",
"is_currency",
"updated_by",
"dw_name",
"createddate",
"ide_pg_layout_id",
"validate_future_date",
"validate_eff_dates",
"validate_chg_rpt_date",
"col_id",
"future_date",
"validate_nondob",
"format_date",
"chk_spl_chars",
"is_alpha",
"validation_id",
"name",
"created_by",
"blankout_ebd",
"systemmodstamp",
"compare_dates_inclusive",
"validate_chg_vrf_date",
"validate_use_month"
})
public class ColumnValidation {

@JsonProperty("is_numeric")
private String isNumeric;
@JsonProperty("compare_dates")
private String compareDates;
@JsonProperty("format_currency")
private String formatCurrency;
@JsonProperty("validate_eed")
private String validateEed;
@JsonProperty("copy_flds")
private String copyFlds;
@JsonProperty("validate_vrf_end_date")
private String validateVrfEndDate;
@JsonProperty("join_three_fields")
private String joinThreeFields;
@JsonProperty("join_four_fields")
private String joinFourFields;
@JsonProperty("blankout_flds")
private String blankoutFlds;
@JsonProperty("past_date")
private String pastDate;
@JsonProperty("id")
private Integer id;
@JsonProperty("validate_date")
private String validateDate;
@JsonProperty("is_complete")
private String isComplete;
@JsonProperty("is_alpha_numeric")
private String isAlphaNumeric;
@JsonProperty("validate_dob")
private String validateDob;
@JsonProperty("is_currency")
private String isCurrency;
@JsonProperty("updated_by")
private String updatedBy;
@JsonProperty("dw_name")
private String dwName;
@JsonProperty("createddate")
private String createddate;
@JsonProperty("ide_pg_layout_id")
private Integer idePgLayoutId;
@JsonProperty("validate_future_date")
private String validateFutureDate;
@JsonProperty("validate_eff_dates")
private String validateEffDates;
@JsonProperty("validate_chg_rpt_date")
private String validateChgRptDate;
@JsonProperty("col_id")
private Integer colId;
@JsonProperty("future_date")
private String futureDate;
@JsonProperty("validate_nondob")
private String validateNondob;
@JsonProperty("format_date")
private String formatDate;
@JsonProperty("chk_spl_chars")
private String chkSplChars;
@JsonProperty("is_alpha")
private String isAlpha;
@JsonProperty("validation_id")
private Integer validationId;
@JsonProperty("name")
private String name;
@JsonProperty("created_by")
private String createdBy;
@JsonProperty("blankout_ebd")
private String blankoutEbd;
@JsonProperty("systemmodstamp")
private String systemmodstamp;
@JsonProperty("compare_dates_inclusive")
private String compareDatesInclusive;
@JsonProperty("validate_chg_vrf_date")
private String validateChgVrfDate;
@JsonProperty("validate_use_month")
private String validateUseMonth;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("is_numeric")
public String getIsNumeric() {
return isNumeric;
}

@JsonProperty("is_numeric")
public void setIsNumeric(String isNumeric) {
this.isNumeric = isNumeric;
}

@JsonProperty("compare_dates")
public String getCompareDates() {
return compareDates;
}

@JsonProperty("compare_dates")
public void setCompareDates(String compareDates) {
this.compareDates = compareDates;
}

@JsonProperty("format_currency")
public String getFormatCurrency() {
return formatCurrency;
}

@JsonProperty("format_currency")
public void setFormatCurrency(String formatCurrency) {
this.formatCurrency = formatCurrency;
}

@JsonProperty("validate_eed")
public String getValidateEed() {
return validateEed;
}

@JsonProperty("validate_eed")
public void setValidateEed(String validateEed) {
this.validateEed = validateEed;
}

@JsonProperty("copy_flds")
public String getCopyFlds() {
return copyFlds;
}

@JsonProperty("copy_flds")
public void setCopyFlds(String copyFlds) {
this.copyFlds = copyFlds;
}

@JsonProperty("validate_vrf_end_date")
public String getValidateVrfEndDate() {
return validateVrfEndDate;
}

@JsonProperty("validate_vrf_end_date")
public void setValidateVrfEndDate(String validateVrfEndDate) {
this.validateVrfEndDate = validateVrfEndDate;
}

@JsonProperty("join_three_fields")
public String getJoinThreeFields() {
return joinThreeFields;
}

@JsonProperty("join_three_fields")
public void setJoinThreeFields(String joinThreeFields) {
this.joinThreeFields = joinThreeFields;
}

@JsonProperty("join_four_fields")
public String getJoinFourFields() {
return joinFourFields;
}

@JsonProperty("join_four_fields")
public void setJoinFourFields(String joinFourFields) {
this.joinFourFields = joinFourFields;
}

@JsonProperty("blankout_flds")
public String getBlankoutFlds() {
return blankoutFlds;
}

@JsonProperty("blankout_flds")
public void setBlankoutFlds(String blankoutFlds) {
this.blankoutFlds = blankoutFlds;
}

@JsonProperty("past_date")
public String getPastDate() {
return pastDate;
}

@JsonProperty("past_date")
public void setPastDate(String pastDate) {
this.pastDate = pastDate;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("validate_date")
public String getValidateDate() {
return validateDate;
}

@JsonProperty("validate_date")
public void setValidateDate(String validateDate) {
this.validateDate = validateDate;
}

@JsonProperty("is_complete")
public String getIsComplete() {
return isComplete;
}

@JsonProperty("is_complete")
public void setIsComplete(String isComplete) {
this.isComplete = isComplete;
}

@JsonProperty("is_alpha_numeric")
public String getIsAlphaNumeric() {
return isAlphaNumeric;
}

@JsonProperty("is_alpha_numeric")
public void setIsAlphaNumeric(String isAlphaNumeric) {
this.isAlphaNumeric = isAlphaNumeric;
}

@JsonProperty("validate_dob")
public String getValidateDob() {
return validateDob;
}

@JsonProperty("validate_dob")
public void setValidateDob(String validateDob) {
this.validateDob = validateDob;
}

@JsonProperty("is_currency")
public String getIsCurrency() {
return isCurrency;
}

@JsonProperty("is_currency")
public void setIsCurrency(String isCurrency) {
this.isCurrency = isCurrency;
}

@JsonProperty("updated_by")
public String getUpdatedBy() {
return updatedBy;
}

@JsonProperty("updated_by")
public void setUpdatedBy(String updatedBy) {
this.updatedBy = updatedBy;
}

@JsonProperty("dw_name")
public String getDwName() {
return dwName;
}

@JsonProperty("dw_name")
public void setDwName(String dwName) {
this.dwName = dwName;
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

@JsonProperty("validate_future_date")
public String getValidateFutureDate() {
return validateFutureDate;
}

@JsonProperty("validate_future_date")
public void setValidateFutureDate(String validateFutureDate) {
this.validateFutureDate = validateFutureDate;
}

@JsonProperty("validate_eff_dates")
public String getValidateEffDates() {
return validateEffDates;
}

@JsonProperty("validate_eff_dates")
public void setValidateEffDates(String validateEffDates) {
this.validateEffDates = validateEffDates;
}

@JsonProperty("validate_chg_rpt_date")
public String getValidateChgRptDate() {
return validateChgRptDate;
}

@JsonProperty("validate_chg_rpt_date")
public void setValidateChgRptDate(String validateChgRptDate) {
this.validateChgRptDate = validateChgRptDate;
}

@JsonProperty("col_id")
public Integer getColId() {
return colId;
}

@JsonProperty("col_id")
public void setColId(Integer colId) {
this.colId = colId;
}

@JsonProperty("future_date")
public String getFutureDate() {
return futureDate;
}

@JsonProperty("future_date")
public void setFutureDate(String futureDate) {
this.futureDate = futureDate;
}

@JsonProperty("validate_nondob")
public String getValidateNondob() {
return validateNondob;
}

@JsonProperty("validate_nondob")
public void setValidateNondob(String validateNondob) {
this.validateNondob = validateNondob;
}

@JsonProperty("format_date")
public String getFormatDate() {
return formatDate;
}

@JsonProperty("format_date")
public void setFormatDate(String formatDate) {
this.formatDate = formatDate;
}

@JsonProperty("chk_spl_chars")
public String getChkSplChars() {
return chkSplChars;
}

@JsonProperty("chk_spl_chars")
public void setChkSplChars(String chkSplChars) {
this.chkSplChars = chkSplChars;
}

@JsonProperty("is_alpha")
public String getIsAlpha() {
return isAlpha;
}

@JsonProperty("is_alpha")
public void setIsAlpha(String isAlpha) {
this.isAlpha = isAlpha;
}

@JsonProperty("validation_id")
public Integer getValidationId() {
return validationId;
}

@JsonProperty("validation_id")
public void setValidationId(Integer validationId) {
this.validationId = validationId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("created_by")
public String getCreatedBy() {
return createdBy;
}

@JsonProperty("created_by")
public void setCreatedBy(String createdBy) {
this.createdBy = createdBy;
}

@JsonProperty("blankout_ebd")
public String getBlankoutEbd() {
return blankoutEbd;
}

@JsonProperty("blankout_ebd")
public void setBlankoutEbd(String blankoutEbd) {
this.blankoutEbd = blankoutEbd;
}

@JsonProperty("systemmodstamp")
public String getSystemmodstamp() {
return systemmodstamp;
}

@JsonProperty("systemmodstamp")
public void setSystemmodstamp(String systemmodstamp) {
this.systemmodstamp = systemmodstamp;
}

@JsonProperty("compare_dates_inclusive")
public String getCompareDatesInclusive() {
return compareDatesInclusive;
}

@JsonProperty("compare_dates_inclusive")
public void setCompareDatesInclusive(String compareDatesInclusive) {
this.compareDatesInclusive = compareDatesInclusive;
}

@JsonProperty("validate_chg_vrf_date")
public String getValidateChgVrfDate() {
return validateChgVrfDate;
}

@JsonProperty("validate_chg_vrf_date")
public void setValidateChgVrfDate(String validateChgVrfDate) {
this.validateChgVrfDate = validateChgVrfDate;
}

@JsonProperty("validate_use_month")
public String getValidateUseMonth() {
return validateUseMonth;
}

@JsonProperty("validate_use_month")
public void setValidateUseMonth(String validateUseMonth) {
this.validateUseMonth = validateUseMonth;
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