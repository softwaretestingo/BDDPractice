package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto03_cucumberDataTablesFT/10_MultipleRowsWithHeaderWithDataTableType.feature",
	glue="sto03_cucumberDataTablesSD"
)
public class MultipleRowsWithHeaderWithDataTableTypeRunner extends AbstractTestNGCucumberTests
{
	
}