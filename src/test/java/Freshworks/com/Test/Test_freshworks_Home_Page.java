package Freshworks.com.Test;

import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;

public class Test_freshworks_Home_Page extends BaseTest {
	
	@Test(priority=1)
	public void DoTest_freshworks_Home_Page() {
		
		fresghomepg.dodropdownheader();
	}
	
	@Test(priority=2)
	public void DoTest_ProductsDropDown() throws InterruptedException {
		fresghomepg.doClickProductsDropDown();
	}
	
	@Test(priority=3)
	public void DotestResourceslink() throws InterruptedException {
		fresghomepg.doclickResources();
	}

}
