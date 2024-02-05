package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsDemo {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting googleNewAccCreation automation");
		Thread.sleep(10000);

		googleNewAccCreation();
		
		Thread.sleep(5000);
		driver.close();
	}
	
	// google New Acc Creation
	public static void googleNewAccCreation() {
		
		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
		
		driver.get(baseUrl);
		
		// Locate the first name feild using id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));
		
		firstNameTF.sendKeys("Muthu");
		
		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.name("lastName"));				
		lastNameTF.sendKeys("Varma");
		
		//Locate the button using class
		WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextButton.click();			
	}

}
