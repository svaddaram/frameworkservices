package com.cbms.dao.model.heroku;

import java.util.ArrayList;
import java.util.List;

public class IDE_REL_FLD {
	
	
	String relGrpNm;
	List<String> relListFlds;
	String chldRelNm;
	public String getRelGrpNm() {
		return relGrpNm;
	}
	public void setRelGrpNm(String relGrpNm) {
		this.relGrpNm = relGrpNm;
	}
	public List<String> getRelListFlds() {
		return relListFlds;
	}
	public void setRelListFlds(List<String> relListFlds) {
		this.relListFlds = relListFlds;
	}
	public String getChldRelNm() {
		return chldRelNm;
	}
	public void setChldRelNm(String chldRelNm) {
		this.chldRelNm = chldRelNm;
	}
	
	

}
