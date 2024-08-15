package sto000701_datatablesd;
import java.util.List;
import java.util.Map;
import io.cucumber.java.en.Given;
public class SingleRowWithHeaderWithListOfMapSD 
{
	@Given("my Blog credentials For Single Row with Header With ListOfMap")
	public void my_blog_credentials_for_single_row_with_header_with_list_of_map(List<Map<String, String>> dataTable) 
	{
		System.out.println("UserName: "+ dataTable.get(0).get("UserName"));
		System.out.println("UserName: "+ dataTable.get(0).get("Password"));
	}
}