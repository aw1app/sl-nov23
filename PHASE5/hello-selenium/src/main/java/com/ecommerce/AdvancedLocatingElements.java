package com.ecommerce;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLocatingElements {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		demoAdvancedXPathCSSSelector();
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}
	
	
	static void demoAdvancedXPathCSSSelector(){
		String baseUrl = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";
		
		driver.get(baseUrl);
		
		List<WebElement> inputTagElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));
		
		System.out.println(" Size of inputTagElements = "+inputTagElements.size()); // ?? 3		
		
	}

}
