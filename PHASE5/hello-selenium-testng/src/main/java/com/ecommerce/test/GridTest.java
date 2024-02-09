package com.ecommerce.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class GridTest {
	public WebDriver driver;
	
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

}
