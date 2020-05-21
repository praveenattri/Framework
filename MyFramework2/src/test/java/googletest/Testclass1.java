package googletest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Browserfiles.Baseclass;

public class Testclass1 extends Baseclass {
	
	
	@Test
	public void Browseropen()
	{
		OrangeHome.verifyOrangePageUrl(driver);
	}
	
	@Test(dependsOnMethods="Browseropen")
	public void Clicking_On_Products()
	{
		OrangeHome.Click_OrangeHR_(driver).click();
		
	}
}
