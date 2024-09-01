package com.learning_Test_Script;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CreateNewCustomer {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//m1();
		
	//}
		//public static void m1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		String title = driver.getTitle();
		
TakesScreenshot ts1 = (TakesScreenshot) driver;  
		
		File src1 = ts1.getScreenshotAs(OutputType.FILE);  
		
		File dest1 = new File("./screenshots/actiTimeLoginPage_SS.png"); 
		
		FileHandler.copy(src1, dest1);
		
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		Thread.sleep(2000);
		if (title.equals("actiTIME")) {
			System.out.println("Home page is displayed");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@height='98' and @width='84' ])[2]")).click();
		if (title.equals("Tasks")) {
			System.out.println("Open Tasks page is displayed");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		
		if (title.equals("Projects & Customers")) {
			System.out.println("Active Projects & Customers page is dispayed");
			
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@onClick='addCustomer(this.form)']")).click();
		if (title.equals("Create New Customer")) {
			System.out.println("Create New Customer page is displayed");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashhar");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		if (title.equals("Create customer")){
			System.out.println("Account should be created");
		}
		Thread.sleep(3000);
		
	TakesScreenshot ts = (TakesScreenshot) driver;  
		
		File src = ts.getScreenshotAs(OutputType.FILE);  
		
		File dest = new File("./screenshots/actiTimeCreateNewCustomer_SS.png"); 
		
		FileHandler.copy(src, dest);
		
		driver.quit();
		}

	}


