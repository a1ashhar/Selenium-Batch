package com.learning_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Multi_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
	  WebElement monthDD = driver.findElement(By.xpath("//select[@name='Month']"));
		Thread.sleep(2000);
		
		Select sel = new Select(monthDD);
		System.out.println(sel.isMultiple());
		
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("Feb");
		Thread.sleep(1000);
		sel.selectByVisibleText("March");
		
		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
		
		//sel.deselectByIndex(3);
	//	Thread.sleep(1000);
		//sel.deselectByValue("Feb");
	//	Thread.sleep(1000);
	//	sel.deselectByVisibleText("January");
		
		sel.deselectAll();
		
		driver.quit();
		
		
		
		
		
		


	}

}
