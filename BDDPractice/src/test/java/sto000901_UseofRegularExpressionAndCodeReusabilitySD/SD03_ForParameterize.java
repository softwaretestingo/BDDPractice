package sto000901_UseofRegularExpressionAndCodeReusabilitySD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD03_ForParameterize 
{
	@Given("FT03_User is on the netbanking landing page")
	public void ft03_user_is_on_the_netbanking_landing_page()
	{
		System.out.println("User is on the netbanking landing page");
	}
	@When("FT03_User login into application with {string} and password {string}")
	public void ft03_user_login_into_application_with_and_password(String uname, String pwd)
	{
	    System.out.println("Entered User Name is : " + uname + " and Password is :" + pwd);
	}
	@Then("FT03_Home page is displayed")
	public void ft03_home_page_is_displayed()
	{
	    System.out.println("Home page is displayed");
	}
	@Then("FT03_Cards are displayed")
	public void ft03_cards_are_displayed() 
	{
	    System.out.println("Cards are displayed");
	}
}
