package sto000701_datatablesd;
import java.util.List;
import java.util.Map;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import sto000703_Objects.SoftwareTestingCredentialsForMultipleRowsWithDataTableType;
public class SD10_MultipleRowsWithHeaderWithDataTableTypeSD 
{
	// DataTable Transformer
	@DataTableType
	public SoftwareTestingCredentialsForMultipleRowsWithDataTableType credEntry(Map<String, String> entrys)
	{
		// Here we are returning the UserName and Password
		return new SoftwareTestingCredentialsForMultipleRowsWithDataTableType(entrys.get("UserName"), entrys.get("Password"));
	}
	
	@Given("my Blog credentials For Multiple Rows with Header Data Table")
	public void my_blog_credentials_for_multiple_rows_with_header_data_table(List<SoftwareTestingCredentialsForMultipleRowsWithDataTableType> dataTable) 
	{
	   System.out.println("1st User Name: "+ dataTable.get(0).getUserName());
	   System.out.println("1st Password: "+dataTable.get(0).getPassword());
	   System.out.println("2nd User Name: "+ dataTable.get(1).getUserName());
	   System.out.println("2nd Password: "+dataTable.get(1).getPassword());
	}
}