package com.learning_SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Single_Select_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		WebElement minDropDwn = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		
		Select sel = new Select(minDropDwn);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("20000");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("₹30000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
		
		driver.quit();

	}

}
