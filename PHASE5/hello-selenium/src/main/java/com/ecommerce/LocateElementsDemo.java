package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateElementsDemo {

	// static WebDriver driver = new ChromeDriver();
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting googleNewAccCreation automation");
		Thread.sleep(10000);

		//googleNewAccCreation();
		
		facebookAccCreation();

		Thread.sleep(5000);
		driver.close();
	}

	public static void facebookAccCreation() throws InterruptedException {

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);
		
		//The Day Dropdown
		String fullXPathOfDayDropDown = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
		WebElement daySelectElement = driver.findElement(By.xpath(fullXPathOfDayDropDown)); 
		Select select = new Select(daySelectElement);
		select.selectByValue("11");
		

	}

	// google New Acc Creation
	public static void googleNewAccCreation() throws InterruptedException {

		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";

		driver.get(baseUrl);

		// Locate the first name feild using id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));

		firstNameTF.sendKeys("Muthu");

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.name("lastName"));
		lastNameTF.sendKeys("Varma");

		// Locate the button using class
		WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextButton.click();

		// This drop down is next screen, after the above "Next" button is clicked
		// WebElement monthSelectElement = driver.findElement(By.id("month")); //
		// locating did not work here.

		Thread.sleep(5000);

		// Locate by XPath
		String xPathOfMonth = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div/div/div[2]/select";
		WebElement monthSelectElement = driver.findElement(By.xpath(xPathOfMonth)); // NOT WORKING

		// String cssSelectorForMonth = "#month";
		// WebElement monthSelectElement =
		// driver.findElement(By.cssSelector(cssSelectorForMonth));
		// Now select June month
		Select select = new Select(monthSelectElement);
		select.selectByValue("6");
	}

}
