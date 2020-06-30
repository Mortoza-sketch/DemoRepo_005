package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeDemo {

	    public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		driver.manage().window().maximize();
		
        driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		
	/*	driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Mortoza");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
        Thread.sleep(5000);  
        
        driver.findElement(By.xpath("//a[contains(text(),'Morteza Motahhari')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Morteza Pouraligan")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Morteza Avini")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Morteza Pashaei')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Morteza Ahmadi Harandi')]")).click();
        Thread.sleep(5000); */
		
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Mortoza");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		//Print the dimension 
		
	/*	Dimension result = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']")).getSize();
		System.out.println(result);  */
		
		//Print number of search results
		
		WebElement opentabs=driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
		System.out.println(opentabs.findElements(By.tagName("a")).size());
		
		//Click on every search result
		
		for (int i=1;i<opentabs.findElements(By.tagName("a")).size();i++)
			
		{
			opentabs.findElement(By.tagName("a")).click();
		}
	
        
       // driver.close();
        // driver.quit();

	}

}
