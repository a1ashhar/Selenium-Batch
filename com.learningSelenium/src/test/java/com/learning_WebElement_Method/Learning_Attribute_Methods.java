package com.learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Attribute_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println(loginButton.getAttribute("id"));
		System.out.println(loginButton.getDomAttribute("class"));
		System.out.println(loginButton.getDomProperty("href"));
		
		Thread.sleep(2000);
		driver.quit();
	

	}

}
