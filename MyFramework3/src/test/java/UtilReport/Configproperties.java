package UtilReport;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configproperties {
	
	public Properties pro;

	public Configproperties()
	{
		File src=new File("./config/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src); 
			
			pro=new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to Load value from Propertiesa file "+e.getMessage());
		}
	}
	
	public String getDataFromConfigFile(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getqaUrl()
	{
		return pro.getProperty("qaURL");
	}
	
}
