package com.ecommerce;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedLocatingElements {
	static WebDriver driver = new FirefoxDriver();

	static String baseUrlOfTestHtml = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

	public static void main(String[] args) throws InterruptedException {

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		// demoAdvancedXPathCSSSelector();
		// demoTableDetails() ;
		// demoExternalElementsAlerts();

		// demoExternalElementsNewTab();

		demoExternalElementsIFrame();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Thread.sleep(5000);
		driver.close();
	}

	// body > div.container-fluid.td-outer > div.td-main > div >
	// aside.d-none.d-xl-block.col-xl-2.td-sidebar-toc.d-print-none

	static void demoExternalElementsIFrame() throws InterruptedException {
		driver.get(baseUrlOfTestHtml);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		driver.switchTo().frame("myframe");
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/button/span[1]/span")).click();
		
		Thread.sleep(5000);
		
		WebDriverWait explicitWaitForAlert = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		explicitWaitForAlert.until(ExpectedConditions.visibilityOfElementLocated(By.id("#docsearch-input")));
		
		driver.findElement(By.id("#docsearch-input")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
	}

	static void demoExternalElementsNewTab() throws InterruptedException {
		driver.get(baseUrlOfTestHtml);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com?q=flowers");
	}

	// External elements (JavaScript alerts)
	static void demoExternalElementsAlerts() throws InterruptedException {

		driver.get(baseUrlOfTestHtml);

		Thread.sleep(5000);

		driver.findElement(By.linkText("See an example alert")).click();

		// alert will appear now, may be in 10 secs
		WebDriverWait explicitWaitForAlert = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the alert to be displayed
		explicitWaitForAlert.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();

		System.out.printf("\n alert text is %s \n", alert.getText());

		Thread.sleep(10000);

		alert.accept();

	}

	static void demoAdvancedXPathCSSSelector() {
		String baseUrl = "file:///F:/Users/home/git/sl-nov23/PHASE5/hello-selenium/src/main/resources/test.html";

		driver.get(baseUrl);

		List<WebElement> inputTagElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println(" Size of inputTagElements = " + inputTagElements.size()); // ?? 3

		// Using CSS
		List<WebElement> inputTagElementsUsingCSS = driver.findElements(By.cssSelector("input[id*='admin']"));

		System.out.println(" Size of inputTagElementsUsingCSS = " + inputTagElementsUsingCSS.size()); // ?? 3

		List<WebElement> inputXYZInIDElementsUsingCSSSelectors2 = driver
				.findElements(By.cssSelector("input[id$='xyz']"));
		System.out.println("input  whose ids end with xyz " + inputXYZInIDElementsUsingCSSSelectors2.size()); // 2

		WebElement h4SecondChildInsideDiv = driver.findElement(By.cssSelector("div[id='eCommerce'] h4:nth-child(2)"));
		System.out.println("h4SecondChildInsideDiv text is " + h4SecondChildInsideDiv.getText()); // h4 second

		// Locate and Process multi select list
		WebElement selectMonthElement = driver.findElement(By.id("month"));

		Select selectMonth = new Select(selectMonthElement);
		System.out.printf("\n selectMonth.isMultiple() = %s", selectMonth.isMultiple());

		selectMonth.selectByIndex(0); // Select Jan
		selectMonth.selectByIndex(3); // also select Apr
		selectMonth.selectByIndex(6); // and July

		// verify the selections (Jan, Apr, July)
		List<WebElement> allMonthsSelected = selectMonth.getAllSelectedOptions();
		for (WebElement monthOption : allMonthsSelected) {
			System.out.printf("\n option selected = %s", monthOption.getText());
		}
	}

	// Locate and Process Table (no of rows, no of columns, particular cell data,
	// etc)
	static void demoTableDetails() throws InterruptedException {

		String baseUrl = "https://www.nyse.com/ipo-center/recent-ipo";
		driver.get(baseUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String tableXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table";

		String tableXPathRow = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/tbody/tr";

		List<WebElement> rowList = driver.findElements(By.xpath(tableXPathRow));

		System.out.printf("\n No of rows in IPO table = %s", rowList.size());

		// Column count

		String tableXPathHeading = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/thead/tr/th";

		List<WebElement> colsList = driver.findElements(By.xpath(tableXPathHeading));

		System.out.printf("\n No of columns in IPO table = %s  \n", colsList.size());

		// Finding cell value at ith row and jth colum (3,4)
		/// html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/table/tbody/tr[3]/td[4]
		String cellAddressXPath = tableXPath + "/tbody/tr[3]/td[4]";
		WebElement cellAddress = driver.findElement(By.xpath(cellAddressXPath));

		String value = cellAddress.getText();
		System.out.println("The Cell Value at 3R, 4C is : " + value);

		// Change the cell contents using JS
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) >
		// div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > table > tbody >
		// tr:nth-child(3) > td:nth-child(2)

		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // NOT
		// working
		String myJS = "var e =document.querySelector(\"body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(2)\"); e.textContent='IPL Cricket'";

		Thread.sleep(10000);

		js.executeScript(myJS);

	}

}
