package com.cbms.dao.model.local;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "IDE_PG_LAYOUT")
public class IDE_PG_LAYOUT implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "IDE_OBJ_ID", nullable=false)
	private String IDE_OBJ_ID;
	
	
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

	@Id
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
	
	@Column(name = "IDE_PG_LAYOUT_NM")
	private String IDE_PG_LAYOUT_NM;
	/**
	 * @return the iDE_PG_LAYOUT_NM
	 */
	public String getIDE_PG_LAYOUT_NM() {
		return IDE_PG_LAYOUT_NM;
	}
	/**
	 * @param iDE_PG_LAYOUT_NM the iDE_PG_LAYOUT_NM to set
	 */
	public void setIDE_PG_LAYOUT_NM(String iDE_PG_LAYOUT_NM) {
		IDE_PG_LAYOUT_NM = iDE_PG_LAYOUT_NM;
	}
	
	/*@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID", nullable=false, insertable=false, updatable=false)
	private IDE_OBJ idePgLayouts;


	*//**
	 * @return the idePgLayouts
	 *//*
	public IDE_OBJ getIdePgLayouts() {
		return idePgLayouts;
	}
	*//**
	 * @param idePgLayouts the idePgLayouts to set
	 *//*
	public void setIdePgLayouts(IDE_OBJ idePgLayouts) {
		this.idePgLayouts = idePgLayouts;
	}*/
	
	@OneToMany(mappedBy = "ideColValidations")
	private List<IDE_COL_VALIDATION> ideColValidations = new ArrayList<IDE_COL_VALIDATION>();
	/**
	 * @return the ideColValidations
	 */
	public List<IDE_COL_VALIDATION> getIdeColValidations() {
		return ideColValidations;
	}
	/**
	 * @param ideColValidations the ideColValidations to set
	 */
	public void setIdeColValidations(List<IDE_COL_VALIDATION> ideColValidations) {
		this.ideColValidations = ideColValidations;
	}
	
	@OneToMany(mappedBy = "idePageSectns")
	@OrderBy("IDE_PG_SECTN_SEQ")
	private List<IDE_PG_SECTN> idePageSectns = new ArrayList<IDE_PG_SECTN>();


	/**
	 * @return the idePageSectns
	 */
	public List<IDE_PG_SECTN> getIdePageSectns() {
		return idePageSectns;
	}
	/**
	 * @param idePageSectns the idePageSectns to set
	 */
	public void setIdePageSectns(List<IDE_PG_SECTN> idePageSectns) {
		this.idePageSectns = idePageSectns;
	}
}
