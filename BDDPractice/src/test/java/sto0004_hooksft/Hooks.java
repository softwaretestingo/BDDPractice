package sto0004_hooksft;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
public class Hooks 
{
	@Before(value ="@admin", order=2)
	public void setupAdminDataBase(Scenario sc) 
	{
		System.out.println("Admin DataBase Setup Complete Order 1");
		System.out.println("Scenario Name: "+sc.getName());
	}
	
	@Before(value ="@admin", order=1)
	public void setupAdminDataBase1(Scenario sc) 
	{
		System.out.println("Admin DataBase Setup Complete Order 2");
		System.out.println("Scenario Name: "+sc.getName());
	}
	
	@Before("@normal")
	public void setupNoprmalUserDataBase() 
	{
		System.out.println("***************************************");
		System.out.println("Normal User DataBase Setup Complete");
	}
	
	@BeforeStep
	public void beforeStepex()
	{
		System.out.println("Before Step Executed");
	}
	
	@AfterStep
	public void afterStepex()
	{
		System.out.println("After Step Executed");
	}
	
	@After
	public void clear()
	{
		System.out.println("Clear The Database Entries");
	}
}