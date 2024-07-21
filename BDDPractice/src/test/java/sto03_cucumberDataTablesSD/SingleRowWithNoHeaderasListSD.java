package sto03_cucumberDataTablesSD;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class SingleRowWithNoHeaderasListSD 
{
	@Given("my credential")
	public void my_credential(DataTable dataTable) 
	{
	    List<String> cred= dataTable.asList();
	    System.out.println("UserName : "+cred.get(0));
	    System.out.println("Password : "+cred.get(1));
	}
}