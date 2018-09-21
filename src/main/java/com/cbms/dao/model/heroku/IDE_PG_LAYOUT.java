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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "IDE_PG_LAYOUT",schema = "salesforce")
public class IDE_PG_LAYOUT implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name = "CRT_OS_USR")
	String created_by;
	
	@Column(name = "UPD_OS_USER")
	String updated_by;
	
	@Column(name = "STATUS")
	String status;
	
	
	@Column(name = "PUBLISHED_DATE", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date publishedDate;
	
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public Date getPublishedDate() {
		return publishedDate;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
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
	
	@Id
	@SequenceGenerator( name="IDE_PG_LAYOUT_SEQUENCE", sequenceName="IDE_PG_LAYOUT_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDE_PG_LAYOUT_SEQUENCE")
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
	
	
	@Column(name = "UPD_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date systemModStamp;
	
	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	
	public Date getSystemModStamp() {
		return systemModStamp;
	}
	
/*	@Column(name = "NAME")
	private String Name;
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name; 
	}*/
	
	@Column(name = "CRT_DTM", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;
	
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	public Date getCreateddate() {
		return createddate;
	}
	
	/*@Column(name = "systemmodstamp")
	String systemModStamp;
	
	public void setSystemModStamp(String systemModStamp) {
		this.systemModStamp = systemModStamp;
	}
	
	public String getSystemModStamp() {
		return systemModStamp;
	}*/
	
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
	
	@Column(name = "IDE_OBJ_ID" ,insertable=false,updatable=false)
	//@NaturalId
	String IDE_OBJ_ID__c;
	
	public void setIDE_OBJ_ID__c(String iDE_OBJ_ID__c) {
		IDE_OBJ_ID__c = iDE_OBJ_ID__c;
	}
	
	public String getIDE_OBJ_ID__c() {
		return IDE_OBJ_ID__c;
	}
	
	@ManyToOne
    @JoinColumn(name="IDE_OBJ_ID",referencedColumnName="IDE_OBJ_ID")
	private IDE_OBJ idePgLayouts;


	
	public IDE_OBJ getIdePgLayouts() {
		return idePgLayouts;
	}
	
	public void setIdePgLayouts(IDE_OBJ idePgLayouts) {
		this.idePgLayouts = idePgLayouts;
	}
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "ideColValidations")
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
	
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy = "idePageSectns")
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
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof IDE_PG_LAYOUT )) return false;
	        return IDE_PG_LAYOUT_ID != null && IDE_PG_LAYOUT_ID.equals(((IDE_PG_LAYOUT) o).IDE_PG_LAYOUT_ID);
	    }
	    @Override
	    public int hashCode() {
	        return 31;
	    }
		public void addPageLayout(IDE_PG_SECTN createIDE_PG_SECTN) {
			idePageSectns.add(createIDE_PG_SECTN);
			createIDE_PG_SECTN.setIdePageSectns(this);	
			//if(idePgLayouts!=null)createIDE_PG_SECTN.setIDE_OBJ_ID(idePgLayouts.getIDE_OBJ_ID());
			
		}
		
		@Column
		String RLTED_LST_IDS;


		/**
		 * @return the rLTED_LST_IDS
		 */
		public String getRLTED_LST_IDS() {
			if(RLTED_LST_IDS == null)
				RLTED_LST_IDS="";
			return RLTED_LST_IDS;
		}
		/**
		 * @param rLTED_LST_IDS the rLTED_LST_IDS to set
		 */
		public void setRLTED_LST_IDS(String rLTED_LST_IDS) {
			RLTED_LST_IDS = rLTED_LST_IDS;
		}
		
		@Column
		String IS_PARENT;


		/**
		 * @return the iS_PARENT
		 */
		public String getIS_PARENT() {
			return IS_PARENT;
		}
		/**
		 * @param iS_PARENT the iS_PARENT to set
		 */
		public void setIS_PARENT(String iS_PARENT) {
			IS_PARENT = iS_PARENT;
		}
		
		@Column
		String PAGE_REDIRECT;


		/**
		 * @return the pAGE_REDIRECT
		 */
		public String getPAGE_REDIRECT() {
			return PAGE_REDIRECT;
		}
		/**
		 * @param pAGE_REDIRECT the pAGE_REDIRECT to set
		 */
		public void setPAGE_REDIRECT(String pAGE_REDIRECT) {
			PAGE_REDIRECT = pAGE_REDIRECT;
		}
		
		@Column
		String PAGE_ID;


		/**
		 * @return the pAGE_ID
		 */
		public String getPAGE_ID() {
			if(PAGE_ID == null) {
				return "";
			}
			return PAGE_ID;
		}
		/**
		 * @param pAGE_ID the pAGE_ID to set
		 */
		public void setPAGE_ID(String pAGE_ID) {
			PAGE_ID = pAGE_ID;
		}
		
		@Column
		String SCRN_TYP;


		/**
		 * @return the sCRN_TYP
		 */
		public String getSCRN_TYP() {
			if(SCRN_TYP == null)
				SCRN_TYP = "";
			return SCRN_TYP;
		}
		/**
		 * @param sCRN_TYP the sCRN_TYP to set
		 */
		public void setSCRN_TYP(String sCRN_TYP) {
			SCRN_TYP = sCRN_TYP;
		}
		
		/*@OneToMany(mappedBy = "idePageBtns")
		private List<IDE_BTN> idePageBtns = new ArrayList<IDE_BTN>();


		*//**
		 * @return the idePageBtns
		 *//*
		public List<IDE_BTN> getIdePageBtns() {
			return idePageBtns;
		}
		*//**
		 * @param idePageBtns the idePageBtns to set
		 *//*
		public void setIdePageBtns(List<IDE_BTN> idePageBtns) {
			this.idePageBtns = idePageBtns;
		}*/
		
		@Column
		String SHOW_TITLE;


		/**
		 * @return the sHOW_TITLE
		 */
		public String getSHOW_TITLE() {
			if(SHOW_TITLE == null)
				SHOW_TITLE="";
			return SHOW_TITLE;
		}
		/**
		 * @param sHOW_TITLE the sHOW_TITLE to set
		 */
		public void setSHOW_TITLE(String sHOW_TITLE) {
			SHOW_TITLE = sHOW_TITLE;
		}
}
