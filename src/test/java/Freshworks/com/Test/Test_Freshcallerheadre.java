package Freshworks.com.Test;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;

public class Test_Freshcallerheadre extends BaseTest {
	
	@BeforeClass
	public void gotoFreshCallerPage() throws InterruptedException {
		freshcallerpg=fresghomepg.doClickProductsDropDown();
	}
	@Test
	public void doTesFreshcaller() {
		List<String> li=freshcallerpg.doFreshcallerheadre();
		System.out.println("List of header:" +li);
	}
}