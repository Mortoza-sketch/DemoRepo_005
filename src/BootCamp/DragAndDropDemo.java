package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    
	    WebElement source_element = driver.findElement(By.id("box3"));
	    WebElement target_element = driver.findElement(By.id("box103"));
	    Thread.sleep(3000);
	    
	    Actions act = new Actions(driver);
	    act.dragAndDrop(source_element, target_element).build().perform();
	   
	    
	    WebElement source_element1 = driver.findElement(By.id("box7"));
	    WebElement target_element1 = driver.findElement(By.id("box107"));
	    act.dragAndDrop(source_element1, target_element1).build().perform(); 
	    Thread.sleep(3000);
	    
	    WebElement source_element2 = driver.findElement(By.id("box1"));
	    WebElement target_element2 = driver.findElement(By.id("box101"));
	    act.dragAndDrop(source_element2, target_element2).build().perform();
	    Thread.sleep(3000);
	    
	    WebElement source_element3 = driver.findElement(By.id("box2"));
	    WebElement target_element3 = driver.findElement(By.id("box102"));
	    act.dragAndDrop(source_element3, target_element3).build().perform();
	    Thread.sleep(3000);
	    
	    WebElement source_element4 = driver.findElement(By.id("box6"));
	    WebElement target_element4 = driver.findElement(By.id("box106"));
	    act.dragAndDrop(source_element4, target_element4).build().perform();
	    Thread.sleep(3000); 
	    
	    WebElement source_element5 = driver.findElement(By.id("box4"));
	    WebElement target_elelemt5 = driver.findElement(By.id("box104"));
	    act.dragAndDrop(source_element5, target_elelemt5).build().perform();
	    Thread.sleep(3000);

	    WebElement source_element6 = driver.findElement(By.id("box5"));
	    WebElement target_element6 = driver.findElement(By.id("box105"));
	    act.dragAndDrop(source_element6, target_element6).build().perform();
	    Thread.sleep(3000);
	    
	    driver.close();
	    driver.quit();
	  		

	}

}
