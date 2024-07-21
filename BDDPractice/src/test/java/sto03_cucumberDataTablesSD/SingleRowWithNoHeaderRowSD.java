package sto03_cucumberDataTablesSD;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class SingleRowWithNoHeaderRowSD 
{
	@Given("my Blog credentials")
	public void my_credential(DataTable dataTable) 
	{
		// It Will Choose the First Row, But you can also use other variation also
	    List<String> cred= dataTable.row(0);
	    System.out.println("UserName : "+cred.get(0));
	    System.out.println("Password : "+cred.get(1));
	}
}