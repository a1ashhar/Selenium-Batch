package com.practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Options opt = driver.manage();
Window win = opt.window();
win.maximize();
Thread.sleep(2000);
win.minimize();
Thread.sleep(2000);


Dimension size = win.getSize();
System.out.println("Size "+size);
System.out.println("Height "+size.height);
System.out.println("Weidth "+size.width);

Point position = win.getPosition();
System.out.println(position);
System.out.println("X-axis "+position.getX());
System.out.println("Y-axis "+position.getY());

Navigation nav = driver.navigate();
nav.forward();
Thread.sleep(2000);
nav.back();
Thread.sleep(2000);
nav.refresh();

win.fullscreen();
Thread.sleep(3000);
driver.manage().window().minimize();
	}

}