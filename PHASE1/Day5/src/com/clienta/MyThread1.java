package com.clienta;

public class MyThread1 extends Thread{
	
	public Data data;
	
	public MyThread1(Data data) {
		super();
		this.data=data;
	}
	
	
	@Override
	public void run_sleep() {
		int counter=0;
		
		
		while(true) {
			System.out.println("Inside MyThread1 " + counter++);
			System.out.println("MyThread1 checking for data.a==10 ");
			if(data.a==10) {
				System.out.println("My job is done!");
				break;
			}
			else {
				System.out.println("MyThread1 checking for data.a==10 failed so will sleep.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}
		

		
	}

 //Solution using wait and notify mechanism
	@Override
	public void run() {
		int counter=0;
		
		synchronized(data) {
		
		while(true) {
			System.out.println("Inside MyThread1 " + counter++);
			System.out.println("MyThread1 checking for data.a==10 ");
			if(data.a==10) {
				System.out.println("My job is done!");
				break;
			}
			else {
				System.out.println("MyThread1 checking for data.a==10 failed so will wait.");
				try {
					data.wait();
					System.out.println("MyThread1  somebody notfied me. I will awake.");
				} catch (InterruptedException e) {
					
				}
			}
		}
		
	}
		
	
}

}
