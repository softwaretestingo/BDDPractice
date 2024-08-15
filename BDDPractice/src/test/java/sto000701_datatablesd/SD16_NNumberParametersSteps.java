package sto000701_datatablesd;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD16_NNumberParametersSteps {
	
	@Given("user is on the Register page")
	public void user_is_on_the_register_page() {
	    System.out.println("user is on the Register page");
	}
	@When("User enter All the Required Details")
	public void user_enter_all_the_required_details(List<String> data) {
	    System.out.println("First Value : "+data.get(0));
	    System.out.println("Second Value : "+data.get(1));
	    System.out.println("Third Value : "+data.get(2));
	    System.out.println("Fourth Value : "+data.get(3));
	}
	@Then("User will redirect to Account Create Page")
	public void user_will_redirect_to_account_create_page() {
	    System.out.println("User will redirect to Account Create Page");
	}
	@Then("User can see Your Account Has Been Created! Header")
	public void user_can_see_your_account_has_been_created_header() {
	   System.out.println("User can see Your Account Has Been Created! Header");
	}
}
