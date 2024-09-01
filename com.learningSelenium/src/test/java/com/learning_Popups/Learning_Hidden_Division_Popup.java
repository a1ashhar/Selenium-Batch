package com.learning_Popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Learning_Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b11jro9:8080/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title = driver.getTitle();
driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
driver.findElement(By.xpath("(//img[@height='98' and @width='84' and  @class='sizer'])[1]")).click();
driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
driver.findElement(By.id("customer1")).click();
driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();

Thread.sleep(2000);
TakesScreenshot ts = (TakesScreenshot) driver;

File src = ts.getScreenshotAs(OutputType.FILE);  

File dest = new File("./screenshots/Confirm Project Deletion_SS.png");  

FileHandler.copy(src, dest);
driver.findElement(By.id("deleteButton")).click();


		

	}

}
