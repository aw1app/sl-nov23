package com.clienta;

import java.util.Date;

public class Patient {
	public String name;
	String wardOf; // camel case letter
	float age;
	String diseaseType;
	long phoneNumber;
	
	int id;
	Date dob;
	String gender;
	String address;
	
	

	public Patient(String name, float age, int id) {
//		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}



	public float getAge() {
		return this.age;
	}

	public void setAge(float age) {
		this.age = age;

	}

}