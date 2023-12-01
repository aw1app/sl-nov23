package com.clienta;

public class Postman {
	
	String msg;
	
	public void send(String msg) {
		
		System.out.println("Sending your "  + msg ); 
		
		// some other work, packaging ....
		try {
		Thread.sleep(5000);
		}catch (InterruptedException e) {
			
		}
		
		System.out.println("\n" + msg  + " has been sent! ");
		
	}

}
