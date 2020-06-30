package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotAccount {

	public static void main(String[] args) throws InterruptedException {
	        
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();	
		
			
		 driver.get("https://www.homedepot.com/account/view/register");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		
	     driver.findElement(By.id("registrationEmail")).sendKeys("abcdtesting2@gmail.com");
	     driver.findElement(By.xpath("//input[@class='checkbox-btn__input u--paddingNone body__p-left-medium ng-untouched ng-pristine ng-invalid']")).sendKeys("abcD1233");
	     driver.findElement(By.id("zipCode")).sendKeys("19446");
	     driver.findElement(By.id("phoneNumber")).sendKeys("2676709240");
	     driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();
         Thread.sleep(5000);   
         
         driver.close();
         driver.quit();
         
 
	}

}
