package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		Thread.sleep(2000);
		driver.findElement(By.className("textfield")).sendKeys("admin");
		//driver.findElement(By.name("textfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("textfield")).sendKeys("manager");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.className("loginButton")).click();
		Thread.sleep(3000);
		
		//driver.quit();

	}

}
