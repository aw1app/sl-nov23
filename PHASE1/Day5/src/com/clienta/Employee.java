package com.clienta;

public class Employee {
	
	String name;
	public int baseSalary=1000;
	
	public Employee(String name) {
		this.name=name;
	}
	
	public int getSalary() {
		return this.baseSalary;
	}
	
	public String getName() {
		return this.name;
	}

}
