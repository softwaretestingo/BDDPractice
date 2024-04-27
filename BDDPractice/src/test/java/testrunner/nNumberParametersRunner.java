package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/passingMoreParameters",
		glue="stepdefinitions",
		monochrome=true
		)
public class nNumberParametersRunner extends AbstractTestNGCucumberTests{

}
