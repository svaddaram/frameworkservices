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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "idePageSubSectns" })
@Entity
@Table(name = "IDE_PG_SUB_SECTN__c",schema = "salesforce")

public class IDE_PG_SUB_SECTN implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name = "crt_by__c")
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

	
	@Column(name = "IDE_PG_SECT_NM__c")
	private Integer IDE_PG_SECT_NM;
	
	@Column(name = "LBL__c")
	private String LBL;
	
	@Column(name = "LST_UPD_BY__c")
	private String LST_UPD_BY;
	
	@Column(name = "SEQ_ORD__c")
	private Integer SEQ_ORD;

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "IDE_PG_SUB_SECTN_ID__c")
	private String IDE_PG_SUB_SECTN_ID;
	
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
	
/*	@Column(name = "DW_NAME__C")
	private String DW_NAME__C;
	
	public void setDW_NAME__C(String dW_NAME__C) {
		DW_NAME__C = dW_NAME__C;
	}
	
	public String getDW_NAME__C() {
		return DW_NAME__C;
	}*/
	
	
	@Column(name = "Name")
	private String Name;
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	

	public Integer getIDE_PG_SECT_NM() {
		return IDE_PG_SECT_NM;
	}

	public void setIDE_PG_SECT_NM(Integer iDE_PG_SECT_NM) {
		IDE_PG_SECT_NM = iDE_PG_SECT_NM;
	}

	public String getLBL() {
		return LBL;
	}

	public void setLBL(String lBL) {
		LBL = lBL;
	}

	public String getLST_UPD_BY() {
		return LST_UPD_BY;
	}

	public void setLST_UPD_BY(String lST_UPD_BY) {
		LST_UPD_BY = lST_UPD_BY;
	}

	public Integer getSEQ_ORD() {
		return SEQ_ORD;
	}

	public void setSEQ_ORD(Integer sEQ_ORD) {
		SEQ_ORD = sEQ_ORD;
	}

	public String getIDE_PG_SUB_SECTN_ID() {
		return IDE_PG_SUB_SECTN_ID;
	}

	public void setIDE_PG_SUB_SECTN_ID(String iDE_PG_SUB_SECTN_ID) {
		IDE_PG_SUB_SECTN_ID = iDE_PG_SUB_SECTN_ID;
	}
	
	
	/*@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID")
	private IDE_OBJ ideObjSubSection;

	*//**
	 * @return the ideObjSubSection
	 *//*
	public IDE_OBJ getIdeObjSubSection() {
		return ideObjSubSection;
	}

	*//**
	 * @param ideObjSubSection the ideObjSubSection to set
	 *//*
	public void setIdeObjSubSection(IDE_OBJ ideObjSubSection) {
		this.ideObjSubSection = ideObjSubSection;
	}*/
	
	@Column(name = "IDE_PG_SECTN_ID__c",insertable=false,updatable=false)
	Integer IDE_PG_SECTN_ID;
	public Integer getIDE_PG_SECTN_ID() {
		return IDE_PG_SECTN_ID;
	}
	public void setIDE_PG_SECTN_ID(Integer iDE_PG_SECTN_ID) {
		IDE_PG_SECTN_ID = iDE_PG_SECTN_ID;
	}
	@Column(name = "IDE_OBJ_ID__c" )
	String IDE_OBJ_ID__c;
	
	public void setIDE_OBJ_ID__c(String iDE_OBJ_ID__c) {
		IDE_OBJ_ID__c = iDE_OBJ_ID__c;
	}
	
	public String getIDE_OBJ_ID__c() {
		return IDE_OBJ_ID__c;
	}
	
	@Column(name = "IDE_PG_LAYOUT_ID__c")
	Integer IDE_PG_LAYOUT_ID__c;
	
	public Integer getIDE_PG_LAYOUT_ID__c() {
		return IDE_PG_LAYOUT_ID__c;
	}
	
	public void setIDE_PG_LAYOUT_ID__c(Integer iDE_PG_LAYOUT_ID__c) {
		IDE_PG_LAYOUT_ID__c = iDE_PG_LAYOUT_ID__c;
	}

	
	@ManyToOne
	 @JoinColumns({
		 	@JoinColumn(name="IDE_PG_SECTN_ID__c",referencedColumnName="IDE_PG_SECTN_ID__c"),
	        })
	private IDE_PG_SECTN idePageSubSectns;

	/**
	 * @return the idePageSubSectns
	 */
	public IDE_PG_SECTN getIdePageSubSectns() {
		return idePageSubSectns;
	}

	/**
	 * @param idePageSubSectns the idePageSubSectns to set
	 */
	public void setIdePageSubSectns(IDE_PG_SECTN idePageSubSectns) {
		this.idePageSubSectns = idePageSubSectns;
	}
	

	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "idePgSubSecFldLayouts",orphanRemoval=true)
	 @OrderBy(" ROW_NUMBER, COL_NUMBER, COL_ORDER_S")
	private List<IDE_FIELD_LAYOUT> idePgSubSecFldLayouts = new ArrayList<IDE_FIELD_LAYOUT>();

	/**
	 * @return the idePgSubSecFldLayouts
	 */
	public List<IDE_FIELD_LAYOUT> getIdePgSubSecFldLayouts() {
		return idePgSubSecFldLayouts;
	}

	/**
	 * @param idePgSubSecFldLayouts the idePgSubSecFldLayouts to set
	 */
	public void setIdePgSubSecFldLayouts(List<IDE_FIELD_LAYOUT> idePgSubSecFldLayouts) {
		this.idePgSubSecFldLayouts = idePgSubSecFldLayouts;
	}
	
	public void addIDE_FIELD_LAYOUT(IDE_FIELD_LAYOUT fieldLayout) {
		idePgSubSecFldLayouts.add(fieldLayout);
		fieldLayout.setIdePgSubSecFldLayouts(this);
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
	
	@Column(name = "ENA_DIS_RULE_EXP")
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
		
		String ruleArr[] = ENA_DIS_RULE_EXP.split("/.");
		if(ruleArr!=null && ruleArr.length>1) {
		String containsValue = ruleArr[1].substring(ruleArr[1].indexOf("("), ruleArr[1].lastIndexOf(")"));
		ENA_DIS_RULE_EXP = "{!v.detailData.sobjectData." + ruleArr[0] + "}~" + containsValue.substring(1,containsValue.length() - 1);
		}
		return ENA_DIS_RULE_EXP;
	}
	public void setENA_DIS_RULE_EXP(String eNA_DIS_RULE_EXP) {
		ENA_DIS_RULE_EXP = eNA_DIS_RULE_EXP;
	}
	
}
