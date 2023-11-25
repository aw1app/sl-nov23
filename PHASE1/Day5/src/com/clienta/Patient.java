package com.clienta;

import java.util.Date;

public class Patient {
	String name;
	String wardOf; // camel case letter
	float age;
	String diseaseType;
	long phoneNumber;
	
	int id;
	Date dob;
	String gender;
	String address;

	float getAge() {
		return this.age;
	}

	void setAge(float age) {
		this.age = age;

	}

}