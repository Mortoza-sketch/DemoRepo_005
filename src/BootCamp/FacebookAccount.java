package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccount {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();	
			
		 driver.get("https://www.facebook.com/");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	     
	     driver.findElement(By.id("u_0_m")).sendKeys("Arafat ");
	     Thread.sleep(3000);
         driver.findElement(By.id("u_0_o")).sendKeys("Rahman");
         Thread.sleep(3000);
         driver.findElement(By.id("u_0_r")).sendKeys("abcdtesting3@gmail.com");
         Thread.sleep(3000);
         driver.findElement(By.id("u_0_u")).sendKeys("abcdtesting3@gmail.com");
         Thread.sleep(3000);
         driver.findElement(By.id("u_0_w")).sendKeys("abcD@123456");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//option[contains(text(),'Dec')]")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("day")).sendKeys("21");
         Thread.sleep(3000);
         driver.findElement(By.id("year")).sendKeys("1995");
         Thread.sleep(3000);
         driver.findElement(By.id("u_0_7")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("u_0_13")).click();
         Thread.sleep(3000);
          
         driver.close(); 
         driver.quit();
         
	}

}
