package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0002_cucumberoptionsft/01_CucumberOptionsPlugin.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	plugin="pretty" // Console Output will print in a good and color format
) 
public class RN01_CucumberOptionsPluginRunner extends AbstractTestNGCucumberTests
{

}
