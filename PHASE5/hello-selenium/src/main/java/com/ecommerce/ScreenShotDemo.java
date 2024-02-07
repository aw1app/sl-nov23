package com.ecommerce;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotDemo {

	static WebDriver driver = new FirefoxDriver();

	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String[] args) throws InterruptedException, IOException {

		driver.get(baseUrlOfTestHtml);

		Thread.sleep(5000);

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);

		File destinationFile = new File("F:\\Users\\home\\git\\sl-nov23\\PHASE5\\hello-selenium\\SS.jpg");

		Files.copy(imgTmpFile, destinationFile);
		
		
		//Now, Take a screenshot after double clicking the button 
		WebElement button = driver.findElement(By.id("dblButton"));
		Actions actions = new Actions(driver);		
		actions.doubleClick(button).perform();
		
		imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
		destinationFile = new File("F:\\Users\\home\\git\\sl-nov23\\PHASE5\\hello-selenium\\SS1.jpg");
		Files.copy(imgTmpFile, destinationFile);

		driver.close();

	}

}
