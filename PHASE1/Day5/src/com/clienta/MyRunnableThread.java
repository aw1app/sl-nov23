package com.clienta;

public class MyRunnableThread implements Runnable{
	
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("MyRunnableThread " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
		}
	}

}
