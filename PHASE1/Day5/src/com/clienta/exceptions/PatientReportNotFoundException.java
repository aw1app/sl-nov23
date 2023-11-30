package com.clienta.exceptions;

public class PatientReportNotFoundException extends Exception{
	
	String message;
	
	public PatientReportNotFoundException(String message) {
		super(message);		
	}
	
	

}
