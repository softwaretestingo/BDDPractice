package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0007_datatableft/FT15_SingleColumnwithHeaderDataTableTypeWithDataTable.feature",
	glue="sto000701_datatablesd"
)
public class RN14_SingleColumnWithHeaderDataTypeTableRunner extends AbstractTestNGCucumberTests
{
	
}