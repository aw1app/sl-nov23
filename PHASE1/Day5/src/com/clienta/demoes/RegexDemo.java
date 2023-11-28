package com.clienta.demoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		String text = "I am staying at door no 34. You can call me on 900007654 before 3 pm.";
		
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
//		boolean b = matcher.matches();
//		System.out.println(b);
//		
//		if (matcher.matches()) {
//			
//			System.out.println("Yes, there are numbers in the given text!");
//			
//		}else {
//			System.out.println("Text does not have any numbers !!");
//		}
		
		int counter=0;
		while(matcher.find()) {
			System.out.printf("\n Found a match at starting at %s and ending at %s ", matcher.start(), matcher.end());
			counter++;
		};
		
		// Email matching
		String email = "aksingh@yahoo.co.in";
		String emailRegex = "^[a-zA-Z0-9_.-]+@(.+)$";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher emailMatcher = emailPattern.matcher(email);
		
		if(emailMatcher.matches())
		System.out.println("\n The given text is a valid email");
		else System.out.println("\n The given text is NOT a valid email");
		

		// Challenge 5
		// Given any number, check if it is a valid 10 digit phone number
		// and starting with either 7 or 8 or 9.
		// SOLUTION : "^[789]\\d{9}$"
		
		// SOLUTION 2 : ^[789][0-9]{9}$
		
				
				
	}

}
