package com.clienta.demoes;

import java.util.*;

import com.clienta.Doctor;
import com.clienta.Patient;

public class CollectionsDemo {

	public static void main(String[] args) {
		// List Demo
		System.out.println("List Demo");
		
		Doctor d1 = new Doctor(1,"Madan",67.5f);
		Doctor d2 = new Doctor(2,"Sharath",55f);
		Doctor d3 = new Doctor(3,"Suzi",60.5f);
		Doctor d4 = new Doctor(4,"Patrick",67f);
		
		ArrayList listOfDoctors = new ArrayList();
		
		listOfDoctors.add(d1);
		listOfDoctors.add(d2);
		listOfDoctors.add(d3);
		listOfDoctors.add(d4);
		
				
		System.out.printf("Size of tyhe listOfDoctors is %s \n", listOfDoctors.size());
		
		// Printy the names and ages of all the doctors
		for(int i=0;i<listOfDoctors.size();i++) {
			Doctor tempDoctor  =(Doctor) listOfDoctors.get(i);
			
			System.out.printf("Doctor name is %s and age is %s \n",tempDoctor.getName(),tempDoctor.getAge());
		}
		
		// another way to loop
		for(Object obj: listOfDoctors) {
			Doctor tempDoctor = (Doctor)obj;
			System.out.printf("Doctor name is %s and age is %s \n",tempDoctor.getName(),tempDoctor.getAge());
		};
		
		// 
		ArrayList<Doctor> listOfDoctors1 = new ArrayList<Doctor>();
		
		listOfDoctors1.add(d1);
		listOfDoctors1.add(d2);
		listOfDoctors1.add(d3);
		listOfDoctors1.add(d4);
		
		for(int i=0;i<listOfDoctors1.size();i++) {			
			System.out.printf("Doctor name is %s and age is %s \n",
					listOfDoctors1.get(i).getName(),listOfDoctors1.get(i).getAge());
		};
		for(Doctor tempDoctor: listOfDoctors1) {
			System.out.printf("Doctor name is %s and age is %s \n",tempDoctor.getName(),tempDoctor.getAge());
		};
		
		Patient p1 = new Patient();
		p1.name="Sundar";
		
		// ERROR listOfDoctors1.add(p1);
	
		listOfDoctors.add(p1);
	}

}
