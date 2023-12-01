package com.clienta.demoes;

import com.clienta.MyRunnableThread;
import com.clienta.MyThread;

public class ThreadDemo {

	// Main thread
	public static void main(String[] args) {
		
		System.out.println("statement 1");
		System.out.println("statement 2");

		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
		
		
		MyRunnableThread r1 = new MyRunnableThread();
		Thread rt1 = new Thread(r1);
		rt1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("statement 4 ");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
		}

		System.out.println("statement 5");
		System.out.println("statement 6");

	}

}
