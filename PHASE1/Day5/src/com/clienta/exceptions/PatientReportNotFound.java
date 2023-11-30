package com.clienta.exceptions;

public class PatientReportNotFound extends Exception{
	
	String message;
	
	public PatientReportNotFound(String message) {
		super(message);		
	}
	
	

}
