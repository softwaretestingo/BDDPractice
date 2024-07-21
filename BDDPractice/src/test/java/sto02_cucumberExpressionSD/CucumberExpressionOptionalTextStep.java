package sto02_cucumberExpressionSD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CucumberExpressionOptionalTextStep 
{
	@Given("Add One Quantity to the Cart")
	public void add_one_quantity_to_the_cart() {
	    
	}
	@When("I'm On trhe Store Page")
	public void i_m_on_trhe_store_page() {
	    
	}
	@Then("I add a {string} to the Cart")
	public void i_add_a_to_the_cart(String string) {
	    
	}
	//Here (s) Is an Optional Text
	@Then("I See {int} Product(s) in the Cart")
	public void i_see_product_in_the_cart(Integer int1) {
	    
	}
}