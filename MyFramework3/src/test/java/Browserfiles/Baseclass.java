package Browserfiles;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import UtilReport.Configproperties;
import UtilReport.ExcelDataprovider;
import UtilReport.Multibrowser2;
import UtilReport.Screenshoot;
import googlepage.MenuofShoppingpage;
import googlepage.Nextpageaftersearch;
import googlepage.OrangeHR_Home_Page;

public class Baseclass /*extends Pageinitiatorclass*/ {

	public WebDriver driver;
	public ExcelDataprovider excel;
	public Configproperties config;
	public ExtentReports report;
	public ExtentTest logger;  //This object is used to call any method related to extent Report

	/*This is initilization of page which we want to use for our testing*/
	public OrangeHR_Home_Page OrangeHome=PageFactory.initElements(driver, OrangeHR_Home_Page.class);
	public Nextpageaftersearch loginApp1=PageFactory.initElements(driver, Nextpageaftersearch.class);
	public MenuofShoppingpage loginApp3=PageFactory.initElements(driver, MenuofShoppingpage.class);


	@BeforeSuite
	public void DataSuit()
	{
		Reporter.log("The Datasuit details are loading",true);
		excel=new ExcelDataprovider();		
		config=new Configproperties();

		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/Projectreport" + Screenshoot.CurrentDateAndTime() +".html")); 
		report=new ExtentReports(); 
		report.attachReporter(extent);
		Reporter.log("The Datasuit configuration are done and loaded",true);
	}

	@BeforeClass
	public void StartUp1()
	{
		Reporter.log("The Web browser is going to start",true);
		driver=Multibrowser2.openbr(driver, config.getBrowser(), config.getqaUrl());
		Reporter.log("Web browser is started successfully successsfully",true);
	}

	@AfterClass
	public void StartUp2()
	{
		//		Multibrowser2.quitBrowser(driver);
	}


	@AfterMethod
	public void AfterMethod_Run(ITestResult result) throws IOException
	{
		Reporter.log("The Method is completed and screenshoot system get started successsfully",true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//			Screenshoot.Takescreenshoot(driver);//Upto here only for screenshoot not in report
			logger.fail("Test Failed ", MediaEntityBuilder.createScreenCaptureFromPath(Screenshoot.Takescreenshoot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed ", MediaEntityBuilder.createScreenCaptureFromPath(Screenshoot.Takescreenshoot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.skip("Test Passed ", MediaEntityBuilder.createScreenCaptureFromPath(Screenshoot.Takescreenshoot(driver)).build());
		}
		report.flush();
		Reporter.log("The Method is completed and screenshoot is taken and attached to Extent report successsfully",true);
	}

	@AfterSuite
	public void AfterallRun(ITestResult result)
	{

	}

}
