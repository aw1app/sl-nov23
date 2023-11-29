package com.clienta;

abstract public class Receptionist {
	
	abstract public void announce(String message);
	
	public void openTheDoors() {
		System.out.println("Opening the door..");
	}

}


/// Abstract class are making the design part simpler focusing on what to do rather than how to do?