package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/parameterized",
		glue="stepdefinitions",
		monochrome=true
		)
public class ParameterizedRunner extends AbstractTestNGCucumberTests{

}
