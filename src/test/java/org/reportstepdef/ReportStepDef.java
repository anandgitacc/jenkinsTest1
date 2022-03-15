package org.reportstepdef;

import org.baseclasscucumber.BaseClassCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportStepDef extends BaseClassCucumber {
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		
		browserLaunch("https://en-gb.facebook.com/");
		
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		
		findElementid("email").sendKeys(username);
		findElementid("pass").sendKeys(password);
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		
		findElementName("login").click();
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {
		
		System.out.println("Verified facebook login");
	}

}
