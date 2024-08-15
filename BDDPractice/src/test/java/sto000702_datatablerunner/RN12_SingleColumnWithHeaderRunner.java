package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT12_SingleColumnWithHeader.feature",
	glue="sto000701_datatablesd"
)
public class RN12_SingleColumnWithHeaderRunner extends AbstractTestNGCucumberTests
{
	
}
