package com.clienta.demoes;

import java.util.*;

import com.clienta.Doctor;
import com.clienta.Patient;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		 //demoList();
		
		 demoSet();
		
	}
	
	public static void demoMap(){
		Patient p1 = new Patient("Sundar",23.6f,1);
		Patient p2 = new Patient("Bala",53.6f,2);
		Patient p3 = new Patient("Sameer",23.7f,3);
		Patient p4 = new Patient("Shaji",29.6f,4);
		
		Map<Float,Patient> patientMap = new HashMap<Float,Patient>();
		
	}
	
	public static void demoSet() {
		System.out.println("Set  Demo");
		Doctor d1 = new Doctor(1,"Madan",67.5f);
		Doctor d2 = new Doctor(2,"Sharath",55f);
		Doctor d3 = new Doctor(3,"Suzi",60.5f);
		Doctor d4 = new Doctor(4,"Patrick",67f);
		
		Set<Doctor> setOfDoctors = new HashSet<Doctor>();
		setOfDoctors.add(d1);
		setOfDoctors.add(d2);
		setOfDoctors.add(d3);
		setOfDoctors.add(d4);
		
		System.out.printf("1. Size of the setOfDoctors is %s \n", setOfDoctors.size());
		
		for(Doctor tempDoctor: setOfDoctors) {
			System.out.printf("Doctor name is %s and age is %s \n",tempDoctor.getName(),tempDoctor.getAge());
		};
		
		setOfDoctors.add(d3);
		System.out.printf("2. After adding doctor d3, Size of the setOfDoctors is %s \n", setOfDoctors.size());
		
		for(Doctor tempDoctor: setOfDoctors) {
			System.out.printf("Doctor name is %s and age is %s \n",tempDoctor.getName(),tempDoctor.getAge());
		};
		
	}

	public static void demoList() {
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
		List<Doctor> listOfDoctors1 = new ArrayList<Doctor>();
		
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
		
		Patient p1 = new Patient("Sundar",23.6f,1);
		
		// ERROR listOfDoctors1.add(p1);
	
		listOfDoctors.add(p1);
		
		//ArrayList<Patient> listOfPatients = new ArrayList<Patient>();
		
		
	}

}
