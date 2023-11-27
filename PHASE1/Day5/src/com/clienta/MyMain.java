package com.clienta;

import java.util.Date;

public class MyMain {

	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		d1.name="Madan";
		d1.age=56.3f;
		
		
		
		System.out.println("Doctor's name is "+ d1.name);
		System.out.println("Doctor's age is "+ d1.age);
		
		d1.examinePatient();
		
		d1.setAge(100.5f);
		System.out.println("Doctor's age is "+ d1.age);
		
		System.out.println("");
		
		Doctor d2 = new Doctor();
		d2.name="Raman";
		d2.age=40.3f;
		
		System.out.println("Second Doctor's name is "+ d2.name);
		System.out.println("Second Doctor's age is "+ d2.age);
		
		d2.examinePatient();
		
		d2.setAge(50.0f);
		System.out.println("Second Doctor's age is "+ d2.age);
		
		System.out.println("\n\n\n\n");
		
		//Create 2-3 patients 
		Patient p1= new Patient();
		p1.name="Selva";
		p1.age=70.1f;
		System.out.println("First Patients name is "+ p1.name);
		System.out.println("First Patients age is "+ p1.age);
		

	}

}
