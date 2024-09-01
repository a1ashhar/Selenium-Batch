package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Without_Entering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);

		
		driver.findElement(By.id("datepicker")).click();

		 String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	

	// System.out.println(month.getText()+" "+year.getText());
	 
	 while(true) {
		 driver.findElement(By.xpath("//span[text()='Prev']")).click();
		 
		if((month.equals("April") && year.equals("2024")){
		 //System.out.println(driver.findElement(By.className("ui-datepicker-title")).getText());
		 
		 
	 }
	 driver.findElement(By.xpath("//a[text()='15']")).click();
	

	}

	}}
