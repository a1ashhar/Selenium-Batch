package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ea {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ram@123");
		
		driver.close();
		
	}

}
