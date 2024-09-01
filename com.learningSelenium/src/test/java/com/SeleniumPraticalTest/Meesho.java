package com.SeleniumPraticalTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
	Options opt = driver.manage();
	Window win = driver.manage().window();
	
     win.maximize();
	Thread.sleep(2000);
	win.fullscreen();
	Thread.sleep(3000);
	Dimension size = win.getSize();
	System.out.println(size);
	System.out.println("Height "+size.height);
	System.out.println("Weidth "+size.width);
	
	Point position = win.getPosition();
	System.out.println("Position "+position);
	System.out.println("X-axix "+position.getX());
	System.out.println("Y-axix "+position.getY());
	
	  win.minimize();
	}

}



