package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLoginIn_OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		
		//driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}

}
