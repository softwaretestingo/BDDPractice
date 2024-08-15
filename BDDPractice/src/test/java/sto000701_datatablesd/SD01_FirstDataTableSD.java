package sto000701_datatablesd;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class SD01_FirstDataTableSD 
{
	@Given("my credentials")
	public void my_credentials(DataTable dataTable) 
	{
	   System.out.println("Data Table");
	}
}