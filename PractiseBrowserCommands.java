package com.shweta.automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseBrowserCommands {

	//private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// launching the website in the browser
		driver.get("http://google.com");
		
		//Printing Title and Title length
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("The title of page is " + title+ " and the length of title is " + titleLength);
		System.out.println();
		
		// Printing CurrentURL and its length
		String currentUrl = driver.getCurrentUrl();
		int currentURL_len = currentUrl.length();
		System.out.println("The current URL is " + currentUrl + " and the length of currentURL is " + currentURL_len);
		System.out.println();
		
		//Refresh current web page
		driver.navigate().refresh();
		
		//Printing Page Source and its length
		
		String pageSource = driver.getPageSource();
		int pageSourceLen = pageSource.length();
		System.out.println("The Page Source length  is " + pageSourceLen);
		System.out.println();
		
		
		// closing browser
		driver.close();
		


	}

}
