package runner;

import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="src/test/resources/features/KayakFlightTest.feature",
				glue= {"stepDef"},
				dryRun= false,
				monochrome= true,
				//tags= "@Functional",
				
				plugin= {"pretty",
						"json:testOutput/JSON_report/default.json",
						"html:testOutput/HTML_reports/default.html",
						"junit:testOutput/XML_reports/default.xml"
						}
				)

public class Runner {
	
	
	
	

}
