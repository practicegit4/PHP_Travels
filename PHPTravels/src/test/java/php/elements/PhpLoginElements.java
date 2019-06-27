package php.elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PhpLoginElements {

	


	
	
	//username
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")
	public WebElement username;
	
	//password
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")
	public WebElement Password;
	
	//Login Button
		@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
		public WebElement loginButton;
		
		
		
		
		// hotel button
		@FindBy(xpath = "//*[@id=\'body-section\']/section/div[2]/div/div/div[2]/ul/li[1]/a")
		public WebElement HotelButton;
		
		// city name
		@FindBy(xpath = "//*[@id=\'select2-drop\']/div/input")
		public WebElement CityName;
		
		// check in date
		@FindBy(xpath = "//*[@id=\'dpd1\']/div/input")
		public WebElement CheckIn;
		// check out date
		@FindBy(xpath = "//*[@id=\'dpd2\']/div/input")
		public WebElement CheckOut;
		// Search
		@FindBy(xpath = "//*[@id=\'hotels\']/form/div[5]/button")
		public WebElement Search;
		
	
}
