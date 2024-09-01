package com.learning_TakesScreenShot_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		File src = registerLink.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/registerLink_SS.jpeg");
		FileHandler.copy(src, dest);
		
		driver.quit();
		

	}

}
