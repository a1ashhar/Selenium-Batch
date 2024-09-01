package com.learning_Test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotOf_Createcustomer {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		String title = driver.getTitle();
		
	}

}
