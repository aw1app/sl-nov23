package com.clienta;

public class PantryEmployee extends Employee{
	
	int baseSalary=2000;

	public PantryEmployee(String name) {
		super(name);
	}
	
	@Override
	public String getName() {
		return this.name.toUpperCase();
	}

}
