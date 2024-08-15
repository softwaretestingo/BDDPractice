package sto000601_cucumberExpressionsd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD03_CucumberExpressionParameterTypesStep 
{
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("User is on the login page");
	}
	@When("User Enter {int}, {double}, {string}, \\{}  Details")
	public void user_enter_details(Integer int1, Double double1, String string) {
	    System.out.println("Int Value: "+int1);
	    System.out.println("Double Value: "+double1);
	    System.out.println("String Value: "+string);
	}
	@Then("User Profile Page Will Be Display")
	public void user_profile_page_will_be_display() {
	    System.out.println("User Profile Page Will Be Display");
	}
	@Then("User Details Will Be Display")
	public void user_details_will_be_display() {
	    System.out.println("User Details Will Be Display");
	}
}