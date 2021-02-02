package Freshworks.com.Test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;
import Freshworks.com.Util.Constants;

public class Test_freshworks_Home_Page extends BaseTest{
	
	@Test(priority=1)
	public void dotest_freshworks_Home_Page() {
		List<String> ListOfHeader=fresghomepg.dodropdownheader();
		System.out.println("List of header:" +ListOfHeader );
		//Assert.assertEquals(ListOfHeader, Constants.getListofheadfrepg());
	}
	@Test(priority=2)
	public void doTest_ClickProductsDropDown() throws InterruptedException {
		fresghomepg.doClickProductsDropDown();
	}

}
