package com.learning_Test_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewProject extends CreateNewCustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		String title = driver.getTitle();
		
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
		
		driver.findElement(By.xpath("//select[@name='selectedCustomer']")).sendKeys("Ashhar");
		
		driver.findElement(By.xpath("//input[@type='button' and @value='Create New Project' ]")).click();
		Thread.sleep(1000);
		if (title.equals("Create New Project")) {
			System.out.println("Create New Project page should displayed");
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("EcoMav");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
	//driver.quit();
		
		
		
		
		

	}

}
