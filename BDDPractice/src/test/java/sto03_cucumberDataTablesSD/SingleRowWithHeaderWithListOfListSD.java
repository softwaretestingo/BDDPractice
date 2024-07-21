package sto03_cucumberDataTablesSD;
import java.util.List;
import io.cucumber.java.en.Given;
public class SingleRowWithHeaderWithListOfListSD 
{
	@Given("my Blog credentials For Single Row with Header With ListOfList")
	public void my_blog_credentials_for_single_row_with_header_with_list_of_list(List<List<String>> dataTable) 
	{
		// Skipping First Row and Retrieving 2nd Row first and second value
	    System.out.println("UserName: "+ dataTable.get(1).get(0));
	    System.out.println("Password: "+ dataTable.get(1).get(1));
	    
	}
}