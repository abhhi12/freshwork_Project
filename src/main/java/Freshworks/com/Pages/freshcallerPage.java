package Freshworks.com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Freshworks.com.Util.ElementUtil;

public class freshcallerPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By Freshcallerheadre = By.xpath("//ul[@class='l-nav-list nav-main-menu']/li");
	private By Features = By.linkText("Features");
	private By submenuofFeatures = By.linkText("\r\n"
			+ "                        Phone Setup\r\n"
			+ "                      ");
	
	
	
	public freshcallerPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	public List<String> doFreshcallerheadre() {
		List<String> stringlist = new ArrayList<String>();
		
		List<WebElement> listoffreshcallereheader =eleutil.getElements(Freshcallerheadre);
		for(WebElement e: listoffreshcallereheader) {
			String getListofFreshcallerheadre=e.getText();
			stringlist.add(getListofFreshcallerheadre);
		}
		return stringlist ;
	}
	public void DosubmenuofFeatures() throws InterruptedException {
		eleutil.clickOnSubMenu(Features, submenuofFeatures);
	}
}
