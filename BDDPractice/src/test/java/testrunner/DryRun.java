package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// If You Set dryRun=true that means Compile But it will not run
@CucumberOptions(
		features="src/test/java/hooks",
		glue={"stepdefinitions","hooks"},
		dryRun=false,
		monochrome=true //In Console Result There is no difference If You Use
		)
public class DryRun extends AbstractTestNGCucumberTests{

}

