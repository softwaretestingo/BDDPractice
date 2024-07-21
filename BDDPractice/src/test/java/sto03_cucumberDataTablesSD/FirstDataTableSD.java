package sto03_cucumberDataTablesSD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class FirstDataTableSD 
{
	@Given("my credentials")
	public void my_credentials(DataTable dataTable) 
	{
	   System.out.println("Data Table");
	}
}