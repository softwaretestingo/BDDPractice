package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto03_cucumberDataTablesFT/12_SingleColumnWithHeader.feature",
	glue="sto03_cucumberDataTablesSD"
)
public class SingleColumnWithHeaderRunner extends AbstractTestNGCucumberTests
{
	
}
