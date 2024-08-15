package sto000701_datatablesd;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class SingleRowWithNoHeaderValueSD 
{
	@Given("my Blog credential")
	public void my_credential(DataTable dataTable) 
	{
	    List<String> cred= dataTable.values();
	    System.out.println("UserName : "+cred.get(0));
	    System.out.println("Password : "+cred.get(1));
	}
}