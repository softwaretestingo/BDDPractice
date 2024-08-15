package sto000701_datatablesd;
import java.util.List;
import java.util.Map;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import sto03_Objects.SoftwareTestingCredentialsForMultipleRows;
public class SD09_MultipleRowsWithHeaderWithListOfMapSD 
{
	// DataTable Transformer
	@DataTableType
	public SoftwareTestingCredentialsForMultipleRows credEntry(List<String> entrys)
	{
		// Here we are returning the UserName and Password
		return new SoftwareTestingCredentialsForMultipleRows(entrys.get(0), entrys.get(1));
	}
	
	@Given("my Blog credentials For Multiple Rows with Header")
	public void my_blog_credentials_for_multiple_rows_with_header(List<Map<String, String>> dataTables) 
	{
		System.out.println("1st User Name: "+ dataTables.get(0).get("UserName"));
		System.out.println("1st User Name: "+ dataTables.get(0).get("Password"));
		System.out.println("2nd User Name: "+ dataTables.get(1).get("UserName"));
		System.out.println("2nd User Name: "+ dataTables.get(1).get("Password"));
	}
}