package UtilReport;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshoot {

	public static void takescreenshoot(WebDriver driver) {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println("The screenshoot is taken");
		
		try {
			FileHandler.copy(src, new File("./logs/Screenshoot/PicsofProject_"+ CurrentDateAndTime() +".png"));
		} catch (Exception e) {
			System.out.println("The screen shoot taken have some problem");
		}
	}
	
	public static String CurrentDateAndTime() {
		
		DateFormat format=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date Simpledate=new Date();
		
		return format.format(Simpledate);
	}
}

