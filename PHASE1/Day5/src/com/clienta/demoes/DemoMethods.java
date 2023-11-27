package com.clienta.demoes;

import package1.A;

public class DemoMethods {

	public static void main(String[] args) {
		A a1 = new A();
		
		System.out.println("a1.x="+a1.getValueOfx());
		
		a1.method1A();
		
		int result1 =a1.method2A(3);
		System.out.println(result1);
		
		
		int result2 = a1.method2A(3,5);
		System.out.println(result2);
		
		
		
		/// Use the overloaded constructor
		A a2 = new A(12,15);
		System.out.println("a2.x="+a2.getValueOfx());
	}
	
	

}
