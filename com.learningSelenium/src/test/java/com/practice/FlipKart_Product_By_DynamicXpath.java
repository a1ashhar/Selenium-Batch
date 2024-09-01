package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Product_By_DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		Thread.sleep(2000);
		
	  List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	  
	  for (WebElement name : mobileNames) {
		  System.out.println(name.getText());
		 
		String mName = name.getText();
		  
     String xpath = "//div[text()='"+mName+"']/../..//div[@class='Nx9bqj _4b5DiR']";
     WebElement mPrice = driver.findElement(By.xpath(xpath));
     System.out.println(mPrice.getText());
     
		
	}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
