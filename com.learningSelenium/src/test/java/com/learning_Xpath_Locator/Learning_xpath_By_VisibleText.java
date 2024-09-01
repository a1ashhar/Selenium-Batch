package com.learning_Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_xpath_By_VisibleText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String text = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).getText();
		System.out.println(text);
		
		if (text.equals("Shopping cart")) {
			System.out.println("Cart Page is displayed...");
		}
		else
			System.out.println("cart Page is not displayed..");
		
		driver.quit();
	}
}
