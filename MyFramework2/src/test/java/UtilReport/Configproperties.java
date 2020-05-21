package UtilReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configproperties {

	public Properties pro;

	public Configproperties() {

		File src=new File("./config/Config.properties");

		try {
			FileInputStream fis=new FileInputStream(src);

			pro=new Properties();

			pro.load(fis);

		} catch (Exception e) {

			System.out.println("The configuration file data is not load prefectly");
		}
	}

	public String get_Data(String DataAtLine) {

		return pro.getProperty(DataAtLine);
	}

	public String get_Browser() {

		return pro.getProperty("Browser");
	}
	public String get_Url() {

		return pro.getProperty("qaUrl");
	}
}




