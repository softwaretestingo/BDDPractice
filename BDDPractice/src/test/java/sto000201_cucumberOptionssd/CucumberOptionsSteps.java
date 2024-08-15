package sto000201_cucumberOptionssd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberOptionsSteps 
{
	@Given("User is on the CucumberOptions login page")
	public void user_is_on_the_cucumber_options_login_page() {
		System.out.println("User is on the login page");
	}
	@When("User login into the CucumberOptions application")
	public void user_login_into_the_cucumber_options_application() {
		 System.out.println("User login into the application");
	}
	@Then("CucumberOptions My account page will be displayed")
	public void cucumber_options_my_account_page_will_be_displayed() {
		System.out.println("My account page will be displayed");
	}
	@Then("CucumberOptions My Account Header will be displayed")
	public void cucumber_options_my_account_header_will_be_displayed() {
		  System.out.println("My Account Header will be displayed");
	}
}
