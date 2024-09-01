package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=10066328454113951932&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007765&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		
       String title =  driver.getTitle();
       
       if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
       System.out.println(title);
       System.out.println("Welcome Page is displayed ======");
		
	}
       else {
    	   System.out.println("Invalid Page is found");
       }
            String url = driver.getCurrentUrl();
            System.out.println(url);
            if (url.equals("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=10066328454113951932&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007765&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1")) {
            	System.out.println("Valid Page is displayed");
            }
            else
            	System.out.println("Invalid Page ");
            
           String sourcecode = driver.getPageSource();
           System.out.println(sourcecode );
           
           driver.manage().window().maximize();
           Thread.sleep(2000);
           driver.manage().window().fullscreen();
           Thread.sleep(2000);
           
           driver.navigate().forward();
           Thread.sleep(2000);
          
           driver.navigate().refresh();
           Thread.sleep(2000);
           
           driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
           Thread.sleep(5000);
           driver.navigate().back();
           Thread.sleep(8000);
           driver.manage().window().minimize();
	}       
}
