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

}