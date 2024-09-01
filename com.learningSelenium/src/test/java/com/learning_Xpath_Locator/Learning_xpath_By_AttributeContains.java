package com.learning_Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_xpath_By_AttributeContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@onclick,'login')]")).click();
		
		driver.quit();

	}

}
