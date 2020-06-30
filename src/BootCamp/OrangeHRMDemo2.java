package BootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDemo2 {

	public static void main(String[] args) throws InterruptedException {
    
		
     System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);

        
        driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
        driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click();
		Thread.sleep(5000);
        
		
		int rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println(rows);
		
		int count =0;
		for (int r =1; r<=rows;r++)
			
		{
			String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			
		 if (status.equals("Enabled"))
			 
		 {
			 count++;
		 }
			
		}
		
        
		System.out.println("Number of Enable employees: " +count);
		System.out.println("Number of Disable employees: " +(rows-count));
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();	
		
		

	}

}
