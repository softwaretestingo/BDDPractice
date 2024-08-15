package sto000102_firstprogrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features="src/test/java/sto0001_firstprogfeature",
glue="sto000101_firstprogsd", //only mention package name
plugin="usage",
monochrome=false)
public class FirstProgramRunner extends AbstractTestNGCucumberTests
{

}
