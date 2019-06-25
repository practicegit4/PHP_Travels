package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import php.actions.PhpLoginActions;

public class PhpLoginStepDef {
	PhpLoginActions loginActions = new PhpLoginActions();
	
	
	
	@Given("^I navigated to Phptravels login page$")
	public void i_navigated_to_Phptravels_login_page()  {
		String actualTittle = loginActions.phpLoginPage();
	}

	@When("^I entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_and(String username, String password)  {
	   loginActions.setUserName(username);
	   loginActions.setPassword(password);
	   
	}

	@When("^I click on login$")
	public void i_click_on_login() {
	 loginActions.loginClick();  
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login()  {
		Assert.assertEquals(loginActions.phpLoginPage(), true);
	    
	}



}
