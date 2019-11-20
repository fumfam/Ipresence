package Hotel;


import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.LandingPage;


public class SearchTest  extends base {



	@BeforeTest
	public void initialise() throws IOException
	{
		
		driver =initialiseDriver();	
		driver.get(prop.getProperty("url"));
		
	}
	 
	
	@Test
	
	
	
	public void SearchHotel() throws IOException, InterruptedException
	{
	LandingPage l=new LandingPage(driver);
	l.getHotelName().click();
	l.getHotelNameInput().sendKeys("dub");
	Thread.sleep(10000);
	l.getHotelNameInput().sendKeys(Keys.ENTER);
	//Thread.sleep(10000);
	l.getCheckIn().sendKeys("28/12/2019");
	l.getCheckOut().sendKeys("30/12/2019");
	Thread.sleep(30000);
	l.getSearch().click();
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return;
	
}
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
	}
	
}