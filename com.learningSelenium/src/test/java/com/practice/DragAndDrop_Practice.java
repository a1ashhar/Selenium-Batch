package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

	
		Actions action = new Actions(driver);
		
		for (int i = 1; i <=7; i++) {
			action.dragAndDrop(driver.findElement(By.id("box"+i)), driver.findElement(By.id("box10"+i))).perform();
			Thread.sleep(1000);
			action.dragAndDrop(driver.findElement(By.id("box"+i)), driver.findElement(By.id("capitals"))).perform();
			Thread.sleep(1000);
			
		}

	}

}
