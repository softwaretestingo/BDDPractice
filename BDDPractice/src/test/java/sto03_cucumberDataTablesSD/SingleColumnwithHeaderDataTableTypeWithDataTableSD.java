package sto03_cucumberDataTablesSD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import sto03_Objects.CredentialsSingleColumnWithHeaderDataTypeTable;
public class SingleColumnwithHeaderDataTableTypeWithDataTableSD 
{
	@DataTableType
	//When we use DataTable we Need to Implement Own Own Logic
	public CredentialsSingleColumnWithHeaderDataTypeTable credentials(DataTable dataTable)
	{
		return new CredentialsSingleColumnWithHeaderDataTypeTable (dataTable.row(0).get(1), dataTable.row(1).get(1));
	}
	
	@Given("Single Columns with Header Data Table Type")
	// With Out @Transpost Annotation Also we can Run Our Program
	public void single_columns_with_header_data_table_type(CredentialsSingleColumnWithHeaderDataTypeTable dataTable) 
	{
	    System.out.println("User Name: "+dataTable.getUserName());
	    System.out.println("Password: "+dataTable.getPassword());
	}
}
