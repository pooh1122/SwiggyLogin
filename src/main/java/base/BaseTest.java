package base;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	 //protected static final String BASE_URL = "https://www.swiggy.com/";

		@BeforeMethod
	    public void setUp() {
			 ChromeOptions options = new ChromeOptions();
		        
		        // 1. Remove the "Chrome is being controlled by automated test software" infobar
		        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		        options.setExperimentalOption("useAutomationExtension", false);
		        
		        // 2. Disable the webdriver flag
		        options.addArguments("--disable-blink-features=AutomationControlled");
		        
		        // Optional: Disguise your User-Agent
		        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
	        
		        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.swiggy.com/");
	    }
	    
	    @AfterMethod
	    public void tearDown() {

	    	if(driver!=null)
	    	   driver.quit();
	    }
	    

}
