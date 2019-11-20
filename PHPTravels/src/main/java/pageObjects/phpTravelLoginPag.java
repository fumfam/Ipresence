
	
	package pageObjects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	public class phpTravelLoginPag{

		
		public WebDriver driver;
		
		By email=By.xpath("//input[@placeholder='Email']");
		By password=By.xpath("//input[@placeholder='Password']");
		By login=By.cssSelector("#loginfrm > button");
		
		
		
		
		public phpTravelLoginPag(WebDriver driver) {
			
			this.driver=driver;
			
		}




		public WebElement getEmail()
		{
			return driver.findElement(email);
		}
		

		public WebElement getPassword()
		{
			return driver.findElement(password);
		}
		
		public WebElement getLogin()
		{
			return driver.findElement(login);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	

