package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath_BY_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		String name = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).getText();
		System.out.println(name);
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(price);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
