package com.clienta;

import com.clienta.exceptions.PatientReportNotFoundException;

public class PatientRecord {

	public static String findRecord(int id) throws PatientReportNotFoundException {
		// assume that patient records are available only for id from 1 to 10.
		if (id > 0 && id <= 10) {
			return " Found the record. Will Email it";
		} else {
			throw new PatientReportNotFoundException("records with id="+id+" not found");
		}
	}
}