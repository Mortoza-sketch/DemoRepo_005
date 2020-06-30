package BootCamp;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaAccountdemo {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();	
		 
		 driver.get("https://www.expedia.com/Flights");	
		 //driver.get("https://www.expedia.com/");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		
	     //Click on Flights Tab
	     driver.findElement(By.id("primary-header-flight")).click(); 
	     Thread.sleep(2000);
	     //Fill the form to search flight for roundtrip and click on search button
	     driver.findElement(By.id("flight-origin-flp")).sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
	     Thread.sleep(2000);
	     driver.findElement(By.id("flight-destination-flp")).sendKeys("Dallas, TX (DFW-Dallas-Fort Worth Intl.)");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='flight-departing-flp']")).sendKeys("4/18/2020");
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
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]")).click(); 
        Thread.sleep(2000);
     	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[12]/section[1]/div[1]/div[12]/ul[1]/li[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click(); 
     	 Thread.sleep(2000);
     	 driver.findElement(By.xpath("//a[@id='forcedChoiceNoThanks']")).click();  
     	 Thread.sleep(2000);
     	 
     	 Iterator<String> iterator = driver.getWindowHandles().iterator();
		 iterator.next();
		 String current = iterator.next();
		 driver.switchTo().window(current);
        
		 //Continue the Booking button
		 driver.findElement(By.xpath("//button[@id='bookButton']")).click();
		 Thread.sleep(3000);
		 
		//Fill Passenger Information
		 driver.findElement(By.id("firstname[0]")).sendKeys("Arafath");
		 Thread.sleep(2000);
		 driver.findElement(By.id("lastname[0]")).sendKeys("Rahman");
		 Thread.sleep(2000);
        driver.findElement(By.id("phone-number[0]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("gender_male[0]")).click();
        Thread.sleep(2000);
        
        Select drop1=new Select(driver.findElement(By.id("date_of_birth_month0")));
        drop1.selectByVisibleText("04 - Apr");
        Thread.sleep(2000);
        Select drop2=new Select(driver.findElement(By.id("date_of_birth_day[0]")));
        drop2.selectByVisibleText("09");
        Thread.sleep(2000);
        Select drop3=new Select(driver.findElement(By.id("date_of_birth_year[0]")));
        drop3.selectByVisibleText("1994");
        Thread.sleep(2000); 
        //driver.findElement(By.id("seat-map-button")).click();   
        
        /*Select drop=new Select(driver.findElement(By.id("date_of_birth_month0")));
        drop.selectByVisibleText("04 - Apr");
        Select drop2=new Select(driver.findElement(By.id("date_of_birth_day[0]")));
        drop2.selectByVisibleText("09");
        Select drop3=new Select(driver.findElement(By.id("date_of_birth_year[0]")));
        drop3.selectByVisibleText("1990"); 
        driver.findElement(By.id("seat-map-button")).click();*/
        
       /* driver.findElement(By.xpath("//option[contains(text(),'04 - Apr')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[14]/section[2]/article[1]/form[1]/fieldset[1]/fieldset[1]/div[1]/fieldset[3]/label[2]/select[1]/option[10]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1993')]")).click(); 
        driver.findElement(By.id("seat-map-button")).click();    */
        
 /*     driver.findElement(By.xpath("//label[@class='text cc-cardholder-name']//input[@name='creditCards[0].cardholder_name")).sendKeys("Arafath Rahman"); 
        Thread.sleep(2000);
        
        driver.findElement(By.id("creditCardInput")).sendKeys("123456789");
        Thread.sleep(2000);
        
        Select drop4=new Select(driver.findElement(By.xpath("//select[contains(@name,'creditCards[0].expiration_month")));
        drop4.selectByVisibleText("03-Mar");
        Thread.sleep(2000);
        Select drop5=new Select(driver.findElement(By.xpath("//select[contains(@name,'creditCards[0].expiration_year")));
        drop5.selectByVisibleText("2022");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='new_cc_security_code']")).sendKeys("532");        
        Thread.sleep(2000); 
        
        driver.findElement(By.xpath("//input[@placeholder='(ex. 123 Main)']")).sendKeys("1234 Main Street");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='creditCards[0].city")).sendKeys("Hatfield");
        Thread.sleep(2000);
        
        Select drop6=new Select(driver.findElement(By.id("//select[contains(@name,'creditCards[0].state")));
        drop6.selectByVisibleText("PA");
        
        driver.findElement(By.xpath("//input[@name='creditCards[0].zipcode")).sendKeys("1234");
        Thread.sleep(2000); */
        
        driver.findElement(By.xpath("//fieldset[contains(@class,'email-margin create-account-enabled')]//input[@name='email']")).sendKeys("abcdtesting3@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='account-creation']//input[@name='password']")).sendKeys("abcD1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'repeat_password')]")).sendKeys("abcD1234");
        Thread.sleep(2000);
        driver.findElement(By.id("complete-booking")).click();
        Thread.sleep(2000);
        
        driver.close();
        driver.quit();	

	}

}
