package sto000801_scenariooutlinesd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD02_ParameterizedWithAnyDataTypeSteps {
	
	@Given("User in Application login page")
	public void user_in_application_login_page() {
	    System.out.println("User in Application login page");
	}
	
	// You need to Add ^ at beginning and $ at last
	// For Accept Any Data Type you need to mention this  (.+)
	@When("^User login into the application by username (.+) and password (.+)$")
	public void user_login_into_the_application_by_username_and_password_password2(String firstValue, String secondValue) {
		System.out.println("First Value: "+firstValue);
		System.out.println("Second Value: "+secondValue);
	}
	@Then("My account page Shows")
	public void my_account_page_shows() {
		System.out.println("My account page Shows");	    
	}
	@Then("My Account Header Shows")
	public void my_account_header_shows() {
	   System.out.println("My Account Header Shows");
	   System.out.println("----------*********--------------");
	}

}
