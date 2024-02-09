package com.ecommerce.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GridTest {
	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeSuite
	public void beforeSuite() {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.WIN10);
		caps.setBrowserName("firefox");
		
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.59.1:4444/wd/hub"), caps);
		} catch (MalformedURLException e) {			
			e.printStackTrace();
		}
		
	}
	
	@AfterSuite
	public void afterSuite() {		
		driver.quit();
	}
	
	
	@Test(groups={"Group1"})
	public void searchGoogleAndTestTitleText() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "searchGoogleAndTestTitleText", Thread.currentThread().getId());

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());

		softAssert.assertEquals(driver.getTitle(), "Google");

		softAssert.assertAll("Google title did not match");
	}
	
	
	@Test(enabled=false, dataProvider = "googleNewUserData")
	public void googleNewAccCreation(String firstName, String lastName) throws InterruptedException {

		String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
		driver.get(baseUrl);

		// Locate the first name feild using id
		WebElement firstNameTF = driver.findElement(By.id("firstName"));
		
		softAssert.assertNotNull(firstNameTF);
		firstNameTF.sendKeys(firstName);

		// Locate the last name feild using name
		WebElement lastNameTF = driver.findElement(By.name("lastName"));
		
		softAssert.assertNotNull(lastNameTF);		
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
