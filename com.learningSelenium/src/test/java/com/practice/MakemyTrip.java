package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']")).click();
driver.findElement(By.xpath("//label[@class='makeFlex column latoRegular']")).click();
driver.findElement(By.xpath("//span[text()='New Delhi Railway Station']")).click();

driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("HWH");
//driver.findElement(By.xpath("//label[@for='toCity']")).click();
driver.findElement(By.xpath("(//span[text()='Kolkata Howrah Junction'])[1]")).click();
driver.findElement(By.xpath("//div[@aria-label='Thu Sep 12 2024']")).click();
driver.findElement(By.xpath("//li[text()='Second AC']")).click();
driver.findElement(By.xpath("//a[text()='Search']")).click();

List<WebElement> allTrains = driver.findElements(By.xpath("//div[@class='train-name']"));

for (WebElement trains : allTrains) {
	System.out.println(trains.getText());
	System.out.println("======================");
	
}
driver.quit();

	}

}
