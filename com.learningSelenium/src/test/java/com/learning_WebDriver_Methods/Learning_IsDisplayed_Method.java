package com.learning_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IsDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		WebElement usernameTextField = driver.findElement(By.name("username"));

		System.out.println(usernameTextField.isDisplayed());
		
		if(usernameTextField.isDisplayed()) {
			usernameTextField.sendKeys("admin");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
