package com.clienta;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println(this.getName()+" " + i);
			//
			
			try {
				Thread.sleep(1000);// sleep for 10 ms
			} catch (InterruptedException e) {

			}
		}
	}

}
