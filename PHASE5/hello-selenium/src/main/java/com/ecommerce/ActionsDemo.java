package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	static WebDriver driver = new ChromeDriver();

	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(10000);

		//demoDoubleClick();
		//demoMultipleActions() ;
		
		
		demoScrollAction();

		Thread.sleep(5000);
		driver.close();

	}

	static void demoDoubleClick() throws InterruptedException {

		driver.get(baseUrlOfTestHtml);

		WebElement button = driver.findElement(By.id("dblButton"));

		Actions actions = new Actions(driver);

		Thread.sleep(5000);
		
		actions.doubleClick(button).perform();

	}
	
	// Demo multiple actions
	static void demoMultipleActions() throws InterruptedException {

		driver.get(baseUrlOfTestHtml);
		
		WebElement button = driver.findElement(By.id("dblButton"));
		
		WebElement helloPara = driver.findElement(By.id("xyz"));
				
		Actions actions = new Actions(driver);

		Thread.sleep(5000);
		
		
		actions
		.moveToElement(button)
		.click(button)
		.pause(3000)
		.moveToElement(helloPara)
		.pause(3000)
		.doubleClick(helloPara)
		.release()
		.build()
		.perform();
		
		System.out.println("Actions built and executed.");
		
		//actions.perform();
		
		Thread.sleep(5000);
		
	}
	
	static void demoScrollAction() {
		
		driver.get(baseUrlOfTestHtml);
		
		Actions scrollPageActions = new Actions(driver);
		
		scrollPageActions
		.pause(5000)
		.sendKeys(Keys.PAGE_DOWN)
		.pause(5000)
		.sendKeys(Keys.PAGE_DOWN)
		.pause(5000)
		.sendKeys(Keys.PAGE_UP)
		.build()
		.perform();
		
		
	}

}
