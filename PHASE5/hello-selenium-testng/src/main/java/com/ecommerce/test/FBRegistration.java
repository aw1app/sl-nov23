package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBRegistration {
	
	public WebDriver driver;
	SoftAssert softAssert =  new SoftAssert();

	
	@BeforeSuite
	public void beforeSuite() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	
		
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}
	
	@Test
	public void fbAccount() {
		
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
		
		System.out.println("Gender is enabled = " + cssGenderRadio.isSelected());
		
		softAssert.assertAll("Either Day or Gender element was not located OR gender selection failed");		
		
	}
	
	@Test
	public void searchGoogleAndTestTitleText() {

		driver.get("http://www.google.com");

		System.out.println("Title of google page is " + driver.getTitle());
		
		softAssert.assertEquals(driver.getTitle(), "Google");
		

		softAssert.assertAll("Google title did not match");		
	}

}
