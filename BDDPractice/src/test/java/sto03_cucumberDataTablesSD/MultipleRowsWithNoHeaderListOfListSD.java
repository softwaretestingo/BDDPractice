package sto03_cucumberDataTablesSD;
import java.util.List;
import io.cucumber.java.en.Given;
public class MultipleRowsWithNoHeaderListOfListSD 
{
	@Given("my Blog credentials For Multiple Rows with No Header")
	public void my_blog_credentials_for_multiple_rows_with_no_header(List<List<String>> cred) 
	{
	    System.out.println("UserName: "+cred.get(0).get(0));
	    System.out.println("UserName: "+cred.get(0).get(1));
	    System.out.println("UserName: "+cred.get(1).get(0));
	    System.out.println("UserName: "+cred.get(1).get(1));
	}
}