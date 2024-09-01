package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicing_DragAndDrop_Method2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

	
		Actions action = new Actions(driver);
		
		
		action.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.id("box101"))).perform();
		Thread.sleep(2000);
		action.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.id("box102"))).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("box103"))).perform();
		Thread.sleep(2000);

		action.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.id("box104"))).perform();
		Thread.sleep(2000);

		action.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("box105"))).perform();
		Thread.sleep(2000);

		action.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).perform();
		Thread.sleep(2000);
		
		action.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.id("box107"))).perform();
		Thread.sleep(2000);



		
		action.clickAndHold(driver.findElement(By.id("box1"))).release(driver.findElement(By.id("capitals"))).perform();
		
		Thread.sleep(2000);
		action.clickAndHold(driver.findElement(By.id("box2"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		action.clickAndHold(driver.findElement(By.id("box3"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		action.clickAndHold(driver.findElement(By.id("box4"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		action.clickAndHold(driver.findElement(By.id("box5"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		action.clickAndHold(driver.findElement(By.id("box6"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		action.clickAndHold(driver.findElement(By.id("box7"))).release(driver.findElement(By.id("capitals"))).perform();
		Thread.sleep(2000);

		driver.quit();
		

	}

}
