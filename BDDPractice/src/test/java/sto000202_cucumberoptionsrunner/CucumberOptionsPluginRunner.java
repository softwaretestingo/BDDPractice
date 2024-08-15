package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="src/test/java/sto01_cucumberOptions/01_CucumberOptionsPlugin.feature",
glue="sto01_cucumberOptionsSD", //only mention package name
plugin="pretty" // Console Output will print in a good and color format
) 
public class CucumberOptionsPluginRunner extends AbstractTestNGCucumberTests
{

}
