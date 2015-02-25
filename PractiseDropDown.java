package com.shweta.automationframework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.toolsqa.com/automation-practice-form");
		Select oSelection = new Select(driver.findElement(By.id("continents")));
		oSelection.selectByVisibleText("Europe");
		System.out.println("Selected Europe");
		Thread.sleep(5000);
		
		oSelection.selectByIndex(2);
		System.out.println("Selected Africa");
		Thread.sleep(5000);
		
		List<WebElement> drop_Cont = oSelection.getOptions();
		int drop_Cont_Size = drop_Cont.size();
		for(int i=0; i<drop_Cont_Size;i++){
			String cont_Value =oSelection.getOptions().get(i).getText();
			System.out.println(cont_Value);
			if(cont_Value.equals("Africa")){
				System.out.println("Reached this loop");
				oSelection.selectByIndex(i);
				break;
			}
			
			
		}
		
		driver.close();
		
	}

}
