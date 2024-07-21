package sto03_cucumberDataTablesSD;
import java.util.List;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import sto03_Objects.SoftwareTestingCredentials;
public class RowWithNoHeaderDataTableTypeSD 
{
	// DataTable Transformer
	@DataTableType
	public SoftwareTestingCredentials credEntry(List<String> entry)
	{
		// Here we are returning the UserName and Password
		return new SoftwareTestingCredentials(entry.get(0), entry.get(1));
	}
	
	@Given("my Blog credentials For Rows with No Header Data Table Type")
	public void my_blog_credentials_for_rows_with_no_header_data_table_type(List<SoftwareTestingCredentials> dataTable) 
	{
	    System.out.println("1st UserName: "+dataTable.get(0).getUserName());
	    System.out.println("1st Password: "+dataTable.get(0).getPassword());
	    System.out.println("2nd UserName: "+dataTable.get(1).getUserName());
	    System.out.println("2nd Password: "+dataTable.get(1).getPassword());
	}
}
