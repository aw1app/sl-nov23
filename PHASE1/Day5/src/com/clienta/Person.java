package com.clienta;

public class Person extends Thread{
	
	Postman postman;
	String msg;
	
	public Person(Postman postman, String msg) {
		this.postman = postman;
		this.msg = msg;		
	}
	
	@Override
	public void run() {
		
		synchronized (postman) {
			postman.send(msg);
		}
		
	}

}
