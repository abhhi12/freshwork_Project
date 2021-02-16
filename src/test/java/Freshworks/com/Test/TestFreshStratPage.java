package Freshworks.com.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Freshworks.com.BaseTest.BaseTest;

public class TestFreshStratPage extends BaseTest{
	
	@BeforeMethod
	public void switchtStratPage() throws InterruptedException {
		frestatpag=fresghomepg.doclickResources();
	}
	
	@Test
	public void testfrestatpag() {
		frestatpag.dofreshfooter();
	}

}
