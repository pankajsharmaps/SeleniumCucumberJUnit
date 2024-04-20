package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import base.BaseClass;
import utils.ReadLocators;


public class KayakHomePage extends BaseClass{
	
	ReadLocators rl = new ReadLocators();
	
	
	@Test//
	public void searchDestination(String city) throws InterruptedException {
		WebElement destination = driver.findElement(By.xpath(rl.getLocatorValue("dest_field")));
//		Assert.assertEquals("Nums are equal", 1, 0);
		Reporter.log(city);
		destination.click();
		destination.sendKeys(city);
		
		Thread.sleep(2000);
		
		List<WebElement> we = driver.findElements(By.xpath("//*[@id='flight-destination-smarty-input-list']//child::*[@class='vPgG-name']"));
		System.out.println(we.size());
		
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);
		
		List <WebElement> weCity = driver.findElements(By.xpath("//*[@class='c_neb-item-value']"));
		
		String selectedFromCityTxt = weCity.get(0).getText();
		String selectedToCityTxt = weCity.get(1).getText();
		System.out.println(selectedFromCityTxt+" : "+selectedToCityTxt);
		
		boolean cityCheck = weCity.get(1).getText().contains(city);
		System.out.println(cityCheck);
		
		Assert.assertEquals(true,cityCheck);
		
//		Thread.sleep(2000);
		
//		destination.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
//		destination.sendKeys(Keys.ENTER);
		
	}
		
	public void fromDateSelection(String fDate) {	
		List<WebElement> calender = driver.findElements(By.xpath("//*[@class='JONo-icon']"));
//		calender.sendKeys(Keys.ENTER);
//		calender.click();
		
		System.out.println("Calender size : "+calender.size());
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(calender.get(0)).click().build().perform();		
		
		
		List <WebElement> dates = driver.findElements(By.xpath(rl.getLocatorValue("dates_field")));
		System.out.println(dates.size());
		for (WebElement we : dates) {
			if (we.getAttribute("aria-label").contains(fDate)) {
				System.out.println("Match");
				we.click();
				break;
				}
			}
		}
	
	public void toDateSelection(String toDate) {
		List <WebElement> dates = driver.findElements(By.xpath(rl.getLocatorValue("dates_field")));
		for (WebElement we : dates) {
			if (we.getAttribute("aria-label").contains(toDate)) {
				we.click();
				break;
			}
		}	
	}
	
	public void clickSearchBtn() {
		WebElement searchBtn = driver.findElement(By.xpath(rl.getLocatorValue("search_btn")));
		searchBtn.click();
	}
}