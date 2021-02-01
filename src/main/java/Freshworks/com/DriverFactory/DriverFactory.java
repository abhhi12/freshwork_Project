package Freshworks.com.DriverFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private WebDriver driver;
	public Properties prop;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver() {
		String BrowserName = prop.getProperty("browser");
		System.out.println("Browser Name :" +BrowserName);
		
		switch(BrowserName) {
			case"chrome":
				WebDriverManager.chromedriver().setup();
				//driver = new ChromeDriver();
				tlDriver.set(new ChromeDriver());
				break;
				
			case"firefox":
				WebDriverManager.firefoxdriver().setup();
				//driver = new FirefoxDriver();
				tlDriver.set(new FirefoxDriver());
				break;
				
			default:
				System.out.println("Please pass correct Browser name :" +BrowserName);
				break;
			
	 }
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
		
	
  }
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	public Properties init_properties() {
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public String getScreenShots() {
		File src=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+ System.currentTimeMillis()+".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyDirectory(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	
	
}