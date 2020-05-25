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

	public static String Takescreenshoot(WebDriver driver)
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath= System.getProperty("user.dir") + "/ScreenShoot/PicsofProject_" + CurrentDateAndTime() + ".png";
		//		System.out.println("ScreenShoot Capture");

		try {
			//			FileHandler.copy(src, new File("./ScreenShoot/PicsofProject_"+ CurrentDateAndTime() +".png"));//This filehandler is used to take screenshoot only
			FileHandler.copy(src, new File(screenshotPath));

			System.out.println("Screenshot capture");

		} catch (IOException e) {

			System.out.println("Unable to take ScreenShoot "+e.getMessage());
		}
		return screenshotPath;
	}

	public static String CurrentDateAndTime()
	{
		DateFormat format=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

		Date CurrentDatedate=new Date();

		return format.format(CurrentDatedate);
	}

}

