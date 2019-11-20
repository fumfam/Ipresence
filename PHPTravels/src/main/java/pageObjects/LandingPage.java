package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By myAccount=By.cssSelector(".dropdown-login>a:nth-child(1)");
	By login= By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]"); 
	By title=By.cssSelector("#header-waypoint-sticky > div.header-top > div > div > div.col-md-4.col-2.o2 > div > a > img");
	By hotelName=By.linkText("Search by Hotel or City Name");
    By hotelNameInput=By.cssSelector("#select2-drop .select2-input");//*[@id="s2id_autogen1"]

    
	By checkIn=By.xpath("//input[@id='checkin']");
	By checkOut= By.xpath("//input[@id='checkout']");
	By checkInPicker=By.cssSelector(".datepicker--cell.datepicker--cell-day.-current-.-selected-");
	By search=By.xpath("//div[@class='col-md-2 col-xs-12 o1']//button[@class='btn btn-primary btn-block'][contains(text(),'Search')]");

	
	public LandingPage(WebDriver driver) {
		
		
		this.driver=driver;
		
	}


	public WebElement getMyAccount()
	{
		return driver.findElement(myAccount);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	public WebElement getHotelName()
	{
		return driver.findElement(hotelName);
	}
	
	public WebElement getHotelNameInput()
	{
		return driver.findElement(hotelNameInput);
	}
	public WebElement getCheckIn()
	{
		return driver.findElement(checkIn);
	}
	
	public WebElement getCheckOut()
	{
		return driver.findElement(checkOut);
	}
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
}
