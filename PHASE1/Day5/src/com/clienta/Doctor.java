package com.clienta;

public class Doctor {
	
	// Properties/ Fields / Variables
	String name;
	int id;
	float age;
	
	String speciality;
	
	
	// Methods / Functions / Operations
	
	/* This method examines 
	 * a patient by checking there body temp,
	 * heart beat ...	 * 
	 */
	void examinePatient(){
		// method body
		
		System.out.println("Examing the  patient...");		
	}
	
	float getAge(){		
		return this.age;
	}
	
	void setAge(float age){	
		this.age=age;
	}	

}
