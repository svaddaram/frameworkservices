package com.cbms.dao.model.local;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "idePgSubSecFldLayouts" })
@Entity
@Where(clause="IDE_PG_SUB_SECTN_ID is not null")
@Table(name = "IDE_FIELD_LAYOUT",schema = "salesforce")
public class IDE_FIELD_LAYOUT implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "IDE_PG_LAYOUT_ID")
	Integer IDE_PG_LAYOUT_ID;
	
	public Integer getIDE_PG_LAYOUT_ID() {
		return IDE_PG_LAYOUT_ID;
	}
	
	public void setIDE_PG_LAYOUT_ID(Integer iDE_PG_LAYOUT_ID) {
		IDE_PG_LAYOUT_ID = iDE_PG_LAYOUT_ID;
	}
	@Column(name = "UPD_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date systemModStamp;
	
	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	
	public Date getSystemModStamp() {
		return systemModStamp;
	}
	
	
	@Column(name = "CRT_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;
	
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	public Date getCreateddate() {
		return createddate;
	}
	
	@Column(name = "CRT_OS_USR")
	String created_by;
	
	@Column(name = "UPD_OS_USER")
	String updated_by;
	
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	public String getUpdated_by() {
		return updated_by;
	}
	
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	public String getCreated_by() {
		return created_by;
	}
	
	
	@Column(name = "COL_ID")
	private Integer COL_ID;
	public Integer getCOL_ID() {
		return COL_ID;
	}
	public void setCOL_ID(Integer cOL_ID) {
		COL_ID = cOL_ID;
	}
	@Column(name = "IDE_OBJ_ID")
	private String IDE_OBJ_ID;
	public String getIDE_OBJ_ID() {
		return IDE_OBJ_ID;
	}
	public void setIDE_OBJ_ID(String iDE_OBJ_ID) {
		IDE_OBJ_ID = iDE_OBJ_ID;
	}
	@Column(name = "IDE_PG_SUB_SECTN_ID",insertable=false,updatable=false)
	private Integer IDE_PG_SUB_SECTN_ID;
	public Integer getIDE_PG_SUB_SECTN_ID() {
		return IDE_PG_SUB_SECTN_ID;
	}
	public void setIDE_PG_SUB_SECTN_ID(Integer iDE_PG_SUB_SECTN_ID) {
		IDE_PG_SUB_SECTN_ID = iDE_PG_SUB_SECTN_ID;
	}
	
	@Column(name = "IDE_PG_SECTN_ID")
	private Integer IDE_PG_SECTN_ID;
	public Integer getIDE_PG_SECTN_ID() {
		return IDE_PG_SECTN_ID;
	}
	public void setIDE_PG_SECTN_ID(Integer iDE_PG_SECTN_ID) {
		IDE_PG_SECTN_ID = iDE_PG_SECTN_ID;
	}
	
	/*@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID", nullable=false)
	private IDE_OBJ ideObjFldLayouts;
	*//**
	 * @return the ideObjFldLayouts
	 *//*
	public IDE_OBJ getIdeObjFldLayouts() {
		return ideObjFldLayouts;
	}
	*//**
	 * @param ideObjFldLayouts the ideObjFldLayouts to set
	 *//*
	public void setIdeObjFldLayouts(IDE_OBJ ideObjFldLayouts) {
		this.ideObjFldLayouts = ideObjFldLayouts;
	}*/
	
	@Id
	@SequenceGenerator(name="IDE_FIELD_LAYOUT_SEQUENCE", sequenceName="IDE_FIELD_LAYOUT_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDE_FIELD_LAYOUT_SEQUENCE")
	@Column(name="IDE_FIELD_LAYOUT_ID")
	private Integer IDE_FIELD_LAYOUT_ID;
	/**
	 * @return the iDE_FIELD_LAYOUT_ID
	 */
	public Integer getIDE_FIELD_LAYOUT_ID() {
		return IDE_FIELD_LAYOUT_ID;
	}
	/**
	 * @param iDE_FIELD_LAYOUT_ID the iDE_FIELD_LAYOUT_ID to set
	 */
	public void setIDE_FIELD_LAYOUT_ID(Integer iDE_FIELD_LAYOUT_ID) {
		IDE_FIELD_LAYOUT_ID = iDE_FIELD_LAYOUT_ID;
	}
	
	/*@ManyToOne
    @JoinColumn(name="IDE_PG_SECTN_ID", nullable=false, insertable=false, updatable=false)
	private IDE_PG_SECTN idePgSecFldLayouts;
	
	*//**
	 * @return the idePgSecFldLayouts
	 *//*
	public IDE_PG_SECTN getIdePgSecFldLayouts() {
		return idePgSecFldLayouts;
	}
	*//**
	 * @param idePgSecFldLayouts the idePgSecFldLayouts to set
	 *//*
	public void setIdePgSecFldLayouts(IDE_PG_SECTN idePgSecFldLayouts) {
		this.idePgSecFldLayouts = idePgSecFldLayouts;
	}*/

	@ManyToOne
	 @JoinColumns({
		 	 @JoinColumn(name="IDE_PG_SUB_SECTN_ID", referencedColumnName="IDE_PG_SUB_SECTN_ID")
	    })
	private IDE_PG_SUB_SECTN idePgSubSecFldLayouts;
	/**
	 * @return the idePgSubSecFldLayouts
	 */
	public IDE_PG_SUB_SECTN getIdePgSubSecFldLayouts() {
		return idePgSubSecFldLayouts;
	}
	/**
	 * @param idePgSubSecFldLayouts the idePgSubSecFldLayouts to set
	 */
	public void setIdePgSubSecFldLayouts(IDE_PG_SUB_SECTN idePgSubSecFldLayouts) {
		this.idePgSubSecFldLayouts = idePgSubSecFldLayouts;
	}
	
	public String getAPI_NAME_S() {
		if(API_NAME_S == null)
			return "";
		return API_NAME_S;
	}
	public void setAPI_NAME_S(String aPI_NAME_S) {
		API_NAME_S = aPI_NAME_S;
	}
	public String getFIELD_LABEL_S() {
		/*if(FIELD_LABEL_S.length() > 40){
			FIELD_LABEL_S = FIELD_LABEL_S.substring(0, 39);
		}*/
		return FIELD_LABEL_S;
	}
	public void setFIELD_LABEL_S(String fIELD_LABEL_S) {
		FIELD_LABEL_S = fIELD_LABEL_S;
	}
	public String getTYPE_S() {
		if(TYPE_S==null)
			return "";
		return TYPE_S;
	}
	public void setTYPE_S(String tYPE_S) {
		TYPE_S = tYPE_S;
	}
	public String getREQUIRED_S() {
		return REQUIRED_S;
	}
	public void setREQUIRED_S(String rEQUIRED_S) {
		REQUIRED_S = rEQUIRED_S;
	}
	public String getUNIQUE_S() {
		if(UNIQUE_S == null){
			UNIQUE_S ="false";
		}
		return UNIQUE_S;
	}
	public void setUNIQUE_S(String uNIQUE_S) {
		UNIQUE_S = uNIQUE_S;
	}
	public String getCASE_SENSITIVE_S() {
		return CASE_SENSITIVE_S;
	}
	public void setCASE_SENSITIVE_S(String cASE_SENSITIVE_S) {
		CASE_SENSITIVE_S = cASE_SENSITIVE_S;
	}
	public String getEXTERNAL_ID_S() {
		if(EXTERNAL_ID_S == null){
			EXTERNAL_ID_S = "";
		}
		return EXTERNAL_ID_S;
	}
	public void setEXTERNAL_ID_S(String eXTERNAL_ID_S) {
		EXTERNAL_ID_S = eXTERNAL_ID_S;
	}
	public String getFIELD_DESCRIPTION_S() {
		if(FIELD_DESCRIPTION_S == null){
			FIELD_DESCRIPTION_S = "";
		}
		return FIELD_DESCRIPTION_S;
	}
	public void setFIELD_DESCRIPTION_S(String fIELD_DESCRIPTION_S) {
		FIELD_DESCRIPTION_S = fIELD_DESCRIPTION_S;
	}
	public String getREFERENCE_TO_S() {
		if(REFERENCE_TO_S == null)
			return "";
		return REFERENCE_TO_S;
	}
	public void setREFERENCE_TO_S(String rEFERENCE_TO_S) {
		REFERENCE_TO_S = rEFERENCE_TO_S;
	}
	public String getRELATIONSHIP_LABEL_S() {
		return RELATIONSHIP_LABEL_S;
	}
	public void setRELATIONSHIP_LABEL_S(String rELATIONSHIP_LABEL_S) {
		RELATIONSHIP_LABEL_S = rELATIONSHIP_LABEL_S;
	}
	public String getRELATIONSHIP_ORDER_S() {
		return RELATIONSHIP_ORDER_S;
	}
	public void setRELATIONSHIP_ORDER_S(String rELATIONSHIP_ORDER_S) {
		RELATIONSHIP_ORDER_S = rELATIONSHIP_ORDER_S;
	}
	public String getCOL_FLTR_NAME_C() {
		if(null == COL_FLTR_NAME_C || "null".equals(COL_FLTR_NAME_C))
			COL_FLTR_NAME_C = "";
		return COL_FLTR_NAME_C;
	}
	public void setCOL_FLTR_NAME_C(String cOL_FLTR_NAME_C) {
		COL_FLTR_NAME_C = cOL_FLTR_NAME_C;
	}
	public String getCOL_FLTR_VAL_C() {
		if(null == COL_FLTR_VAL_C || "null".equals(COL_FLTR_VAL_C))
			COL_FLTR_VAL_C = "";
		return COL_FLTR_VAL_C;
	}
	public void setCOL_FLTR_VAL_C(String cOL_FLTR_VAL_C) {
		COL_FLTR_VAL_C = cOL_FLTR_VAL_C;
	}
	public String getHOVR_TXT_C() {
		if(HOVR_TXT_C == null){
			HOVR_TXT_C = "";
		}
		HOVR_TXT_C = HOVR_TXT_C.replaceAll("[&]","");
		if(HOVR_TXT_C.length() > 255){
			HOVR_TXT_C = HOVR_TXT_C.substring(0,254);
		}
		return HOVR_TXT_C;
	}
	public void setHOVR_TXT_C(String hOVR_TXT_C) {
		HOVR_TXT_C = hOVR_TXT_C;
	}
	public String getRT_CD_C() {
		if(null == RT_CD_C || "null".equals(RT_CD_C))
			RT_CD_C = "";
		return RT_CD_C;
	}
	public void setRT_CD_C(String rT_CD_C) {
		RT_CD_C = rT_CD_C;
	}
	public String getRT_DSC_C() {
		if(null == RT_DSC_C || "null".equals(RT_DSC_C))
			RT_DSC_C = "";
		return RT_DSC_C;
	}
	public void setRT_DSC_C(String rT_DSC_C) {
		RT_DSC_C = rT_DSC_C;
	}
	public String getRT_TBL_NM_C() {
		if(RT_TBL_NM_C == null || "null".equals(RT_TBL_NM_C)){
			RT_TBL_NM_C ="";
		}
		return RT_TBL_NM_C;
	}
	public void setRT_TBL_NM_C(String rT_TBL_NM_C) {
		RT_TBL_NM_C = rT_TBL_NM_C;
	}
	public String getLABEL_OVERIDE_S() {
		return LABEL_OVERIDE_S;
	}
	public void setLABEL_OVERIDE_S(String lABEL_OVERIDE_S) {
		LABEL_OVERIDE_S = lABEL_OVERIDE_S;
	}
	public String getDISPLAY_ONLY_S() {
		return DISPLAY_ONLY_S;
	}
	public void setDISPLAY_ONLY_S(String dISPLAY_ONLY_S) {
		DISPLAY_ONLY_S = dISPLAY_ONLY_S;
	}
	public String getCOL_VISIBLE_S() {
		return COL_VISIBLE_S;
	}
	public void setCOL_VISIBLE_S(String cOL_VISIBLE_S) {
		COL_VISIBLE_S = cOL_VISIBLE_S;
	}
	public Integer getLENGTH_S() {
		if(LENGTH_S==null) {
			LENGTH_S = 0;
		}
		return LENGTH_S;
	}
	public void setLENGTH_S(Integer lENGTH_S) {
		LENGTH_S = lENGTH_S;
	}
	public Integer getPRECISION_S() {
		return PRECISION_S;
	}
	public void setPRECISION_S(Integer pRECISION_S) {
		PRECISION_S = pRECISION_S;
	}
	public Integer getSCALE_S() {
		return SCALE_S;
	}
	public void setSCALE_S(Integer sCALE_S) {
		SCALE_S = sCALE_S;
	}
	public Integer getCOL_ORDER_S() {
		return COL_ORDER_S;
	}
	public void setCOL_ORDER_S(Integer cOL_ORDER_S) {
		COL_ORDER_S = cOL_ORDER_S;
	}
	public Integer getLIST_VIEW_S() {
		return LIST_VIEW_S;
	}
	public void setLIST_VIEW_S(Integer lIST_VIEW_S) {
		LIST_VIEW_S = lIST_VIEW_S;
	}
	@Column(name = "FORMULA_S")
	String FORMULA_S;
	public String getFORMULA_S() {
		if(FORMULA_S == null){
			FORMULA_S ="";
		}
		return FORMULA_S;
	}
	public void setFORMULA_S(String fORMULA_S) {
		FORMULA_S = fORMULA_S;
	}
	/*@Id
	@Column(name = "IDE_OBJ_NM")
	String IDE_OBJ_NM;*/
	@Column(name = "API_NAME_S")
	String API_NAME_S;
	@Column(name = "FIELD_LABEL_S")
	String FIELD_LABEL_S;
	@Column(name = "TYPE_S")
	String TYPE_S;
	@Column(name = "REQUIRED_S")
	String REQUIRED_S;
	@Column(name = "UNIQUE_S")
	String UNIQUE_S;
	@Column(name = "CASE_SENSITIVE_S")
	String CASE_SENSITIVE_S;
	@Column(name = "EXTERNAL_ID_S")
	String EXTERNAL_ID_S;
	@Column(name = "FIELD_DESCRIPTION_S")
	String FIELD_DESCRIPTION_S;
	@Column(name = "REFERENCE_TO_S")
	String REFERENCE_TO_S;
	@Column(name = "RELATIONSHIP_LABEL_S")
	String RELATIONSHIP_LABEL_S;
	@Column(name = "RELATIONSHIP_ORDER_S")
	String RELATIONSHIP_ORDER_S;
	@Column(name = "COL_FLTR_NAME_C")
	String COL_FLTR_NAME_C;
	@Column(name = "COL_FLTR_VAL_C")
	String COL_FLTR_VAL_C;
	@Column(name = "HOVR_TXT_C")
	String HOVR_TXT_C;
	@Column(name = "RT_CD_C")
	String RT_CD_C;
	@Column(name = "RT_DSC_C")
	String RT_DSC_C;
	@Column(name = "RT_TBL_NM_C")
	String RT_TBL_NM_C;
	@Column(name = "LABEL_OVERIDE_S")
	String LABEL_OVERIDE_S;
	@Column(name = "DISPLAY_ONLY_S")
	String DISPLAY_ONLY_S;
	@Column(name = "COL_VISIBLE_S")
	String COL_VISIBLE_S;
	
	@Column(name = "LENGTH_S")
	Integer LENGTH_S;
	@Column(name = "PRECISION_S")
	Integer PRECISION_S;
	@Column(name = "SCALE_S")
	Integer SCALE_S;
	@Column(name = "COL_ORDER_S")
	Integer COL_ORDER_S;
	@Column(name = "LIST_VIEW_S")
	Integer LIST_VIEW_S;
	@Column(name = "IDE_FLD_SEQ")
	Integer IDE_FLD_SEQ;	
	public Integer getIDE_FLD_SEQ() {
		return IDE_FLD_SEQ;
	}
	public void setIDE_FLD_SEQ(Integer iDE_FLD_SEQ) {
		IDE_FLD_SEQ = iDE_FLD_SEQ;
	}
	
	@Column(name = "ROW_NUMBER")
	Integer ROW_NUMBER;
	
	@Column(name = "COL_NUMBER")
	Integer COL_NUMBER;
	public Integer getROW_NUMBER() {
		return ROW_NUMBER;
	}
	public void setROW_NUMBER(Integer rOW_NUMBER) {
		ROW_NUMBER = rOW_NUMBER;
	}
	public Integer getCOL_NUMBER() {
		return COL_NUMBER;
	}
	public void setCOL_NUMBER(Integer cOL_NUMBER) {
		COL_NUMBER = cOL_NUMBER;
	}
	
	@Column(name = "TYPE_C")
	String TYPE_C;
	public String getTYPE_C() {
		if(TYPE_C == null)
			return "";
		return TYPE_C;
	}
	public void setTYPE_C(String tYPE_C) {
		TYPE_C = tYPE_C;
	}
	
	@Column(name = "EDIT_VAL")
	String EDIT_VAL;
	public String getEDIT_VAL() {
		if(EDIT_VAL==null) {
			EDIT_VAL = "";
		}
		return EDIT_VAL;
	}
	public void setEDIT_VAL(String eDIT_VAL) {
		EDIT_VAL = eDIT_VAL;
	}
	
	@Column(name = "OBJ_NAME")
	String OBJ_NAME;
	public String getOBJ_NAME() {
		if(null == OBJ_NAME)
			return "";
		return OBJ_NAME;
	}
	public void setOBJ_NAME(String oBJ_NAME) {
		OBJ_NAME = oBJ_NAME;
	}
	
	@Column(name = "FLD_NAME")
	String FLD_NAME;
	public String getFLD_NAME() {
		if(null == FLD_NAME)
				return "";
		return FLD_NAME;
	}
	public void setFLD_NAME(String fLD_NAME) {
		FLD_NAME = fLD_NAME;
	}
	
	@Column(name = "ENA_DIS_RULE_EXP")
	String ENA_DIS_RULE_EXP;
	public String getENA_DIS_RULE_EXP() {
		if(null == ENA_DIS_RULE_EXP)
			return "";
		
		return FrameworkUtil.compileRule(ENA_DIS_RULE_EXP,false);
	}
	
	@Column(name = "MAND_RULE_EXP")
	String MAND_RULE_EXP;
	public void setENA_DIS_RULE_EXP(String eNA_DIS_RULE_EXP) {
		ENA_DIS_RULE_EXP = eNA_DIS_RULE_EXP;
	}
	public String getMAND_RULE_EXP() {
		if(null == MAND_RULE_EXP)
			return "";
		return "{!"+ FrameworkUtil.compileRule(MAND_RULE_EXP,false) + "}";
	}
	public void setMAND_RULE_EXP(String mAND_RULE_EXP) {
		MAND_RULE_EXP = mAND_RULE_EXP;
	}
	
	/*@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID")
	private IDE_OBJ ideObjFlds;
	
	
	
	*//**
	 * @return the ideObjFlds
	 *//*
	public IDE_OBJ getIdeObjFlds() {
		return ideObjFlds;
	}
	*//**
	 * @param ideObjFlds the ideObjFlds to set
	 *//*
	public void setIdeObjFlds(IDE_OBJ ideObjFlds) {
		this.ideObjFlds = ideObjFlds;
	}*/
	@Column(name = "DEPNT_FLDS")
	String DEPNT_FLDS;

	/**
	 * @return the dEPNT_FLDS
	 */
	public String getDEPNT_FLDS() {
		if(null == DEPNT_FLDS)
			return "";
		
		return DEPNT_FLDS;
	}
	/**
	 * @param dEPNT_FLDS the dEPNT_FLDS to set
	 */
	public void setDEPNT_FLDS(String dEPNT_FLDS) {
		DEPNT_FLDS = dEPNT_FLDS;
	}
	
	@Column(name = "IS_DEPNT")
	String IS_DEPNT;

	/**
	 * @return the iS_DEPNT
	 */
	public String getIS_DEPNT() {
		return IS_DEPNT;
	}
	/**
	 * @param iS_DEPNT the iS_DEPNT to set
	 */
	public void setIS_DEPNT(String iS_DEPNT) {
		IS_DEPNT = iS_DEPNT;
	}
	
	
	@Column(name = "PAGE_PARAMS")
	String PAGE_PARAMS;

	/**
	 * @return the pAGE_PARAMS
	 */
	public String getPAGE_PARAMS() {
		return PAGE_PARAMS;
	}
	/**
	 * @param pAGE_PARAMS the pAGE_PARAMS to set
	 */
	public void setPAGE_PARAMS(String pAGE_PARAMS) {
		PAGE_PARAMS = pAGE_PARAMS;
	}
	
	@Column(name = "DEPNT_S")
	String DEPNT_S;

	/**
	 * @return the dEPNT_S
	 */
	public String getDEPNT_S() {
		return DEPNT_S;
	}
	/**
	 * @param dEPNT_S the dEPNT_S to set
	 */
	public void setDEPNT_S(String dEPNT_S) {
		DEPNT_S = dEPNT_S;
	}
	
	@Column(name="BLANKOUT_FLDS")
	String BLANKOUT_FLDS;

	/**
	 * @return the bLANKOUT_FLDS
	 */
	public String getBLANKOUT_FLDS() {
		if(null == BLANKOUT_FLDS) {
			return BLANKOUT_FLDS="";
		}
		return BLANKOUT_FLDS;
	}
	/**
	 * @param bLANKOUT_FLDS the bLANKOUT_FLDS to set
	 */
	public void setBLANKOUT_FLDS(String bLANKOUT_FLDS) {
		BLANKOUT_FLDS = bLANKOUT_FLDS;
	}
	
	@Column
	String BLANKOUT_FLDS_RULE;

	/**
	 * @return the bLANKOUT_FLDS_RULE
	 */
	public String getBLANKOUT_FLDS_RULE() {
		
		if(BLANKOUT_FLDS_RULE == null)
			return "";
		return "{!"+ FrameworkUtil.compileRule(BLANKOUT_FLDS_RULE,false) + "}";
		
	}
	/**
	 * @param bLANKOUT_FLDS_RULE the bLANKOUT_FLDS_RULE to set
	 */
	public void setBLANKOUT_FLDS_RULE(String bLANKOUT_FLDS_RULE) {
		BLANKOUT_FLDS_RULE = bLANKOUT_FLDS_RULE;
	}
	
	@Column
	String COPY_SRC_FLD;

	/**
	 * @return the cOPY_SRC_FLD
	 */
	public String getCOPY_SRC_FLD() {
		if(COPY_SRC_FLD == null)
			return "";
		return COPY_SRC_FLD;
	}
	/**
	 * @param cOPY_SRC_FLD the cOPY_SRC_FLD to set
	 */
	public void setCOPY_SRC_FLD(String cOPY_SRC_FLD) {
		COPY_SRC_FLD = cOPY_SRC_FLD;
	}
	
	@Column
	String COPY_TARGET_FLD;

	/**
	 * @return the cOPY_TARGET_FLD
	 */
	public String getCOPY_TARGET_FLD() {
		if(COPY_TARGET_FLD == null)
			return "";
		return COPY_TARGET_FLD;
	}
	/**
	 * @param cOPY_TARGET_FLD the cOPY_TARGET_FLD to set
	 */
	public void setCOPY_TARGET_FLD(String cOPY_TARGET_FLD) {
		COPY_TARGET_FLD = cOPY_TARGET_FLD;
	}
	
	@Column
	String COPY_FLDS_RULE;

	/**
	 * @return the cOPY_FLDS_RULE
	 */
	public String getCOPY_FLDS_RULE() {
		if(COPY_FLDS_RULE == null)
			return "";
		
		return "{!"+ FrameworkUtil.compileRule(COPY_FLDS_RULE,false) + "}";
		
	}
	/**
	 * @param cOPY_FLDS_RULE the cOPY_FLDS_RULE to set
	 */
	public void setCOPY_FLDS_RULE(String cOPY_FLDS_RULE) {
		COPY_FLDS_RULE = cOPY_FLDS_RULE;
	}
	
	
	@Column
	String COPY_SEL_OPT_COLS;

	/**
	 * @return the cOPY_SEL_OPT_COLS
	 */
	public String getCOPY_SEL_OPT_COLS() {
		if(COPY_SEL_OPT_COLS == null)
			return "";
		return COPY_SEL_OPT_COLS;
	}
	/**
	 * @param cOPY_SEL_OPT_COLS the cOPY_SEL_OPT_COLS to set
	 */
	public void setCOPY_SEL_OPT_COLS(String cOPY_SEL_OPT_COLS) {
		COPY_SEL_OPT_COLS = cOPY_SEL_OPT_COLS;
	}
	
	@Column
	String COMPUTE_FLD_RULE;

	/**
	 * @return the cOMPUTE_FLD_RULE
	 */
	public String getCOMPUTE_FLD_RULE() {
		if(COMPUTE_FLD_RULE == null)
			return "";
		return "{!"+ FrameworkUtil.compileRule(COMPUTE_FLD_RULE,false) + "}";
	}
	/**
	 * @param cOMPUTE_FLD_RULE the cOMPUTE_FLD_RULE to set
	 */
	public void setCOMPUTE_FLD_RULE(String cOMPUTE_FLD_RULE) {
		COMPUTE_FLD_RULE = cOMPUTE_FLD_RULE;
	}
	
	@Column
	String DEFAULT_VALUE;

	/**
	 * @return the dEFAULT_VALUE
	 */
	public String getDEFAULT_VALUE() {
		if(DEFAULT_VALUE==null)
			return "";
		return DEFAULT_VALUE;
	}
	/**
	 * @param dEFAULT_VALUE the dEFAULT_VALUE to set
	 */
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	
	@Column
	String COPY_DEFAULT_VALUE;

	/**
	 * @return the cOPY_DEFAULT_VALUE
	 */
	public String getCOPY_DEFAULT_VALUE() {
		if(COPY_DEFAULT_VALUE == null)
			COPY_DEFAULT_VALUE="";
		return COPY_DEFAULT_VALUE;
	}
	/**
	 * @param cOPY_DEFAULT_VALUE the cOPY_DEFAULT_VALUE to set
	 */
	public void setCOPY_DEFAULT_VALUE(String cOPY_DEFAULT_VALUE) {
		COPY_DEFAULT_VALUE = cOPY_DEFAULT_VALUE;
	}

	@Column
	String COPY_DEFAULT_TAR;

	/**
	 * @return the cOPY_DEFAULT_TAR
	 */
	public String getCOPY_DEFAULT_TAR() {
		if(COPY_DEFAULT_TAR == null)
			COPY_DEFAULT_TAR="";
		return COPY_DEFAULT_TAR;
	}
	/**
	 * @param cOPY_DEFAULT_TAR the cOPY_DEFAULT_TAR to set
	 */
	public void setCOPY_DEFAULT_TAR(String cOPY_DEFAULT_TAR) {
		COPY_DEFAULT_TAR = cOPY_DEFAULT_TAR;
	}
	
	@Column
	String COPY_DEFAULT_RULE;

	/**
	 * @return the cOPY_DEFAULT_RULE
	 */
	public String getCOPY_DEFAULT_RULE() {
		if(COPY_DEFAULT_RULE == null)
			return "";
		return "{!"+ FrameworkUtil.compileRule(COPY_DEFAULT_RULE,false) + "}";
	}
	/**
	 * @param cOPY_DEFAULT_RULE the cOPY_DEFAULT_RULE to set
	 */
	public void setCOPY_DEFAULT_RULE(String cOPY_DEFAULT_RULE) {
		COPY_DEFAULT_RULE = cOPY_DEFAULT_RULE;
	}
	@Column
	String DISABLE_ON_SELECT;

	/**
	 * @return the dISABLE_ON_SELECT
	 */
	public String getDISABLE_ON_SELECT() {
		if(DISABLE_ON_SELECT == null)
			DISABLE_ON_SELECT= "";
		return "{" + DISABLE_ON_SELECT +"}";
	}
	/**
	 * @param dISABLE_ON_SELECT the dISABLE_ON_SELECT to set
	 */
	public void setDISABLE_ON_SELECT(String dISABLE_ON_SELECT) {
		DISABLE_ON_SELECT = dISABLE_ON_SELECT;
	}
	
	@Column
	String SELECT_ON_SELECT;

	/**
	 * @return the sELECT_ON_SELECT
	 */
	public String getSELECT_ON_SELECT() {
		if(SELECT_ON_SELECT == null)
			SELECT_ON_SELECT = "";
		return "{" + SELECT_ON_SELECT +"}";
	}
	/**
	 * @param sELECT_ON_SELECT the sELECT_ON_SELECT to set
	 */
	public void setSELECT_ON_SELECT(String sELECT_ON_SELECT) {
		SELECT_ON_SELECT = sELECT_ON_SELECT;
	}
	
	/*@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	IDE_FLD ideFld;
	*//**
	 * @return the ideFld
	 *//*
	public IDE_FLD getIdeFld() {
		return ideFld;
	}
	*//**
	 * @param ideFld the ideFld to set
	 *//*
	public void setIdeFld(IDE_FLD ideFld) {
		this.ideFld = ideFld;
	}*/
	
	@Column
	String DATA_PATTERN;
	public String getDATA_PATTERN() {
		if(DATA_PATTERN == null)
			DATA_PATTERN="";
		return DATA_PATTERN;
	}
	public void setDATA_PATTERN(String dATA_PATTERN) {
		DATA_PATTERN = dATA_PATTERN;
	}
	@Column(name = "MIN_LEN")
	Integer MIN_LEN;
	public Integer getMIN_LEN() {
		if(MIN_LEN==null) {
			MIN_LEN = 0;
		}
		return MIN_LEN;
	}
	public void setMIN_LEN(Integer mIN_LEN) {
		MIN_LEN = mIN_LEN;
	}
	@Column(name = "ADDR_FLDS")
	String ADDR_FLDS;
	public String getADDR_FLDS() {
		if(ADDR_FLDS==null) {
			ADDR_FLDS = "";
		}
		return ADDR_FLDS;
		
	}
	public void setADDR_FLDS(String aDDR_FLDS) {
		ADDR_FLDS = aDDR_FLDS;
	}
	
	@Column
	String COND_VALUE;
	/**
	 * @return the cOND_VALUE
	 */
	public String getCOND_VALUE() {
		if(null == COND_VALUE)
			return "";
		
		return FrameworkUtil.compileRule(COND_VALUE,true);
	}
	/**
	 * @param cOND_VALUE the cOND_VALUE to set
	 */
	public void setCOND_VALUE(String cOND_VALUE) {
		COND_VALUE = cOND_VALUE;
	}
	@Column
	Integer MIN_VAL;
	/**
	 * @return the mIN_VAL
	 */
	public Integer getMIN_VAL() {
		return MIN_VAL;
	}
	/**
	 * @param mIN_VAL the mIN_VAL to set
	 */
	public void setMIN_VAL(Integer mIN_VAL) {
		MIN_VAL = mIN_VAL;
	}
	@Column
	Integer MAX_VAL;
	/**
	 * @return the mAX_VAL
	 */
	public Integer getMAX_VAL() {
		if(MAX_VAL == null)
			return -1;
		return MAX_VAL;
	}
	/**
	 * @param mAX_VAL the mAX_VAL to set
	 */
	public void setMAX_VAL(Integer mAX_VAL) {
		MAX_VAL = mAX_VAL;
	}
	@Column
	String DATE_COMP_FLD;
	/**
	 * @return the dATE_COMP_FLD
	 */
	public String getDATE_COMP_FLD() {
		if(DATE_COMP_FLD == null)
			return "";
		
		return "{!"+ FrameworkUtil.compileRule(DATE_COMP_FLD,false) + "}";
		
	}
	/**
	 * @param dATE_COMP_FLD the dATE_COMP_FLD to set
	 */
	public void setDATE_COMP_FLD(String dATE_COMP_FLD) {
		DATE_COMP_FLD = dATE_COMP_FLD;
	}
	
	@Column
	String CLR_ERR_MSG_FLDS;
	/**
	 * @return the cLR_ERR_MSG_FLDS
	 */
	public String getCLR_ERR_MSG_FLDS() {
		if(CLR_ERR_MSG_FLDS == null)
			return "";
		return CLR_ERR_MSG_FLDS;
	}
	/**
	 * @param cLR_ERR_MSG_FLDS the cLR_ERR_MSG_FLDS to set
	 */
	public void setCLR_ERR_MSG_FLDS(String cLR_ERR_MSG_FLDS) {
		CLR_ERR_MSG_FLDS = cLR_ERR_MSG_FLDS;
	}
	
	@Column
	String CLR_ERR_MSG_RULE;
	/**
	 * @return the cLR_ERR_MSG_RULE
	 */
	public String getCLR_ERR_MSG_RULE() {
		if(CLR_ERR_MSG_RULE == null)
			return "";
		
		return "{!"+ FrameworkUtil.compileRule(CLR_ERR_MSG_RULE,false) + "}";
	}
	/**
	 * @param cLR_ERR_MSG_RULE the cLR_ERR_MSG_RULE to set
	 */
	public void setCLR_ERR_MSG_RULE(String cLR_ERR_MSG_RULE) {
		CLR_ERR_MSG_RULE = cLR_ERR_MSG_RULE;
	}
	
	@Column
	String CNTY_RQRD;
	/**
	 * @return the cNTY_RQRD
	 */
	public String getCNTY_RQRD() {
		if(CNTY_RQRD == null)
			return "";
		return CNTY_RQRD;
	}
	/**
	 * @param cNTY_RQRD the cNTY_RQRD to set
	 */
	public void setCNTY_RQRD(String cNTY_RQRD) {
		CNTY_RQRD = cNTY_RQRD;
	}
	
	@Column
	String EXTN_RQRD;
	/**
	 * @return the eXTN_RQRD
	 */
	public String getEXTN_RQRD() {
		if(EXTN_RQRD == null)
			return "";
		return EXTN_RQRD;
	}
	/**
	 * @param eXTN_RQRD the eXTN_RQRD to set
	 */
	public void setEXTN_RQRD(String eXTN_RQRD) {
		EXTN_RQRD = eXTN_RQRD;
	}
	
	@Column
	String 	SEARCH_COND;
	@Column
	String 	CHILD_RELATION;
	@Column
	String 	CRITERIA_METHOD;
	@Column
	String 	TRUMP_ALL;
	@Column
	String 	SHOW_LINK;
	@Column
	String 	SHOW_ICON;
	@Column
	String 	ICON_NAME;
	/**
	 * @return the sEARCH_COND
	 */
	public String getSEARCH_COND() {
		if(SEARCH_COND == null)
			return "";
		return SEARCH_COND;
	}
	/**
	 * @param sEARCH_COND the sEARCH_COND to set
	 */
	public void setSEARCH_COND(String sEARCH_COND) {
		SEARCH_COND = sEARCH_COND;
	}
	/**
	 * @return the cHILD_RELATION
	 */
	public String getCHILD_RELATION() {
		if(CHILD_RELATION == null)
			return "";
		return CHILD_RELATION;
	}
	/**
	 * @param cHILD_RELATION the cHILD_RELATION to set
	 */
	public void setCHILD_RELATION(String cHILD_RELATION) {
		CHILD_RELATION = cHILD_RELATION;
	}
	/**
	 * @return the cRITERIA_METHOD
	 */
	public String getCRITERIA_METHOD() {
		if(CRITERIA_METHOD == null)
			return "";
		return CRITERIA_METHOD;
	}
	/**
	 * @param cRITERIA_METHOD the cRITERIA_METHOD to set
	 */
	public void setCRITERIA_METHOD(String cRITERIA_METHOD) {
		CRITERIA_METHOD = cRITERIA_METHOD;
	}
	/**
	 * @return the tRUMP_ALL
	 */
	public String getTRUMP_ALL() {
		if(TRUMP_ALL == null)
			return "";
		return TRUMP_ALL;
	}
	/**
	 * @param tRUMP_ALL the tRUMP_ALL to set
	 */
	public void setTRUMP_ALL(String tRUMP_ALL) {
		TRUMP_ALL = tRUMP_ALL;
	}
	/**
	 * @return the sHOW_LINK
	 */
	public String getSHOW_LINK() {
		if(SHOW_LINK == null)
			return "";
		return SHOW_LINK;
	}
	/**
	 * @param sHOW_LINK the sHOW_LINK to set
	 */
	public void setSHOW_LINK(String sHOW_LINK) {
		SHOW_LINK = sHOW_LINK;
	}
	/**
	 * @return the sHOW_ICON
	 */
	public String getSHOW_ICON() {
		if(SHOW_ICON == null)
			return "";
		return SHOW_ICON;
	}
	/**
	 * @param sHOW_ICON the sHOW_ICON to set
	 */
	public void setSHOW_ICON(String sHOW_ICON) {
		SHOW_ICON = sHOW_ICON;
	}
	/**
	 * @return the iCON_NAME
	 */
	public String getICON_NAME() {
		if(ICON_NAME == null)
			return "";
		return ICON_NAME;
	}
	/**
	 * @param iCON_NAME the iCON_NAME to set
	 */
	public void setICON_NAME(String iCON_NAME) {
		ICON_NAME = iCON_NAME;
	}
	@Column
	String VAL_RULE;
	@Column
	String VAL_ERR_MSG;
	/**
	 * @return the vAL_RULE
	 */
	public String getVAL_RULE() {
		if(VAL_RULE == null)
			return "";
		return "{!" + FrameworkUtil.compileRule(VAL_RULE, false) + "}";
	}
	/**
	 * @param vAL_RULE the vAL_RULE to set
	 */
	public void setVAL_RULE(String vAL_RULE) {
		VAL_RULE = vAL_RULE;
	}
	/**
	 * @return the vAL_ERR_MSG
	 */
	public String getVAL_ERR_MSG() {
		if(VAL_ERR_MSG == null)
			return "";
		return VAL_ERR_MSG;
	}
	/**
	 * @param vAL_ERR_MSG the vAL_ERR_MSG to set
	 */
	public void setVAL_ERR_MSG(String vAL_ERR_MSG) {
		VAL_ERR_MSG = vAL_ERR_MSG;
	}
	
}



