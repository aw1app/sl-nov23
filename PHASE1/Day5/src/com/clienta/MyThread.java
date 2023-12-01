package com.clienta;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println(this.getName()+" " + i);
			
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//
//			}
		}
	}

}
