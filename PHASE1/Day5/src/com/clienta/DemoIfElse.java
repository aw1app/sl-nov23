package com.clienta;

public class DemoIfElse {

	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		int c=10;
		
		if(a<b) {
			System.out.println("Hi");
		};
		
		if(a>b || a<1) {
			System.out.println("Hi 2");
		};
		
		if(a>b || a>1) {
			System.out.println("Hi 3");
		};
		
		if(a>b) {
			System.out.println("Hi 4");
		}else if (a==c) {
			System.out.println("Hi 5");
		};
		
		if(a==c) {
			System.out.println("Hi 6");
		}else if (c>b) {
			System.out.println("Hi 7");
		};
		
		System.out.println("10/7 " + 10/7);
		System.out.println("10%7 " + 10%7);
		
	}

}
