package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="src/test/java/features",
glue="stepdefinitions", //only mention package name
publish=true)
public class Publish extends AbstractTestNGCucumberTests 
{

}
