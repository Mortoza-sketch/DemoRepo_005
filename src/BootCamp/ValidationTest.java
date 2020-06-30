package BootCamp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTest {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
			
		 driver.get("https://jqueryui.com/tooltip/");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 	
	     driver.switchTo().frame(0);
			
		 WebElement agebox = driver.findElement(By.id("age"));
		 String tooltiptext=agebox.getAttribute("title");
		    
		 System.out.println(tooltiptext);
		     
		 if (tooltiptext.equals("We ask for your age only for statistical purposes."))
		    	
		    {
		    	System.out.println("Tooltip test Passed");
		    }
		    
		    else
		    	
		    {
		    	System.out.println("Tooltip test Failed");
		    }
		 
		  driver.close(); 
		  driver.quit();
		      
	}

}
