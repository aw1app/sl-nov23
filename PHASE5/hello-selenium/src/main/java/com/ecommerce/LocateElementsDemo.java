package com.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsDemo {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		

	}
	
	// google New Acc Creation
	public static void testCase1() {
		
		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
		
		driver.get(baseUrl);
		
		
		
	}

}
