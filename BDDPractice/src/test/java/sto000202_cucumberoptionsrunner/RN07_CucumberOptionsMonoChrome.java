package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0002_cucumberoptionsft/01_CucumberOptionsPlugin.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	plugin={"pretty","summary"}, // Console Output will print in a good and color format
	monochrome = true // Best to Use Plugin or Monochrome, not both
) 
public class RN07_CucumberOptionsMonoChrome extends AbstractTestNGCucumberTests
{

}
