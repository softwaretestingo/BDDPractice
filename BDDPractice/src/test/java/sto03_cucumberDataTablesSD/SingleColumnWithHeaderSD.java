package sto03_cucumberDataTablesSD;
import java.util.Map;
import io.cucumber.java.en.Given;
public class SingleColumnWithHeaderSD 
{
	@Given("Single Column With Header")
	public void single_column_with_header(Map<String, String> cred) 
	{
		System.out.println("1st User Name: "+cred.get("UserName"));
		System.out.println("2nd User Name: "+cred.get("Password"));
	}
}
