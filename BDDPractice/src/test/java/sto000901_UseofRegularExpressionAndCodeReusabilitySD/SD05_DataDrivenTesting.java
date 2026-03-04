package sto000901_UseofRegularExpressionAndCodeReusabilitySD;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD05_DataDrivenTesting 
{
	@Given("FT05_User is on the Registration page")
	public void ft05_user_is_on_the_registration_page() 
	{
		System.out.println("User Is On the Registration Page");
	}

	@When("FT05_User Register With the Details")
	public void ft05_user_register_with_the_details(List<String> data) 
	{
	    System.out.println("First Name : "+ data.get(0));
	    System.out.println("Last Name : "+ data.get(1));
	    System.out.println("Email ID : "+ data.get(2));
	    System.out.println("Contact No : "+ data.get(3));
	}
	@Then("FT05_Home page is displayed")
	public void ft05_home_page_is_displayed() 
	{
	   System.out.println("Home page is displayed");
	}
	@Then("FT05_Cards are displayed")
	public void ft05_cards_are_displayed() 
	{
	    System.out.println("Cards are displayed");
	}
}
