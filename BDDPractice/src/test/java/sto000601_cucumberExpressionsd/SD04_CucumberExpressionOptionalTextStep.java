package sto000601_cucumberExpressionsd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD04_CucumberExpressionOptionalTextStep 
{
	@Given("FT04_Add One Quantity to the Cart")
	public void ft04_add_one_quantity_to_the_cart() 
	{
		System.out.println("Add One Quantity to the Cart");
	}
	@When("FT04_I'm On the Store Page")
	public void ft04_i_m_on_the_store_page()
	{
		System.out.println("I'm On the Store Page");
	}
	@Then("FT04_I add a {string} to the Cart")
	public void ft04_i_add_a_to_the_cart(String string) 
	{
		System.out.println("I add a \"Product Name\" to the Cart");
	}
	@Then("FT04_I See {int} Product(s) in the Cart")
	public void ft04_i_see_product_in_the_cart(Integer count) 
	{
		System.out.println("I See "+count+" Products in the Cart");
	}
}