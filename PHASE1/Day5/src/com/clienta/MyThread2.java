package com.clienta;

public class MyThread2 extends Thread {

	public Data data;

	public MyThread2(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {

		synchronized (data) {

			System.out.println("Inside MyThread2 , just started");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {

			} // 10s

			this.data.a = 10;
			System.out.println("data.a has set to 10");
			data.notify();
			System.out.println("MyThread2 I have notified others.");
		}

	}

}
