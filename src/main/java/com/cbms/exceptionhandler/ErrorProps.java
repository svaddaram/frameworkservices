package com.cbms.exceptionhandler;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ErrorProps implements Serializable {
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	 private String errorMessage;
	 
	 public ErrorProps(){super();}
	 
	 public ErrorProps(String statusFromOutside, String errorMessageFromOutside)
	 {
	 this.status = statusFromOutside;
	 this.errorMessage = errorMessageFromOutside;
	 }
	 
	 
	 public String getErrorMessage() {
	 return errorMessage;
	 }
	 public void setErrorMessage(String errorMessage) {
	 this.errorMessage = errorMessage;
	 }
	 public String getStatus() {
	 return status;
	 }
	 public void setStatus(String status) {
	 this.status = status;
	 }

	public void setCode(String string) {
		
	} 
	 
	}
