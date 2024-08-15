package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT03_SingleRowWithNoHeaderWithValues.feature",
	glue="sto000701_datatablesd"
)
public class RN03_SingleRowWithNoHeaderValueRunner extends AbstractTestNGCucumberTests
{
	
}