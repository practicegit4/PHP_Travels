package php.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhpLoginStepDef {
	PhploginActions loginActions = new PhploginActions();

	@Given("I navigated to Php login page")
	public void i_navigated_to_Php_login_page() {
		String actualTitle = loginActions.upsLoginPage();
		//Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
	}

	@When("I entered correct \"(.*)\" and \"(.*)\"")
	public void i_entered_correct_and(String userId, String password) {
		loginActions.setUserID(username);
		loginActions.setPassword(password);
       }
	

	@When("I click on login")
	public void i_click_on_login() {
		loginActions.loginClick();
	}

	
	@Then("I should be able to login")
	public void i_should_be_able_to_login() {
		Assert.assertEquals(loginActions.errorReadMsg(), false);
	}
}
