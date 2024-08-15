package sto000702_datatablerunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/sto0007_datatableft/FT16_nNumberParameters.feature",
		glue="sto000701_datatablesd",
		monochrome=true
		)
public class RN16_nNumberParametersRunner extends AbstractTestNGCucumberTests{

}
