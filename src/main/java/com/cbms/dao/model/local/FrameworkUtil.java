package com.cbms.dao.model.local;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class FrameworkUtil {

	public static String toString(Object obj) {
		
		String str ="";
		if(null != obj) {
			str = obj.toString();
		}
		
		return str;
	}

	public static String removeSpecialChars(String fileName) {
		
		return fileName.replace("/", "").replace("\\", "").replace("+", "").replace("-", "").replace(" ", "").replace("/","");
	}
	
	/*
	 * Method used to write the output file
	 */
	public static String writeFile(StringWriter writer, File file) {
		FileWriter fw = null;
		try {
			file.createNewFile();
			fw  = new FileWriter(file);
			fw.write(writer.toString());
			fw.flush();
			fw.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		return writer.toString();
	}
	/*
	 * Method used to get the file from resource 
	 */
	public static File getFile(String fileName) {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file;
	}
	/*
	 * Method used to merge the content into template
	 */

	
	public static void createStreamReader(String templatePath) throws Exception {
		InputStream input =  Thread.currentThread().getContextClassLoader().getResourceAsStream(templatePath);
        if (input == null) {
            throw new IOException("Template file doesn't exist");
        }
        InputStreamReader reader = new InputStreamReader(input);
        reader.close();
	}
	
	
	/*
	 * Method used to merge template
	 */
	
	
	public static String getPath(String path) {
		String oSName = System.getProperty("os.name");
		if(oSName.contains("Windows")) {
			path = path + "\\";
		} else {
			path = path + "/";
		}
		return path;
	}
	
	public static void loadProperties(String propPath) throws Exception {
		InputStream inStream = new FileInputStream(propPath);
		Properties props = new Properties();
		props.load(inStream);
		for(String key : props.keySet().toArray(new String[0])) {
			System.setProperty(key, props.getProperty(key));
		}
	}
	
	public static String compileRule(String ruleStr, boolean isCondValue) {
		if(!StringUtils.isEmpty(ruleStr.trim())) {
			if(!ruleStr.contains("v.")) {
				ruleStr = ruleStr.replace(":"," : ").replace("&&", " && ").replace("||", " || ").replace(">=", " >= ").replace("==", " == ").replace("!=", " != ").replace("(", " ( ").replace(")", " ) ").replace("?", " ? ");
				String rplcStr = "";
				for(int i=0; i< ruleStr.length(); i++) {
					if(ruleStr.charAt(i) == '<' || ruleStr.charAt(i) == '>') {
						if(ruleStr.charAt(i+1) == '=') {
							rplcStr = rplcStr +  ruleStr.charAt(i);
						} else {
							rplcStr = rplcStr + " " + ruleStr.charAt(i) + " ";
						}
					} else {
						rplcStr = rplcStr + ruleStr.charAt(i);
					}
				}
				ruleStr = rplcStr;
				String[] splitString = ruleStr.split(" ");
				String temp="";
				for (int i = 0; i < splitString.length; i++) {
					if(isCondValue) {
						if (splitString[i].contains("__c") && (splitString[i].contains("\'") == false) && ruleStr.contains("?")) {
							temp = temp.concat(" v.detailData.sobjectData." + splitString[i]);
						} else if (splitString[i].toUpperCase().equals("ID")) {
							temp = temp.concat(" v.detailData.sobjectData." + splitString[i].toString());
						} else if(splitString[i].toUpperCase().equals("CURRENTDATE")) {
							temp = temp.concat(" v." + splitString[i].toString());
						} else {
							temp = temp.concat(" " + splitString[i].toString());
						}
					} else {
						if (splitString[i].contains("__c") && (splitString[i].contains("\'") == false)) {
							temp = temp.concat(" v.detailData.sobjectData." + splitString[i]);
						} else if (splitString[i].toUpperCase().equals("ID")) {
							temp = temp.concat(" v.detailData.sobjectData." + splitString[i].toString());
						} else if(splitString[i].toUpperCase().equals("CURRENTDATE")) {
							temp = temp.concat(" v." + splitString[i].toString());
						} else {
							temp = temp.concat(" " + splitString[i].toString());
						}
					}
				}
				if(temp.contains("&&") && !temp.contains("&amp;")) {
					temp = temp.replace("&&", "&amp;&amp;");
				}
				if((temp.contains("csHdrInfo.") || temp.contains("usrInfoObj.")) && !temp.contains("v.compViewObj")) {
					temp = temp.replace("csHdrInfo.", "v.compViewObj.csHdrInfo.").replace("usrInfoObj.", "v.compViewObj.usrInfoObj.");
				}
				ruleStr = temp;
			}
		}
		if(isCondValue && ruleStr.contains("v.")) {
			ruleStr = "{! " + ruleStr + " }";
		}
		return ruleStr;
	}
	public static String compileBORule(String ruleStr) {
		if(!StringUtils.isEmpty(ruleStr.trim())) {
			if(!ruleStr.contains("wObject.")) {
				ruleStr = ruleStr.replace(" ", "").replace(":"," : ").replace("&&", " && ").replace("||", " || ").replace(">=", " >= ").replace("==", " == ").replace("!=", " != ").replace("(", " ( ").replace(")", " ) ").replace("?", " ? ").replace("+"," + ").replace("-"," - ");
				String rplcStr = "";
				for(int i=0; i< ruleStr.length(); i++) {
					if(ruleStr.charAt(i) == '<' || ruleStr.charAt(i) == '>') {
						if(ruleStr.charAt(i+1) == '=') {
							rplcStr = rplcStr +  ruleStr.charAt(i);
						} else {
							rplcStr = rplcStr + " " + ruleStr.charAt(i) + " ";
						}
					} else {
						rplcStr = rplcStr + ruleStr.charAt(i);
					}
				}
				ruleStr = rplcStr;
				String[] splitString = ruleStr.split(" ");
				String temp="";
				for (int i = 0; i < splitString.length; i++) {
					if (splitString[i].contains("__c") && (splitString[i].contains("\'") == false)) {
						temp = temp.concat(" wObject.sobjectData." + splitString[i]);
					}else if(splitString[i].toUpperCase().contains("CURRENTDATE")) {
						temp = temp.concat(splitString[i].toUpperCase().replace("CURRENTDATE", " curDateObj.todayVal").replace("ADDMONTHS", "addMonths").replace("ADDYEARS", "addYears"));
					} else {
						temp = temp.concat(" " + splitString[i].toString());
					}
				}
				
				if((temp.contains("csHdrInfo.") || temp.contains("usrInfoObj.")) && !temp.contains("v.compViewObj")) {
					temp = temp.replace("csHdrInfo.", "v.compViewObj.csHdrInfo.").replace("usrInfoObj.", "v.compViewObj.usrInfoObj.");
				}
				ruleStr = temp;
			}
		}
		return ruleStr;
	}
}
