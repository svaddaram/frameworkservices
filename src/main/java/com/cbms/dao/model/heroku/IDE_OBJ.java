package com.cbms.dao.model.heroku;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "IDE_OBJ__c",schema = "salesforce")
public class IDE_OBJ implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "IDE_OBJ_ID__c")
	String IDE_OBJ_ID;
	@Column(name = "OBJECT_NAME_S__c")
	String OBJECT_NAME_S;
	@Column(name = "API_S__c")
	String API_S;
	@Column(name = "TYPE_C__c")
	String TYPE_C;
	@Column(name = "PLURAL_NAME_S__c")
	String PLURAL_NAME_S;
	@Column(name = "SHARING_MODEL_S__c")
	String SHARING_MODEL_S;
	@Column(name = "ENABLE_ACTVITIES_S__c")
	String ENABLE_ACTVITIES_S;
	@Column(name = "ENABLE_FEEDS_S__c")
	String ENABLE_FEEDS_S;
	@Column(name = "ENABLE_HISTORY_S__c")
	String ENABLE_HISTORY_S;
	@Column(name = "ENABLE_REPORTS_S__c")
	String ENABLE_REPORTS_S;
	@Column(name = "DESCRIPTION_S__c")
	String DESCRIPTION_S;
	@Column(name = "SEQ_TYPE_S__c")
	String SEQ_TYPE_S;
	@Column(name = "LABEL_S__c")
	String LABEL_S;
	@Column(name = "DISPLAY_FORMAT_S__c")
	String DISPLAY_FORMAT_S;
	@Column(name = "GENERATE_C__c")
	String GENERATE_C;
	@Column(name = "INAPP_C__c")
	String INAPP_C;
	@Column(name = "IS_CUSTOM__c")
	String IS_CUSTOM;
	@Column(name = "ENABLE_STRMING_API_S__c")
	String ENABLE_STRMING_API_S;
	@Column(name = "ENABLE_SRCH_S__c")
	String ENABLE_SRCH_S;
	@Column(name = "ENABLE_BULK_APL_S__c")
	String ENABLE_BULK_APL_S;
	@Column(name = "ENABLE_SHARING_S__c")
	String ENABLE_SHARING_S;
	
	@Column(name = "created_by__c")
	String created_by;
	
	@Column(name = "updated_by__c")
	String updated_by;
	@Column(name = "DW_NAME__C")
	private String DW_NAME__C;
	
	@Column(name = "status__c")
	String status;
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setDW_NAME__C(String dW_NAME__C) {
		DW_NAME__C = dW_NAME__C;
	}
	
	public String getDW_NAME__C() {
		return DW_NAME__C;
	}
	
	@Column(name = "NAME")
	private String Name;
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
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
	
	/*@Column(name = "systemmodstamp")
	String systemModStamp;
	
	public void setSystemModStamp(String systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	
	public String getSystemModStamp() {
		return systemModStamp;
	}*/
	
	@Column(name = "systemmodstamp", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date systemModStamp;
	
	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	
	public Date getSystemModStamp() {
		return systemModStamp;
	}
	
	
	@Column(name = "createddate", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;
	
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	public Date getCreateddate() {
		return createddate;
	}
	
	
	
	/**
	 * @return the iDE_OBJ_ID
	 */
	public String getIDE_OBJ_ID() {
		return IDE_OBJ_ID;
	}
	/**
	 * @param iDE_OBJ_ID the iDE_OBJ_ID to set
	 */
	public void setIDE_OBJ_ID(String iDE_OBJ_ID) {
		IDE_OBJ_ID = iDE_OBJ_ID;
	}
	/**
	 * @return the oBJECT_NAME_S
	 */
	public String getOBJECT_NAME_S() {
		return OBJECT_NAME_S;
	}
	/**
	 * @param oBJECT_NAME_S the oBJECT_NAME_S to set
	 */
	public void setOBJECT_NAME_S(String oBJECT_NAME_S) {
		OBJECT_NAME_S = oBJECT_NAME_S;
	}
	/**
	 * @return the aPI_S
	 */
	public String getAPI_S() {
		return API_S;
	}
	/**
	 * @param aPI_S the aPI_S to set
	 */
	public void setAPI_S(String aPI_S) {
		API_S = aPI_S;
	}
	/**
	 * @return the tYPE_C
	 */
	public String getTYPE_C() {
		return TYPE_C;
	}
	/**
	 * @param tYPE_C the tYPE_C to set
	 */
	public void setTYPE_C(String tYPE_C) {
		TYPE_C = tYPE_C;
	}
	/**
	 * @return the pLURAL_NAME_S
	 */
	public String getPLURAL_NAME_S() {
		return PLURAL_NAME_S;
	}
	/**
	 * @param pLURAL_NAME_S the pLURAL_NAME_S to set
	 */
	public void setPLURAL_NAME_S(String pLURAL_NAME_S) {
		PLURAL_NAME_S = pLURAL_NAME_S;
	}
	/**
	 * @return the sHARING_MODEL_S
	 */
	public String getSHARING_MODEL_S() {
		return SHARING_MODEL_S;
	}
	/**
	 * @param sHARING_MODEL_S the sHARING_MODEL_S to set
	 */
	public void setSHARING_MODEL_S(String sHARING_MODEL_S) {
		SHARING_MODEL_S = sHARING_MODEL_S;
	}
	/**
	 * @return the eNABLE_ACTVITIES_S
	 */
	public String getENABLE_ACTVITIES_S() {
		return ENABLE_ACTVITIES_S;
	}
	/**
	 * @param eNABLE_ACTVITIES_S the eNABLE_ACTVITIES_S to set
	 */
	public void setENABLE_ACTVITIES_S(String eNABLE_ACTVITIES_S) {
		ENABLE_ACTVITIES_S = eNABLE_ACTVITIES_S;
	}
	/**
	 * @return the eNABLE_FEEDS_S
	 */
	public String getENABLE_FEEDS_S() {
		return ENABLE_FEEDS_S;
	}
	/**
	 * @param eNABLE_FEEDS_S the eNABLE_FEEDS_S to set
	 */
	public void setENABLE_FEEDS_S(String eNABLE_FEEDS_S) {
		ENABLE_FEEDS_S = eNABLE_FEEDS_S;
	}
	/**
	 * @return the eNABLE_HISTORY_S
	 */
	public String getENABLE_HISTORY_S() {
		return ENABLE_HISTORY_S;
	}
	/**
	 * @param eNABLE_HISTORY_S the eNABLE_HISTORY_S to set
	 */
	public void setENABLE_HISTORY_S(String eNABLE_HISTORY_S) {
		ENABLE_HISTORY_S = eNABLE_HISTORY_S;
	}
	/**
	 * @return the eNABLE_REPORTS_S
	 */
	public String getENABLE_REPORTS_S() {
		return ENABLE_REPORTS_S;
	}
	/**
	 * @param eNABLE_REPORTS_S the eNABLE_REPORTS_S to set
	 */
	public void setENABLE_REPORTS_S(String eNABLE_REPORTS_S) {
		ENABLE_REPORTS_S = eNABLE_REPORTS_S;
	}
	/**
	 * @return the dESCRIPTION_S
	 */
	public String getDESCRIPTION_S() {
		return DESCRIPTION_S;
	}
	/**
	 * @param dESCRIPTION_S the dESCRIPTION_S to set
	 */
	public void setDESCRIPTION_S(String dESCRIPTION_S) {
		DESCRIPTION_S = dESCRIPTION_S;
	}
	/**
	 * @return the sEQ_TYPE_S
	 */
	public String getSEQ_TYPE_S() {
		return SEQ_TYPE_S;
	}
	/**
	 * @param sEQ_TYPE_S the sEQ_TYPE_S to set
	 */
	public void setSEQ_TYPE_S(String sEQ_TYPE_S) {
		SEQ_TYPE_S = sEQ_TYPE_S;
	}
	/**
	 * @return the lABEL_S
	 */
	public String getLABEL_S() {
		return LABEL_S;
	}
	/**
	 * @param lABEL_S the lABEL_S to set
	 */
	public void setLABEL_S(String lABEL_S) {
		LABEL_S = lABEL_S;
	}
	/**
	 * @return the dISPLAY_FORMAT_S
	 */
	public String getDISPLAY_FORMAT_S() {
		return DISPLAY_FORMAT_S;
	}
	/**
	 * @param dISPLAY_FORMAT_S the dISPLAY_FORMAT_S to set
	 */
	public void setDISPLAY_FORMAT_S(String dISPLAY_FORMAT_S) {
		DISPLAY_FORMAT_S = dISPLAY_FORMAT_S;
	}
	/**
	 * @return the gENERATE_C
	 */
	public String getGENERATE_C() {
		return GENERATE_C;
	}
	/**
	 * @param gENERATE_C the gENERATE_C to set
	 */
	public void setGENERATE_C(String gENERATE_C) {
		GENERATE_C = gENERATE_C;
	}
	/**
	 * @return the iNAPP_C
	 */
	public String getINAPP_C() {
		return INAPP_C;
	}
	/**
	 * @param iNAPP_C the iNAPP_C to set
	 */
	public void setINAPP_C(String iNAPP_C) {
		INAPP_C = iNAPP_C;
	}
	/**
	 * @return the iS_CUSTOM
	 */
	public String getIS_CUSTOM() {
		return IS_CUSTOM;
	}
	/**
	 * @param iS_CUSTOM the iS_CUSTOM to set
	 */
	public void setIS_CUSTOM(String iS_CUSTOM) {
		IS_CUSTOM = iS_CUSTOM;
	}
	
	/*@OneToMany(mappedBy = "ideObjSectn")
	@Where(clause="SECTN_VISIBLE!='N'")
	@OrderBy("IDE_PG_SECTN_SEQ")
	private List<IDE_PG_SECTN> idePgSectns = new ArrayList<IDE_PG_SECTN>();
	
	public List<IDE_PG_SECTN> getIdePgSectns() {
		return this.idePgSectns;
	}

	public void setIdePgSectns(List<IDE_PG_SECTN> idePgSectns) {
		this.idePgSectns = idePgSectns;
	}
	
	@OneToMany(mappedBy = "ideObjSubSection")
	@OrderBy("SEQ_ORD")
	private List<IDE_PG_SUB_SECTN> idePgsubSectns = new ArrayList<IDE_PG_SUB_SECTN>();
	*//**
	 * @return the idePgsubSectns
	 *//*
	public List<IDE_PG_SUB_SECTN> getIdePgsubSectns() {
		return idePgsubSectns;
	}
	*//**
	 * @param idePgsubSectns the idePgsubSectns to set
	 *//*
	public void setIdePgsubSectns(List<IDE_PG_SUB_SECTN> idePgsubSectns) {
		this.idePgsubSectns = idePgsubSectns;
	}
	
	@OneToMany(mappedBy = "ideObjFldLayouts")
	@OrderBy(" ROW_NUMBER, COL_NUMBER")
	private List<IDE_FIELD_LAYOUT> ideFldLayouts = new ArrayList<IDE_FIELD_LAYOUT>();
	*//**
	 * @return the ideFldLayouts
	 *//*
	public List<IDE_FIELD_LAYOUT> getIdeFldLayouts() {
		return ideFldLayouts;
	}
	*//**
	 * @param ideFldLayouts the ideFldLayouts to set
	 *//*
	public void setIdeFldLayouts(List<IDE_FIELD_LAYOUT> ideFldLayouts) {
		this.ideFldLayouts = ideFldLayouts;
	}*/
	

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "ideObjFlds")
	private List<IDE_FLD> ideFlds = new ArrayList<IDE_FLD>();
	/**
	 * @return the ideFlds
	 */
	public List<IDE_FLD> getIdeFlds() {
		return ideFlds;
	}
	/**
	 * @param ideFlds the ideFlds to set
	 */
	public void setIdeFlds(List<IDE_FLD> ideFlds) {
		this.ideFlds = ideFlds;
	}
	
	public void addPageLayout(IDE_PG_LAYOUT layout) {
		idePgLayouts.add(layout);
		layout.setIdePgLayouts(this);
    }
	
	public void addPageFields(IDE_FLD field) {
		ideFlds.add(field);
		field.setIdeObjFlds(this);
    }
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "idePgLayouts")
	private List<IDE_PG_LAYOUT> idePgLayouts = new ArrayList<IDE_PG_LAYOUT>();
	
	public List<IDE_PG_LAYOUT> getIdePgLayouts() {
		return idePgLayouts;
	}
	
	public void setIdePgLayouts(List<IDE_PG_LAYOUT> idePgLayouts) {
		this.idePgLayouts = idePgLayouts;
	}
	
	/*@OneToMany(mappedBy = "ideBoValidations")
	private List<IDE_BO_VALIDATIONS> ideBoValidations = new ArrayList<IDE_BO_VALIDATIONS>();
	
	
	*//**oad
	 * @return the ideBoValidations
	 *//*
	public List<IDE_BO_VALIDATIONS> getIdeBoValidations() {
		return ideBoValidations;
	}
	*//**
	 * @param ideBoValidations the ideBoValidations to set
	 *//*
	public void setIdeBoValidations(List<IDE_BO_VALIDATIONS> ideBoValidations) {
		this.ideBoValidations = ideBoValidations;
	}
	
	@OneToMany(mappedBy = "ideObjTriggers")
	private List<IDE_OBJ_TRIGGER> ideObjTriggers = new ArrayList<IDE_OBJ_TRIGGER>();
	
	*//**
	 * @return the ideObjTriggers
	 *//*
	public List<IDE_OBJ_TRIGGER> getIdeObjTriggers() {
		return ideObjTriggers;
	}
	*//**
	 * @param ideObjTriggers the ideObjTriggers to set
	 *//*
	public void setIdeObjTriggers(List<IDE_OBJ_TRIGGER> ideObjTriggers) {
		this.ideObjTriggers = ideObjTriggers;
	}*/
	
	@OneToMany(mappedBy = "ideObjTriggers")
	/*private List<IDE_OBJ_TRIGGER> ideObjTriggers = new ArrayList<IDE_OBJ_TRIGGER>();
	
	
	public void setIdeObjTriggers(List<IDE_OBJ_TRIGGER> ideObjTriggers) {
		this.ideObjTriggers = ideObjTriggers;
	}
	
	public List<IDE_OBJ_TRIGGER> getIdeObjTriggers() {
		return ideObjTriggers;
	}*/
	
	public String getENABLE_STRMING_API_S() {
		return ENABLE_STRMING_API_S;
	}
	public void setENABLE_STRMING_API_S(String eNABLE_STRMING_API_S) {
		ENABLE_STRMING_API_S = eNABLE_STRMING_API_S;
	}
	public String getENABLE_SRCH_S() {
		return ENABLE_SRCH_S;
	}
	public void setENABLE_SRCH_S(String eNABLE_SRCH_S) {
		ENABLE_SRCH_S = eNABLE_SRCH_S;
	}
	public String getENABLE_BULK_APL_S() {
		return ENABLE_BULK_APL_S;
	}
	public void setENABLE_BULK_APL_S(String eNABLE_BULK_APL_S) {
		ENABLE_BULK_APL_S = eNABLE_BULK_APL_S;
	}
	public String getENABLE_SHARING_S() {
		return ENABLE_SHARING_S;
	}
	public void setENABLE_SHARING_S(String eNABLE_SHARING_S) {
		ENABLE_SHARING_S = eNABLE_SHARING_S;
	}
	
	
}
