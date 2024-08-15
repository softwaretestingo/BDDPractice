package sto0004_hooksft;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks 
{
	
	@Before("@admin")
	public void setupAdminDataBase() 
	{
		System.out.println("Admin DataBase Setup Complete");
	}
	
	@Before("@normal")
	public void setupNoprmalUserDataBase() 
	{
		System.out.println("***************************************");
		System.out.println("Normal User DataBase Setup Complete");
	}
	
	@After
	public void clear()
	{
		System.out.println("Clear The Database Entries");
	}

}
