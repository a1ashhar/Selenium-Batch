package com.learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Close_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.getPageSource();
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		Thread.sleep(2000);
		driver.close();
		

	}

	
}
