package Freshworks.com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Freshworks.com.Util.ElementUtil;

public class FreshStratPage {
	
	private WebDriver driver;
	private ElementUtil eleuitl;
	
	private By freshfooter = By.xpath("(//ul[@class='footer-nav'])[1]/li");
	
	
	public FreshStratPage(WebDriver driver) {
		this.driver = driver;
		eleuitl = new ElementUtil(driver);
		
	}
	
	public void dofreshfooter() {
		List<WebElement> FreshFooterlist=eleuitl.getElements(freshfooter);
		for(WebElement e : FreshFooterlist ) {
			String FooterList=e.getText();
			System.out.println("Total list name :" +FooterList);
		}
	}

}
