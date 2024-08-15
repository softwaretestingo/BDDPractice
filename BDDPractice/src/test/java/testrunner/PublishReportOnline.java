package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="src/test/java/sto0008_scenariooutlineft",
glue="sto000801_scenariooutlinesd", //only mention package name
publish=true)
public class PublishReportOnline extends AbstractTestNGCucumberTests 
{

}
