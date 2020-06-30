package BootCamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='login']")).click();
        Thread.sleep(3000);
	    
        List <WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());

		for (WebElement e:links)
			
		{
			System.out.println(e.getText());
		}
	    
		driver.close();
        driver.quit();
		

	}

}
