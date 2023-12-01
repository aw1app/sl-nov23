package com.clienta.demoes;

import com.clienta.Data;
import com.clienta.MyThread1;
import com.clienta.MyThread2;

public class ThreadWaitNoftifyDemo {

	public static void main(String[] args) {
		Data data1 = new Data(); // common object
		
		MyThread1 mt1 = new MyThread1(data1);
		MyThread2 mt2 = new MyThread2(data1);
		
		mt1.start();
		mt2.start();

	}

}
