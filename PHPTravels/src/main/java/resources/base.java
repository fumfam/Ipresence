package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	/*
	public WebDriver driver;
	public Properties prop;
	public static String url;
	public String browserName;
	*/
	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initialiseDriver() throws IOException 
	{
		
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\MMAD\\PHPTravels\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		/*
		browserName=prop.getProperty("browser");
		//url=prop.getProperty("url");
	    */
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//firefox driver code
		}
	
		else if(browserName.equals("IE"))
		{
			//IE driver code
			
		}
		
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
	

}
