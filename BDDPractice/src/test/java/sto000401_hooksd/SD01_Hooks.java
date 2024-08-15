package sto000401_hooksd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD01_Hooks
{
	@Given("Login Page displayed for user")
	public void login_page_displayed_for_user() {
	    System.out.println("Login Page displayed for user");
	}
	@When("Admin User login into the application with Admin Credential username {string} and password {string}")
	public void admin_user_login_into_the_application_with_admin_credential_username_and_password(String string, String string2) {
	    System.out.println("User Login with the credentials");
	}
	@Then("Admin My account page will be displayed")
	public void admin_my_account_page_will_be_displayed() {
	    System.out.println("My Account Page is Displayed");
	}
	@Then("Admin My Account Header will be displayed")
	public void admin_my_account_header_will_be_displayed() {
		System.out.println("Header Page is Displayed");
	}
	
	@Given("Normal User is on the login page")
	public void normal_user_is_on_the_login_page() {
	   System.out.println("Normal User Login Page Displayed");
	}
	@When("Normal User login into the application with Normal User Credential username {string} and password {string}")
	public void normal_user_login_into_the_application_with_normal_user_credential_username_and_password(String string, String string2) {
	   System.out.println("Normal User Login With Credentials");
	}
	@Then("Normal My account page will be displayed")
	public void normal_my_account_page_will_be_displayed() {
	   System.out.println("Normal User My Account Page Displayed");
	}
	@Then("Normal My Account Header will be displayed")
	public void normal_my_account_header_will_be_displayed() {
	    System.out.println("Normal User Header Is Displaying");
	}
}
