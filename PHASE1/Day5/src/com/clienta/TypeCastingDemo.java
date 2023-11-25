package com.clienta;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		int a =10;
		float b= 45.3f;
		
		
		// a = b; // Type cast error
		 a = (int) b; // No error because we are doing explicit type casting
		
		// b = a;

	}

}
