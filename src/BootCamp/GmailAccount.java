package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {

	public static void main(String[] args) throws InterruptedException {
    
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();	
			
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp\r\n"+"");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
         
	     
	     driver.findElement(By.id("firstName")).sendKeys("Arafath");
	     Thread.sleep(2000);
	     driver.findElement(By.id("lastName")).sendKeys("Rahman");
	     Thread.sleep(2000);
	     driver.findElement(By.id("username")).sendKeys("Arafath999998");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("abcD@123456");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("abcD@123456");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("4676909560");
	     Thread.sleep(2000);
         driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
         Thread.sleep(2000);
	     driver.close();
         driver.quit();

         
	     
	}

}
