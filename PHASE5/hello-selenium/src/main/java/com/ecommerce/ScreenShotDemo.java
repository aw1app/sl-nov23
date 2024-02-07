package com.ecommerce;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {

	static WebDriver driver = new FirefoxDriver();

	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String[] args) throws InterruptedException, IOException {

		driver.get(baseUrlOfTestHtml);

		Thread.sleep(5000);

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File imgTmpFile  = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File("F:\\Users\\home\\git\\sl-nov23\\PHASE5\\hello-selenium\\SS.jpg");
		
		Files.copy(imgTmpFile, destinationFile);
		
		driver.close();

	}

}
