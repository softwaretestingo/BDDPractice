package sto000101_firstprogsd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstProgramSteps 
{
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("User is on the login page");
	}
	@When("User login into the application")
	public void user_login_into_the_application() {
	    System.out.println("User login into the application");
	}
	@Then("My account page will be displayed")
	public void my_account_page_will_be_displayed() {
	    System.out.println("My account page will be displayed");
	}
	@Then("My Account Header will be displayed")
	public void my_account_header_will_be_displayed() {
	    System.out.println("My Account Header will be displayed");
	}
}
