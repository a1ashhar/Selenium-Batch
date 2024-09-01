package com.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_Product_By_SwitchTo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ocean Green, 128 GB)']")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandle);
		System.out.println(windowHandles);
		
		windowHandles.remove(windowHandle);
		for (String windowID : windowHandles) {

			driver.switchTo().window(windowID);

			//Thread.sleep(2000);
			WebElement mName = driver.findElement(By.xpath("//span[@class='VU-ZEz']"));
			System.out.println(mName.getText());
			
		    WebElement mPrice = driver.findElement(By.xpath("//span[@class='VU-ZEz']/../../..//div[@class='Nx9bqj CxhGGd']"));
		    System.out.println(mPrice.getText());
		    driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();

		    driver.close();
			
			
		}
		driver.switchTo().window(windowHandle);
		WebElement m1Name = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']"));
		System.out.println(m1Name.getText());
		WebElement m1Price = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']/../..//div[text()='₹11,999']"));
		System.out.println(m1Price.getText());
		
		  driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();
		 
		 Thread.sleep(1000);
		
           TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/FlipKart_AddToCart_SS.png");
		
		FileHandler.copy(src, dest);
		
		
		driver.close();
		
		

	}

}
