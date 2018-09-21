package com.cbms.input.domain;

import java.util.ArrayList;
import java.util.List;

public class RelatedList {
	
	public RelatedList(){
		
	}
	
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
