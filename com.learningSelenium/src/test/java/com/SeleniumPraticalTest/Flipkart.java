package com.SeleniumPraticalTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Welcome Page is displayed-----");
		}
		else
			System.out.println("Invalid page");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.flipkart.com/")) {
			System.out.println("Valid Page is displayed");
		}
		else
			System.out.println("Invalid page is displayed");
		
	      driver.navigate().to("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(2000);
		title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com")) {
			System.out.println("Login Page is displayed---");
		}
		else
			System.out.println("Invalid Page is displayed");
		  url = driver.getCurrentUrl();
		  System.out.println(url);
		
		if (url.equals("https://www.flipkart.com/account/login?ret=/")) {
			System.out.println("Login Page is displayed");
		}
		else 
		System.out.println("Invalid Page is displayed");
		
		 driver.navigate().to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		
		
	}

}
