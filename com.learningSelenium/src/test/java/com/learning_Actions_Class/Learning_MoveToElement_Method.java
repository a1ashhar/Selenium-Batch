package com.learning_Actions_Class;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_MoveToElement_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		String xpath = "//div[@class='H6-NpN _3N4_BX']";
		action.moveToElement(driver.findElement(By.xpath(xpath))).perform();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
