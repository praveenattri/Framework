package googlepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuofShoppingpage {

	public WebDriver driver;
	//New commit

	public MenuofShoppingpage(WebDriver driverI)
	{

		this.driver=driverI;
	}
	public WebElement Avilable_Nearby(WebDriver driver) {


		try{
			WebElement element=driver.findElement(By.xpath(".//*[@class='vjtvke'][@href='/search?biw=1920&bih=925&tbm=shop&q=Enter+the+value&tbs=vw:l,mr:1,local_avail:1,ss:55&sa=X&ved=0ahUKEwjCvJLV2JvnAhUrxzgGHX-oAJQQsysIyAEoAA']//following::span[@class='lg3aE'][@title='Available nearby']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("The value is passed in search box");
		}
		return null;
	}
	public WebElement Image_Link(WebDriver driver) {


		try{
			WebElement element=driver.findElement(By.xpath("//a[@class='q qs'][text()='Images']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("We have clicked on Image_Link");
		}
		return null;
	}


}
