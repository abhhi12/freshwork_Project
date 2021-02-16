package Freshworks.com.BaseTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Freshworks.com.DriverFactory.DriverFactory;
import Freshworks.com.Pages.FreshStratPage;
import Freshworks.com.Pages.ProductWindowHandlers;
import Freshworks.com.Pages.SignUpPage;
import Freshworks.com.Pages.WindowHandlerPage;
import Freshworks.com.Pages.freshworks_Home_Page;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public freshworks_Home_Page fresghomepg;
	public SignUpPage signup; 
	public FreshStratPage frestatpag;
	public ProductWindowHandlers prowinHand;
	//public WindowHandlerPage windhandpage;
	
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop=df.init_properties();
		driver=df.init_driver(prop);
		fresghomepg = new freshworks_Home_Page(driver);
		signup = new SignUpPage(driver);
		prowinHand = new ProductWindowHandlers(driver);
		frestatpag = new FreshStratPage(driver);
		//windhandpage = new WindowHandlerPage();
		
		
		
		driver.get(prop.getProperty("url"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
