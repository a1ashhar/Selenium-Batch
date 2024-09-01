package com.learning_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IsSelected_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://desktop-b11jro9:8080/login.do");
WebElement checkbox = driver.findElement(By.name("remember"));
System.out.println(checkbox.isSelected());
checkbox.click();
System.out.println(checkbox.isDisplayed());

Thread.sleep(2000);
driver.quit();
	}

}

