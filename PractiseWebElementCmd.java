package com.shweta.automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseWebElementCmd {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get( "http://www.toolsqa.com/automation-practice-form/");
		
		//Type first name
		driver.findElement(By.name("firstname")).sendKeys("shweta");
		
		//Type Last name
		driver.findElement(By.name("lastname")).sendKeys("verdia");
		
		//click on submit
		driver.findElement(By.id("submit")).click();
		
		String sClass = driver.findElements(By.tagName("button")).toString();
		 
        System.out.println(sClass);
		
		driver.close();
		
		
	}

}
