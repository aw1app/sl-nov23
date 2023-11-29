package com.clienta;

public abstract class Receptionist {
	
	abstract public void announce(String message);
	
	public void openTheDoors() {
		System.out.println("Opening the door..");
	}

}
