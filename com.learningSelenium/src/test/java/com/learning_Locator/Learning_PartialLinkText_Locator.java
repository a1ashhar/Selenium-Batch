package com.learning_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_PartialLinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("License")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
