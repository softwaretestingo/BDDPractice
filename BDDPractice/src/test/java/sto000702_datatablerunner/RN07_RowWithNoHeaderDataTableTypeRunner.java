package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT07_RowWithNoHeaderDataTableType.feature",
	glue="sto000701_datatablesd"
)
public class RN07_RowWithNoHeaderDataTableTypeRunner extends AbstractTestNGCucumberTests
{
	
}