package sto02_cucumberExpressionSD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CucumberExpressionStep 
{
	@Given("CEUser is on the login page")
	public void ce_user_is_on_the_login_page() {
		System.out.println("User is on the login page");
	}
	@When("CEUser Enter User1 Details")
	public void ce_user_enter_user1_details() {
		System.out.println("User Enter User1 Details");
	}
	//Cucumber Expression Used Here
	@Then("CEUser {int} Profile Page Will Be Display")
	public void ce_user_profile_page_will_be_display(Integer int1) {
		System.out.println("User 1 Profile Page Will Be Display");
	}
	@Then("CEUser1 Details Will Be Display")
	public void ce_user1_details_will_be_display() {
		System.out.println("User1 Details Will Be Display");
	}
}