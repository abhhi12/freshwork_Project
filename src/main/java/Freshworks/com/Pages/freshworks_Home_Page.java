package Freshworks.com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Freshworks.com.Util.ElementUtil;

public class freshworks_Home_Page {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	private By dropdownheader = By.xpath("//ul[@class='l-nav-list nav-main-menu']/li");
	private By ProductsDropDown = By.xpath("(//ul[@class='l-nav-list nav-main-menu']/li)[1]");
	private By SubmenuProductsDropDown = By.xpath("//span[text()='Reimagine your cloud-based phone system for businesses of all sizes across 90+ countries.']");
	private By FreshDesk = By.xpath("/html/body/section[2]/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/a/div/img");
	private By SignUpForFree = By.xpath("//div[@class='pt-sm pb-md']/a");
	
	private By Resources = By.xpath("(//li[@class='nav-main-item caps-heading-12 has-sub-menu    '])[2]");
	private By freshstar = By.xpath("/html/body/header/nav/div/div/ul/li[4]/ul/li[4]/a");
	
	public freshworks_Home_Page(WebDriver driver) {
		this.driver=driver;
		eleutil = new ElementUtil(driver);
	}
	public List<String> dodropdownheader() {
		List<String> ListodDropD= new ArrayList<String>();
		
		List<WebElement> dropheader=eleutil.getElements(dropdownheader);
		for(WebElement e: dropheader ) {
			String ListOfDropDownHeader=e.getText();
			
			ListodDropD.add(ListOfDropDownHeader);
		}
		return ListodDropD;
	}
	public void doClickProductsDropDown() throws InterruptedException {
			eleutil.clickOnSubMenu(ProductsDropDown, SubmenuProductsDropDown);
     }
	public SignUpPage doclickFreshDesk() {
		eleutil.doClick(FreshDesk);
		eleutil.doClick(SignUpForFree);
		return new SignUpPage(driver);
	}
	
	public FreshStratPage doclickResources() throws InterruptedException {
		eleutil.clickOnSubMenu(Resources, freshstar);
		return new FreshStratPage(driver);
	}
	
	
	
	
	
	
}