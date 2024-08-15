package sto000501_backgroundsd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

	@Given("Setup the Entries in Database")
	public void setup_the_entries_in_database() {
		System.out.println("*************************************");
	    System.out.println("Setup the Entries in Database");
	}
	@Given("Launch The Browser Based on config variables")
	public void launch_the_browser_based_on_config_variables() {
		System.out.println("Launch The Browser Based on config variables");
	}
	@Given("Hit the Home Page URL of banking site")
	public void hit_the_home_page_url_of_banking_site() {
		System.out.println("Hit the Home Page URL of banking site");
	}
	@Given("Normal User is on the login page")
	public void normal_user_is_on_the_login_page() {
		System.out.println("Normal User is on the login page");
	}
	@When("Normal User login into the application with Normal User Credential username {string} and password {string}")
	public void normal_user_login_into_the_application_with_normal_user_credential_username_and_password(String username, String password) {
		System.out.println("UserName is: "+username);
		System.out.println("Password Is: "+password);
	}
	@Then("Normal My account page will be displayed")
	public void normal_my_account_page_will_be_displayed() {
		System.out.println("Normal My account page will be displayed");
	}
	@Then("Normal My Account Header will be displayed")
	public void normal_my_account_header_will_be_displayed() {
		System.out.println("Normal My Account Header will be displayed");
	}
	
	@Given("Login Page displayed for user")
	public void login_page_displayed_for_user() {
	   System.out.println("Login Page displayed for user");
	}
	@When("Admin User login into the application with Admin Credential username {string} and password {string}")
	public void admin_user_login_into_the_application_with_admin_credential_username_and_password(String username, String password) {
		System.out.println("UserName is: "+username);
		System.out.println("Password Is: "+password);
	}
	@Then("Admin My account page will be displayed")
	public void admin_my_account_page_will_be_displayed() {
	    System.out.println("Admin My account page will be displayed");
	}
	@Then("Admin My Account Header will be displayed")
	public void admin_my_account_header_will_be_displayed() {
	    System.out.println("Admin My Account Header will be displayed");
	}
}
