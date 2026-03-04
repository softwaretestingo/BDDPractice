package sto000601_cucumberExpressionsd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD01_RegularExpressionStep 
{
	@Given("FT01_User is on the login page")
	public void ft01_user_is_on_the_login_page() 
	{
		System.out.println("User is on the login page");
	}
	@When("FT01_User Enter User1 Details")
	public void ft01_user_enter_user1_details() 
	{
		System.out.println("User Enter User1 Details");
	}
	// Here Regular Expression Used
	@Then("^FT01_User (.*) Profile Page Will Be Display$")
	public void ft01_user_profile_page_will_be_display(Integer int1) 
	{
		System.out.println("User "+int1+" Profile Page Will Be Display");
	}
	@Then("FT01_User1 Details Will Be Display")
	public void ft01_user1_details_will_be_display() 
	{
		System.out.println("User1 Details Will Be Display");
	}
}