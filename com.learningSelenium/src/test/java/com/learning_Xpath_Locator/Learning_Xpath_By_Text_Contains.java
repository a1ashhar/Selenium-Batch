package com.learning_Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Text_Contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'License ')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Actimind ')]")).click();
		//driver.close();
		
		driver.quit();

	}

}
