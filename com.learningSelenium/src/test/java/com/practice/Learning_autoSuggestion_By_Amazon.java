package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_autoSuggestion_By_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//public static void main (String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.name("//div[s='nav-search-field ']")).sendKeys("jacket");
			Thread.sleep(2000);
			List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
			Thread.sleep(2000);
			for (WebElement element : suggestions) {
				System.out.println(element.getText());
			}
			
			for (int i = 0; i < suggestions.size(); i++) {
				WebElement element = suggestions.get(i);
				
				if (element.getText().equals("jacket for men")) {
					element.click();
					break;
				}
				
			}
			
		//	Thread.sleep(2000);
			//driver.quit();
		}

		


	

}
