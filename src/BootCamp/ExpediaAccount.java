package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpediaAccount {

	     public static void main(String[] args) throws InterruptedException {
    
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();	
		 
		 driver.get("https://www.expedia.com/Flights");	
		 //driver.get("https://www.expedia.com/");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		
	     driver.findElement(By.id("primary-header-flight")).click(); 
	     Thread.sleep(2000);
	     driver.findElement(By.id("flight-origin-flp")).sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
	     Thread.sleep(2000);
	     driver.findElement(By.id("flight-destination-flp")).sendKeys("Dallas, TX (DFW-Dallas-Fort Worth Intl.)");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='flight-departing-flp']")).sendKeys("4/17/2020");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("#flight-returning-flp")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	     driver.findElement(By.cssSelector("#flight-returning-flp")).sendKeys("4/22/2020");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='cols-nested ab25184-submit']//button[@class='btn-primary btn-action gcw-submit']")).click();
         Thread.sleep(2000);
	     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]").click();
         
       
        
         

	}

}
