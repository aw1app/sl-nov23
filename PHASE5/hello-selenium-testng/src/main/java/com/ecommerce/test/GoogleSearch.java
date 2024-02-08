package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {

	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "beforeSuite", Thread.currentThread().getId());
		
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver_win32
		// (1)\\chromedriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.printf("Inside %s and thread-id is %s \n", "afterSuite", Thread.currentThread().getId());
		
		driver.close();
	}

	
	@Test(groups={"Group1"})
	public void searchGoogleAndTestTitleText() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "searchGoogleAndTestTitleText", Thread.currentThread().getId());

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());

		softAssert.assertEquals(driver.getTitle(), "Google");

		softAssert.assertAll("Google title did not match");
	}
	
	
	@Test(dataProvider = "googleNewUserData")
	public void googleNewAccCreation(String firstName, String lastName) throws InterruptedException {

		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";

		driver.get(baseUrl);

		// Locate the first name feild using id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));

		firstNameTF.sendKeys(firstName);

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.name("lastName"));
		lastNameTF.sendKeys(lastName);
		
		Thread.sleep(10000);
		
	}
	
	@DataProvider(name = "googleNewUserData")
	public Object[][] googleNewUserData() {
		return new Object[][] {

				{ "fname1", "lname1" },
				{ "fname2__2", "lname2__2" }
			};
	}
	
	@Test(groups={"Group2"})
	public void f3() {
		System.out.printf("Inside %s and thread-id is %s \n", "f3 in GoogleSearch class in Group2", Thread.currentThread().getId());
	}
	
	

}
