package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT06_SingleRowWithHeaderWithListOfMap.feature",
	glue="sto000701_datatablesd"
)
public class RN06_SingleRowWithHeaderWithListOfMapRunner extends AbstractTestNGCucumberTests
{

}