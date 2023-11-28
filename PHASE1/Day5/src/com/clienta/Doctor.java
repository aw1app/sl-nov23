package com.clienta;

public class Doctor {

	// Properties/ Fields / Variables
	String name;
	int id;
	float age;

	String speciality;

	public Doctor() {

	}

	public Doctor(int id, String name, float age) {
		this.age=age;
		this.id=id;
		this.name=name;
	}

	// Methods / Functions / Operations

	/*
	 * This method examines a patient by checking there body temp, heart beat ... *
	 */
	void examinePatient() {
		// method body

		System.out.println("Examing the  patient...");
	}

	public String getName() {
		return this.name;
	}
	
	public float getAge() {
		return this.age;
	}

	void setAge(float age) {
		this.age = age;
	}

}
