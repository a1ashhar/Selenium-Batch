package com.learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FileUpload_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Lenovo\\Pictures\\Screenshots\\Screenshot (1).png");
		driver.findElement(By.id("file-submit")).submit();

	}

}
