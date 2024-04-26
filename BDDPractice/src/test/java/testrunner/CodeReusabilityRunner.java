package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/codeReusability",
		glue="stepdefinitions",
		monochrome=true
		)
public class CodeReusabilityRunner extends AbstractTestNGCucumberTests{

}
