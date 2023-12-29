package com.clienta;

public class OfficeCustomer extends Thread {

	public Office office;

	public OfficeCustomer(Office office) {
		this.office = office;
	};

	public void run_sleep() {
		int counter = 0;

		while (true) {
			System.out.println("Inside OfficeCustomer Thread " + counter++);
			System.out.println("OfficeCustomer:  checking for door open");
			if (office.doorOpen == true) {
				System.out.println("OfficeCustomer: Entered the office. My job is done!");
				break;
			} else {
				System.out.println(
						"OfficeCustomer:  checking for door open. Door not open, so will sleep for 1s and check if the door is open again..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
			}
		}
	}

	// Solution using wait and notify mechanism
	@Override
	public void run() {
		int counter = 0;

		while (true) {
			synchronized (office) {

				System.out.println("Inside OfficeCustomer Thread :" );
				System.out.println("OfficeCustomer:  checking for door open " + counter++ +"th time");
				if (office.doorOpen == true) {
					System.out.println("OfficeCustomer: Entered the office. My job is done!");
					break;
				} else {
					System.out.println("OfficeCustomer:  checking for door open. Door not open, so will sleep.");
					try {
						office.wait();
						//Thread.sleep(1000);//
						System.out.println(
								"OfficeCustomer: somebody notfied me. I will wake up and check if the door is open.");
					} catch (InterruptedException e) {

					}
				}
			}

		}

	}

}
