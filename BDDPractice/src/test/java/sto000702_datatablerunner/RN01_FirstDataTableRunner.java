package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT01_FirstDatabaleEx.feature",
	glue="sto000701_datatablesd",  // Only Package Name Mention
	plugin="usage"
)
public class RN01_FirstDataTableRunner extends AbstractTestNGCucumberTests
{
	
}
