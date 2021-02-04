package Freshworks.com.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;
import Freshworks.com.Util.Constants;
import Freshworks.com.Util.ExelUtil;

public class TestSignUpPage extends BaseTest {
	
	@BeforeClass
	public void intoSignUpPage() {
		signup=fresghomepg.doclickFreshDesk();
	}
	@DataProvider
	public Object[][] DataFromExelSheet() {
		Object [][] FromExelSheet = ExelUtil.getTestData(Constants.FRESH_WORK_SHEET_NAME);
		return FromExelSheet;
	}
	
	@Test(priority= 1, dataProvider="DataFromExelSheet")
	public void DoTest_SignUpPage(String FirstName, String LastName, String Email, String Compname, String Phoneno) {
		signup.DoSignUpPage(FirstName, LastName, Email, Compname, Phoneno);
	}
	


}
