package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_DragDrop_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement drag = driver.findElement(By.id("box6"));
		WebElement drop = driver.findElement(By.id("box106"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		action.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.id("box102"))).perform();
		action.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("box103"))).perform();

		
		driver.quit();

	}

}
