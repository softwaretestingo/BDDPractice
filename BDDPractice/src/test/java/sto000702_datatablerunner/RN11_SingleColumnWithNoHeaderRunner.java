package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT11_SingleColumnWithNoHeader.feature",
	glue="sto000701_datatablesd"
)
public class RN11_SingleColumnWithNoHeaderRunner extends AbstractTestNGCucumberTests
{
	
}
