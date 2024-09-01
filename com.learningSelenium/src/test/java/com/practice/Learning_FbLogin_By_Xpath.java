package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FbLogin_By_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("ashharfaridi92@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("AshhaR@92");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
