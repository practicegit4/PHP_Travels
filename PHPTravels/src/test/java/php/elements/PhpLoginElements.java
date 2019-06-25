package php.elements;

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
	
}
