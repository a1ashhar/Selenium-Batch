package com.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_OpenMultipleTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		for (int i = 1; i < 6; i++) {
			
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])["+i+"]")).click();
			
		}
		String windowHandle = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(windowHandle);
		
		for (String windowID : windowHandles)
		{
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			String title2 = driver.getTitle();
			
	    if (title2.equals("MOTOROLA G34 5G ( 128 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com")) 
	    {
	    	//System.out.println(driver.findElement(By.xpath("//span[@class='VU-ZEz']")).getText());
	    	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	    	driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();
	    	
	    	TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/flipkartProduct.png");
			FileHandler.copy(src, dest);
			driver.close();
	    }
	    else {
	    	Random random = new Random();
			int num = random.nextInt(1000);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/flipkart_"+num+".png");
			FileHandler.copy(src, dest);
			driver.close();
	    }
	    
	    }

		
		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/FlipKart2.png");
		FileHandler.copy(src, dest);	
		driver.close();

	}

}
