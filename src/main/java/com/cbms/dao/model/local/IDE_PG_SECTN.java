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
@JsonIgnoreProperties(value = { "idePageSectns" })
@Entity
@Table(name = "IDE_PG_SECTN")
public class IDE_PG_SECTN implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ALLW_DEL")
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
	public String getIDE_OBJ_ID() {
		return IDE_OBJ_ID;
	}
	public void setIDE_OBJ_ID(String iDE_OBJ_ID) {
		IDE_OBJ_ID = iDE_OBJ_ID;
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
	@Column(name = "GRP_LABLE")
	String GRP_LABLE;
	@Column(name = "IDE_OBJ_ID", nullable=false)
	String IDE_OBJ_ID;

	@Column(name = "IDE_PG_SECTN_SEQ")
	Integer	IDE_PG_SECTN_SEQ;
	@Column(name = "VW_DEL")
	String VW_DEL;
	@Column(name = "VW_HIST")
	String VW_HIST;
	
	@Column(name = "IDE_PG_GRP_ID")
	Integer IDE_PG_GRP_ID;
	public Integer getIDE_PG_GRP_ID() {
		return IDE_PG_GRP_ID;
	}
	public void setIDE_PG_GRP_ID(Integer iDE_PG_GRP_ID) {
		IDE_PG_GRP_ID = iDE_PG_GRP_ID;
	}
	
	@Column(name = "TYPE")
	String TYPE;
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	
	@Column(name = "SECTN_VISIBLE")
	String SECTN_VISIBLE;
	
	public String getSECTN_VISIBLE() {
		return SECTN_VISIBLE;
	}
	public void setSECTN_VISIBLE(String sECTN_VISIBLE) {
		SECTN_VISIBLE = sECTN_VISIBLE;
	}
	@Id
	@Column(name = "IDE_PG_SECTN_ID")
	Integer IDE_PG_SECTN_ID;
	public Integer getIDE_PG_SECTN_ID() {
		return IDE_PG_SECTN_ID;
	}
	public void setIDE_PG_SECTN_ID(Integer iDE_PG_SECTN_ID) {
		IDE_PG_SECTN_ID = iDE_PG_SECTN_ID;
	}
	
	
	@Column(name = "TYP")
	String TYP;
	public String getTYP() {
		return TYP;
	}
	public void setTYP(String tYP) {
		TYP = tYP;
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
	@Column(name = "IDE_PG_LAYOUT_ID")
	private Integer IDE_PG_LAYOUT_ID;
	/**
	 * @return the iDE_PG_LAYOUT_ID
	 */
	public Integer getIDE_PG_LAYOUT_ID() {
		return IDE_PG_LAYOUT_ID;
	}
	/**
	 * @param iDE_PG_LAYOUT_ID the iDE_PG_LAYOUT_ID to set
	 */
	public void setIDE_PG_LAYOUT_ID(Integer iDE_PG_LAYOUT_ID) {
		IDE_PG_LAYOUT_ID = iDE_PG_LAYOUT_ID;
	}
	
	@ManyToOne
    @JoinColumn(name="IDE_PG_LAYOUT_ID", nullable=false, insertable=false, updatable=false)
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
	
	@OneToMany(mappedBy = "idePageSubSectns")
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
}
