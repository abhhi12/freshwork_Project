package Freshworks.com.BaseTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Freshworks.com.DriverFactory.DriverFactory;
import Freshworks.com.Pages.freshworks_Home_Page;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public freshworks_Home_Page fresghomepg;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop=df.init_properties();
		driver=df.init_driver(prop);
		fresghomepg = new freshworks_Home_Page(driver);
		
		
		driver.get(prop.getProperty("url"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
