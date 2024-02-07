package com.ecommerce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadDemo {
	
	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String args[]) throws IOException, InterruptedException {
		
		uploadFileDemo();
		
		//uploadFileUsingAutoITScript();
		
	}
	
	
	public static void uploadFileDemo() throws IOException, InterruptedException {
		// Instantiation of driver object. To launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		//String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrlOfTestHtml);

		Thread.sleep(10000);

		WebDriverWait explicitWaitForAlert = new WebDriverWait(driver, Duration.ofSeconds(30));

		explicitWaitForAlert.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadPicture")));

		WebElement uploadFileElememt = driver.findElement(By.id("uploadPicture"));
		//uploadFileElememt.click();
		uploadFileElememt.sendKeys("F:\\Users\\home\\git\\sl-nov23\\UploadFile.txt");		
		
		Thread.sleep(10000);
		
		// 'close' method is used to close the browser window
		driver.close();

	}
	
	
	public static void uploadFileUsingAutoITScript() throws IOException, InterruptedException {
		// Instantiation of driver object. To launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		//String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrlOfTestHtml);

		Thread.sleep(10000);

		WebDriverWait explicitWaitForAlert = new WebDriverWait(driver, Duration.ofSeconds(30));

		explicitWaitForAlert.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadPicture")));

		WebElement uploadFileElememt = driver.findElement(By.id("uploadPicture"));
		
		Actions actions = new Actions(driver);
		actions.click(uploadFileElememt).click().perform();

		System.out.println("uploadFileElememt details " + uploadFileElememt);

		Thread.sleep(5000);
		// To call the AutoIt script
		Runtime.getRuntime().exec("F:\\AutoIT-Projects\\fileupload.exe");
		
		Thread.sleep(5000);
		
		// 'close' method is used to close the browser window
		driver.close();

	}

}
