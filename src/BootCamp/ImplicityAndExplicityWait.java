package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityAndExplicityWait {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();

	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	    
           
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login']")));
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	    Thread.sleep(5000);
	    
	    
	    driver.close();
        driver.quit();

	    
	    }
	    

	}


