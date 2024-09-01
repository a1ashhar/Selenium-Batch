package com.SeleniumPraticalTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
        
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		Thread.sleep(2000);
		win.fullscreen();
		Thread.sleep(3000);
		
		Dimension size = win.getSize();
		System.out.println("Size "+size);
		System.out.println("Height "+size.getHeight());
		System.out.println("Width "+size.getHeight());
		
		Point position = win.getPosition();
		System.out.println("Position "+position);
		System.out.println("X-axis "+position.getX());
		System.out.println("Y-axis "+position.getY());
		win.minimize();
		
	}

}

