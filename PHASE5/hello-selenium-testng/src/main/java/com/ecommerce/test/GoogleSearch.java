package com.ecommerce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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
	
	@Test(groups={"Group2"})
	public void f3() {
		System.out.printf("Inside %s and thread-id is %s \n", "f3 in GoogleSearch class in Group2", Thread.currentThread().getId());
	}
	
	

}
