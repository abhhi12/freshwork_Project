package Freshworks.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Freshworks.com.Util.ElementUtil;

public class SignUpPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By FirstName = By.name("first-name");
	private By LastName = By.name("last-name");
	private By Email = By.name("email");
	private By CompName = By.name("company");
	private By Phoneno = By.name("phone");
	
	
	
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}
	
	public void DoSignUpPage(String firstname, String lastname, String email, String compname, String phoneno ) {
		eleutil.doSendKeys(FirstName, firstname);
		eleutil.doSendKeys(LastName, lastname);
		eleutil.doSendKeys(Email, email);
		eleutil.doSendKeys(CompName, compname);
		eleutil.doSendKeys(Phoneno, phoneno);
	}

}
