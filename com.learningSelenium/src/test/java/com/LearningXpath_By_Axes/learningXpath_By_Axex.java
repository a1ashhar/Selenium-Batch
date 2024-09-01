package com.LearningXpath_By_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningXpath_By_Axex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?semcmpid=sem_6143003030_BU_Lifestyle_Text_MenAccessories_goog&cmpid=sem_3856208402_Mobiles_dsa_goog&gad_source=1&gclid=CjwKCAjwrcKxBhBMEiwAIVF8rFvR7APNF4bq23hqTLiFuvdTgmdH5hXdNWncN4OArFpXd4WrTW3M_xoCmS0QAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung s24 ultra");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		String pname = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)']")).getText();
		
		String price = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[contains(@class,'DiR')]")).getText();
		System.out.println(pname);
		System.out.println(price);
		
		Thread.sleep(3000);
		driver.quit();

	}

	
}
