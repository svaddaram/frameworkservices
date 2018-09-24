package com.cbms.manager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cbms.constants.SearchParameterEnum;
import com.cbms.dao.model.heroku.IDE_COL_VALIDATION;
import com.cbms.dao.model.heroku.IDE_FIELD_LAYOUT;
import com.cbms.dao.model.heroku.IDE_FLD;
import com.cbms.dao.model.heroku.IDE_OBJ;
import com.cbms.dao.model.heroku.IDE_PG_LAYOUT;
import com.cbms.dao.model.heroku.IDE_PG_SECTN;
import com.cbms.dao.model.heroku.IDE_PG_SUB_SECTN;
import com.cbms.dao.model.heroku.IDE_SECTION_FLD_LAYOUT;
import com.cbms.input.domain.Application;
import com.cbms.input.domain.ColumnValidation;
import com.cbms.input.domain.Field;
import com.cbms.input.domain.FieldLayout;
import com.cbms.input.domain.PageLayout;
import com.cbms.input.domain.PageSection;
import com.cbms.input.domain.SubSection;

public class ObjectManagerImpl implements ObjectManager{
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public IDE_OBJ createIDE_OBJ(Application application,String objectType) {
		if(application==null)return null;
		IDE_OBJ ideObj=new IDE_OBJ(); 
		ideObj.setAPI_S(application.getApiS());
		ideObj.setDESCRIPTION_S(application.getDescriptionS());
		ideObj.setDISPLAY_FORMAT_S(application.getDisplayFORMATS());
		ideObj.setENABLE_ACTVITIES_S(application.getEnableACTVITIESS());
		ideObj.setENABLE_BULK_APL_S(application.getEnableBULKAPLS());
		ideObj.setENABLE_FEEDS_S(application.getEnableFEEDSS());
		ideObj.setENABLE_HISTORY_S(application.getEnableHISTORYS());
		ideObj.setENABLE_REPORTS_S(application.getEnableREPORTSS());
		ideObj.setENABLE_SHARING_S(application.getEnableSHARINGS());
		ideObj.setENABLE_SRCH_S(application.getEnableSRCHS());
		ideObj.setENABLE_STRMING_API_S(application.getEnableSTRMINGAPIS());
		Date date=new Date();
		if(application.getIdeOBJID()==null) {		
		ideObj.setCreateddate(date);
		ideObj.setCreated_by(application.getCreatedBy());
		}
		ideObj.setSystemModStamp(date);
		ideObj.setUpdated_by(application.getUpdatedBy());
		ideObj.setGENERATE_C(application.getGenerateC());
		ideObj.setIDE_OBJ_ID(application.getIdeOBJID());
		ideObj.setINAPP_C(application.getInappC());
		ideObj.setIS_CUSTOM(application.getIsCustom());
		ideObj.setLABEL_S(application.getLabelS());
		ideObj.setOBJECT_NAME_S(application.getObjectNames());
		ideObj.setPLURAL_NAME_S(application.getPluralNAMES());
		ideObj.setSEQ_TYPE_S(application.getSeqTYPES());
		ideObj.setTYPE_C(application.getTypeC());
		ideObj.setSHARING_MODEL_S(application.getSharingMODELS());
		//ideObj.setName(application.getName());
		ideObj.setDW_NAME(application.getDwName());
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
		if(application!=null && application.getIdePgLayouts()!=null) {
			for(PageLayout pageLayout:application.getIdePgLayouts()) {
				//pgList.add(createPAGE_LAYOUT(pageLayout));
				ideObj.addPageLayout(createPAGE_LAYOUT(pageLayout,objectType));
			}
		}
		if(application!=null && application.getIdeFlds()!=null) {
			for(Field field:application.getIdeFlds()) {
				//pgList.add(createPAGE_LAYOUT(pageLayout));
				ideObj.addPageFields(createIDE_FLD(field));
			}
		}
		}
		return ideObj;
	}

	@Override
	public Application createApplicationObject(IDE_OBJ ideObj,String objectType) {
		if(ideObj==null)
		return null;
		
		
		Application application=new Application(); 
		
		if("RELATEDLIST".equalsIgnoreCase(objectType)) {
			 if (ideObj.getIdePgLayouts() != null) {
					System.out.println("inside pg layout size" + ideObj.getIdePgLayouts().size());
					List<PageLayout> pgRelatedList = new ArrayList<PageLayout>();
					for (IDE_PG_LAYOUT pgLayout : ideObj.getIdePgLayouts()) {
						if (pgLayout != null && pgLayout.getIS_PARENT()!=null && pgLayout.getIS_PARENT().equalsIgnoreCase("N") ) {
							System.out.println("is parent is not y");
							PageLayout pglayout=createPageLayoutObject(pgLayout,"ALL",Boolean.FALSE);
							//pglayout.setIdePGLAYOUTNM(pgLayout.getIDE_PG_LAYOUT_NM());
							//layout.setStatus(pgLayout.getStatus());
							pgRelatedList.add(pglayout);
						}
		}
					 application.setPageRelatedList(pgRelatedList);
			 }
			 return application;
		}
		
		application.setApiS(ideObj.getAPI_S());
		application.setDescriptionS(ideObj.getDESCRIPTION_S());
		application.setDisplayFORMATS(ideObj.getDISPLAY_FORMAT_S());
		application.setEnableACTVITIESS(ideObj.getENABLE_ACTVITIES_S());
		application.setEnableBULKAPLS(ideObj.getENABLE_BULK_APL_S());
		application.setEnableFEEDSS(ideObj.getENABLE_FEEDS_S());
		application.setEnableHISTORYS(ideObj.getENABLE_HISTORY_S());
		application.setEnableREPORTSS(ideObj.getENABLE_REPORTS_S());
		application.setEnableSHARINGS(ideObj.getENABLE_SHARING_S());
		application.setEnableSRCHS(ideObj.getENABLE_SRCH_S());
		application.setEnableSTRMINGAPIS(ideObj.getENABLE_STRMING_API_S());
		application.setGenerateC(ideObj.getGENERATE_C());
		application.setIdeOBJID(ideObj.getIDE_OBJ_ID());
	//	application.setName(ideObj.getName());
		application.setDwName(ideObj.getDW_NAME());
			application.setInappC(ideObj.getINAPP_C() );
			application.setIsCustom(ideObj.getIS_CUSTOM());
			application.setLabelS(ideObj.getLABEL_S());
			application.setObjectNames(ideObj.getOBJECT_NAME_S());
			application.setPluralNAMES(ideObj.getPLURAL_NAME_S());
			application.setSeqTYPES(ideObj.getSEQ_TYPE_S());
			application.setTypeC(ideObj.getTYPE_C());
			application.setSharingMODELS(ideObj.getSHARING_MODEL_S());
			
			  application.setModifiedTimeStamp(ideObj.getSystemModStamp()!=null?df.format(ideObj.getSystemModStamp()):null);
			  application.setCreatedTimeStamp(ideObj.getCreateddate()!=null?df.format(ideObj.getCreateddate()):null);
			  application.setCreatedBy(ideObj.getCreated_by());
			  application.setUpdatedBy(ideObj.getUpdated_by());
			  application.setStatus(ideObj.getStatus());
		
			
			if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			if(ideObj.getIdePgLayouts()!=null) {
				System.out.println("inside pg layout size"+ideObj.getIdePgLayouts().size());
				List<PageLayout> pgList=new ArrayList<PageLayout>();
				for(IDE_PG_LAYOUT pgLayout:ideObj.getIdePgLayouts()) {
					PageLayout pglayout=createPageLayoutObject(pgLayout,objectType,Boolean.FALSE);
					System.out.println("pglayout-->"+pglayout);
					if(pglayout!=null) {
						System.out.println("pglayout added-->"+pglayout);
					pgList.add(pglayout);
					}
				}
			application.setIdePgLayouts(pgList);
			}
			
			if(ideObj.getIdeFlds()!=null) {
				List<Field> fieldList=new ArrayList<Field>();
				for(IDE_FLD field:ideObj.getIdeFlds()) {
					System.out.println("inside pg fields size"+ideObj.getIdeFlds().size());
					Field fld=createIDE_FLD(field);
					if(fld!=null) {
					fieldList.add(createIDE_FLD(field));
					}
				}
			application.setIdeFlds(fieldList);
			}
			
			
			}else if (ideObj.getIdePgLayouts() != null) {
				System.out.println("inside pg layout size" + ideObj.getIdePgLayouts().size());
				List<PageLayout> pgList = new ArrayList<PageLayout>();
				List<PageLayout> pgRelatedList = new ArrayList<PageLayout>();
				for (IDE_PG_LAYOUT pgLayout : ideObj.getIdePgLayouts()) {
					if (pgLayout != null && pgLayout.getIS_PARENT()==null) {
						System.out.println("is parent is not y");
						PageLayout layout = new PageLayout();
						layout.setIdePGLAYOUTNM(pgLayout.getIDE_PG_LAYOUT_NM());
						//layout.setStatus(pgLayout.getStatus());
						pgRelatedList.add(layout);
					}
					if (pgLayout != null) {
						PageLayout layout = new PageLayout();
						layout.setIdePGLAYOUTNM(pgLayout.getIDE_PG_LAYOUT_NM());
						layout.setStatus(pgLayout.getStatus());
						pgList.add(layout);
					}
				}
				application.setPgStatusList(pgList);
				application.setPageRelatedList(pgRelatedList);
			}
			
			
			
			
			return application;
	}

	@Override
	public PageLayout createPageLayoutObject(IDE_PG_LAYOUT addPageLayoutObject,String objectType,Boolean isCanvas) {
		if(addPageLayoutObject==null ) {
			return null;
		}
		PageLayout layout=new PageLayout();
		/*List<RelatedList> relatedPagesList=new ArrayList<RelatedList>();
		RelatedList relatedList=new RelatedList();
		relatedList.setRelGrpNm("dummyTest");
		List<String> relListFlds =new ArrayList<String>();
		relListFlds.add("column1");
		relListFlds.add("column2");
		relListFlds.add("column3");
		relListFlds.add("column4");
		relatedList.setRelListFlds(relListFlds);
		relatedPagesList.add(relatedList);
		layout.setRelatedList(relatedPagesList);*/
		
		if(addPageLayoutObject.getIdePgLayouts()!=null) {
		layout.setIdeOBJID(addPageLayoutObject.getIdePgLayouts().getIDE_OBJ_ID());
		}
		layout.setStatus(addPageLayoutObject.getStatus());
		layout.setPublishedDate(addPageLayoutObject.getPublishedDate()!=null?df.format(addPageLayoutObject.getPublishedDate()):null);
		layout.setIdePGLAYOUTID(addPageLayoutObject.getIDE_PG_LAYOUT_ID());
		layout.setIdePGLAYOUTNM(addPageLayoutObject.getIDE_PG_LAYOUT_NM());
		layout.setModifiedTimeStamp(addPageLayoutObject.getSystemModStamp()!=null?df.format(addPageLayoutObject.getSystemModStamp()):null);
		layout.setCreatedTimeStamp(addPageLayoutObject.getCreateddate()!=null?df.format(addPageLayoutObject.getCreateddate()):null);
		layout.setCreatedBy(addPageLayoutObject.getCreated_by());
		layout.setUpdatedBy(addPageLayoutObject.getUpdated_by());
		//layout.setName(addPageLayoutObject.getName());
		
		layout.setShowTitle(addPageLayoutObject.getSHOW_TITLE());
		layout.setScrnType(addPageLayoutObject.getSCRN_TYP());
		layout.setPageId(addPageLayoutObject.getPAGE_ID());
		layout.setPageRedirect(addPageLayoutObject.getPAGE_REDIRECT());
		layout.setIsParent(addPageLayoutObject.getIS_PARENT());
		layout.setRltedListIds(addPageLayoutObject.getRLTED_LST_IDS());
		
		
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			
		if(addPageLayoutObject.getIdePageSectns()!=null) {
			List<PageSection> pgSectionList=new ArrayList<PageSection>();
			for(IDE_PG_SECTN pgSectionLayout:addPageLayoutObject.getIdePageSectns()) {
				System.out.println("INSIDE pAGE sECTIONS WITH SIZE ="+addPageLayoutObject.getIdePageSectns().size());
				PageSection section=createPageSection(pgSectionLayout,objectType,isCanvas);
				if(section!=null) {
				pgSectionList.add(section);
				}
			}
			layout.setIde_PG_SECTN(pgSectionList);
		}
		
		if(addPageLayoutObject.getIdeColValidations()!=null) {
			List<ColumnValidation> columnValidationList=new ArrayList<ColumnValidation>();
			for(IDE_COL_VALIDATION colValidation:addPageLayoutObject.getIdeColValidations()) {
				ColumnValidation section=createColumnValidation(colValidation);
				if(section!=null) {
				columnValidationList.add(section);
				}
			}
			layout.setColumnValidation(columnValidationList);
		}
		}
		
		return layout;
	}

	@Override
	public IDE_PG_LAYOUT createPAGE_LAYOUT(PageLayout pageLayout,String objectType) {
		if(pageLayout==null) {
			return null;
		}
		System.out.println("inside create pg_layout");
		
		IDE_PG_LAYOUT layout=new IDE_PG_LAYOUT();
		layout.setIDE_PG_LAYOUT_ID(pageLayout.getIdePGLAYOUTID());
		layout.setIDE_PG_LAYOUT_NM(pageLayout.getIdePGLAYOUTNM());
		layout.setIDE_OBJ_ID__c(pageLayout.getIdeOBJID());
		layout.setStatus(pageLayout.getStatus());
		//layout.setName(pageLayout.getIdePGLAYOUTNM());
		Date date=new Date();
		if(pageLayout.getIdePGLAYOUTID()==null) {		
			layout.setCreateddate(date);
			layout.setCreated_by(pageLayout.getCreatedBy());
		}
		layout.setSystemModStamp(date);
		layout.setUpdated_by(pageLayout.getUpdatedBy());
		layout.setSHOW_TITLE(pageLayout.getShowTitle());
		layout.setSCRN_TYP(pageLayout.getScrnType());
		layout.setPAGE_ID(pageLayout.getPageId());
		layout.setPAGE_REDIRECT(pageLayout.getPageRedirect());
		layout.setIS_PARENT(pageLayout.getIsParent());
		layout.setRLTED_LST_IDS(pageLayout.getRltedListIds());
		
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			if(pageLayout.getIde_PG_SECTN()!=null) {
				System.out.println("INSIDE pAGE layout WITH SIZE ="+pageLayout.getIde_PG_SECTN().size());
				for(PageSection pgSection:pageLayout.getIde_PG_SECTN()) {
				layout.addPageLayout(createIDE_PG_SECTN(pgSection,objectType));
			}
		}
		}
		System.out.println("exit pg_layout" +layout.getIDE_PG_LAYOUT_NM());
		return layout;
	}

	@Override
	public IDE_PG_SECTN createIDE_PG_SECTN(PageSection section,String objectType) {
		if(section==null) {
			return null;
		}
		IDE_PG_SECTN pageSection=new IDE_PG_SECTN();
		//pageSection.setName(section.getName());
		pageSection.setDW_NAME(section.getDwName());
		pageSection.setALLW_DEL(section.getAllwDEL());
		pageSection.setGRP_LABLE(section.getGrpLABLE());
		pageSection.setIDE_PG_SECTN_ID(section.getIdePGSECTNID());
		pageSection.setIDE_PG_GRP_ID(section.getIdePGGRPID());
		pageSection.setIDE_PG_SECTN_SEQ(section.getIdePGSECTNSEQ());
		pageSection.setSECTN_VISIBLE(section.getSectnVISIBLE());
		pageSection.setTYP(section.getTyp());
		pageSection.setTYPE(section.getType());
		pageSection.setVW_DEL(section.getVwDEL());
		pageSection.setVW_HIST(section.getVwHIST());
		pageSection.setIDE_PG_LAYOUT_ID(section.getIdePGLAYOUTID());
		pageSection.setRow(section.getRow());
		pageSection.setColumn(section.getColumn());
		pageSection.setIDE_OBJ_ID(section.getIdeOBJID());
		
		
		pageSection.setENA_DIS_RULE_EXP(section.getEna_DIS_RULE_EXP());
		pageSection.setSHOW_TBL(section.getShowTable());
		pageSection.setALLW_EDIT(section.getAllowEdit());
		pageSection.setALLW_VIEW(section.getAllowView());
		pageSection.setSHOW_ACTN(section.getShowActn());
		pageSection.setSHOW_ADD(section.getShowAdd());
		pageSection.setIS_SUM_DTL(section.getIsSumDetail());
		
		Date date=new Date();
	/*	if(section.getIdePGSECTNID()==null) {		
			pageSection.setCreateddate(date);
			pageSection.setCreated_by(section.getCreatedBy());
		}
		pageSection.setSystemModStamp(date);
		pageSection.setUpdated_by(section.getUpdatedBy());*/
		
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			
			if(section.getIdePageSubSectns()!=null) {
				
				for(SubSection subSection:section.getIdePageSubSectns()) {
					System.out.println("INSIDE pAGE sub sections WITH SIZE ="+section.getIdePageSubSectns().size());
					pageSection.addPageSubSection(createIDE_PG_SUB_SECTN(subSection,objectType));
				}
			}
			if(section.getIde_field_layout()!=null) {
				System.out.println("INSIDE pAGE sub fields WITH SIZE ="+section.getIde_field_layout().size());
				
				for(FieldLayout subSection:section.getIde_field_layout()) {
					IDE_SECTION_FLD_LAYOUT fldLayout=createIDE_SECTION_FLD_LAYOUT(subSection);
					if(fldLayout!=null)
					pageSection.addPageSectionFieldLayout(fldLayout);
				}
			}

		}
		return pageSection;
	}
	@Override
	public IDE_SECTION_FLD_LAYOUT createIDE_SECTION_FLD_LAYOUT(FieldLayout fieldLayout) {
		// TODO Auto-generated method stub
		if(fieldLayout==null || fieldLayout.getOperationType()!=null && fieldLayout.getOperationType().equalsIgnoreCase("DELETE"))return null;
		IDE_SECTION_FLD_LAYOUT fldLayout=new IDE_SECTION_FLD_LAYOUT();
		Date date=new Date();
		if(fieldLayout.getIdeFieldLayoutId()==null) {		
			fldLayout.setCreateddate(date);
			fldLayout.setCreated_by(fieldLayout.getCreatedBy());
		}
		fldLayout.setSystemModStamp(date);
		fldLayout.setUpdated_by(fieldLayout.getUpdatedBy());
		
		fldLayout.setAPI_NAME_S(fieldLayout.getApiNameS());
		fldLayout.setCOL_ID(fieldLayout.getColId());
		fldLayout.setCOL_NUMBER(fieldLayout.getColNumber());
		//fldLayout.setFLD_COL_ORDERS(fieldLayout.getFldColOrders());
		fldLayout.setIDE_FIELD_LAYOUT_ID(fieldLayout.getIdeFieldLayoutId());
		fldLayout.setFLD_NAME(fieldLayout.getFldName());
		fldLayout.setROW_NUMBER(fieldLayout.getRowNumber());
		fldLayout.setIDE_PG_SECTN_ID(fieldLayout.getIdePgSectnId());
		fldLayout.setIDE_OBJ_ID(fieldLayout.getIdeObjId());
		fldLayout.setIDE_PG_LAYOUT_ID(fieldLayout.getIdePgLayoutId());
		fldLayout.setBLANKOUT_FLDS(fieldLayout.getBlankoutFlds());
		fldLayout.setBLANKOUT_FLDS_RULE(fieldLayout.getBlankoutFldsRule());
		fldLayout.setCASE_SENSITIVE_S(fieldLayout.getCaseSensitiveS());
		fldLayout.setCOL_FLTR_NAME_C(fieldLayout.getColFltrNameC());
		fldLayout.setCOL_FLTR_VAL_C(fieldLayout.getColFltrValC());
		fldLayout.setCOL_VISIBLE_S(fieldLayout.getColVisibleS());
		fldLayout.setCOMPUTE_FLD_RULE(fieldLayout.getComputeFldRule());
		fldLayout.setCOPY_DEFAULT_RULE(fieldLayout.getCopyDefaultRule());
		fldLayout.setCOPY_DEFAULT_TAR(fieldLayout.getCopyDefaultTar());
		fldLayout.setCOPY_DEFAULT_VALUE(fieldLayout.getCopyDefaultValue());
		fldLayout.setCOPY_FLDS_RULE(fieldLayout.getCopyFldsRule());
		fldLayout.setCOPY_SEL_OPT_COLS(fieldLayout.getCopySelOptCols());
		fldLayout.setCOPY_SRC_FLD(fieldLayout.getCopySrcFld());
		fldLayout.setCOPY_TARGET_FLD(fieldLayout.getCopyTargetFld());
		fldLayout.setDEFAULT_VALUE(fieldLayout.getDefaultValue());
		fldLayout.setDEPNT_FLDS(fieldLayout.getDepntFlds());
		fldLayout.setDEPNT_S(fieldLayout.getDepntS());
		fldLayout.setDISABLE_ON_SELECT(fieldLayout.getDisableOnSelect());
		fldLayout.setDISPLAY_ONLY_S(fieldLayout.getDisplayOnlyS());
		fldLayout.setEDIT_VAL(fieldLayout.getEditVal());
		fldLayout.setENA_DIS_RULE_EXP(fieldLayout.getEnaDisRuleExp());
		fldLayout.setFIELD_DESCRIPTION_S(fieldLayout.getFieldDescriptionS());
		fldLayout.setFIELD_LABEL_S(fieldLayout.getFieldLabelS());
		fldLayout.setFLD_NAME(fieldLayout.getFldName());
		fldLayout.setFORMULA_S(fieldLayout.getFormulaS());
		fldLayout.setHOVR_TXT_C(fieldLayout.getHovrTxtC());
		fldLayout.setIS_DEPNT(fieldLayout.getIsDepnt());
		fldLayout.setLABEL_OVERIDE_S(fieldLayout.getLabelOverideS());
		fldLayout.setLENGTH_S(fieldLayout.getLengthS());
		fldLayout.setLIST_VIEW_S(fieldLayout.getListViewS());
		fldLayout.setMAND_RULE_EXP(fieldLayout.getMandRuleExp());
		fldLayout.setOBJ_NAME(fieldLayout.getObjName());
		fldLayout.setPAGE_PARAMS(fieldLayout.getPageParams());
		fldLayout.setPRECISION_S(fieldLayout.getPrecisionS());
		fldLayout.setREFERENCE_TO_S(fieldLayout.getReferenceToS());
		fldLayout.setRELATIONSHIP_LABEL_S(fieldLayout.getRelationshipLabelS());
		fldLayout.setRELATIONSHIP_ORDER_S(fieldLayout.getRelationshipLabelS());
		fldLayout.setREQUIRED_S(fieldLayout.getRequiredS());
		fldLayout.setRT_CD_C(fieldLayout.getRtCdC());
		fldLayout.setRT_DSC_C(fieldLayout.getRtDscC());
		fldLayout.setRT_TBL_NM_C(fieldLayout.getRtTblNmC());
		fldLayout.setSCALE_S(fieldLayout.getScaleS());
		fldLayout.setSELECT_ON_SELECT(fieldLayout.getSelectOnSelect());
		fldLayout.setTYPE_C(fieldLayout.getTypeC());
		fldLayout.setTYPE_S(fieldLayout.getTypeS());
		fldLayout.setUNIQUE_S(fieldLayout.getUniqueS());
		
		fldLayout.setDATA_PATTERN((String)fieldLayout.getDataPattern());
		fldLayout.setMIN_LEN((Integer)fieldLayout.getMinLen());
		fldLayout.setADDR_FLDS((String)fieldLayout.getAddrFlds());
		fldLayout.setCOND_VALUE((String)fieldLayout.getCondValue());
		fldLayout.setMAX_VAL((Integer)fieldLayout.getMaxVal());
		fldLayout.setDATE_COMP_FLD((String)fieldLayout.getDateCompFld());
		fldLayout.setCLR_ERR_MSG_FLDS((String)fieldLayout.getClrErrMsgFlds());
		fldLayout.setCLR_ERR_MSG_RULE((String)fieldLayout.getClrErrMsgRule());
		fldLayout.setCNTY_RQRD((String)fieldLayout.getCntyRqrd());
		fldLayout.setEXTN_RQRD((String)fieldLayout.getExtnRqrd());
		fldLayout.setSEARCH_COND((String)fieldLayout.getSearchCond());
		fldLayout.setCHILD_RELATION((String)fieldLayout.getChildRelation());
		fldLayout.setCRITERIA_METHOD((String)fieldLayout.getCriteriaMethod());
		fldLayout.setTRUMP_ALL((String)fieldLayout.getTrumpAll());
		fldLayout.setSHOW_LINK((String)fieldLayout.getShowLink());
		fldLayout.setSHOW_ICON((String)fieldLayout.getShowIcon());
		fldLayout.setICON_NAME((String)fieldLayout.getShowIcon());
		fldLayout.setCOL_ORDER_S((Integer)fieldLayout.getColOrderSC());
		fldLayout.setENA_DIS_RULE_EXP((String)fieldLayout.getEnaDisRuleExp());
		
		
		
		return fldLayout;

	}

	@Override
	public PageSection createPageSection(IDE_PG_SECTN pagesection,String objectType,Boolean isCanvas) {
		if(pagesection==null || (isCanvas && pagesection.getIDE_PG_SECTN_SEQ()==null) ) {
			return null;
		}
		PageSection section=new PageSection();
		//section.setName(pagesection.getName());
		section.setDwName(pagesection.getDW_NAME());
		section.setAllwDEL(pagesection.getALLW_DEL());
		section.setGrpLABLE(pagesection.getGRP_LABLE());
		section.setIdePGGRPID(pagesection.getIDE_PG_GRP_ID());
		section.setIdePGSECTNSEQ(pagesection.getIDE_PG_SECTN_SEQ());
		section.setSectnVISIBLE(pagesection.getSECTN_VISIBLE());
		section.setTyp(pagesection.getTYP());
		section.setType(pagesection.getTYPE());
		section.setVwDEL(pagesection.getVW_DEL());
		section.setVwHIST(pagesection.getVW_DEL());
		
		
		section.setEna_DIS_RULE_EXP(pagesection.getENA_DIS_RULE_EXP());
		section.setShowTable(pagesection.getSHOW_TBL());
		section.setAllowEdit(pagesection.getALLW_EDIT());
		section.setAllowView(pagesection.getALLW_VIEW());
		section.setShowActn(pagesection.getSHOW_ACTN());
		section.setShowAdd(pagesection.getSHOW_ADD());
		section.setIsSumDetail(pagesection.getIS_SUM_DTL());
		
	/*	section.setModifiedTimeStamp(pagesection.getSystemModStamp()!=null?df.format(pagesection.getSystemModStamp()):null);
		section.setCreatedTimeStamp(pagesection.getCreateddate()!=null?df.format(pagesection.getCreateddate()):null);
		section.setCreatedBy(pagesection.getCreated_by());
		section.setUpdatedBy(pagesection.getUpdated_by());*/
		/*if(pagesection.getIdePageSubSectns()!=null) {
		for(IDE_PG_SUB_SECTN subSectn:pagesection.getIdePageSubSectns()) {
		if(subSectn.getRow())	
		}
		}*/
		if(pagesection.getRow()!=null && pagesection.getColumn()!=null) {
			section.setRow(pagesection.getRow());
			section.setColumn(pagesection.getColumn());
		}else {
		Integer firstRowNumber=0;
		if(pagesection.getIdePgSectionLayoutList()!=null) {
			if(pagesection.getIdePgSectionLayoutList().size()>0) {
				if(pagesection.getIdePgSectionLayoutList().get(0)!=null) {
					firstRowNumber=pagesection.getIdePgSectionLayoutList().get(0).getROW_NUMBER();
					System.out.println("firstRowNumber--->"+firstRowNumber);
					if(firstRowNumber!=null && firstRowNumber>0) {
						firstRowNumber=firstRowNumber-1;
					}
					
					
				}
			}
			for(IDE_SECTION_FLD_LAYOUT layout:pagesection.getIdePgSectionLayoutList()) {
				
				if(layout!=null && layout.getIDE_PG_SUB_SECTN_ID()==null) {
					if(layout.getROW_NUMBER()!=null && section.getRow()==null && layout.getIDE_PG_SUB_SECTN_ID()==null) {
						section.setRow(layout.getROW_NUMBER());
					}else if(layout.getROW_NUMBER()!=null && section.getRow()!=null && section.getRow()<layout.getROW_NUMBER() && layout.getIDE_PG_SUB_SECTN_ID()==null){
						section.setRow(layout.getROW_NUMBER());
					}
				}
				if(firstRowNumber!=null && section.getRow()!=null && section.getRow()>firstRowNumber) {
					section.setRow(section.getRow()-firstRowNumber);
				}
			}
		}

		if(pagesection.getIdePgSectionLayoutList()!=null) {
			for(IDE_SECTION_FLD_LAYOUT layout:pagesection.getIdePgSectionLayoutList()) {
				if(layout!=null && layout.getIDE_PG_SUB_SECTN_ID()==null) {
					if(layout.getCOL_NUMBER()!=null && section.getColumn()==null && layout.getIDE_PG_SUB_SECTN_ID()==null) {
						System.out.println("inside getting column "+layout.getCOL_NUMBER());
						section.setColumn(layout.getCOL_NUMBER());
					}else if(layout.getCOL_NUMBER()!=null && section.getColumn()!=null && section.getColumn()<layout.getCOL_NUMBER() && layout.getIDE_PG_SUB_SECTN_ID()==null){
						System.out.println("inside getting column1 "+layout.getCOL_NUMBER());
						section.setColumn(layout.getCOL_NUMBER());
					}
				}
			}
		}
		if(pagesection.getIdePageSubSectns()!=null) {
			if(section.getRow()!=null && pagesection.getIdePageSubSectns()!=null && pagesection.getIdePageSubSectns().size()>0) {
				section.setRow(section.getRow()+pagesection.getIdePageSubSectns().size());
			}else if(pagesection.getIdePageSubSectns()!=null && pagesection.getIdePageSubSectns().size()>0) {
				section.setRow(pagesection.getIdePageSubSectns().size());
			}
			
			
		}
		if(section.getRow()==null) {
			section.setRow(1);
		}
		if(section.getColumn()==null) {
			section.setColumn(1);
		}
		}
		
		
		if(pagesection.getIdePageSectns()!=null ) {
		section.setIdePGLAYOUTID(pagesection.getIdePageSectns().getIDE_PG_LAYOUT_ID());
		if(pagesection.getIdePageSectns().getIdePgLayouts()!=null) {
			section.setIdeOBJID(pagesection.getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID());
		}
		}
		
		section.setIdePGSECTNID(pagesection.getIDE_PG_SECTN_ID());
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			
		if(pagesection.getIdePgSectionLayoutList()!=null) {
			System.out.println("INSIDE pAGE section field LAYOUT WITH SIZE ="+pagesection.getIdePgSectionLayoutList().size());
			
			List<FieldLayout> pgSubSectionList=new ArrayList<FieldLayout>();
			for(IDE_SECTION_FLD_LAYOUT pgSubSection:pagesection.getIdePgSectionLayoutList()) {
				if(pgSubSection.getIDE_PG_SUB_SECTN_ID()!=null) {
					continue;
				}
				FieldLayout fldLayout=createPageSectionFieldLayout(pgSubSection,objectType);
				if(fldLayout!=null)
				pgSubSectionList.add(fldLayout);
			}
			section.setIde_field_layout(pgSubSectionList);
		}
		
		if(pagesection.getIdePageSubSectns()!=null) {
			System.out.println("INSIDE pAGE sub section WITH SIZE ="+pagesection.getIdePageSubSectns().size());
			
			List<SubSection> pgSubSectionList=new ArrayList<SubSection>();
			for(IDE_PG_SUB_SECTN pgSubSection:pagesection.getIdePageSubSectns()) {
				SubSection subsection=createPageSubSection(pgSubSection,objectType,isCanvas);
				if(subsection!=null)
				pgSubSectionList.add(subsection);
			}
			section.setIdePageSubSectns(pgSubSectionList);
		}
		}
		return section;
	}
	private FieldLayout createPageSectionFieldLayout(IDE_SECTION_FLD_LAYOUT fieldLayout, String objectType) {
		if(fieldLayout==null)return null;
		
		System.out.println("inside section field layout");
		FieldLayout fldLayout=new FieldLayout();
		fldLayout.setSelectOnSelect(fieldLayout.getSELECT_ON_SELECT());
		fldLayout.setApiNameS(fieldLayout.getAPI_NAME_S());
		fldLayout.setColId(fieldLayout.getCOL_ID());
		fldLayout.setColNumber(fieldLayout.getCOL_NUMBER());
	//	fldLayout.setFldColOrders(fieldLayout.getFLD_COL_ORDERS());
		fldLayout.setIdeFieldLayoutId(fieldLayout.getIDE_FIELD_LAYOUT_ID());
		fldLayout.setName(fieldLayout.getFLD_NAME());
		fldLayout.setRowNumber(fieldLayout.getROW_NUMBER());
		fldLayout.setModifiedTimeStamp(fieldLayout.getSystemModStamp()!=null?df.format(fieldLayout.getSystemModStamp()):null);
		fldLayout.setCreatedTimeStamp(fieldLayout.getCreateddate()!=null?df.format(fieldLayout.getCreateddate()):null);
		fldLayout.setCreatedBy(fieldLayout.getCreated_by());
		fldLayout.setUpdatedBy(fieldLayout.getUpdated_by());
		if (fieldLayout.getIdePgSectionLayoutList() != null) {
			fldLayout.setIdePgSectnId(fieldLayout.getIdePgSectionLayoutList().getIDE_PG_SECTN_ID());
		}
		if (fieldLayout.getIdePgSectionLayoutList() != null
				&& fieldLayout.getIdePgSectionLayoutList().getIdePageSectns() != null
				&& fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIdePgLayouts() != null) {
			fldLayout.setIdeObjId(
					fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID());
		}

		if (fieldLayout.getIdePgSectionLayoutList() != null
				&& fieldLayout.getIdePgSectionLayoutList().getIdePageSectns() != null) {
			fldLayout
					.setIdePgLayoutId(fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIDE_PG_LAYOUT_ID());
		}
		fldLayout.setBlankoutFlds(fieldLayout.getBLANKOUT_FLDS());
		fldLayout.setBlankoutFldsRule(fieldLayout.getBLANKOUT_FLDS_RULE());
		fldLayout.setCaseSensitiveS(fieldLayout.getCASE_SENSITIVE_S());
		fldLayout.setColFltrNameC(fieldLayout.getCOL_FLTR_NAME_C());
		fldLayout.setColFltrValC(fieldLayout.getCOL_FLTR_VAL_C());
		fldLayout.setColVisibleS(fieldLayout.getCOL_VISIBLE_S());
		fldLayout.setComputeFldRule(fieldLayout.getCOMPUTE_FLD_RULE());
		fldLayout.setCopyDefaultRule(fieldLayout.getCOPY_DEFAULT_RULE());
		fldLayout.setCopyDefaultTar(fieldLayout.getCOPY_DEFAULT_TAR());
		fldLayout.setCopyDefaultValue(fieldLayout.getCOPY_DEFAULT_VALUE());
		fldLayout.setCopyFldsRule(fieldLayout.getCOPY_FLDS_RULE());
		fldLayout.setCopySelOptCols(fieldLayout.getCOPY_SEL_OPT_COLS());
		fldLayout.setCopySrcFld(fieldLayout.getCOPY_SRC_FLD());
		fldLayout.setCopyTargetFld(fieldLayout.getCOPY_TARGET_FLD());
		fldLayout.setDefaultValue(fieldLayout.getDEFAULT_VALUE());
		fldLayout.setDepntFlds(fieldLayout.getDEPNT_FLDS());
		fldLayout.setDepntS(fieldLayout.getDEPNT_S());
		fldLayout.setDisableOnSelect(fieldLayout.getDISABLE_ON_SELECT());
		fldLayout.setDisplayOnlyS(fieldLayout.getDISPLAY_ONLY_S());
		fldLayout.setEditVal(fieldLayout.getEDIT_VAL());
		fldLayout.setEnaDisRuleExp(fieldLayout.getENA_DIS_RULE_EXP());
		fldLayout.setFieldDescriptionS(fieldLayout.getFIELD_DESCRIPTION_S());
		fldLayout.setFieldLabelS(fieldLayout.getFIELD_LABEL_S());
		fldLayout.setFldName(fieldLayout.getFLD_NAME());
		fldLayout.setFormulaS(fieldLayout.getFORMULA_S());
		fldLayout.setHovrTxtC(fieldLayout.getHOVR_TXT_C());
		fldLayout.setIsDepnt(fieldLayout.getIS_DEPNT());
		fldLayout.setLabelOverideS(fieldLayout.getLABEL_OVERIDE_S());
		fldLayout.setLengthS(fieldLayout.getLENGTH_S());
		fldLayout.setListViewS(fieldLayout.getLIST_VIEW_S());
		fldLayout.setMandRuleExp(fieldLayout.getMAND_RULE_EXP());
		fldLayout.setObjName(fieldLayout.getOBJ_NAME());
		fldLayout.setPageParams(fieldLayout.getPAGE_PARAMS());
		fldLayout.setPrecisionS(fieldLayout.getPRECISION_S());
		fldLayout.setReferenceToS(fieldLayout.getREFERENCE_TO_S());
		fldLayout.setRelationshipLabelS(fieldLayout.getRELATIONSHIP_LABEL_S());
		fldLayout.setRelationshipOrderS(fieldLayout.getRELATIONSHIP_ORDER_S());
		fldLayout.setRequiredS(fieldLayout.getREQUIRED_S());
		fldLayout.setRtCdC(fieldLayout.getRT_CD_C());
		fldLayout.setRtDscC(fieldLayout.getRT_DSC_C());
		fldLayout.setRtTblNmC(fieldLayout.getRT_TBL_NM_C());
		fldLayout.setScaleS(fieldLayout.getSCALE_S());
		fldLayout.setSelectOnSelect(fieldLayout.getSELECT_ON_SELECT());
		fldLayout.setTypeC(fieldLayout.getTYPE_C());
		fldLayout.setTypeS(fieldLayout.getTYPE_S());
		fldLayout.setUniqueS(fieldLayout.getUNIQUE_S());
		
		fldLayout.setDataPattern(fieldLayout.getDATA_PATTERN());
		fldLayout.setMinLen(fieldLayout.getMIN_LEN());
		fldLayout.setAddrFlds(fieldLayout.getADDR_FLDS());
		fldLayout.setCondValue(fieldLayout.getCOND_VALUE());
		fldLayout.setMaxVal(fieldLayout.getMAX_VAL());
		fldLayout.setDateCompFld(fieldLayout.getDATE_COMP_FLD());
		fldLayout.setClrErrMsgFlds(fieldLayout.getCLR_ERR_MSG_FLDS());
		fldLayout.setClrErrMsgRule(fieldLayout.getCLR_ERR_MSG_RULE());
		fldLayout.setCntyRqrd(fieldLayout.getCNTY_RQRD());
		fldLayout.setExtnRqrd(fieldLayout.getEXTN_RQRD());
		fldLayout.setSearchCond(fieldLayout.getSEARCH_COND());
		fldLayout.setChildRelation(fieldLayout.getCHILD_RELATION());
		fldLayout.setCriteriaMethod(fieldLayout.getCRITERIA_METHOD());
		fldLayout.setTrumpAll(fieldLayout.getTRUMP_ALL());
		fldLayout.setShowLink(fieldLayout.getSHOW_LINK());
		fldLayout.setShowIcon(fieldLayout.getSHOW_ICON());
		fldLayout.setIconName(fieldLayout.getICON_NAME());
		fldLayout.setColOrderSC(fieldLayout.getCOL_ORDER_S());
		fldLayout.setEnaDisRuleExp(fieldLayout.getENA_DIS_RULE_EXP());
	
		
		return fldLayout;
	}

	@Override
	public IDE_FLD createIDE_FLD(Field field) {
		if(field==null) {
			return null;
		}
		IDE_FLD fld=new IDE_FLD();
		
		Date date=new Date();
		if(field.getIdeFldSeq()==null) {		
		//	fld.setCreateddate(date);
		//	fld.setCreated_by(field.getCreatedBy());
			
		}
		fld.setSELECT_ON_SELECT(field.getSelectOnSelect());
		fld.setDISABLE_ON_SELECT(field.getDisableOnSelect());
		fld.setCOPY_DEFAULT_RULE(field.getCopyDefaultRule());
		fld.setCOPY_DEFAULT_TAR(field.getCopyDefaultRule());
		fld.setCOPY_DEFAULT_VALUE(field.getCopyDefaultValue());
		fld.setDEFAULT_VALUE(field.getDefaultValue());
		fld.setDISP_REL_LST(field.getDispRelLst());
		fld.setRELATIONSHIP_ORDER_S(field.getRelationshipOrderS());
		fld.setIS_PARENT(field.getIsParent());
		
	//	fld.setSystemModStamp(date);
	//	fld.setUpdated_by(field.getUpdatedBy());
		fld.setAPI_NAME_S(field.getApiNameS());
		fld.setFIELD_LABEL_S(field.getFieldLabelS());
		fld.setIDE_FLD_SEQ(field.getIdeFldSeq());
		fld.setTYPE_S(field.getTypeS());
		fld.setCOL_ORDER_S(field.getColOrderS());
		fld.setREQUIRED_S(field.getRequiredS());
		fld.setUNIQUE_S(field.getUniqueS());
		fld.setCASE_SENSITIVE_S(field.getCaseSensitiveS());
		fld.setEXTERNAL_ID_S(field.getExternalIdS());
		fld.setFIELD_DESCRIPTION_S(field.getFieldDescriptionS());
		fld.setREFERENCE_TO_S(field.getReferenceToS());
		fld.setRELATIONSHIP_LABEL_S(field.getRelationshipLabelS());
		fld.setCOL_FLTR_NAME_C(field.getColFltrNameC());
		fld.setCOL_FLTR_VAL_C(field.getColFltrNameC());
		fld.setHOVR_TXT_C(field.getHovrTxtC());
		fld.setRT_CD_C(field.getRtCdC());
		fld.setRT_DSC_C(field.getRtDscC());
		fld.setRT_TBL_NM_C(field.getRtTblNmC());
		fld.setLABEL_OVERIDE_S(field.getLabelOverideS());
		fld.setDISPLAY_ONLY_S(field.getDisplayOnlyS());
		fld.setCOL_VISIBLE_S(field.getColVisibleS());
		fld.setLENGTH_S(field.getLengthS());
		fld.setPRECISION_S(field.getPrecisionS());
		fld.setSCALE_S(field.getScaleS());
		fld.setLIST_VIEW_S(field.getListViewS());
		fld.setFORMULA_S(field.getFormulaS());
		fld.setROW_NUMBER(field.getRowNumber());
		fld.setCOL_NUMBER(field.getColNumber());
		fld.setEDIT_VAL(field.getEditVal());
		fld.setOBJ_NAME(field.getObjName());
		fld.setFLD_NAME(field.getFldName());
		fld.setENA_DIS_RULE_EXP(field.getEnaDisRuleExp());
		fld.setMAND_RULE_EXP(field.getMandRuleExp());
		fld.setDEPNT_FLDS(field.getDepntFlds());
		fld.setIS_DEPNT(field.getIsDepnt());
		fld.setPAGE_PARAMS(field.getPageParams());
		fld.setDEPNT_S(field.getDepntS());
		fld.setBLANKOUT_FLDS(field.getBlankoutFlds());
		fld.setBLANKOUT_FLDS_RULE(field.getBlankoutFldsRule());
		fld.setCOPY_SRC_FLD(field.getCopySrcFld());
		fld.setCOPY_TARGET_FLD(field.getCopyTargetFld());
		fld.setCOPY_FLDS_RULE(field.getCopyFldsRule());
		fld.setCOPY_SEL_OPT_COLS(field.getCopySelOptCols());
		fld.setCOMPUTE_FLD_RULE(field.getComputeFldRule());
		/*fld.setDEFAULT_VALUE(field.getDefaultVALUE());
		fld.setCOPY_DEFAULT_VALUE(field.getCopyDEFAULTVALUE());
		fld.setCOPY_DEFAULT_TAR(field.getCopyDEFAULTTAR());
		fld.setCOPY_DEFAULT_RULE(field.getCopyDEFAULTRULE());
		fld.setDISABLE_ON_SELECT(field.getDisableONSELECT());
		fld.setSELECT_ON_SELECT(field.getSelectONSELECT());*/
	//	fld.setName(field.getName());
	//	fld.setDISP_REL_LST(field.getDispRelLst());
	//	fld.setTYPE(field.getTypeC());
		return fld;
	}
	
	@Override
	public Field createIDE_FLD(IDE_FLD field) {
		if(field==null ) {
			return null;
		}

		Field fld=new Field();
		fld.setIdeFldSeq(field.getIDE_FLD_SEQ());
		if(field.getIdeObjFlds()!=null) {
		fld.setIdeObjId(field.getIdeObjFlds().getIDE_OBJ_ID());
		}
		fld.setSelectOnSelect(field.getSELECT_ON_SELECT());
		fld.setDisableOnSelect(field.getDISABLE_ON_SELECT());
		fld.setCopyDefaultRule(field.getCOPY_DEFAULT_RULE());
		fld.setCopyDefaultTar(field.getCOPY_DEFAULT_TAR());
		fld.setCopyDefaultValue(field.getCOPY_DEFAULT_VALUE());
		fld.setDefaultValue(field.getDEFAULT_VALUE());
		fld.setDispRelLst(field.getDISP_REL_LST());
		fld.setRelationshipOrderS(field.getRELATIONSHIP_ORDER_S());
		fld.setIsParent(field.getIS_PARENT());
	//	fld.setModifiedTimeStamp(field.getSystemModStamp()!=null?df.format(field.getSystemModStamp()):null);
	//	fld.setCreatedTimeStamp(field.getCreateddate()!=null?df.format(field.getCreateddate()):null);
	//	fld.setCreatedBy(field.getCreated_by());
	//	fld.setUpdatedBy(field.getUpdated_by());
		fld.setApiNameS(field.getAPI_NAME_S());
		fld.setFieldLabelS(field.getFIELD_LABEL_S());
		fld.setTypeS(field.getTYPE_S());
		//fld.setTypeC(field.getTYPE__C());
		fld.setColOrderS(field.getCOL_ORDER_S());
		fld.setRequiredS(field.getREQUIRED_S());
		fld.setUniqueS(field.getUNIQUE_S());
		fld.setCaseSensitiveS(field.getCASE_SENSITIVE_S());
		//fld.setDispRelLst(field.getDISP_REL_LST());
		//fld.setName(field.getName());
		fld.setExternalIdS(field.getEXTERNAL_ID_S());
		fld.setFieldDescriptionS(field.getFIELD_DESCRIPTION_S());
		fld.setReferenceToS(field.getREFERENCE_TO_S());
		fld.setRelationshipLabelS(field.getRELATIONSHIP_LABEL_S());
		fld.setColFltrNameC(field.getCOL_FLTR_NAME_C());
		fld.setColFltrValC(field.getCOL_FLTR_VAL_C());
		fld.setHovrTxtC(field.getHOVR_TXT_C());
		fld.setRtCdC(field.getRT_CD_C());
		fld.setRtDscC(field.getRT_DSC_C());
		fld.setRtTblNmC(field.getRT_TBL_NM_C());
		fld.setLabelOverideS(field.getLABEL_OVERIDE_S());
		fld.setDisplayOnlyS(field.getDISPLAY_ONLY_S());
		fld.setColVisibleS(field.getCOL_VISIBLE_S());
		fld.setLengthS(field.getLENGTH_S());
		fld.setPrecisionS(field.getPRECISION_S());
		fld.setScaleS(field.getSCALE_S());
		fld.setListViewS(field.getLIST_VIEW_S());
		fld.setFormulaS(field.getFORMULA_S());
		fld.setRowNumber(field.getROW_NUMBER());
		fld.setColNumber(field.getCOL_NUMBER());
		fld.setEditVal(field.getEDIT_VAL());
		fld.setObjName(field.getOBJ_NAME());
		fld.setFldName(field.getFLD_NAME());
		fld.setEnaDisRuleExp(field.getENA_DIS_RULE_EXP());
		fld.setMandRuleExp(field.getMAND_RULE_EXP());
		fld.setDepntFlds(field.getDEPNT_FLDS());
		fld.setIsDepnt(field.getIS_DEPNT());
		fld.setPageParams(field.getPAGE_PARAMS());
		fld.setDepntS(field.getDEPNT_S());
		fld.setBlankoutFlds(field.getBLANKOUT_FLDS());
		fld.setBlankoutFldsRule(field.getBLANKOUT_FLDS_RULE());
		fld.setCopySrcFld(field.getCOPY_SRC_FLD());
		fld.setCopyTargetFld(field.getCOPY_TARGET_FLD());
		fld.setCopyFldsRule(field.getCOPY_FLDS_RULE());
		fld.setCopySelOptCols(field.getCOPY_SEL_OPT_COLS());
		fld.setComputeFldRule(field.getCOMPUTE_FLD_RULE());
		
		return fld;		
	}
	@Override
	public SubSection createPageSubSection(IDE_PG_SUB_SECTN sub_section,String objectType,Boolean isCanvas){
		if(sub_section==null || (isCanvas && sub_section.getSEQ_ORD()==null)) {
			return null;
		}
		SubSection subSection=new  SubSection();
		if(sub_section.getRow()!=null && sub_section.getColumn()!=null) {
			subSection.setRow(sub_section.getRow());
			subSection.setColumn(sub_section.getColumn());
		}else {
		if(sub_section.getIdePgSubSecFldLayouts()!=null) {
			for(IDE_FIELD_LAYOUT layout:sub_section.getIdePgSubSecFldLayouts()) {
				if(layout!=null) {
					if(layout.getROW_NUMBER()!=null && subSection.getRow()==null) {
						subSection.setRow(layout.getROW_NUMBER());
					}else if(layout.getROW_NUMBER()!=null && subSection.getRow()!=null && subSection.getRow()<layout.getROW_NUMBER()){
						subSection.setRow(layout.getROW_NUMBER());
					}
				}
			}
		}
		if(sub_section.getIdePgSubSecFldLayouts()!=null) {
			for(IDE_FIELD_LAYOUT layout:sub_section.getIdePgSubSecFldLayouts()) {
				if(layout!=null) {
					if(layout.getCOL_NUMBER()!=null && subSection.getColumn()==null) {
						subSection.setColumn(layout.getCOL_NUMBER());
					}else if(layout.getCOL_NUMBER()!=null && subSection.getColumn()!=null && subSection.getColumn()<layout.getCOL_NUMBER()){
						subSection.setColumn(layout.getCOL_NUMBER());
					}
				}
			}
		}
		if(subSection.getRow()==null) {
			subSection.setRow(1);
		}
		if(subSection.getColumn()==null) {
			subSection.setColumn(1);
		}
		}
		
		//subSection.setColumn(sub_section.getColumn());
		//subSection.setModifiedTimeStamp(sub_section.get!=null?df.format(sub_section.getSystemModStamp()):null);
		//subSection.setCreatedTimeStamp(sub_section.geC!=null?df.format(sub_section.getCreateddate()):null);
		subSection.setCreatedBy(sub_section.getCRT_BY());
		subSection.setUpdatedBy(sub_section.getLST_UPD_BY());
		//subSection.setCreatedBy(sub_section.getCreated_by());
		subSection.setIdePgSubSectnId(sub_section.getIDE_PG_SUB_SECTN_ID()!=null?sub_section.getIDE_PG_SUB_SECTN_ID().toString():null);
		subSection.setLbl(sub_section.getLBL());
		subSection.setLstUpdBy(sub_section.getLST_UPD_BY());
		subSection.setName(sub_section.getLBL());
		subSection.setSeqOrd(sub_section.getSEQ_ORD());
		subSection.setIdePgSubSectnId(sub_section.getIDE_PG_SUB_SECTN_ID()!=null?sub_section.getIDE_PG_SUB_SECTN_ID().toString():null);
		
		subSection.setEna_DIS_RULE_EXP(sub_section.getENA_DIS_RULE_EXP());


		
		
		if(sub_section.getIdePageSubSectns()!=null) {
		if(sub_section.getIdePageSubSectns().getIdePageSectns()!=null) {
			subSection.setIdePgLayoutId(sub_section.getIdePageSubSectns().getIdePageSectns().getIDE_PG_LAYOUT_ID());
		}
		if(sub_section.getIdePageSubSectns().getIdePageSectns().getIdePgLayouts()!=null) {
			subSection.setIdeObjId(sub_section.getIdePageSubSectns().getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID());
		}
		subSection.setIdePgSectnId(sub_section.getIdePageSubSectns().getIDE_PG_SECTN_ID());
		}
		

		subSection.setIdePgSectNm(sub_section.getIDE_PG_SECT_NM());
	
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			
		if(sub_section.getIdePgSubSecFldLayouts()!=null) {
			System.out.println("INSIDE pAGE sub section field LAYOUT WITH SIZE ="+sub_section.getIdePgSubSecFldLayouts().size());
			
			List<FieldLayout> fieldLayoutList=new ArrayList<FieldLayout>();
			for(IDE_FIELD_LAYOUT fieldLayout:sub_section.getIdePgSubSecFldLayouts()) {
				System.out.println("in IDE_FIELD_LAYOUT");
				FieldLayout fldLayout=createFieldLayout(fieldLayout);
				if(fldLayout!=null)
				fieldLayoutList.add(fldLayout);
			}
			subSection.setIde_field_layout(fieldLayoutList);
		}
		}
		return subSection;
	}
	
	
	
	
	@Override
	public IDE_PG_SUB_SECTN createIDE_PG_SUB_SECTN(SubSection sub_section,String objectType){
		if(sub_section==null) {
			return null;
		}
		IDE_PG_SUB_SECTN subSection=new  IDE_PG_SUB_SECTN();
		
		Date date=new Date();
		if(sub_section.getIdePgSubSectnId()==null) {		
			//subSection.setCreateddate(date);
			subSection.setCRT_BY(sub_section.getCreatedBy());
		}
		//subSection.setSystemModStamp(date);
		subSection.setLST_UPD_BY(sub_section.getUpdatedBy());
		subSection.setCRT_BY(sub_section.getCreatedBy());
		subSection.setRow(sub_section.getRow());
		subSection.setColumn(sub_section.getColumn());
		subSection.setIDE_PG_SUB_SECTN_ID(sub_section.getIdePgSubSectnId()!=null?Integer.parseInt(sub_section.getIdePgSubSectnId()):null);
		subSection.setLBL(sub_section.getLbl());
		subSection.setLST_UPD_BY(sub_section.getLstUpdBy());
		//subSection.setName(sub_section.getName());
		subSection.setSEQ_ORD(sub_section.getSeqOrd());
		//subSection.setIDE_PG_SUB_SECTN_ID(sub_section.getIdePgSubSectnId()!);
		subSection.setIDE_PG_SECTN_ID(sub_section.getIdePgSectnId());
		subSection.setIDE_PG_LAYOUT_ID(sub_section.getIdePgLayoutId());
		subSection.setIDE_OBJ_ID(sub_section.getIdeObjId());
		subSection.setIDE_PG_SECT_NM(sub_section.getIdePgSectNm());
		subSection.setENA_DIS_RULE_EXP(sub_section.getEna_DIS_RULE_EXP());
		if(!SearchParameterEnum.BASICOBJECT.toString().equalsIgnoreCase(objectType)) {
			
			if(sub_section.getIde_field_layout()!=null) {
			System.out.println("INSIDE pAGE sub section field LAYOUT WITH SIZE ="+sub_section.getIde_field_layout().size());
			
			for(FieldLayout fieldLayout:sub_section.getIde_field_layout()) {
				subSection.addIDE_FIELD_LAYOUT(createFieldLayout(fieldLayout));
			}
			
		}
		}
		return subSection;
	}
	
	@Override
	public FieldLayout createFieldLayout(IDE_FIELD_LAYOUT fieldLayout) {
		if(fieldLayout==null ) {
			return null;
		}
		System.out.println("started building FE fieldLayout");
		FieldLayout fldLayout=new FieldLayout();
		fldLayout.setModifiedTimeStamp(fieldLayout.getSystemModStamp()!=null?df.format(fieldLayout.getSystemModStamp()):null);
		fldLayout.setCreatedTimeStamp(fieldLayout.getCreateddate()!=null?df.format(fieldLayout.getCreateddate()):null);
		fldLayout.setCreatedBy(fieldLayout.getCreated_by());
		fldLayout.setUpdatedBy(fieldLayout.getUpdated_by());
		fldLayout.setApiNameS(fieldLayout.getAPI_NAME_S());
		fldLayout.setColId(fieldLayout.getCOL_ID());
		fldLayout.setColNumber(fieldLayout.getCOL_NUMBER());
		//fldLayout.setFldColOrders(fieldLayout.getFLD_COL_ORDERS());
		System.out.println("complted building FE fieldLayout upto primary number");
		fldLayout.setIdeFieldLayoutId(fieldLayout.getIDE_FIELD_LAYOUT_ID());
		System.out.println("complted building FE fieldLayout upto primary number");
		fldLayout.setName(fieldLayout.getFLD_NAME());
		fldLayout.setRowNumber(fieldLayout.getROW_NUMBER());
		System.out.println("complted building FE fieldLayout upto row number");
		if(fieldLayout.getIdePgSubSecFldLayouts()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns()!=null) {
		fldLayout.setIdePgSectnId(fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIDE_PG_SECTN_ID());
		}
		if(fieldLayout.getIdePgSubSecFldLayouts()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIdePageSectns()!=null &&
				fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIdePageSectns().getIdePgLayouts()!=null) {
		fldLayout.setIdeObjId(fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID());
		}
		if(fieldLayout.getIdePgSubSecFldLayouts()!=null) {
		fldLayout.setIdePgSubSectnId(fieldLayout.getIdePgSubSecFldLayouts().getIDE_PG_SUB_SECTN_ID()!=null?fieldLayout.getIdePgSubSecFldLayouts().getIDE_PG_SUB_SECTN_ID().toString():null);
		}
		if(fieldLayout.getIdePgSubSecFldLayouts()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIdePageSectns()!=null) {
		fldLayout.setIdePgLayoutId(fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIdePageSectns().getIDE_PG_LAYOUT_ID());
		}
		fldLayout.setBlankoutFlds(fieldLayout.getBLANKOUT_FLDS());
		fldLayout.setBlankoutFldsRule(fieldLayout.getBLANKOUT_FLDS_RULE());
		fldLayout.setCaseSensitiveS(fieldLayout.getCASE_SENSITIVE_S());
		fldLayout.setColFltrNameC(fieldLayout.getCOL_FLTR_NAME_C());
		fldLayout.setColFltrValC(fieldLayout.getCOL_FLTR_VAL_C());
		fldLayout.setColVisibleS(fieldLayout.getCOL_VISIBLE_S());
		System.out.println("complted building FE fieldLayout upto visible column");
		fldLayout.setComputeFldRule(fieldLayout.getCOMPUTE_FLD_RULE());
		fldLayout.setCopyDefaultRule(fieldLayout.getCOPY_DEFAULT_RULE());
		fldLayout.setCopyDefaultTar(fieldLayout.getCOPY_DEFAULT_TAR());
		fldLayout.setCopyDefaultValue(fieldLayout.getCOPY_DEFAULT_VALUE());
		fldLayout.setCopyFldsRule(fieldLayout.getCOPY_FLDS_RULE());
		fldLayout.setCopySelOptCols(fieldLayout.getCOPY_SEL_OPT_COLS());
		fldLayout.setCopySrcFld(fieldLayout.getCOPY_SRC_FLD());
		fldLayout.setCopyTargetFld(fieldLayout.getCOPY_TARGET_FLD());
		fldLayout.setDefaultValue(fieldLayout.getDEFAULT_VALUE());
		fldLayout.setDepntFlds(fieldLayout.getDEPNT_FLDS());
		fldLayout.setDepntS(fieldLayout.getDEPNT_S());
		System.out.println("complted building FE fieldLayout upto DEPNT column");
		fldLayout.setDisableOnSelect(fieldLayout.getDISABLE_ON_SELECT());
		fldLayout.setDisplayOnlyS(fieldLayout.getDISPLAY_ONLY_S());
		fldLayout.setEditVal(fieldLayout.getEDIT_VAL());
		fldLayout.setEnaDisRuleExp(fieldLayout.getENA_DIS_RULE_EXP());
		fldLayout.setFieldDescriptionS(fieldLayout.getFIELD_DESCRIPTION_S());
		fldLayout.setFieldLabelS(fieldLayout.getFIELD_LABEL_S());
		fldLayout.setFldName(fieldLayout.getFLD_NAME());
		fldLayout.setFormulaS(fieldLayout.getFORMULA_S());
		System.out.println("complted building FE fieldLayout upto FORMULA column");
		fldLayout.setHovrTxtC(fieldLayout.getHOVR_TXT_C());
		fldLayout.setIsDepnt(fieldLayout.getIS_DEPNT());
		fldLayout.setLabelOverideS(fieldLayout.getLABEL_OVERIDE_S());
		fldLayout.setLengthS(fieldLayout.getLENGTH_S());
		fldLayout.setListViewS(fieldLayout.getLIST_VIEW_S());
		fldLayout.setMandRuleExp(fieldLayout.getMAND_RULE_EXP());
		fldLayout.setObjName(fieldLayout.getOBJ_NAME());
		fldLayout.setPageParams(fieldLayout.getPAGE_PARAMS());
		fldLayout.setPrecisionS(fieldLayout.getPRECISION_S());
		fldLayout.setReferenceToS(fieldLayout.getREFERENCE_TO_S());
		System.out.println("complted building FE fieldLayout upto REFERENCE column");
		fldLayout.setRelationshipLabelS(fieldLayout.getRELATIONSHIP_LABEL_S());
		fldLayout.setRelationshipOrderS(fieldLayout.getRELATIONSHIP_ORDER_S());
		fldLayout.setRequiredS(fieldLayout.getREQUIRED_S());
		fldLayout.setRtCdC(fieldLayout.getRT_CD_C());
		fldLayout.setRtDscC(fieldLayout.getRT_DSC_C());
		fldLayout.setRtTblNmC(fieldLayout.getRT_TBL_NM_C());
		fldLayout.setScaleS(fieldLayout.getSCALE_S());
		fldLayout.setSelectOnSelect(fieldLayout.getSELECT_ON_SELECT());
		fldLayout.setTypeC(fieldLayout.getTYPE_C());
		fldLayout.setTypeS(fieldLayout.getTYPE_S());
		fldLayout.setUniqueS(fieldLayout.getUNIQUE_S());
		
		fldLayout.setDataPattern(fieldLayout.getDATA_PATTERN());
		fldLayout.setMinLen(fieldLayout.getMIN_LEN());
		fldLayout.setAddrFlds(fieldLayout.getADDR_FLDS());
		fldLayout.setCondValue(fieldLayout.getCOND_VALUE());
		fldLayout.setMaxVal(fieldLayout.getMAX_VAL());
		fldLayout.setDateCompFld(fieldLayout.getDATE_COMP_FLD());
		fldLayout.setClrErrMsgFlds(fieldLayout.getCLR_ERR_MSG_FLDS());
		fldLayout.setClrErrMsgRule(fieldLayout.getCLR_ERR_MSG_RULE());
		fldLayout.setCntyRqrd(fieldLayout.getCNTY_RQRD());
		fldLayout.setExtnRqrd(fieldLayout.getEXTN_RQRD());
		fldLayout.setSearchCond(fieldLayout.getSEARCH_COND());
		fldLayout.setChildRelation(fieldLayout.getCHILD_RELATION());
		fldLayout.setCriteriaMethod(fieldLayout.getCRITERIA_METHOD());
		fldLayout.setTrumpAll(fieldLayout.getTRUMP_ALL());
		fldLayout.setShowLink(fieldLayout.getSHOW_LINK());
		fldLayout.setShowIcon(fieldLayout.getSHOW_ICON());
		fldLayout.setIconName(fieldLayout.getICON_NAME());
		fldLayout.setColOrderSC(fieldLayout.getCOL_ORDER_S());
		fldLayout.setEnaDisRuleExp(fieldLayout.getENA_DIS_RULE_EXP());
		
		System.out.println("complted building FE fieldLayout upto UNIQUE column");
		System.out.println("complted building FE fieldLayout");
		return fldLayout;
	}

	@Override
	public IDE_FIELD_LAYOUT createFieldLayout(FieldLayout fieldLayout) {
		if(fieldLayout==null)return null;
		
		IDE_FIELD_LAYOUT fldLayout=new IDE_FIELD_LAYOUT();
		

		Date date=new Date();
		if(fieldLayout.getIdeFieldLayoutId()==null) {		
			fldLayout.setCreateddate(date);
			fldLayout.setCreated_by(fieldLayout.getCreatedBy());
		}
		fldLayout.setSystemModStamp(date);
		fldLayout.setUpdated_by(fieldLayout.getUpdatedBy());
		fldLayout.setAPI_NAME_S(fieldLayout.getApiNameS());
		fldLayout.setCOL_ID(fieldLayout.getColId());
		fldLayout.setCOL_NUMBER(fieldLayout.getColNumber());
		//fldLayout.setFLD_COL_ORDERS(fieldLayout.getFldColOrders());
		System.out.println("newly added " +fieldLayout.getIdeFieldLayoutId());
		fldLayout.setIDE_FIELD_LAYOUT_ID(fieldLayout.getIdeFieldLayoutId());
		fldLayout.setFLD_NAME(fieldLayout.getFldName());
		fldLayout.setROW_NUMBER(fieldLayout.getRowNumber());
		fldLayout.setIDE_PG_SECTN_ID(fieldLayout.getIdePgSectnId());
		fldLayout.setIDE_OBJ_ID(fieldLayout.getIdeObjId());
		System.out.println("newly added " +fieldLayout.getIdePgSubSectnId());
		fldLayout.setIDE_PG_SUB_SECTN_ID(fieldLayout.getIdePgSubSectnId()!=null?Integer.parseInt(fieldLayout.getIdePgSubSectnId()):null);
		fldLayout.setIDE_PG_LAYOUT_ID(fieldLayout.getIdePgLayoutId());
		fldLayout.setBLANKOUT_FLDS(fieldLayout.getBlankoutFlds());
		fldLayout.setBLANKOUT_FLDS_RULE(fieldLayout.getBlankoutFldsRule());
		fldLayout.setCASE_SENSITIVE_S(fieldLayout.getCaseSensitiveS());
		fldLayout.setCOL_FLTR_NAME_C(fieldLayout.getColFltrNameC());
		fldLayout.setCOL_FLTR_VAL_C(fieldLayout.getColFltrValC());
		fldLayout.setCOL_VISIBLE_S(fieldLayout.getColVisibleS());
		fldLayout.setCOMPUTE_FLD_RULE(fieldLayout.getComputeFldRule());
		fldLayout.setCOPY_DEFAULT_RULE(fieldLayout.getCopyDefaultRule());
		fldLayout.setCOPY_DEFAULT_TAR(fieldLayout.getCopyDefaultTar());
		fldLayout.setCOPY_DEFAULT_VALUE(fieldLayout.getCopyDefaultValue());
		fldLayout.setCOPY_FLDS_RULE(fieldLayout.getCopyFldsRule());
		fldLayout.setCOPY_SEL_OPT_COLS(fieldLayout.getCopySelOptCols());
		fldLayout.setCOPY_SRC_FLD(fieldLayout.getCopySrcFld());
		fldLayout.setCOPY_TARGET_FLD(fieldLayout.getCopyTargetFld());
		fldLayout.setDEFAULT_VALUE(fieldLayout.getDefaultValue());
		fldLayout.setDEPNT_FLDS(fieldLayout.getDepntFlds());
		fldLayout.setDEPNT_S(fieldLayout.getDepntS());
		fldLayout.setDISABLE_ON_SELECT(fieldLayout.getDisableOnSelect());
		fldLayout.setDISPLAY_ONLY_S(fieldLayout.getDisplayOnlyS());
		fldLayout.setEDIT_VAL(fieldLayout.getEditVal());
		fldLayout.setENA_DIS_RULE_EXP(fieldLayout.getEnaDisRuleExp());
		fldLayout.setFIELD_DESCRIPTION_S(fieldLayout.getFieldDescriptionS());
		fldLayout.setFIELD_LABEL_S(fieldLayout.getFieldLabelS());
		fldLayout.setFLD_NAME(fieldLayout.getFldName());
		fldLayout.setFORMULA_S(fieldLayout.getFormulaS());
		fldLayout.setHOVR_TXT_C(fieldLayout.getHovrTxtC());
		fldLayout.setIS_DEPNT(fieldLayout.getIsDepnt());
		fldLayout.setLABEL_OVERIDE_S(fieldLayout.getLabelOverideS());
		fldLayout.setLENGTH_S(fieldLayout.getLengthS());
		fldLayout.setLIST_VIEW_S(fieldLayout.getListViewS());
		fldLayout.setMAND_RULE_EXP(fieldLayout.getMandRuleExp());
		fldLayout.setOBJ_NAME(fieldLayout.getObjName());
		fldLayout.setPAGE_PARAMS(fieldLayout.getPageParams());
		fldLayout.setPRECISION_S(fieldLayout.getPrecisionS());
		fldLayout.setREFERENCE_TO_S(fieldLayout.getReferenceToS());
		fldLayout.setRELATIONSHIP_LABEL_S(fieldLayout.getRelationshipLabelS());
		fldLayout.setRELATIONSHIP_ORDER_S(fieldLayout.getRelationshipLabelS());
		fldLayout.setREQUIRED_S(fieldLayout.getRequiredS());
		fldLayout.setRT_CD_C(fieldLayout.getRtCdC());
		fldLayout.setRT_DSC_C(fieldLayout.getRtDscC());
		fldLayout.setRT_TBL_NM_C(fieldLayout.getRtTblNmC());
		fldLayout.setSCALE_S(fieldLayout.getScaleS());
		fldLayout.setSELECT_ON_SELECT(fieldLayout.getSelectOnSelect());
		fldLayout.setTYPE_C(fieldLayout.getTypeC());
		fldLayout.setTYPE_S(fieldLayout.getTypeS());
		fldLayout.setUNIQUE_S(fieldLayout.getUniqueS());
		fldLayout.setIDE_PG_SUB_SECTN_ID(fieldLayout.getIdePgSubSectnId()!=null?Integer.parseInt(fieldLayout.getIdePgSubSectnId()):null);
		
		fldLayout.setDATA_PATTERN((String)fieldLayout.getDataPattern());
		fldLayout.setMIN_LEN((Integer)fieldLayout.getMinLen());
		fldLayout.setADDR_FLDS((String)fieldLayout.getAddrFlds());
		fldLayout.setCOND_VALUE((String)fieldLayout.getCondValue());
		fldLayout.setMAX_VAL((Integer)fieldLayout.getMaxVal());
		fldLayout.setDATE_COMP_FLD((String)fieldLayout.getDateCompFld());
		fldLayout.setCLR_ERR_MSG_FLDS((String)fieldLayout.getClrErrMsgFlds());
		fldLayout.setCLR_ERR_MSG_RULE((String)fieldLayout.getClrErrMsgRule());
		fldLayout.setCNTY_RQRD((String)fieldLayout.getCntyRqrd());
		fldLayout.setEXTN_RQRD((String)fieldLayout.getExtnRqrd());
		fldLayout.setSEARCH_COND((String)fieldLayout.getSearchCond());
		fldLayout.setCHILD_RELATION((String)fieldLayout.getChildRelation());
		fldLayout.setCRITERIA_METHOD((String)fieldLayout.getCriteriaMethod());
		fldLayout.setTRUMP_ALL((String)fieldLayout.getTrumpAll());
		fldLayout.setSHOW_LINK((String)fieldLayout.getShowLink());
		fldLayout.setSHOW_ICON((String)fieldLayout.getShowIcon());
		fldLayout.setICON_NAME((String)fieldLayout.getShowIcon());
		fldLayout.setCOL_ORDER_S((Integer)fieldLayout.getColOrderSC());
		fldLayout.setENA_DIS_RULE_EXP((String)fieldLayout.getEnaDisRuleExp());
		
		
		return fldLayout;
	}
	@Override
	public IDE_COL_VALIDATION createFieldLayout(ColumnValidation validation) {
		if(validation==null)return null;
		IDE_COL_VALIDATION colValidation=new IDE_COL_VALIDATION();
		colValidation.setBLANKOUT_EBD(validation.getBlankoutEbd());
		colValidation.setCHK_SPL_CHARS(validation.getChkSplChars());
		colValidation.setCOL_ID(validation.getColId());
		colValidation.setCOMPARE_DATES(validation.getCompareDates());
		colValidation.setCOMPARE_DATES_INCLUSIVE(validation.getCompareDatesInclusive());
		colValidation.setDW_NAME(validation.getDwName());
		colValidation.setFORMAT_CURRENCY(validation.getFormatCurrency());
		colValidation.setFORMAT_DATE(validation.getFormatDate());
		colValidation.setFUTURE_DATE(validation.getFutureDate());
		colValidation.setIDE_PG_LAYOUT_ID(validation.getIdePgLayoutId());
		colValidation.setIS_ALPHA(validation.getIsAlpha());
		colValidation.setIS_ALPHA_NUMERIC(validation.getIsAlphaNumeric());
		colValidation.setIS_COMPLETE(validation.getIsComplete());
		colValidation.setIS_CURRENCY(validation.getIsCurrency());
		colValidation.setIS_NUMERIC(validation.getIsNumeric());
		colValidation.setJOIN_FOUR_FIELDS(validation.getJoinFourFields());
		colValidation.setJOIN_THREE_FIELDS(validation.getJoinThreeFields());
		colValidation.setPAST_DATE(validation.getPastDate());
		colValidation.setVALIDATE_CHG_RPT_DATE(validation.getValidateChgRptDate());
		colValidation.setVALIDATE_CHG_VRF_DATE(validation.getValidateChgVrfDate());
		colValidation.setVALIDATE_DATE(validation.getValidateDate());
		colValidation.setVALIDATE_DOB(validation.getValidateDob());
		colValidation.setVALIDATE_EED(validation.getValidateEed());
		colValidation.setVALIDATE_EFF_DATES(validation.getValidateEffDates());
		colValidation.setVALIDATE_FUTURE_DATE(validation.getValidateFutureDate());
		colValidation.setVALIDATE_NONDOB(validation.getValidateNondob());
		colValidation.setVALIDATE_USE_MONTH(validation.getValidateUseMonth());
		colValidation.setVALIDATE_VRF_END_DATE(validation.getValidateVrfEndDate());
		colValidation.setVALIDATION_ID(validation.getValidationId());
		//colValidation.setNAME(validation.getName());
		colValidation.setBLANKOUT_FLDS(validation.getBlankoutFlds());
		colValidation.setCOPY_FLDS(validation.getCopyFlds());
		Date date=new Date();
		if(validation.getValidationId()==null) {		
			colValidation.setCreateddate(date);
			//colValidation.setCreated_by(validation.getCreatedBy());
		}
		colValidation.setSystemModStamp(date);
		//colValidation.setUpdated_by(validation.getUpdatedBy());
		return colValidation;
	}
	
	@Override
	public ColumnValidation createColumnValidation(IDE_COL_VALIDATION validation) {
		if(validation==null)return null;
		ColumnValidation colValidation=new ColumnValidation();
		colValidation.setBlankoutEbd(validation.getBLANKOUT_EBD());
		colValidation.setChkSplChars(validation.getCHK_SPL_CHARS());
		colValidation.setColId(validation.getCOL_ID());
		colValidation.setCompareDates(validation.getCOMPARE_DATES());
		colValidation.setCompareDatesInclusive(validation.getCOMPARE_DATES_INCLUSIVE());
		colValidation.setDwName(validation.getDW_NAME());
		colValidation.setFormatCurrency(validation.getFORMAT_CURRENCY());
		colValidation.setFormatDate(validation.getFORMAT_DATE());
		colValidation.setFutureDate(validation.getFUTURE_DATE());
		colValidation.setIdePgLayoutId(validation.getIDE_PG_LAYOUT_ID());
		colValidation.setIsAlpha(validation.getIS_ALPHA());
		colValidation.setIsAlphaNumeric(validation.getIS_ALPHA_NUMERIC());
		colValidation.setIsComplete(validation.getIS_COMPLETE());
		colValidation.setIsCurrency(validation.getIS_CURRENCY());
		colValidation.setIsNumeric(validation.getIS_NUMERIC());
		colValidation.setJoinFourFields(validation.getJOIN_FOUR_FIELDS());
		colValidation.setJoinThreeFields(validation.getJOIN_THREE_FIELDS());
		colValidation.setPastDate(validation.getPAST_DATE());
		colValidation.setValidateChgRptDate(validation.getVALIDATE_CHG_RPT_DATE());
		colValidation.setValidateChgVrfDate(validation.getVALIDATE_CHG_VRF_DATE());
		colValidation.setValidateDate(validation.getVALIDATE_DATE());
		colValidation.setValidateDob(validation.getVALIDATE_DOB());
		colValidation.setValidateEed(validation.getVALIDATE_EED());
		colValidation.setValidateEffDates(validation.getVALIDATE_EFF_DATES());
		colValidation.setValidateFutureDate(validation.getVALIDATE_FUTURE_DATE());
		colValidation.setValidateNondob(validation.getVALIDATE_NONDOB());
		colValidation.setValidateUseMonth(validation.getVALIDATE_USE_MONTH());
		colValidation.setValidateVrfEndDate(validation.getVALIDATE_VRF_END_DATE());
		colValidation.setValidationId(validation.getVALIDATION_ID());
		//colValidation.setName(validation.getNAME());
		colValidation.setBlankoutFlds(validation.getBLANKOUT_FLDS());
		colValidation.setCopyFlds(validation.getCOPY_FLDS());
			colValidation.setCreateddate(validation.getCreateddate()!=null?df.format(validation.getCreateddate()):null);
		//	colValidation.setCreatedBy(validation.getCreated_by());
		colValidation.setSystemmodstamp(validation.getSystemModStamp()!=null?df.format(validation.getSystemModStamp()):null);
		//colValidation.setUpdatedBy(validation.getUpdated_by());
		return colValidation;
	}

	@Override
	public FieldLayout createSectionFieldLayout(IDE_SECTION_FLD_LAYOUT fieldLayout) {
		if(fieldLayout==null) {
			return null;
		}
		System.out.println("started building FE fieldLayout");
		FieldLayout fldLayout=new FieldLayout();
		fldLayout.setModifiedTimeStamp(fieldLayout.getSystemModStamp()!=null?df.format(fieldLayout.getSystemModStamp()):null);
		fldLayout.setCreatedTimeStamp(fieldLayout.getCreateddate()!=null?df.format(fieldLayout.getCreateddate()):null);
		fldLayout.setCreatedBy(fieldLayout.getCreated_by());
		fldLayout.setUpdatedBy(fieldLayout.getUpdated_by());
		fldLayout.setApiNameS(fieldLayout.getAPI_NAME_S());
		fldLayout.setColId(fieldLayout.getCOL_ID());
		fldLayout.setColNumber(fieldLayout.getCOL_NUMBER());
		//fldLayout.setFldColOrders(fieldLayout.getFLD_COL_ORDERS());
		System.out.println("complted building FE fieldLayout upto primary number");
		fldLayout.setIdeFieldLayoutId(fieldLayout.getIDE_FIELD_LAYOUT_ID());
		System.out.println("complted building FE fieldLayout upto primary number");
		fldLayout.setName(fieldLayout.getFLD_NAME());
		fldLayout.setRowNumber(fieldLayout.getROW_NUMBER());
		System.out.println("complted building FE fieldLayout upto row number");
		/*if(fieldLayout.getIdePgSubSecFldLayouts()!=null && fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns()!=null) {
		fldLayout.setIdePgSectnId(fieldLayout.getIdePgSubSecFldLayouts().getIdePageSubSectns().getIDE_PG_SECTN_ID());
		}
		*/
		fldLayout.setIdePgSectnId(fieldLayout.getIDE_PG_SECTN_ID());
		if(fieldLayout.getIdePgSectionLayoutList()!=null && fieldLayout.getIdePgSectionLayoutList().getIdePageSectns()!=null && fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIdePgLayouts()!=null &&
				fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID()!=null) {
			fldLayout.setIdeObjId(fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIdePgLayouts().getIDE_OBJ_ID());
		}
		/*if(fieldLayout.getIdePgSubSecFldLayouts()!=null) {
		fldLayout.setIdePgSubSectnId(fieldLayout.getIdePgSubSecFldLayouts().getIDE_PG_SUB_SECTN_ID());
		}*/
		if(fieldLayout.getIdePgSectionLayoutList()!=null && fieldLayout.getIdePgSectionLayoutList().getIdePageSectns()!=null ) {
		fldLayout.setIdePgLayoutId(fieldLayout.getIdePgSectionLayoutList().getIdePageSectns().getIDE_PG_LAYOUT_ID());
		}
		
		fldLayout.setBlankoutFlds(fieldLayout.getBLANKOUT_FLDS());
		fldLayout.setBlankoutFldsRule(fieldLayout.getBLANKOUT_FLDS_RULE());
		fldLayout.setCaseSensitiveS(fieldLayout.getCASE_SENSITIVE_S());
		fldLayout.setColFltrNameC(fieldLayout.getCOL_FLTR_NAME_C());
		fldLayout.setColFltrValC(fieldLayout.getCOL_FLTR_VAL_C());
		fldLayout.setColVisibleS(fieldLayout.getCOL_VISIBLE_S());
		System.out.println("complted building FE fieldLayout upto visible column");
		fldLayout.setComputeFldRule(fieldLayout.getCOMPUTE_FLD_RULE());
		fldLayout.setCopyDefaultRule(fieldLayout.getCOPY_DEFAULT_RULE());
		fldLayout.setCopyDefaultTar(fieldLayout.getCOPY_DEFAULT_TAR());
		fldLayout.setCopyDefaultValue(fieldLayout.getCOPY_DEFAULT_VALUE());
		fldLayout.setCopyFldsRule(fieldLayout.getCOPY_FLDS_RULE());
		fldLayout.setCopySelOptCols(fieldLayout.getCOPY_SEL_OPT_COLS());
		fldLayout.setCopySrcFld(fieldLayout.getCOPY_SRC_FLD());
		fldLayout.setCopyTargetFld(fieldLayout.getCOPY_TARGET_FLD());
		fldLayout.setDefaultValue(fieldLayout.getDEFAULT_VALUE());
		fldLayout.setDepntFlds(fieldLayout.getDEPNT_FLDS());
		fldLayout.setDepntS(fieldLayout.getDEPNT_S());
		System.out.println("complted building FE fieldLayout upto DEPNT column");
		fldLayout.setDisableOnSelect(fieldLayout.getDISABLE_ON_SELECT());
		fldLayout.setDisplayOnlyS(fieldLayout.getDISPLAY_ONLY_S());
		fldLayout.setEditVal(fieldLayout.getEDIT_VAL());
		fldLayout.setEnaDisRuleExp(fieldLayout.getENA_DIS_RULE_EXP());
		fldLayout.setFieldDescriptionS(fieldLayout.getFIELD_DESCRIPTION_S());
		fldLayout.setFieldLabelS(fieldLayout.getFIELD_LABEL_S());
		fldLayout.setFldName(fieldLayout.getFLD_NAME());
		fldLayout.setFormulaS(fieldLayout.getFORMULA_S());
		System.out.println("complted building FE fieldLayout upto FORMULA column");
		fldLayout.setHovrTxtC(fieldLayout.getHOVR_TXT_C());
		fldLayout.setIsDepnt(fieldLayout.getIS_DEPNT());
		fldLayout.setLabelOverideS(fieldLayout.getLABEL_OVERIDE_S());
		fldLayout.setLengthS(fieldLayout.getLENGTH_S());
		fldLayout.setListViewS(fieldLayout.getLIST_VIEW_S());
		fldLayout.setMandRuleExp(fieldLayout.getMAND_RULE_EXP());
		fldLayout.setObjName(fieldLayout.getOBJ_NAME());
		fldLayout.setPageParams(fieldLayout.getPAGE_PARAMS());
		fldLayout.setPrecisionS(fieldLayout.getPRECISION_S());
		fldLayout.setReferenceToS(fieldLayout.getREFERENCE_TO_S());
		System.out.println("complted building FE fieldLayout upto REFERENCE column");
		fldLayout.setRelationshipLabelS(fieldLayout.getRELATIONSHIP_LABEL_S());
		fldLayout.setRelationshipOrderS(fieldLayout.getRELATIONSHIP_ORDER_S());
		fldLayout.setRequiredS(fieldLayout.getREQUIRED_S());
		fldLayout.setRtCdC(fieldLayout.getRT_CD_C());
		fldLayout.setRtDscC(fieldLayout.getRT_DSC_C());
		fldLayout.setRtTblNmC(fieldLayout.getRT_TBL_NM_C());
		fldLayout.setScaleS(fieldLayout.getSCALE_S());
		fldLayout.setSelectOnSelect(fieldLayout.getSELECT_ON_SELECT());
		fldLayout.setTypeC(fieldLayout.getTYPE_C());
		fldLayout.setTypeS(fieldLayout.getTYPE_S());
		fldLayout.setUniqueS(fieldLayout.getUNIQUE_S());
		System.out.println("complted building FE fieldLayout upto UNIQUE column");
		System.out.println("complted building FE fieldLayout");
		return fldLayout;
	}

	
	
}
