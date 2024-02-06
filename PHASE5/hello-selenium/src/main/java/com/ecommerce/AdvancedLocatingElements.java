package com.ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedLocatingElements {
	static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		demoAdvancedXPathCSSSelector();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.close();
	}

	static void demoAdvancedXPathCSSSelector() {
		String baseUrl = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

		driver.get(baseUrl);

		List<WebElement> inputTagElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println(" Size of inputTagElements = " + inputTagElements.size()); // ?? 3

		// Using CSS
		List<WebElement> inputTagElementsUsingCSS = driver.findElements(By.cssSelector("input[id*='admin']"));

		System.out.println(" Size of inputTagElementsUsingCSS = " + inputTagElementsUsingCSS.size()); // ?? 3

		List<WebElement> inputXYZInIDElementsUsingCSSSelectors2 = driver.findElements(By.cssSelector("input[id$='xyz']"));
		System.out.println("input  whose ids end with xyz " + inputXYZInIDElementsUsingCSSSelectors2.size()); // 2
		
		
		WebElement h4SecondChildInsideDiv = driver.findElement(By.cssSelector("div[id='eCommerce'] h4:nth-child(2)"));
		System.out.println("h4SecondChildInsideDiv text is " + h4SecondChildInsideDiv.getText()); // h4 second
		
		
		// Locate and Process multi select list
		WebElement selectMonthElement = driver.findElement(By.id("month"));
		
		Select selectMonth = new Select(selectMonthElement);
		System.out.printf("\n selectMonth.isMultiple() = %s", selectMonth.isMultiple());
		
		selectMonth.selectByIndex(0);
		selectMonth.selectByIndex(3);
		selectMonth.selectByIndex(6);
		
		List<WebElement> allMonthsSelected = selectMonth.getAllSelectedOptions();
		for (WebElement monthOption : allMonthsSelected) {
			System.out.printf("\n option selected = %s", monthOption.getText());
		}

	}

}
