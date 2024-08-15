package sto000801_scenariooutlinesd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD01_ParameterizedSteps {
	@Given("User is on the Application login page")
	public void user_is_on_the_application_login_page() {
	    System.out.println("User is on the Application login page");
	}
	@When("User try to login into the application by username {string} and password {string}")
	public void user_try_to_login_into_the_application_with_username_and_password(String username, String password) {
	    System.out.println("UserName is :"+username);
	    System.out.println("Password is: "+password);
	}
	@Then("My account page displayed")
	public void my_account_page_displayed() {
	    System.out.println("My account page displayed");
	}
	@Then("My Account Header displayed")
	public void my_account_header_displayed() {
	    System.out.println("My Account Header displayed");
	    System.out.println("----------*********--------------");
	}
}
