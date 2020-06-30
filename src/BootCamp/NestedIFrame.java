package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	    public static void main(String[] args) throws InterruptedException {
	    	

	    	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
			driver.manage().window().maximize();
			
            driver.get("http://demo.automationtesting.in/Frames.html");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	        Thread.sleep(5000);
	        
	        WebElement outerframe = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
	        driver.switchTo().frame(outerframe);
	        Thread.sleep(5000);		
	        
	        WebElement innerframe = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]"));
	        driver.switchTo().frame(innerframe);
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Mortoza");
	        Thread.sleep(5000);
	        
	        driver.close();
            driver.quit();
	        
	}

}
