package com.clienta.demoes;

import java.util.Scanner;

import com.clienta.exceptions.PatientReportNotFound;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the id of the pateint whose record is to be found  ");
		int id = sc.nextInt();

		System.out.println("Thank you.");

	}

}

class PatientRecord {

	static String findRecord(int id) {
		// assume that patient records are available only for id from 1 to 10.
		if (id >= 0 && id <= 10) {
			return " Found the record. Will Email it";
		} else {
			throw new PatientReportNotFound("records with such id not found");
		}
	}
}
