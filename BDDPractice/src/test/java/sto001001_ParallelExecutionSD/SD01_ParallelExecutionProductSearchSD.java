package sto001001_ParallelExecutionSD;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD01_ParallelExecutionProductSearchSD 
{
	WebDriver driver;
	String productURL="https://softwaretestingo.blogspot.com/2026/03/product-page.html";
	String productName;
	Boolean result;
	
	@Given("User is on the Product Landing Page")
	public void user_is_on_the_product_landing_page() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(productURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@When("User Search {string} in the SearchBox")
	public void user_search_in_the_search_box(String productName) 
	{
		driver.findElement(By.id("searchInput")).sendKeys(productName);
	}
	@Then("{string} product Should be Displayed")
	public void product_should_be_displayed(String productName) throws InterruptedException 
	{
		//String name="//*[contains(text(),'"+productName+"')]";
		result= driver.findElement(By.xpath("//*[contains(text(),'"+productName+"')]")).isDisplayed();
		Thread.sleep(5000);
	}
	@Then("Validate Proudct Name")
	public void validate_proudct_name() 
	{
		if(result)
		{
			System.out.println("Product Is Displayed");
		}
		else
		{
			System.out.println("Product Is Not Displayed");
			Assert.assertTrue(false);
			driver.quit();
		}
		driver.quit();
	}
}
