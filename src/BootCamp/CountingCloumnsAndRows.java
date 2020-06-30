package BootCamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountingCloumnsAndRows {

	public static void main(String[] args) throws InterruptedException {
	
		//This script is  wrong, printing wrong number of tables and rows
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); //Launch the Chrome browser
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		
		//No.of Columns
        List  columns = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]"));
        System.out.println("No of columns are : " +columns.size()); 
        //No.of rows 
        List  rows = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/table[1]/thead[1]/tr[1]/td[1]")); 
        System.out.println("No of rows are : " +rows.size());
        Thread.sleep(5000);
       
        driver.close();
        driver.quit();
		
		
		

	}

}
