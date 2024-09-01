package com.learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigation_Method {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.navigate().to("https://demowebshop.tricentis.com/cart");
		
	}

}
