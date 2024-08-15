package sto000701_datatablesd;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import sto000703_Objects.CredentialsSingleColumnWithHeaderDataTypeTable;
public class SD14_SingleColumnWithHeaderDataTypeTableSD 
{
	@DataTableType
	public CredentialsSingleColumnWithHeaderDataTypeTable credentials(Map<String, String> entry)
	{
		return new CredentialsSingleColumnWithHeaderDataTypeTable (entry.get("username"), entry.get("password"));
	}
	
	@Given("Single Column with Header Data Table Type")
	public void single_column_with_header_data_table_type(@Transpose CredentialsSingleColumnWithHeaderDataTypeTable dataTable) 
	{
	    System.out.println("User Name: "+dataTable.getUserName());
	    System.out.println("Password: "+dataTable.getPassword());
	}
}
