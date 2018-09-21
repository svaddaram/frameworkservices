package com.cbms.dao.model.heroku;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = { "ideColValidations" })
@Entity
@Table(name = "IDE_COL_VALIDATION", schema = "salesforce")
public class IDE_COL_VALIDATION implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="IDE_COL_VALIDATION_SEQUENCE", sequenceName="IDE_COL_VALIDATION_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDE_COL_VALIDATION_SEQUENCE")
	@Column(name = "VALIDATION_ID")
	private Integer VALIDATION_ID;
	@Column(name = "DW_NAME")
	private String DW_NAME;
	@Column(name = "IDE_PG_LAYOUT_ID", nullable=false)
	private Integer IDE_PG_LAYOUT_ID;
	@Column(name = "COL_ID")
	private Integer COL_ID;
	@Column(name = "CHK_SPL_CHARS")
	private String CHK_SPL_CHARS;
	@Column(name = "IS_ALPHA")
	private String IS_ALPHA;
	@Column(name = "IS_ALPHA_NUMERIC")
	private String IS_ALPHA_NUMERIC;
	@Column(name = "IS_NUMERIC")
	private String IS_NUMERIC;
	@Column(name = "IS_COMPLETE")
	private String IS_COMPLETE;
	@Column(name = "JOIN_THREE_FIELDS")
	private String JOIN_THREE_FIELDS;
	@Column(name = "JOIN_FOUR_FIELDS")
	private String JOIN_FOUR_FIELDS;
	@Column(name = "FORMAT_DATE")
	private String FORMAT_DATE;
	@Column(name = "VALIDATE_DATE")
	private String VALIDATE_DATE;
	@Column(name = "VALIDATE_DOB")
	private String VALIDATE_DOB;
	@Column(name = "VALIDATE_NONDOB")
	private String VALIDATE_NONDOB;
	@Column(name = "FUTURE_DATE")
	private String FUTURE_DATE;
	@Column(name = "VALIDATE_FUTURE_DATE")
	private String VALIDATE_FUTURE_DATE;
	@Column(name = "PAST_DATE")
	private String PAST_DATE;
	@Column(name = "COMPARE_DATES")
	private String COMPARE_DATES;
	@Column(name = "COMPARE_DATES_INCLUSIVE")
	private String COMPARE_DATES_INCLUSIVE;
	@Column(name = "FORMAT_CURRENCY")
	private String FORMAT_CURRENCY;
	@Column(name = "IS_CURRENCY")
	private String IS_CURRENCY;
	@Column(name = "VALIDATE_EFF_DATES")
	private String VALIDATE_EFF_DATES;
	@Column(name = "VALIDATE_CHG_RPT_DATE")
	private String VALIDATE_CHG_RPT_DATE;
	@Column(name = "VALIDATE_CHG_VRF_DATE")
	private String VALIDATE_CHG_VRF_DATE;
	@Column(name = "VALIDATE_VRF_END_DATE")
	private String VALIDATE_VRF_END_DATE;
	@Column(name = "VALIDATE_USE_MONTH")
	private String VALIDATE_USE_MONTH;
	@Column(name = "VALIDATE_EED")
	private String VALIDATE_EED;
	@Column(name = "BLANKOUT_EBD")
	private String BLANKOUT_EBD;
	@Column(name = "COPY_FLDS")
	private String COPY_FLDS;
	
	
	
	public String getCOPY_FLDS() {
		return COPY_FLDS;
	}
	public void setCOPY_FLDS(String cOPY_FLDS) {
		COPY_FLDS = cOPY_FLDS;
	}
	/**
	 * @return the vALIDATION_ID
	 */
	public Integer getVALIDATION_ID() {
		return VALIDATION_ID;
	}
	/**
	 * @param vALIDATION_ID the vALIDATION_ID to set
	 */
	public void setVALIDATION_ID(Integer vALIDATION_ID) {
		VALIDATION_ID = vALIDATION_ID;
	}
	/**
	 * @return the dW_NAME
	 */
	public String getDW_NAME() {
		return DW_NAME;
	}
	/**
	 * @param dW_NAME the dW_NAME to set
	 */
	public void setDW_NAME(String dW_NAME) {
		DW_NAME = dW_NAME;
	}
	/**
	 * @return the iDE_OBJ_ID
	 */
	public Integer getIDE_PG_LAYOUT_ID() {
		return IDE_PG_LAYOUT_ID;
	}
	/**
	 * @param iDE_OBJ_ID the iDE_OBJ_ID to set
	 */
	public void setIDE_PG_LAYOUT_ID(Integer iDE_PG_LAYOUT_ID) {
		IDE_PG_LAYOUT_ID = iDE_PG_LAYOUT_ID;
	}
	/**
	 * @return the cOL_ID
	 */
	public Integer getCOL_ID() {
		if(COL_ID == null)
			return -1;
		return COL_ID;
	}
	/**
	 * @param cOL_ID the cOL_ID to set
	 */
	public void setCOL_ID(Integer cOL_ID) {
		COL_ID = cOL_ID;
	}
	/**
	 * @return the cHK_SPL_CHARS
	 */
	public String getCHK_SPL_CHARS() {
		return CHK_SPL_CHARS;
	}
	/**
	 * @param cHK_SPL_CHARS the cHK_SPL_CHARS to set
	 */
	public void setCHK_SPL_CHARS(String cHK_SPL_CHARS) {
		CHK_SPL_CHARS = cHK_SPL_CHARS;
	}
	/**
	 * @return the iS_ALPHA
	 */
	public String getIS_ALPHA() {
		return IS_ALPHA;
	}
	/**
	 * @param iS_ALPHA the iS_ALPHA to set
	 */
	public void setIS_ALPHA(String iS_ALPHA) {
		IS_ALPHA = iS_ALPHA;
	}
	/**
	 * @return the iS_ALPHA_NUMERIC
	 */
	public String getIS_ALPHA_NUMERIC() {
		return IS_ALPHA_NUMERIC;
	}
	/**
	 * @param iS_ALPHA_NUMERIC the iS_ALPHA_NUMERIC to set
	 */
	public void setIS_ALPHA_NUMERIC(String iS_ALPHA_NUMERIC) {
		IS_ALPHA_NUMERIC = iS_ALPHA_NUMERIC;
	}
	/**
	 * @return the iS_NUMERIC
	 */
	public String getIS_NUMERIC() {
		return IS_NUMERIC;
	}
	/**
	 * @param iS_NUMERIC the iS_NUMERIC to set
	 */
	public void setIS_NUMERIC(String iS_NUMERIC) {
		IS_NUMERIC = iS_NUMERIC;
	}
	/**
	 * @return the iS_COMPLETE
	 */
	public String getIS_COMPLETE() {
		return IS_COMPLETE;
	}
	/**
	 * @param iS_COMPLETE the iS_COMPLETE to set
	 */
	public void setIS_COMPLETE(String iS_COMPLETE) {
		IS_COMPLETE = iS_COMPLETE;
	}
	/**
	 * @return the jOIN_THREE_FIELDS
	 */
	public String getJOIN_THREE_FIELDS() {
		return JOIN_THREE_FIELDS;
	}
	/**
	 * @param jOIN_THREE_FIELDS the jOIN_THREE_FIELDS to set
	 */
	public void setJOIN_THREE_FIELDS(String jOIN_THREE_FIELDS) {
		JOIN_THREE_FIELDS = jOIN_THREE_FIELDS;
	}
	/**
	 * @return the jOIN_FOUR_FIELDS
	 */
	public String getJOIN_FOUR_FIELDS() {
		return JOIN_FOUR_FIELDS;
	}
	/**
	 * @param jOIN_FOUR_FIELDS the jOIN_FOUR_FIELDS to set
	 */
	public void setJOIN_FOUR_FIELDS(String jOIN_FOUR_FIELDS) {
		JOIN_FOUR_FIELDS = jOIN_FOUR_FIELDS;
	}
	/**
	 * @return the fORMAT_DATE
	 */
	public String getFORMAT_DATE() {
		return FORMAT_DATE;
	}
	/**
	 * @param fORMAT_DATE the fORMAT_DATE to set
	 */
	public void setFORMAT_DATE(String fORMAT_DATE) {
		FORMAT_DATE = fORMAT_DATE;
	}
	/**
	 * @return the vALIDATE_DATE
	 */
	public String getVALIDATE_DATE() {
		return VALIDATE_DATE;
	}
	/**
	 * @param vALIDATE_DATE the vALIDATE_DATE to set
	 */
	public void setVALIDATE_DATE(String vALIDATE_DATE) {
		VALIDATE_DATE = vALIDATE_DATE;
	}
	/**
	 * @return the vALIDATE_DOB
	 */
	public String getVALIDATE_DOB() {
		if(VALIDATE_DOB == null){
			VALIDATE_DOB = "N";
		}
		return VALIDATE_DOB;
	}
	/**
	 * @param vALIDATE_DOB the vALIDATE_DOB to set
	 */
	public void setVALIDATE_DOB(String vALIDATE_DOB) {
		VALIDATE_DOB = vALIDATE_DOB;
	}
	/**
	 * @return the vALIDATE_NONDOB
	 */
	public String getVALIDATE_NONDOB() {
		if(VALIDATE_NONDOB == null){
			VALIDATE_NONDOB = "N";
		}
		return VALIDATE_NONDOB;
	}
	/**
	 * @param vALIDATE_NONDOB the vALIDATE_NONDOB to set
	 */
	public void setVALIDATE_NONDOB(String vALIDATE_NONDOB) {
		VALIDATE_NONDOB = vALIDATE_NONDOB;
	}
	/**
	 * @return the fUTURE_DATE
	 */
	public String getFUTURE_DATE() {
		if(FUTURE_DATE == null){
			FUTURE_DATE = "N";
		}
		return FUTURE_DATE;
	}
	/**
	 * @param fUTURE_DATE the fUTURE_DATE to set
	 */
	public void setFUTURE_DATE(String fUTURE_DATE) {
		FUTURE_DATE = fUTURE_DATE;
	}
	/**
	 * @return the vALIDATE_FUTURE_DATE
	 */
	public String getVALIDATE_FUTURE_DATE() {
		return VALIDATE_FUTURE_DATE;
	}
	/**
	 * @param vALIDATE_FUTURE_DATE the vALIDATE_FUTURE_DATE to set
	 */
	public void setVALIDATE_FUTURE_DATE(String vALIDATE_FUTURE_DATE) {
		VALIDATE_FUTURE_DATE = vALIDATE_FUTURE_DATE;
	}
	/**
	 * @return the pAST_DATE
	 */
	public String getPAST_DATE() {
		if(PAST_DATE == null){
			PAST_DATE = "N";
		}
		return PAST_DATE;
	}
	/**
	 * @param pAST_DATE the pAST_DATE to set
	 */
	public void setPAST_DATE(String pAST_DATE) {
		PAST_DATE = pAST_DATE;
	}
	/**
	 * @return the cOMPARE_DATES
	 */
	public String getCOMPARE_DATES() {
		return COMPARE_DATES;
	}
	/**
	 * @param cOMPARE_DATES the cOMPARE_DATES to set
	 */
	public void setCOMPARE_DATES(String cOMPARE_DATES) {
		COMPARE_DATES = cOMPARE_DATES;
	}
	/**
	 * @return the cOMPARE_DATES_INCLUSIVE
	 */
	public String getCOMPARE_DATES_INCLUSIVE() {
		return COMPARE_DATES_INCLUSIVE;
	}
	/**
	 * @param cOMPARE_DATES_INCLUSIVE the cOMPARE_DATES_INCLUSIVE to set
	 */
	public void setCOMPARE_DATES_INCLUSIVE(String cOMPARE_DATES_INCLUSIVE) {
		COMPARE_DATES_INCLUSIVE = cOMPARE_DATES_INCLUSIVE;
	}
	/**
	 * @return the fORMAT_CURRENCY
	 */
	public String getFORMAT_CURRENCY() {
		return FORMAT_CURRENCY;
	}
	/**
	 * @param fORMAT_CURRENCY the fORMAT_CURRENCY to set
	 */
	public void setFORMAT_CURRENCY(String fORMAT_CURRENCY) {
		FORMAT_CURRENCY = fORMAT_CURRENCY;
	}
	/**
	 * @return the iS_CURRENCY
	 */
	public String getIS_CURRENCY() {
		return IS_CURRENCY;
	}
	/**
	 * @param iS_CURRENCY the iS_CURRENCY to set
	 */
	public void setIS_CURRENCY(String iS_CURRENCY) {
		IS_CURRENCY = iS_CURRENCY;
	}
	/**
	 * @return the vALIDATE_EFF_DATES
	 */
	public String getVALIDATE_EFF_DATES() {
		return VALIDATE_EFF_DATES;
	}
	/**
	 * @param vALIDATE_EFF_DATES the vALIDATE_EFF_DATES to set
	 */
	public void setVALIDATE_EFF_DATES(String vALIDATE_EFF_DATES) {
		VALIDATE_EFF_DATES = vALIDATE_EFF_DATES;
	}
	/**
	 * @return the vALIDATE_CHG_RPT_DATE
	 */
	public String getVALIDATE_CHG_RPT_DATE() {
		return VALIDATE_CHG_RPT_DATE;
	}
	/**
	 * @param vALIDATE_CHG_RPT_DATE the vALIDATE_CHG_RPT_DATE to set
	 */
	public void setVALIDATE_CHG_RPT_DATE(String vALIDATE_CHG_RPT_DATE) {
		VALIDATE_CHG_RPT_DATE = vALIDATE_CHG_RPT_DATE;
	}
	/**
	 * @return the vALIDATE_CHG_VRF_DATE
	 */
	public String getVALIDATE_CHG_VRF_DATE() {
		return VALIDATE_CHG_VRF_DATE;
	}
	/**
	 * @param vALIDATE_CHG_VRF_DATE the vALIDATE_CHG_VRF_DATE to set
	 */
	public void setVALIDATE_CHG_VRF_DATE(String vALIDATE_CHG_VRF_DATE) {
		VALIDATE_CHG_VRF_DATE = vALIDATE_CHG_VRF_DATE;
	}
	/**
	 * @return the vALIDATE_VRF_END_DATE
	 */
	public String getVALIDATE_VRF_END_DATE() {
		return VALIDATE_VRF_END_DATE;
	}
	/**
	 * @param vALIDATE_VRF_END_DATE the vALIDATE_VRF_END_DATE to set
	 */
	public void setVALIDATE_VRF_END_DATE(String vALIDATE_VRF_END_DATE) {
		VALIDATE_VRF_END_DATE = vALIDATE_VRF_END_DATE;
	}
	/**
	 * @return the vALIDATE_USE_MONTH
	 */
	public String getVALIDATE_USE_MONTH() {
		return VALIDATE_USE_MONTH;
	}
	/**
	 * @param vALIDATE_USE_MONTH the vALIDATE_USE_MONTH to set
	 */
	public void setVALIDATE_USE_MONTH(String vALIDATE_USE_MONTH) {
		VALIDATE_USE_MONTH = vALIDATE_USE_MONTH;
	}
	/**
	 * @return the vALIDATE_EED
	 */
	public String getVALIDATE_EED() {
		return VALIDATE_EED;
	}
	/**
	 * @param vALIDATE_EED the vALIDATE_EED to set
	 */
	public void setVALIDATE_EED(String vALIDATE_EED) {
		VALIDATE_EED = vALIDATE_EED;
	}
	/**
	 * @return the bLANKOUT_EBD
	 */
	public String getBLANKOUT_EBD() {
		return BLANKOUT_EBD;
	}
	/**
	 * @param bLANKOUT_EBD the bLANKOUT_EBD to set
	 */
	public void setBLANKOUT_EBD(String bLANKOUT_EBD) {
		BLANKOUT_EBD = bLANKOUT_EBD;
	}
	
	@ManyToOne
    @JoinColumn(name="IDE_PG_LAYOUT_ID", nullable=false, insertable=false, updatable=false)
	private IDE_PG_LAYOUT ideColValidations;

	/**
	 * @return the ideColValidations
	 */
	public IDE_PG_LAYOUT getIdeColValidations() {
		return ideColValidations;
	}
	/**
	 * @param ideColValidations the ideColValidations to set
	 */
	public void setIdeColValidations(IDE_PG_LAYOUT ideColValidations) {
		this.ideColValidations = ideColValidations;
	}
	
	@Column(name = "UPD_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date systemModStamp;
	@Column(name = "BLANKOUT_FLDS")
	private String BLANKOUT_FLDS;
	@Column(name = "CRT_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;


	public Date getSystemModStamp() {
		return systemModStamp;
	}
	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	public String getBLANKOUT_FLDS() {
		return BLANKOUT_FLDS;
	}
	public void setBLANKOUT_FLDS(String bLANKOUT_FLDS) {
		BLANKOUT_FLDS = bLANKOUT_FLDS;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	
}
