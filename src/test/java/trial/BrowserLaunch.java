package trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	public static WebDriver driver;
	
	@Test
	public void launchBrowser() throws InterruptedException{
		
		
//		WebDriver driver;
//		ChromeOptions option = new ChromeOptions();
//		driver= new ChromeDriver(option);	
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();		
//		driver = new ChromeDriver(options);
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();		
		driver = new ChromeDriver(options);
		
		
		driver.get("http://google.com");
		driver.quit();
	
	}

}
