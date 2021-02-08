package Freshworks.com.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Freshworks.com.Util.ElementUtil;

public class ProductWindowHandlers {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By product = By.xpath("//span[text()='Products']");
	private By Submeneu_FreshCalller = By.xpath("//img[@alt='Freshcaller']");
	private By SubMenu_FeatureBtn = By.xpath("(//span[text()='Features'])[2]");
	private By SubMenu_FeatureBtn_TeamMang = By.xpath("/html/body/header/nav/div[2]/div/ul[1]/li[1]/ul/li[3]/a/span");
	
	
	
	public ProductWindowHandlers(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	public void doProductWindowHandlers() throws InterruptedException {
		eleutil.clickOnSubMenu(product, Submeneu_FreshCalller);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String ParentWindow=it.next();
		System.out.println("Parent window id is :" + ParentWindow );
		
		String FreshCallerChild=it.next();
		System.out.println("FreshCaller Child window id is :" + FreshCallerChild );
		
		driver.switchTo().window(FreshCallerChild);
		System.out.println("Child window title is : " + driver.getTitle());
		eleutil.clickOnSubMenu(SubMenu_FeatureBtn, SubMenu_FeatureBtn_TeamMang);
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		System.out.println("Parent window title is : " + driver.getTitle());
		
		driver.quit();
	}

}
