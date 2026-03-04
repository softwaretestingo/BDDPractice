package sto000601_cucumberExpressionsd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//Two Different Scenario
public class SD05_CucumberExpressionAlternativeTextStep 
{
	@Given("Add One Quantity to the Cart")
	public void add_one_quantity_to_the_cart() 
	{
		System.out.println("Add One Quantity to the Cart");
	}
	@When("I am On the Store/Product Page")
	public void i_am_on_the_store_page() 
	{
		System.out.println("I am On the Store/Product Page");
	}
	@Then("I add a {string} to the Cart")
	public void i_add_a_to_the_cart(String productName) 
	{
		System.out.println("I add a "+ productName +"to the Cart from store");
	}
	@Then("I See Product in the Cart")
	public void i_see_product_in_the_cart() 
	{
		System.out.println("I See Product in the Cart");
	}
}