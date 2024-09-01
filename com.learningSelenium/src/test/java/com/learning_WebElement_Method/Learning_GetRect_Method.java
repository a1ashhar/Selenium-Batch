package com.learning_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetRect_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println(loginButton.getRect());//toString() method is overridden
		System.out.println("Height of Web element "+loginButton.getRect().getHeight());
		System.out.println("width of Web element "+loginButton.getRect().getWidth());
		System.out.println("X-Cordinate of Web element "+loginButton.getRect().getX());
		System.out.println("Y-Cordinate of Web element "+loginButton.getRect().getY());
		
		Thread.sleep(2000);
		driver.quit();


	}

}
