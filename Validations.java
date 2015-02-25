package com.shweta.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Validations {

	public void TestApp() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://gmail.com");
		String expectedTitle = "Gmail";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
}
