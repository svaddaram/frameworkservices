package com.cbms.dao.model.local;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = { "idePageSubSectns" })
@Entity
@Table(name = "IDE_PG_SUB_SECTN")
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

	@Column(name = "IDE_PG_SECTN_ID")
	private Integer IDE_PG_SECTN_ID;
	@Id
	@Column(name = "IDE_PG_SUB_SECTN_ID")
	private String IDE_PG_SUB_SECTN_ID;

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
	
	@ManyToOne
    @JoinColumn(name="IDE_PG_SECTN_ID", nullable=false, insertable=false, updatable=false)
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
	
	
	@OneToMany(mappedBy = "idePgSubSecFldLayouts")
	@OrderBy(" ROW_NUMBER, COL_NUMBER")
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
	
}
