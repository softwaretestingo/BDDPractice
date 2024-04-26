package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src/test/java/features",
glue="stepdefinitions", //only mention package name
monochrome=true		)
public class FirstProgramRunner extends AbstractTestNGCucumberTests
{

}
