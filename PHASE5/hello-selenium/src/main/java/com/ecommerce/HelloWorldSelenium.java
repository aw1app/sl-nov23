package com.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {

		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);
		
		System.out.println("Title of webpage "+driver.getTitle());
		
		driver.close();

	}

}
