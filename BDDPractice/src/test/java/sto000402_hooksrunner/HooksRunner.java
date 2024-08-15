package sto000402_hooksrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/hooks",
		glue={"stepdefinitions","hooks"},
		monochrome=true //In Console Result There is no difference If You Use
		)
public class HooksRunner extends AbstractTestNGCucumberTests{

}