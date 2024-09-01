package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Opening_Multiple_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		
	
		
		
			//List<WebElement> opentabs = driver1.findElements(By.xpath("WebDriver driver = new ChromeDriver()"));
		
	        for (int i = 1; i < 6; i++) {
		// WebElement opentabs = driver.findElement(By.xpath("((//div[@class='KzDlHZ'])[i]"));
	//	System.out.println(opentabs.getText());

	        	
	        
		
	            
		
	}
		 

		}}


