package sto000603_cucumberExpressionsSDParameters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sto02_Objects.Product_Shoes;

//Two Different Scenario
public class SD07_CucumberExpressionCustomParameterStep 
{
	@Given("FT07_I am in the Store page")
	public void ft07_i_am_in_the_store_page() 
	{
		System.out.println("I am in the Store page");
	}
	@When("FT07_I add a {productValues} into my Cart")
	public void ft07_i_add_a_into_my_cart(Product_Shoes product) 
	{
		System.out.println("Product Name: " + product.getName());
	}
	@Then("FT07_I can see the selected product in my Cart page")
	public void ft07_i_can_see_the_selected_product_in_my_cart_page() 
	{
		System.out.println("I can see the selected product in my Cart page");
	}
	
	
	@Given("I am in the Store page")
	public void i_am_in_the_store_page() 
	{
		
	}

	@When("I add a {productValues} into my Cart")
	public void i_add_a_into_my_cart(Product_Shoes product) 
	{
		System.out.println("Product Name: " + product.getName());
	}

	@Then("I can see the selected product in my Cart page")
	public void i_can_see_the_selected_product_in_my_cart_page() 
	{
		System.out.println("I can see the selected product in my Cart page");
	}
}