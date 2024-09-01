package com.learning_TakesScreenShot_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOf_WebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;  //typecast to TakesScreenshot interface
		
		File src = ts.getScreenshotAs(OutputType.FILE);  //call the method using ts reference variable, and store in File type Variable
		
		File dest = new File("./screenshots/orangeHRM_SS.png");  //Create the file where we want to store SS
		
		FileHandler.copy(src, dest);//Copy SS from RAM to LOcal Memory
		

	}

}
