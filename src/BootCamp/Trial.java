package BootCamp;

public class Trial {

	public static void main(String[] args) {
	
	/*	driver.find_element(By.ID, "flight-departing-hp-flight").send_keys("07/06/2019")
		ele = driver.find_element(By.ID, "flight-returning-hp-flight")
		#click on return date field
		ele.click()
		# remove the default date(same as selected start date) by hitting backspace
		length = len(ele.get_attribute('value'))
		ele.send_keys(length * Keys.BACKSPACE)
		#enter the return date
		driver.find_element(By.XPATH, "//input[@id='flight-returning-hp-flight']").send_keys("10/06/2019")		*/
		

	}

}
WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.CSS_SELECTOR, "button#tab-flight-tab-hp"))).click()
WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.XPATH, "//label[@for='flight-departing-hp-flight']//span[@class='label' and text()='Departing']//following::input[1]"))).send_keys("08/06/2019")
returning = WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.XPATH, "//label[@for='flight-returning-hp-flight']//span[@class='label' and text()='Returning']//following::input[1]")))
driver.execute_script("arguments[0].setAttribute('value','09/06/2019')", returning)


//driver.findElement(By.xpath("//li[contains(@class,'open')]//span[contains(@class,'gcw-amount-field adults')][contains(text(),'1 Adult')]")).click();
// driver.findElement(By.xpath("//li[contains(@class,'open')]//span[contains(@class,'alt')][contains(text(),'Travelers')]")).click();
 
 
// driver.findElement(By.xpath("//li[@class='open']//span[@class='icon icon-travelers icon-traveler-selector-title']")).click();
// driver.findElement(By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[1]/form[1]/fieldset[2]/div[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]")).click();
/* driver.findElement(By.xpath("//div[@id='traveler-selector-flp']//li")).sendKeys("2");
 Thread.sleep(2000); */
 
 
 
//driver.findElement(By.cssSelector("body.wrap.cf:nth-child(2) section.hero-banner-wrap.wizard-hero.mercury.hero-no-title.background.d-col-ads.core-wizard-loaded.siteid-1.theme-inverse-hero div.hero-banner.background.native-marquee div.hero-banner-gradient.native-marquee:nth-child(1) div.cols-row.hero-banner-inner:nth-child(1) div.hero-banner-box.siteId-1.cf.hideClassicDcol div.cols-row.theme-inverse-pills.wizard-tabs.cols-nested.inline-fields:nth-child(2) div.tabs-container.col section.tab-pane.cf.gcw-section-flights-tab.on:nth-child(1) form.gcw-form.flights.gcw-prepopulate-flying-from.gcw-grey-out-irrelevant-dates.flexible-shopping-form.gcw-traveler-selector.gcw-oneway-packages.gcw-lessThanNTravelers-travelerSelector.gcw-unattendedInfantInLap-travelerSelector.gcw-childAgesAllProvided-travelerSelector.gcw-allFlightsComplete.gcw-allOriginsAreDifferentFromDestinations.gcw-dynamic-leg-fields.field-border-in-high-contrast-mode.ess-passthrough-disabled fieldset.room-data:nth-child(5) div.cols-nested div.ab25184-traveler-wrapper-flight.available-for-flights.gcw-clear-both:nth-child(4) div.col.travel-selector-wrapper div.menu-bar.gcw-travel-selector-wrapper ul.menu-bar-inner li.open button.trigger-utility.menu-trigger.btn-utility.btn-secondary.dropdown-toggle.theme-standard.pin-left.menu-arrow.gcw-component.gcw-traveler-amount-select.gcw-component-initialized span.btn-label span.inline-amount-titles > span.gcw-amount-field.adults:nth-child(1)")).click();
 
 
 
 
/*   Actions act = new Actions (driver);
 act.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);  */
 
 

 //driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).clear();
 
 
 
/*   driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).sendKeys("4/22/2020");
 Thread.sleep(5000);
// driver.findElement(By.xpath("//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")).sendKeys("2");
//  Thread.sleep(2000);
    */
 