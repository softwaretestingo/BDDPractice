package sto000502_backgroundrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/background",
		glue="stepdefinitions",
		monochrome=true
		)
public class BackgroundRunner extends AbstractTestNGCucumberTests{

}
