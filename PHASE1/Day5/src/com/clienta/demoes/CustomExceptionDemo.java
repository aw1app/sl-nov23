package com.clienta.demoes;

import java.util.Scanner;

import com.clienta.PatientRecord;
import com.clienta.exceptions.PatientReportNotFoundException;

public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the id of the pateint whose record is to be found (id b/w 1 and 10) ");
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


