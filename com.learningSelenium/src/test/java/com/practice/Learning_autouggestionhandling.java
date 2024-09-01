package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_autouggestionhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone mobile");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		Thread.sleep(2000);
		for (WebElement element : suggestions) {
			System.out.println(element.getText());
		}
		
		for (int i = 0; i < suggestions.size(); i++) {
			WebElement element = suggestions.get(i);
			
			if (element.getText().equals("iphone 15 plus")) {
				element.click();
				break;
			}
			
		}
		
	//	Thread.sleep(2000);
		driver.quit();
	}

	}



	


