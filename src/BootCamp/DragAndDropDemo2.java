 package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo2 {

	public static void main(String[] args) {
	

        System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/slider/");	
		
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span")); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform(); 
		System.out.println("Slide Action performed.");
			

	}

}
