package com.learning_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Window_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("License for using this software")).click();
		Thread.sleep(2000);
		 String windowHandle = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
		 System.out.println(windowHandle);
		 System.out.println(windowHandles);
		 
		windowHandles.remove(windowHandle);
		
		for (String windowID : windowHandles) {
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
		driver.close();
			
		}
		
		driver.switchTo().window(windowHandle);
		driver.close();
		 
		


	}

}
