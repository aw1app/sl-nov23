package com.clienta.demoes;

import java.util.Scanner;

import com.clienta.exceptions.PatientReportNotFoundException;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the id of the pateint whose record is to be found  ");
		int id = sc.nextInt();

		try {
			String response = PatientRecord.findRecord(id);
			System.out.println(response);
		} catch (PatientReportNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thank you.");
		}

		System.out.println("Exiting");

	}

}

class PatientRecord {

	static String findRecord(int id) throws PatientReportNotFoundException {
		// assume that patient records are available only for id from 1 to 10.
		if (id > 0 && id <= 10) {
			return " Found the record. Will Email it";
		} else {
			throw new PatientReportNotFoundException("records with such id not found");
		}
	}
}
