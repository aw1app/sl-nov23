package com.clienta.demoes;

import com.clienta.*;

public class ThreadWaitNoftifyDemoOfficeStaffCustomer {

	public static void main(String[] args) {
		Office office = new Office(); // common object
		
		OfficeStaff mt1 = new OfficeStaff(office);
		OfficeCustomer mt2 = new OfficeCustomer(office);
		
		mt1.start();
		mt2.start();

	}

}
