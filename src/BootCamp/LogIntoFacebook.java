package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIntoFacebook {

	public static void main(String[] args) throws InterruptedException {
    	
    System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
    ChromeDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("https://www.facebook.com/");		
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd1234");
    driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
    //Thread.sleep(3000);
    
    driver.findElement(By.xpath("//div[@id='u_5_2']//input[@placeholder='Search']")).sendKeys("PeopleNTech Institute of Information Technology");
    driver.findElement(By.xpath("//i[@class='_585_']")).click();
	Thread.sleep(3000);	
	
	driver.close();
    driver.quit();

	

}

}