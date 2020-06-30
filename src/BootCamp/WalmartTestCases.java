package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartTestCases {

	public static void main(String[] args) throws InterruptedException {
		
	/*	● Log In.
		● Click on navigation.
		● Read available features.
		● Browser through the products.
		● Search Items.
		● Sign Out. */

		
//		● Log In.
       System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.walmart.com/account/login?ref=domain");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	    
	    //Log In
	/*  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mz.tamjid@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("m@ze_runner88");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
        Thread.sleep(3000); */
        
        //Navigation Tab & Search items
 /*	   System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.walmart.com");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys("Men Watch");
        driver.findElement(By.xpath("//button[@id='global-search-submit']//img")).click();
        
        driver.findElement(By.xpath("//li[2]//div[1]//div[2]//div[5]//div[1]//a[1]")).click();
	    driver.findElement(By.xpath("//span[@class='spin-button-children']")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
        driver.navigate().to("https://www.walmart.com/");   */ 
	    
    //  ● Log In & Sign Out. 
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mz.tamjid@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("m@ze_runner88");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'MT')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign Out')]")).click();   
		

	}

}
