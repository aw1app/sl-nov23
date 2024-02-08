package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBRegistration {

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

	@BeforeTest
	public void beforeTest() {
		System.out.printf("Inside %s and thread-id is %s \n", "beforeTest", Thread.currentThread().getId());

	}

	@AfterTest
	public void afterTest() {
		System.out.printf("Inside %s and thread-id is %s \n", "afterTest", Thread.currentThread().getId());

	}

	@BeforeClass
	public void beforeClass() {
		System.out.printf("Inside %s and thread-id is %s \n", "beforeClass", Thread.currentThread().getId());
	}

	@AfterClass
	public void afterClass() {
		System.out.printf("Inside %s and thread-id is %s \n", "afterClass", Thread.currentThread().getId());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.printf("Inside %s and thread-id is %s \n", "beforeMethod", Thread.currentThread().getId());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.printf("Inside %s and thread-id is %s \n", "afterMethod", Thread.currentThread().getId());
	}

	@Test
	public void fbAccount() {
		
		System.out.printf("Inside %s and thread-id is %s \n", "fbAccount", Thread.currentThread().getId());

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);

		String cssDay = "#day";
		WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));

		softAssert.assertNotNull(cssDaySelect);

		Select daySelect = new Select(cssDaySelect);
		daySelect.selectByVisibleText("11");

		WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span > input[type='radio'][value='2']"));
		softAssert.assertNotNull(cssGenderRadio);

		cssGenderRadio.click();

		softAssert.assertTrue(cssGenderRadio.isSelected());

		System.out.println("Gender is enabled = " + cssGenderRadio.isSelected());

		softAssert.assertAll("Either Day or Gender element was not located OR gender selection failed");

	}

	
	
	@Test
	public void f1() {
		System.out.printf("Inside %s and thread-id is %s \n", "f1", Thread.currentThread().getId());
	}
	
	@Test
	public void f2() {
		System.out.printf("Inside %s and thread-id is %s \n", "f2", Thread.currentThread().getId());
	}

}
