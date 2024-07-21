package sto03_cucumberDataTablesRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto03_cucumberDataTablesFT/15_SingleColumnwithHeaderDataTableTypeWithDataTable.feature",
	glue="sto03_cucumberDataTablesSD"
)
public class SingleColumnWithHeaderDataTypeTableRunner extends AbstractTestNGCucumberTests
{
	
}