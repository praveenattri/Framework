package googlepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nextpageaftersearch {

	public WebDriver driver;

	public Nextpageaftersearch(WebDriver driver)
	{

		this.driver = driver;
	}

	public WebElement Shopping_Link(WebDriver driver) {


		try{
			WebElement element=driver.findElement(By.xpath("//a[@class='q qs'][text()='Shopping']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("We have clicked on Avilable List of Items");
		}
		return null;
	}
}
