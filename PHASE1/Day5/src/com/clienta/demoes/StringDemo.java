package com.clienta.demoes;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="NOAH";
		String s2="NOAH";
		
		
		if(s1==s2) {
			System.out.println("s1==s2 is true");
			
		}
		else {			
			System.out.println("s1==s2 is false");
		};
		
		
		String s3=new String("NOAH");
		if(s3==s1) {
			System.out.println("s3==s1 is true");
			
		}
		else {			
			System.out.println("s3==s1 is false");
		};
		
		
		// Recommended way to compare strings	
		System.out.println("Testing string equality with .equals method");
		if(s3.equals(s1)) {
			System.out.println("s3==s1 is true");			
		}
		else {			
			System.out.println("s3==s1 is false");
		};

	}

}
