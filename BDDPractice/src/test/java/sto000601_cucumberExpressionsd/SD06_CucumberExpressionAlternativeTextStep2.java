package sto000601_cucumberExpressionsd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//On a Single Scenario
public class SD06_CucumberExpressionAlternativeTextStep2 
{
	@Given("FT06_Go to the Product Page")
	public void ft06_go_to_the_product_page() 
	{
		System.out.println("Go to the Product Page");
	}
	@When("FT06_I am On the Product Page")
	public void ft06_i_am_on_the_product_page() 
	{
		System.out.println("I am On the Product Page");
	}
	@Then("FT06_I have add a {string} into the Cart")
	public void ft06_i_have_add_a_into_the_cart(String productName) 
	{
		System.out.println("I have add a "+ productName +" into the Cart");
	}
	@Then("FT06_I Can See Product/Store in the Cart")
	public void ft06_i_can_see_product_in_the_cart() 
	{
		System.out.println("I Can See Product/Store in the Cart");
	}
}