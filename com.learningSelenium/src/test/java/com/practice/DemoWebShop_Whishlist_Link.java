package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Whishlist_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[4]/a/span[1]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
