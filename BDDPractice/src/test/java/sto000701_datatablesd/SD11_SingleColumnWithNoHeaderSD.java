package sto000701_datatablesd;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
public class SD11_SingleColumnWithNoHeaderSD 
{
	@Given("Single Column with No Header Data Table Type")
	public void single_column_with_no_header_data_table_type(DataTable dataTable) 
	{
	   List<String> cred=dataTable.asList();
	   System.out.println("1st User Name: "+cred.get(0));
	   System.out.println("2nd User Name: "+cred.get(1));
	}
}
