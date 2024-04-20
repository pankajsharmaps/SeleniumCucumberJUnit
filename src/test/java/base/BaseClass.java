package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
public static Properties prop = new Properties ();

	public BaseClass() {
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configs/config.properties");
			prop.load(fis);
		} 
		catch (IOException e) {
			e.getMessage();
		}
	}
	
	@BeforeClass
	public static void setUp() {	
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();		
			driver = new ChromeDriver(options);
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("testurl")); 
		
		
	}	
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
