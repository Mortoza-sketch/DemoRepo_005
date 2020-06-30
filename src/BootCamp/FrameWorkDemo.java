package BootCamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
        for (WebElement e:links)
			
		{
			System.out.println(e.getText());
		}
        
        
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		
		driver.switchTo().frame("classFrame"); 	
		driver.findElement(By.xpath("//tr[1]//td[1]//a[1]")).click();
		Thread.sleep(5000);
		
		driver.close();
        driver.quit();


	}

}
