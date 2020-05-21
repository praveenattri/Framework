package Browserfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import UtilReport.Configproperties;
import UtilReport.ExcelDataprovider;
import UtilReport.Multibrowser2;
import UtilReport.Screenshoot;
import googlepage.OrangeHR_Home_Page;



public class Baseclass {

	public WebDriver driver;
	public ExcelDataprovider excel;
	public Configproperties pro;
	public ExtentReports report;
	
	
	public OrangeHR_Home_Page OrangeHome=PageFactory.initElements(driver, OrangeHR_Home_Page.class);
	
	
	@BeforeSuite
	public void setup_configuration() {
		
		excel=new ExcelDataprovider();
		pro=new Configproperties();
		
	}
	
	@BeforeClass
	public void browser_setting() {
		
		driver=Multibrowser2.openbr(driver, pro.get_Browser(), pro.get_Url());
		
	}
	
	@AfterClass
	public void Close_setting() {
		Multibrowser2.quitBrowser(driver);
	}
	
	
	@AfterMethod
	public void Aftereachmethod_Run(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshoot.takescreenshoot(driver);
		}
		report.flush();
		
	}
	
	
	@AfterSuite 
	public void AfterRun() {
		
		
		
	}
	
	
	
	
		}


