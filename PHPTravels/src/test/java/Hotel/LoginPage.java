package Hotel;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;
import pageObjects.LandingPage;
import pageObjects.phpTravelLoginPag;

public class LoginPage  extends base {



	@BeforeTest
	public void initialise() throws IOException
	{
		
		driver =initialiseDriver();	
		driver.get(prop.getProperty("url"));
		
	}
	 
	
	@Test
	
		public void hotelSearch() throws IOException, InterruptedException
		{
		LandingPage l=new LandingPage(driver);
		l.getMyAccount().click();
		l.getLogin().click();
		phpTravelLoginPag p=new phpTravelLoginPag(driver);
		p.getEmail().sendKeys("test12@gmail.com");
		p.getPassword().sendKeys("testtest");
		Thread.sleep(30000);
		p.getLogin().click();	
		System.out.println("Successfully logged in");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return;
		
	}
		
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
	}
	
}