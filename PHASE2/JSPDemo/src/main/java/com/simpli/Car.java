package com.simpli;

public class Car {
	
	String modelName;
	
	public Car(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelName() throws Exception {
		throw new Exception("Simpli..");
		//return this.modelName;
	}
	
	
}
