package BootCamp;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CodeFromMohammad {

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
	     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[4]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
        
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
        Iterator<String> iterator = driver.getWindowHandles().iterator();
		  iterator.next();
		  String current = iterator.next();
		  driver.switchTo().window(current);
        //Click on “No thanks” for pop-up
        //Click on continue booking button
        driver.findElement(By.id("bookButton")).click();        
        //Fill the passenger’s information
        driver.findElement(By.id("firstname[0]")).sendKeys("Mohamed");
        driver.findElement(By.id("lastname[0]")).sendKeys("Andjouh");
        driver.findElement(By.id("phone-number[0]")).sendKeys("2672476557");
         driver.findElement(By.id("gender_male[0]")).click();
        Select drop=new Select(driver.findElement(By.id("date_of_birth_month0")));
        drop.selectByVisibleText("01 - Jan");
        Select drop2=new Select(driver.findElement(By.id("date_of_birth_day[0]")));
        drop2.selectByVisibleText("17");
        Select drop3=new Select(driver.findElement(By.id("date_of_birth_year[0]")));
        drop3.selectByVisibleText("1993");
        driver.findElement(By.id("seat-map-button")).click();
	}

	

	}


