package com.clienta.demoes;

import com.clienta.MyThread1;

public class ThreadDemo {

	// Main thread
	public static void main(String[] args) {
		System.out.println("statement 1");
		System.out.println("statement 2");

		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread1 t2 = new MyThread1();
		t2.start();

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
