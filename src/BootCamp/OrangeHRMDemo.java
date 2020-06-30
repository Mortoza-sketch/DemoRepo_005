package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
 /*		●	Log In.
		●	Click on navigation Tabs.
		●	Navigate through different level of Health coverage.
		●	Search for Medical tools.
		●	Checkout the Cigna global products.
		●	Sign Out.   */

    
    System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");			
    ChromeDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("People4");
    driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'People4')]")).click();
    Thread.sleep(3000); 
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//option[contains(text(),'Disabled')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    Thread.sleep(3000);
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    
    driver.findElement(By.xpath("//a[@id='welcome']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    Thread.sleep(5000);
    
    driver.close();
    driver.quit();

	}

}
