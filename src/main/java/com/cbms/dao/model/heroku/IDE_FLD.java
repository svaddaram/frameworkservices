package com.cbms.dao.model.heroku;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "ideObjFlds" })
@Entity
@Table(name = "IDE_FLD",schema = "salesforce")
public class IDE_FLD implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public String getAPI_NAME_S() {
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
		/*if(UNIQUE_S == null || "N".equalsIgnoreCase(UNIQUE_S)){
			UNIQUE_S ="false";
		}else {
			UNIQUE_S ="true";
		}*/
		return UNIQUE_S;
	}
	public void setUNIQUE_S(String uNIQUE_S) {
		UNIQUE_S=uNIQUE_S;
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
		if(FORMULA_S.contains("&") && !FORMULA_S.contains("&amp;")) {
			FORMULA_S =  FORMULA_S.replace("&", "&amp;");
		}
		return FORMULA_S;
	}
	public void setFORMULA_S(String fORMULA_S) {
		FORMULA_S = fORMULA_S;
	}
	
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
	@Id
	@SequenceGenerator(name="ide_field_sequence", sequenceName="ide_field_sequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ide_field_sequence")
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
		if(ENA_DIS_RULE_EXP.contains("__c") && !ENA_DIS_RULE_EXP.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(ENA_DIS_RULE_EXP);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
			while(m.find()) {
				String mGrp = m.group();
		    	/*if(!mGrp.equals(mGrpTemp)) {
		    		mGrpTemp = mGrp;
		    		ENA_DIS_RULE_EXP = ENA_DIS_RULE_EXP.replace(mGrp, "v.detailData.sobjectData." + mGrp);
		    	}*/
				 m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
			m.appendTail(sb);
			ENA_DIS_RULE_EXP = sb.toString();
		}
		if(ENA_DIS_RULE_EXP.contains("&")) {
			ENA_DIS_RULE_EXP = ENA_DIS_RULE_EXP.replace("&", "&amp;");
		}   
		return "{!"+ ENA_DIS_RULE_EXP + "}";
	}
	
	@Column(name = "MAND_RULE_EXP")
	String MAND_RULE_EXP;
	public void setENA_DIS_RULE_EXP(String eNA_DIS_RULE_EXP) {
		ENA_DIS_RULE_EXP = eNA_DIS_RULE_EXP;
	}
	public String getMAND_RULE_EXP() {
		if(null == MAND_RULE_EXP)
			return "";
		if(MAND_RULE_EXP.contains("__c") && !MAND_RULE_EXP.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(MAND_RULE_EXP);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
		    while(m.find()) {
		    	String mGrp = m.group();
		    	/*MAND_RULE_EXP = m.replaceAll("v.detailData.sobjectData."+ mGrp);
		    	if(!mGrp.equals(mGrpTemp)) {
		    		mGrpTemp = mGrp;
		    		MAND_RULE_EXP = MAND_RULE_EXP.replace(mGrp, "v.detailData.sobjectData." + mGrp);
		    	}*/
		    	m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
		    m.appendTail(sb);
		    MAND_RULE_EXP = sb.toString();
		}
		if(MAND_RULE_EXP.contains("&")) {
			MAND_RULE_EXP = MAND_RULE_EXP.replace("&", "&amp;");
		}
		return "{!"+ MAND_RULE_EXP + "}";
	}
	public void setMAND_RULE_EXP(String mAND_RULE_EXP) {
		MAND_RULE_EXP = mAND_RULE_EXP;
	}
	
	@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID")
	private IDE_OBJ ideObjFlds;
	
	/**
	 * @return the ideObjFlds
	 */
	public IDE_OBJ getIdeObjFlds() {
		return ideObjFlds;
	}
	/**
	 * @param ideObjFlds the ideObjFlds to set
	 */
	public void setIdeObjFlds(IDE_OBJ ideObjFlds) {
		this.ideObjFlds = ideObjFlds;
	}
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
		if(PAGE_PARAMS == null) {
			return "";
		}
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
		/*else {
			String blnkoutFlds[] = BLANKOUT_FLDS.split(",");
			String temp = "";
			for(String str:blnkoutFlds) {
				temp = temp + "'" +str+"',"; 
			}
			BLANKOUT_FLDS =  "[" + temp.substring(0,temp.lastIndexOf(",")) + "]";
		}*/
			
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
		
		if(BLANKOUT_FLDS_RULE.contains("__c") && !BLANKOUT_FLDS_RULE.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(BLANKOUT_FLDS_RULE);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
		    while(m.find()) {
		    	String mGrp = m.group();
		    	m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
		    m.appendTail(sb);
		    BLANKOUT_FLDS_RULE = sb.toString();
		}
		if(BLANKOUT_FLDS_RULE.contains("&")) {
			BLANKOUT_FLDS_RULE = BLANKOUT_FLDS_RULE.replace("&", "&amp;");
		}
		return "{!"+ BLANKOUT_FLDS_RULE + "}";
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
		if(COPY_FLDS_RULE.contains("__c") && !COPY_FLDS_RULE.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(COPY_FLDS_RULE);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
		    while(m.find()) {
		    	String mGrp = m.group();
		    	m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
		    m.appendTail(sb);
		    COPY_FLDS_RULE = sb.toString();
		}
		if(COPY_FLDS_RULE.contains("&")) {
			COPY_FLDS_RULE = COPY_FLDS_RULE.replace("&", "&amp;");
		}
		return "{!"+ COPY_FLDS_RULE + "}";
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
		if(COMPUTE_FLD_RULE.contains("__c") && !COMPUTE_FLD_RULE.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(COMPUTE_FLD_RULE);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
		    while(m.find()) {
		    	String mGrp = m.group();
		    	m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
		    m.appendTail(sb);
		    COMPUTE_FLD_RULE = sb.toString();
		}
		if(COMPUTE_FLD_RULE.contains("&")) {
			COMPUTE_FLD_RULE = COMPUTE_FLD_RULE.replace("&", "&amp;");
		}
		return "{!"+ COMPUTE_FLD_RULE + "}";
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
		if(COPY_DEFAULT_RULE.contains("__c") && !COPY_DEFAULT_RULE.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(COPY_DEFAULT_RULE);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
		    while(m.find()) {
		    	String mGrp = m.group();
		    	m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
		    m.appendTail(sb);
		    COPY_DEFAULT_RULE = sb.toString();
		}
		if(COPY_DEFAULT_RULE.contains("&")) {
			COPY_DEFAULT_RULE = COPY_DEFAULT_RULE.replace("&", "&amp;");
		}
		return "{!"+ COPY_DEFAULT_RULE + "}";
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
		return DISABLE_ON_SELECT;
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
		return SELECT_ON_SELECT;
	}
	@Column
	String IS_PARENT;
	
	/**
	 * @return the iS_PARENT
	 */
	public String getIS_PARENT() {
		if(IS_PARENT == null)
			return "";
		return IS_PARENT;
	}
	/**
	 * @param iS_PARENT the iS_PARENT to set
	 */
	public void setIS_PARENT(String iS_PARENT) {
		IS_PARENT = iS_PARENT;
	}
	/**
	 * @param sELECT_ON_SELECT the sELECT_ON_SELECT to set
	 */
	public void setSELECT_ON_SELECT(String sELECT_ON_SELECT) {
		SELECT_ON_SELECT = sELECT_ON_SELECT;
	}
	/*@OneToOne(fetch = FetchType.LAZY, mappedBy = "ideFld", cascade = CascadeType.ALL)
	@JoinColumn(name="COL_ID", nullable=false, insertable=false, updatable=false)
	IDE_FIELD_LAYOUT ideFldLayout;

	*//**
	 * @return the ideFldLayout
	 *//*
	public IDE_FIELD_LAYOUT getIdeFldLayout() {
		return ideFldLayout;
	}
	*//**
	 * @param ideFldLayout the ideFldLayout to set
	 *//*
	public void setIdeFldLayout(IDE_FIELD_LAYOUT ideFldLayout) {
		this.ideFldLayout = ideFldLayout;
	}*/
	

	
	@Column
	String DISP_REL_LST;
	
	
	public void setDISP_REL_LST(String dISP_REL_LST) {
		DISP_REL_LST = dISP_REL_LST;
	}
	
	public String getDISP_REL_LST() {
		return DISP_REL_LST;
	}
	
	
}
