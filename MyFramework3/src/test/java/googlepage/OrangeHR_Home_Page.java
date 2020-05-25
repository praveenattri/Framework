package googlepage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OrangeHR_Home_Page {

	//private static WebElement element = null;  // This is done to set driver for all methods

	public WebDriver driver;
	public WebElement element;
	String url = "https://www.orangehrm.com/";	
	public String Fe;
	public String Actual_Services;

	public OrangeHR_Home_Page(WebDriver driver)
	{

		this.driver = driver;
	}
	@Test
	public WebElement Verify_OrangeHR_Features(WebDriver driver)  {

		try{
			element=driver.findElement(By.xpath(".//*[@class='link'][text()='Features']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("The Feature option is Displayed on page");
		}
		return null;

	}
	//	@Test
	//	public WebElement Verify_Menu_Services(WebDriver driver)  {
	//
	//		String Actual_Services=driver.findElement(By.xpath(".//*[@class='link'][text()='Services']")).getText();
	//
	//		String Expected_Text="Servics";
	//
	//		Assert.assertEquals(Actual_Services, Expected_Text);
	//
	//		System.out.println("The String are equal");
	//
	//		//        if(Actua_Services.equals(Expected_Text))
	//		//        	
	//		//        	System.out.println("The String are equal");
	//
	//		return element;
	//
	//
	//	}
	@Test
	public void Verify_Menu_Services(WebDriver driver)  {
		try {
			String Actual_Services=driver.findElement(By.xpath(".//*[@class='link'][text()='Services']")).getText();
			System.out.println("The verification text we get in Verify_Menu_Services is :: "+Actual_Services);
			
			String Expected_Text="Services";
			
			System.out.println("The verification text we expected in Verify_Menu_Services is :: Services ");

			Assert.assertEquals(Actual_Services, Expected_Text);

			System.out.println("The String are equal");

		}catch (Exception e) {
//			System.out.println("The string are not equal"+e.getMessage());
			System.out.println(e.fillInStackTrace());
		}

		return;

	}




	@Test
	public WebElement verifyResetButton(WebDriver driver)
	{

		boolean result=driver.findElement(By.xpath("//img[@class='nav-logo'][@alt='OrangeHRM Inc Logo']")).isDisplayed();
		if(result)
			System.out.println("[Assertion Passed]: Reset Button is displayed !!!");
		return element;

	}
	@Test
	public WebElement Verify_Feature_Menu(WebDriver driver)  {

		List<WebElement> a=driver.findElements(By.xpath(".//*[@class='link'][text()='Features']"));

		int c=a.size();
		for(int i = 0;i<a.size();i++) {

			Assert.assertEquals(a.get(i).getText(), "Features","Login Page URL is NOT as expected!!");
			System.out.println("[Assertion Passed]: Login Page URL is same as Expected!!");
			//Assert.assertTrue(a.get(i).getText().equals("Features")," Login Page URL is NOT as expected!!");

		}

		return null;
	}



	@Test
	public WebElement Click_OrangeHR_Logo(WebDriver driver) {


		try{
			element=driver.findElement(By.xpath("//img[@class='nav-logo'][@alt='OrangeHRM Inc Logo']"));
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			return element;	
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("The OrangeHR Logo is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_Features(WebDriver driver)  {

		try{
			element=driver.findElement(By.xpath(".//*[@class='link'][text()='Features']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("The Feature option is Clicked");
		}
		return null;

	}

	@Test
	public WebElement Click_OrangeHR_Services(WebDriver driver)  {
		try{
			/*WebElement element= driver.findElement(By.xpath(".//*[@class='FPdoLc tfB0Bf']/center//following::input[@class='gNO89b' and @type='submit']"));*/
			element= driver.findElement(By.xpath(".//*[@class='link'][text()='Services']"));
			return element;
		}catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());

		}finally {
			System.out.println("The Submit button is clicked");
		}
		return null;	

	}

	@Test
	public WebElement Click_OrangeHR_Success_Stories(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='link'][text()='Success Stories']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The Success_Stories link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_Partners(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='link'][text()='Partners']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The Partners link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_Blog(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='link'][text()='Blog']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The Blog link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='link'][text()='Blog']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The Blog link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_Contact_Sales(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='btn-orange contact-ohrm '][text()='Contact Sales']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The Contact Sales link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_FREE_Trial(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='btn-orange trial-btn pulse '][text()='FREE 30 Day Trial']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The FREE 30 Day Trial link is clicked");
		}
		return null;
	}

	@Test
	public WebElement Click_OrangeHR_India_Logo(WebDriver driver)
	{
		try {
			element= driver.findElement(By.xpath(".//*[@class='pin-india move-pin'][@src='/assets/Uploads/India.png']"));
			return element;
		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The India_Logo Trial link is clicked");
		}
		return null;
	}

	@Test
	public void verifyOrangePageUrl(WebDriver driver)
	{
		try {

			if(driver.getCurrentUrl().equals(url))
			{
				System.out.println("The URL we get is equal to Current URL");
			}else 
			{
				System.out.println("The URL we get is not equal to Current URL");	
			}

		}catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}finally {
			System.out.println("The URL is matched");
		}
		return;
	}
}



