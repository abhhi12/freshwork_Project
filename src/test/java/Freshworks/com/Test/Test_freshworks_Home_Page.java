package Freshworks.com.Test;

import java.util.List;

import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;

public class Test_freshworks_Home_Page extends BaseTest{
	
	@Test
	public void dotest_freshworks_Home_Page() {
		List<String> ListOfHeader=fresghomepg.dodropdownheader();
		System.out.println("List of header:" +ListOfHeader );
	}

}
