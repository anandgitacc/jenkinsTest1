package org.stepdef;

import java.sql.Driver;
import org.baseclasscucumber.BaseClassCucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginStepDef extends BaseClassCucumber {
	
	WebDriver driver;
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		
		browserLaunch("https://en-gb.facebook.com/");
	}

//	@When("User should enter username and password")
//	public void user_should_enter_username_and_password() {
//		
//		findElementid("email").sendKeys("anand");
//		findElementid("pass").sendKeys("anand@123");
//		
//	}
	
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
		
		System.out.println("Sucessfully entered into login page");
	}

}
