package sto02_cucumberExpressionSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegularExpressionStep 
{
	@Given("REUser is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("User is on the login page");
	}
	@When("REUser Enter User1 Details")
	public void user_enter_user1_details() {
	    System.out.println("User Enter User1 Details");
	}
	
	// Here Regular Expression Used
	@Then("^REUser (.*) Profile Page Will Be Display$")
	public void user_profile_page_will_be_display(Integer int1) {
	    System.out.println("User 1 Profile Page Will Be Display");
	    
	}
	@Then("REUser1 Details Will Be Display")
	public void user1_details_will_be_display() {
	    System.out.println("User1 Details Will Be Display");
	 
	}
}