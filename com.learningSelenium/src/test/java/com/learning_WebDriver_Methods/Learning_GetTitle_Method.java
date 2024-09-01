package com.learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitle_Method {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String title = driver.getTitle();
	 
	if (title.equals("Demo Web Shop")) {
		System.out.println("Welcome Page is displayed successful........");
	}
	else {
		System.out.println("Invalid page found");
	}
	
	
		 

	}

}
