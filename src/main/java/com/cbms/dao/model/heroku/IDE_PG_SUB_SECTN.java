package com.cbms.dao.model.heroku;

import java.io.Serializable;
import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = { "idePageSubSectns" })
@Entity
@Table(name = "IDE_PG_SUB_SECTN",schema = "salesforce")

public class IDE_PG_SUB_SECTN implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "CRT_BY")
	private String CRT_BY;
	
	@Column(name = "IDE_OBJ_ID")
	private String IDE_OBJ_ID;
	
	@Column(name = "IDE_PG_SECT_NM")
	private Integer IDE_PG_SECT_NM;
	
	@Column(name = "LBL")
	private String LBL;
	
	@Column(name = "LST_UPD_BY")
	private String LST_UPD_BY;
	
	@Column(name = "SEQ_ORD")
	private Integer SEQ_ORD;

	@Column(name = "IDE_PG_SECTN_ID",insertable=false,updatable=false)
	private Integer IDE_PG_SECTN_ID;
	@Id
	@SequenceGenerator(name="IDE_PG_SUB_SECTN_SEQUENCE", sequenceName="IDE_PG_SUB_SECTN_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDE_PG_SUB_SECTN_SEQUENCE")
	@Column(name = "IDE_PG_SUB_SECTN_ID")
	private Integer IDE_PG_SUB_SECTN_ID;
	
	@Column(name = "IDE_PG_LAYOUT_ID")
	Integer IDE_PG_LAYOUT_ID;
	
	public Integer getIDE_PG_LAYOUT_ID() {
		return IDE_PG_LAYOUT_ID;
	}
	
	public void setIDE_PG_LAYOUT_ID(Integer iDE_PG_LAYOUT_ID) {
		IDE_PG_LAYOUT_ID = iDE_PG_LAYOUT_ID;
	}

	public String getCRT_BY() {
		return CRT_BY;
	}

	public void setCRT_BY(String cRT_BY) {
		CRT_BY = cRT_BY;
	}

	public String getIDE_OBJ_ID() {
		return IDE_OBJ_ID;
	}

	public void setIDE_OBJ_ID(String iDE_OBJ_ID) {
		IDE_OBJ_ID = iDE_OBJ_ID;
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

	public Integer getIDE_PG_SECTN_ID() {
		return IDE_PG_SECTN_ID;
	}

	public void setIDE_PG_SECTN_ID(Integer iDE_PG_SECTN_ID) {
		IDE_PG_SECTN_ID = iDE_PG_SECTN_ID;
	}

	public Integer getIDE_PG_SUB_SECTN_ID() {
		return IDE_PG_SUB_SECTN_ID;
	}

	public void setIDE_PG_SUB_SECTN_ID(Integer iDE_PG_SUB_SECTN_ID) {
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
	
		@ManyToOne
	 @JoinColumns({
		 	@JoinColumn(name="IDE_PG_SECTN_ID",referencedColumnName="IDE_PG_SECTN_ID"),
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
		if(ruleArr.length>1) {
		String containsValue = ruleArr[1].substring(ruleArr[1].indexOf("("), ruleArr[1].lastIndexOf(")"));
		ENA_DIS_RULE_EXP = "{!v.detailData.sobjectData." + ruleArr[0] + "}~" + containsValue.substring(1,containsValue.length() - 1);
		}
		return ENA_DIS_RULE_EXP;
	}
	public void setENA_DIS_RULE_EXP(String eNA_DIS_RULE_EXP) {
		ENA_DIS_RULE_EXP = eNA_DIS_RULE_EXP;
	}
	
	@Column(name = "row")
	private Integer row;
	
	@Column(name = "columns")
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
	
	public void addIDE_FIELD_LAYOUT(IDE_FIELD_LAYOUT fieldLayout) {
		idePgSubSecFldLayouts.add(fieldLayout);
		fieldLayout.setIdePgSubSecFldLayouts(this);
	}
	
}
