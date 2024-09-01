package com.learning_WebDriver_Methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Manage_Method {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		int y_axis = driver.manage().window().getPosition().getY();
	    System.out.println(y_axis);	
	    int height = driver.manage().window().getSize().getHeight();
	    System.out.println(height);
	    
	    Dimension size = driver.manage().window().getSize();
	    System.out.println("size "+size);
	    System.out.println("Height "+size.getHeight());
	    System.out.println("Weidth "+size.getWidth());
	    
	   Point position = driver.manage().window().getPosition();
	   System.out.println("position "+position);
	   System.out.println("x-axis "+position.getX());
	   System.out.println("y-axix "+position.getY());
	    
	    
	}

}

