package BootCamp;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

class AmazonTestCases {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/tamji/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();

	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
/*	// ● Log In
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abcd@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();  */
    
    
    
    // ● Browse the products and use the shopping cart to check out.
    
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men Wallet");
    driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
    Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	Thread.sleep(3000);
    
    driver.findElement(By.xpath("//span[contains(text(),'RFID Protected Mens Spencer Flip ID Leather Bifold')]")).click();
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
    Thread.sleep(3000); 
    
    
   //●	Search Items and verify items.

/*	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men Wallet");
    driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
    Thread.sleep(3000); 
    driver.findElement(By.xpath("//span[contains(text(),'RFID Protected Mens Spencer Flip ID Leather Bifold')]")).click();
    Thread.sleep(3000); 
    
    */
	
    
    //●	Verify auto suggestion
	
/*	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men Wallet");
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File ("C:/Users/tamji/eclipse-workspace/Boot Camp/src/BootCamp/AmazonAutoSuggestionVerificationTC1.png")); */
	
	
    
    //●	Navigate to the products
	
 /*	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men Wallet");
    driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[contains(text(),'RFID Protected Mens Spencer Flip ID Leather Bifold')]")).click();
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); 
    Thread.sleep(3000);  */
    
    
    
    //●	Sign Out
 /*   driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abcd@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    Thread.sleep(3000); 
    
    driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
    driver.findElement(By.xpath("//a[@class='hmenu-item'][contains(text(),'Sign Out')]")).click();
    Thread.sleep(3000); 
      
	driver.close();
    driver.quit();  */
    
	}

}
