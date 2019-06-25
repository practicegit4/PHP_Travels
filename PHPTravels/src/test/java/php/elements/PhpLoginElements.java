package php.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpLoginElements {

	//UserName
	@FindBy(name="username")
	public WebElement username;
	
	//Password
	@FindBy(name = "password")
	public WebElement password;

	//Login Button
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")
	public WebElement loginButton;
	
	
	
}
