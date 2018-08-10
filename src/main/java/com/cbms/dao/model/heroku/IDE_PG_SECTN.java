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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "idePageSectns" })
@Entity
@Table(name = "IDE_PG_SECTN__c",schema = "salesforce")
public class IDE_PG_SECTN implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "created_by__c")
	String created_by;
	
	@Column(name = "updated_by__c")
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
	
	@Column(name = "row__c")
	private Integer row;
	
	@Column(name = "column__c")
	private Integer column;
	
	public void setRow(Integer row) {
		this.row = row;
	}
	
	public Integer getRow() {
		return row;
	}
	
	public void setColumn(Integer column) {
		this.column = column;
	}
	
	public Integer getColumn() {
		return column;
	}
	
	@Column(name = "Name")
	private String Name;
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	
	@Column(name = "ALLW_DEL__c")
	String ALLW_DEL;
	public String getALLW_DEL() {
		return ALLW_DEL;
	}
	public void setALLW_DEL(String aLLW_DEL) {
		ALLW_DEL = aLLW_DEL;
	}
	public String getGRP_LABLE() {
		return GRP_LABLE;
	}
	public void setGRP_LABLE(String gRP_LABLE) {
		GRP_LABLE = gRP_LABLE;
	}
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
	public Integer getIDE_PG_SECTN_SEQ() {
		return IDE_PG_SECTN_SEQ;
	}
	public void setIDE_PG_SECTN_SEQ(Integer iDE_PG_SECTN_SEQ) {
		IDE_PG_SECTN_SEQ = iDE_PG_SECTN_SEQ;
	}
	public String getVW_DEL() {
		return VW_DEL;
	}
	public void setVW_DEL(String vW_DEL) {
		VW_DEL = vW_DEL;
	}
	public String getVW_HIST() {
		return VW_HIST;
	}
	public void setVW_HIST(String vW_HIST) {
		VW_HIST = vW_HIST;
	}
	@Column(name = "GRP_LABEL__c")
	String GRP_LABLE;
/*	@Column(name = "IDE_OBJ_ID__c", nullable=false)
	String IDE_OBJ_ID;*/

	@Column(name = "IDE_PG_SECTN_SEQ__c")
	Integer	IDE_PG_SECTN_SEQ;
	@Column(name = "VW_DEL__c")
	String VW_DEL;
	@Column(name = "VW_HIST__c")
	String VW_HIST;
	
	@Column(name = "IDE_PG_GRP_ID__c")
	Integer IDE_PG_GRP_ID;
	public Integer getIDE_PG_GRP_ID() {
		return IDE_PG_GRP_ID;
	}
	public void setIDE_PG_GRP_ID(Integer iDE_PG_GRP_ID) {
		IDE_PG_GRP_ID = iDE_PG_GRP_ID;
	}
	
	@Column(name = "TYPE__c")
	String TYPE;
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	
	@Column(name = "SECTN_VISIBLE__c")
	String SECTN_VISIBLE;
	
	public String getSECTN_VISIBLE() {
		  if(SECTN_VISIBLE == null)
			   return "";
			  return SECTN_VISIBLE;
	}
	public void setSECTN_VISIBLE(String sECTN_VISIBLE) {
		SECTN_VISIBLE = sECTN_VISIBLE;
	}
	@Id
	@SequenceGenerator(name="IDE_PG_SECTION_SEQUENCE", sequenceName="IDE_PG_SECTION_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDE_PG_SECTION_SEQUENCE")
	@Column(name = "IDE_PG_SECTN_ID__c")
	Integer IDE_PG_SECTN_ID;
	public Integer getIDE_PG_SECTN_ID() {
		return IDE_PG_SECTN_ID;
	}
	public void setIDE_PG_SECTN_ID(Integer iDE_PG_SECTN_ID) {
		IDE_PG_SECTN_ID = iDE_PG_SECTN_ID;
	}
	
		
	@Column(name = "TYP__c")
	String TYP;
	public String getTYP() {
		return TYP;
	}
	public void setTYP(String tYP) {
		TYP = tYP;
	}
	
	@Column(name = "IDE_OBJ_ID__c" )
	String IDE_OBJ_ID__c;
	
	public void setIDE_OBJ_ID__c(String iDE_OBJ_ID__c) {
		IDE_OBJ_ID__c = iDE_OBJ_ID__c;
	}
	
	public String getIDE_OBJ_ID__c() {
		return IDE_OBJ_ID__c;
	}
	
	/*@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID", nullable=false, insertable=false, updatable=false)
	private IDE_OBJ ideObjSectn;
	*//**
	 * @return the ideObjSectn
	 *//*
	public IDE_OBJ getIdeObjSectn() {
		return ideObjSectn;
	}
	*//**
	 * @param ideObjSectn the ideObjSectn to set
	 *//*
	public void setIdeObjSectn(IDE_OBJ ideObjSectn) {
		this.ideObjSectn = ideObjSectn;
	}*/
	@Column(name = "IDE_PG_LAYOUT_ID__c",insertable=false,updatable=false)
	//@NaturalId
	Integer IDE_PG_LAYOUT_ID__c;
	
	public Integer getIDE_PG_LAYOUT_ID__c() {
		return IDE_PG_LAYOUT_ID__c;
	}
	
	public void setIDE_PG_LAYOUT_ID__c(Integer iDE_PG_LAYOUT_ID__c) {
		IDE_PG_LAYOUT_ID__c = iDE_PG_LAYOUT_ID__c;
	}
	
	@ManyToOne
	  @JoinColumns({
	        @JoinColumn(name="IDE_PG_LAYOUT_ID__c", referencedColumnName="IDE_PG_LAYOUT_ID__c")
	    })
	private IDE_PG_LAYOUT idePageSectns;
	/**
	 * @return the idePageSectns
	 */
	public IDE_PG_LAYOUT getIdePageSectns() {
		return idePageSectns;
	}
	/**
	 * @param idePageSectns the idePageSectns to set
	 */
	public void setIdePageSectns(IDE_PG_LAYOUT idePageSectns) {
		this.idePageSectns = idePageSectns;
	}
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "idePageSubSectns")
	 @OrderBy("SEQ_ORD")
	private List<IDE_PG_SUB_SECTN> idePageSubSectns = new ArrayList<IDE_PG_SUB_SECTN>();
	/**
	 * @return the idePageSubSectns
	 */
	public List<IDE_PG_SUB_SECTN> getIdePageSubSectns() {
		return idePageSubSectns;
	}
	/**
	 * @param idePageSubSectns the idePageSubSectns to set
	 */
	public void setIdePageSubSectns(List<IDE_PG_SUB_SECTN> idePageSubSectns) {
		this.idePageSubSectns = idePageSubSectns;
	}
	public void addPageSubSection(IDE_PG_SUB_SECTN idePgSubSectn) {
		idePageSubSectns.add(idePgSubSectn);
		idePgSubSectn.setIdePageSubSectns(this);
		//idePgSubSectn.setIDE_OBJ_ID(getIDE_OBJ_ID());
	}
	
	/*@OneToMany(mappedBy = "idePgSecFldLayouts")
	@OrderBy(" ROW_NUMBER, COL_NUMBER, COL_ORDER_S")
	private List<IDE_FIELD_LAYOUT> idePgSecFldLayouts = new ArrayList<IDE_FIELD_LAYOUT>();
	*//**
	 * @return the idePgSecFldLayouts
	 *//*
	public List<IDE_FIELD_LAYOUT> getIdePgSecFldLayouts() {
		return idePgSecFldLayouts;
	}
	*//**
	 * @param idePgSecFldLayouts the idePgSecFldLayouts to set
	 *//*
	public void setIdePgSecFldLayouts(List<IDE_FIELD_LAYOUT> idePgSecFldLayouts) {
		this.idePgSecFldLayouts = idePgSecFldLayouts;
	}*/
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "idePgSectionLayoutList",orphanRemoval=true)
	private List<IDE_SECTION_FLD_LAYOUT> idePgSectionLayoutList = new ArrayList<IDE_SECTION_FLD_LAYOUT>();

	public void setIdePgSectionLayoutList(List<IDE_SECTION_FLD_LAYOUT> idePgSectionLayoutList) {
		this.idePgSectionLayoutList = idePgSectionLayoutList;
	}
	
	public List<IDE_SECTION_FLD_LAYOUT> getIdePgSectionLayoutList() {
		return idePgSectionLayoutList;
	}
	public void addPageSectionFieldLayout(IDE_SECTION_FLD_LAYOUT createIDE_SECTION_FLD_LAYOUT) {
		// TODO Auto-generated method stub
		idePgSectionLayoutList.add(createIDE_SECTION_FLD_LAYOUT);
		createIDE_SECTION_FLD_LAYOUT.setIdePgSectionLayoutList(this);
	}
	@Column(name = "DW_NAME__C")
	private String DW_NAME__C;
	
	public void setDW_NAME__C(String dW_NAME__C) {
		DW_NAME__C = dW_NAME__C;
	}
	
	public String getDW_NAME__C() {
		return DW_NAME__C;
	}
	
	@Column(name = "ENA_DIS_RULE_EXP__C")
	String ENA_DIS_RULE_EXP;
	public String getENA_DIS_RULE_EXP() {
		if(null == ENA_DIS_RULE_EXP)
			return "";
		/*if(ENA_DIS_RULE_EXP.contains("__c") && !ENA_DIS_RULE_EXP.contains("v.detailData.sobjectData")) {
			Pattern p = Pattern.compile("(\\w*__c)(?!.*\\\\1)");
		    Matcher m = p.matcher(ENA_DIS_RULE_EXP);
		    String mGrpTemp = "";
		    StringBuffer sb = new StringBuffer();
			while(m.find()) {
				String mGrp = m.group();
				 m.appendReplacement(sb, "v.detailData.sobjectData." + mGrp);
			}
			m.appendTail(sb);
			ENA_DIS_RULE_EXP = sb.toString();
		}
		if(ENA_DIS_RULE_EXP.contains("&")) {
			ENA_DIS_RULE_EXP = ENA_DIS_RULE_EXP.replace("&&", "&amp;&amp;");
		}   
		return "{!"+ ENA_DIS_RULE_EXP + "}";*/
		if(ENA_DIS_RULE_EXP.contains("__c") && !ENA_DIS_RULE_EXP.contains("v.detailData.sobjectData")) {
			String ruleArr[] = ENA_DIS_RULE_EXP.split("\\.");
			String containsValue = ruleArr[1].substring(ruleArr[1].indexOf("("), ruleArr[1].lastIndexOf(")"));
			ENA_DIS_RULE_EXP = "{!v.detailData.sobjectData." + ruleArr[0] + "}~" + containsValue.substring(1,containsValue.length());
		}
		return ENA_DIS_RULE_EXP;
	}
	public void setENA_DIS_RULE_EXP(String eNA_DIS_RULE_EXP) {
		ENA_DIS_RULE_EXP = eNA_DIS_RULE_EXP;
	}
	
	@Column(name = "SHOW_TBL")
	String SHOW_TBL;
	/**
	 * @return the sHOW_TBL
	 */
	public String getSHOW_TBL() {
		if(SHOW_TBL == null) {
			return "";
		}
		return SHOW_TBL;
	}
	/**
	 * @param sHOW_TBL the sHOW_TBL to set
	 */
	public void setSHOW_TBL(String sHOW_TBL) {
		SHOW_TBL = sHOW_TBL;
	}
	
	@Column(name = "ALLW_EDIT")
	String ALLW_EDIT;
	/**
	 * @return the aLLW_EDIT
	 */
	public String getALLW_EDIT() {
		return ALLW_EDIT;
	}
	/**
	 * @param aLLW_EDIT the aLLW_EDIT to set
	 */
	public void setALLW_EDIT(String aLLW_EDIT) {
		ALLW_EDIT = aLLW_EDIT;
	}
	
	@Column(name = "ALLW_VIEW")
	String ALLW_VIEW;
	/**
	 * @return the aLLW_VIEW
	 */
	public String getALLW_VIEW() {
		return ALLW_VIEW;
	}
	/**
	 * @param aLLW_VIEW the aLLW_VIEW to set
	 */
	public void setALLW_VIEW(String aLLW_VIEW) {
		ALLW_VIEW = aLLW_VIEW;
	}
	
	
	@Column(name = "SHOW_ACTN")
	String SHOW_ACTN;
	/**
	 * @return the sHOW_ACTN
	 */
	public String getSHOW_ACTN() {
		return SHOW_ACTN;
	}
	/**
	 * @param sHOW_ACTN the sHOW_ACTN to set
	 */
	public void setSHOW_ACTN(String sHOW_ACTN) {
		SHOW_ACTN = sHOW_ACTN;
	}
	
	@Column(name = "SHOW_ADD")
	String SHOW_ADD;
	/**
	 * @return the sHOW_ADD
	 */
	public String getSHOW_ADD() {
		return SHOW_ADD;
	}
	/**
	 * @param sHOW_ADD the sHOW_ADD to set
	 */
	public void setSHOW_ADD(String sHOW_ADD) {
		SHOW_ADD = sHOW_ADD;
	}
	
	@Column(name = "IS_SUM_DTL")
	String IS_SUM_DTL;
	/**
	 * @return the iS_SUM_DTL
	 */
	public String getIS_SUM_DTL() {
		return IS_SUM_DTL;
	}
	/**
	 * @param iS_SUM_DTL the iS_SUM_DTL to set
	 */
	public void setIS_SUM_DTL(String iS_SUM_DTL) {
		IS_SUM_DTL = iS_SUM_DTL;
	}
	
}
