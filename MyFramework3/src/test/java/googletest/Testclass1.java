package googletest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Browserfiles.Baseclass;

public class Testclass1 extends /*Pageinitiatorclass*/ Baseclass {
	
	
	@Test
	public void Browseropen()
	{
		logger=report.createTest("Verify the Page URL of the Project");
		OrangeHome.verifyOrangePageUrl(driver);
		
		logger.info("The BrowserOpen method is run successfully");
		logger.pass("First Method is checked");
		
	}
	
	@Test(dependsOnMethods="Browseropen")
	public void Clicking_On_Products()
	{
		logger=report.createTest("Verify the Menu option and click on menu option");
//		OrangeHome.Verify_Feature_Menu(driver);
		OrangeHome.Verify_Menu_Services(driver);
		OrangeHome.verifyResetButton(driver);
		OrangeHome.Click_OrangeHR_Features(driver).click();
		Reporter.log("[Assertion Passed]: Login Page URL is same as Expected!!");
		logger.pass("Second Method is checked");
	}
}
