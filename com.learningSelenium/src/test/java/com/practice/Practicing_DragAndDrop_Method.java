package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicing_DragAndDrop_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement drag = driver.findElement(By.id("box6"));
		WebElement drop = driver.findElement(By.id("box106"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(drag, drop).perform();
		action.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).perform();
		
		Thread.sleep(2000);
		
		WebElement dragn = driver.findElement(By.id("box6"));
		WebElement dropn = driver.findElement(By.id("capitals"));
		
		Actions actionw = new Actions(driver);
		actionw.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("capitals"))).perform();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
