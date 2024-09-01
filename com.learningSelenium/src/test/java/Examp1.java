import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Examp1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);

		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

		for (int i = 0; i < mobiles.size(); i++) {

			String mobileName = mobiles.get(i).getText();

			String mobilePrice = prices.get(i).getText();
// System.out.println("Mobile Name: " + mobileName);

			System.out.println("Mobile Name: " + mobileName + ", Price : " + mobilePrice);

		}
		driver.quit();
	}
}
