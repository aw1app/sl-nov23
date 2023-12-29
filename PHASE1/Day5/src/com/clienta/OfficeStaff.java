package com.clienta;

public class OfficeStaff extends Thread {

	public Office office;

	public OfficeStaff(Office office) {
		this.office = office;
	}

	@Override
	public void run() {

		System.out.println("Inside OfficeStaff Thread , just started. Warming up. Will open office door in 10 secs.");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		} // 10s
		
		synchronized (office) {		

			this.office.doorOpen = true;
			System.out.println("OfficeStaff: I have opened the Door.");
			office.notifyAll();
			System.out.println("OfficeStaff Thread : I have notified that door has opened.");
		}

	}

}
