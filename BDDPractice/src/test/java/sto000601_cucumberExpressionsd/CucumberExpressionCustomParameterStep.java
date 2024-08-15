package sto000601_cucumberExpressionsd;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sto02_Objects.Product_Shoes;
//Two Different Scenario
public class CucumberExpressionCustomParameterStep 
{	
	@Given("I am in the Store page")
	public void i_am_in_the_store_page() 
	{
		System.out.println("I am in the Store page");
	}
	@When("I add a {productValues} into my Cart")
	public void i_add_a_into_my_cart(Product_Shoes product) 
	{
	    System.out.println("Product Name: "+product.getName());
	}
	@Then("I can see the selected product in my Cart page")
	public void i_can_see_the_selected_product_in_my_cart_page() 
	{
		System.out.println("I can see the selected product in my Cart page");
	}
}