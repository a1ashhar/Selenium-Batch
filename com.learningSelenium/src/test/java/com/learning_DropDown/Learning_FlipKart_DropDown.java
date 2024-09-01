package com.learning_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_FlipKart_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement minDD = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		
		Select sel = new Select(minDD);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("30000");
		Thread.sleep(1000);
		sel.selectByVisibleText("₹15000");
		
		List<WebElement> options = sel.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
			
			if (option.getText().equals("30000")) {
				sel.selectByValue(option.getAttribute("value"));
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
