package com.shweta.automationframework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseMultySelect {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://www.toolsqa.com/automation-practice-form");
			Select sel = new Select(driver.findElement(By.name("selenium_commands")));
			sel.selectByIndex(0);
			Thread.sleep(2000);
			sel.deselectByIndex(0);
			Thread.sleep(2000);
			
			sel.selectByVisibleText("Navigation Commands");
			Thread.sleep(2000);
			sel.deselectByVisibleText("Navigation Commands");
			
			List <WebElement> list_sel_cmd = sel.getOptions();
			int lSize= list_sel_cmd.size();
			for(int i=0; i<lSize;i++){
				String sel_val = sel.getOptions().get(i).getText();
				System.out.println(sel_val);
				sel.selectByIndex(i);
				Thread.sleep(1000);
			}
			
			sel.deselectAll();
			
			driver.close();
	}

}
