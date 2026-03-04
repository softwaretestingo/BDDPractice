package sto000201_cucumberOptionssd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD04_AllCucumberOptionsUse 
{
	@Given("Normal User is on the CucumberOptions login page")
	public void normal_user_is_on_the_cucumber_options_login_page() 
	{
	    System.out.println("Normal User is on the CucumberOptions login page");
	}
	@When("Normal User login into the CucumberOptions application")
	public void normal_user_login_into_the_cucumber_options_application() 
	{
	    System.out.println("Normal User login into the CucumberOptions application");
	}
	@Then("CucumberOptions Normal user My account page will be displayed")
	public void cucumber_options_normal_user_my_account_page_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Normal user My account page will be displayed");
	}
	@Then("CucumberOptions Normal User My Account Header will be displayed")
	public void cucumber_options_normal_user_my_account_header_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Normal User My Account Header will be displayed");
	}
	
	@Given("Admin User is on the CucumberOptions login page")
	public void admin_user_is_on_the_cucumber_options_login_page()
	{
	    System.out.println("Admin User is on the CucumberOptions login page");
	}
	@When("Admin User login into the CucumberOptions application")
	public void admin_user_login_into_the_cucumber_options_application()
	{
	    System.out.println("Admin User login into the CucumberOptions application");
	}
	@Then("CucumberOptions Admin user My account page will be displayed")
	public void cucumber_options_admin_user_my_account_page_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Admin user My account page will be displayed");
	}
	@Then("CucumberOptions Admin User My Account Header will be displayed")
	public void cucumber_options_admin_user_my_account_header_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Admin User My Account Header will be displayed");
	}
	
	@Given("Guest User is on the CucumberOptions login page")
	public void guest_user_is_on_the_cucumber_options_login_page()
	{
	    System.out.println("Guest User is on the CucumberOptions login page");
	}
	@When("Guest User login into the CucumberOptions application")
	public void guest_user_login_into_the_cucumber_options_application()
	{
	    System.out.println("Guest User login into the CucumberOptions application");
	}
	@Then("CucumberOptions Guest user My account page will be displayed")
	public void cucumber_options_guest_user_my_account_page_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Guest user My account page will be displayed");
	}
	@Then("CucumberOptions Guest User My Account Header will be displayed")
	public void cucumber_options_guest_user_my_account_header_will_be_displayed()
	{
	   System.out.println("CucumberOptions Guest User My Account Header will be displayed");
	}
	
	@Given("Test User is on the CucumberOptions login page")
	public void test_user_is_on_the_cucumber_options_login_page()
	{
	   System.out.println("Test User is on the CucumberOptions login page");
	}
	@When("Test User login into the CucumberOptions application")
	public void test_user_login_into_the_cucumber_options_application()
	{
	    System.out.println("Test User login into the CucumberOptions application");
	}
	@Then("CucumberOptions Test user My account page will be displayed")
	public void cucumber_options_test_user_my_account_page_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Test user My account page will be displayed");
	}
	@Then("CucumberOptions Test User My Account Header will be displayed")
	public void cucumber_options_test_user_my_account_header_will_be_displayed() 
	{
	    System.out.println("CucumberOptions Test User My Account Header will be displayed");
	}
}