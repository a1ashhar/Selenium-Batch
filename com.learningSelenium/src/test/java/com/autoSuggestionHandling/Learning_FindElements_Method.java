package com.autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FindElements_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		for (WebElement element : suggestions) {
			System.out.println(element.getText());
		}
		
		for (int i = 0; i < suggestions.size(); i++) {
			WebElement element = suggestions.get(i);
			
			if (element.getText().equals("selenium webdriver")) {
				element.click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
