package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto03_cucumberDataTablesFT/07_RowWithNoHeaderDataTableType.feature",
	glue="sto03_cucumberDataTablesSD"
)
public class RowWithNoHeaderDataTableTypeRunner extends AbstractTestNGCucumberTests
{
	
}