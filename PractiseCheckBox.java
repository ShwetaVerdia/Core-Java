package com.shweta.automationframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/automation-practice-form/");

		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		boolean bValue = false;
		bValue = rdBtn_Sex.get(0).isSelected();
		if (bValue) {
			rdBtn_Sex.get(1).click();

		} else {
			rdBtn_Sex.get(0).click();
		}

		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();

		List<WebElement> ckBox_Prof = driver.findElements(By.name("profession"));
		int iSize = ckBox_Prof.size();
		for (int i = 0; i < iSize; i++) {
			String sValue = ckBox_Prof.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase("Automation Tester")) {
				System.out.println("Reached Profession Checkbox");
				ckBox_Prof.get(i).click();
				break;
			}

		}

		WebElement ckBox_Tool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		ckBox_Tool.click();

	}
}