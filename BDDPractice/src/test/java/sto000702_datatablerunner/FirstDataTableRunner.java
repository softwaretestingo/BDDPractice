package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto03_cucumberDataTablesFT/01_FirstDatabaleEx.feature",
	glue="sto03_cucumberDataTablesSD",  // Only Package Name Mention
	plugin="pretty"
)
public class FirstDataTableRunner extends AbstractTestNGCucumberTests
{
	
}
