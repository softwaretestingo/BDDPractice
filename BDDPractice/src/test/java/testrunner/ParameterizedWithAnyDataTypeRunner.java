package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/parameterizedWithAnyDataType",
		glue="stepdefinitions",
		monochrome=true
		)
public class ParameterizedWithAnyDataTypeRunner extends AbstractTestNGCucumberTests{

}
