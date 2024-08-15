package sto000701_datatablesd;
import java.util.List;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import sto03_Objects.CredentialsForSingleColumnWithNoHeaderDataTypeTable;
public class SD13_SingleColumnWithNoHeaderDataTypeTableSD 
{
	@DataTableType
	public CredentialsForSingleColumnWithNoHeaderDataTypeTable credentials(List<String> entry)
	{
		return new CredentialsForSingleColumnWithNoHeaderDataTypeTable (entry.get(0), entry.get(1));
	}
	
	@Given("Single Column With No Header")
	//@Transpose annotation helps you convert datatable columns into list
	public void single_column_with_no_header(@Transpose  CredentialsForSingleColumnWithNoHeaderDataTypeTable dataTable) 
	{
	   System.out.println("1st User Name: "+dataTable.getUserName());
	   System.out.println("2nd User Name: "+dataTable.getPassword());
	}
}
