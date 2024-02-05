package com.ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) throws InterruptedException {

		// Basic configuration
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://chromewebstore.google.com/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd";

		driver.get(baseUrl);

		System.out.println("Title of webpage " + driver.getTitle());

		Thread.sleep(5000);

		driver.close();

	}

}
