package php.actions;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.PageFactory;

import php.elements.PhpLoginElements;
import php.utilities.PhpDriverSetup;

public class PhpLoginActions {
	
	
	PhpLoginElements loginTest;
	
	public PhpLoginActions() {
		this.loginTest =new PhpLoginElements();
		PageFactory.initElements(PhpDriverSetup.driver, loginTest);
			
		
	}
	public String phpLoginPage(){
		
		PhpDriverSetup.driver.get("https://www.phptravels.net/login");
		String title = PhpDriverSetup.driver.getTitle();
		return title;
		
	}
	public void setUserName(String username) {

		loginTest.username.sendKeys(username);
		
	}
	public void setPassword (String password) {
		loginTest.Password.sendKeys(password);
	}
	public void loginClick() {
		loginTest.loginButton.click();
		
	}
	
      public String HomePage() {
    	 PhpDriverSetup.driver.get("https://www.phptravels.net");
  		String title = PhpDriverSetup.driver.getTitle();
  		return title;
		
      }
	
	
	
	public void Hotels () {
		loginTest.HotelButton.click();
		
	}
	
	public void CityName(String cityname) {

		loginTest.CityName.sendKeys(cityname);
	
	}
		public void CheckIn (String checkin) {
			loginTest.CheckIn.sendKeys(checkin);
			
		}
		public void CheckOut() {
			loginTest.CheckOut.sendKeys();
		}
		
		public void Search() {
			loginTest.Search.click();
		}
		
		
	}
	


