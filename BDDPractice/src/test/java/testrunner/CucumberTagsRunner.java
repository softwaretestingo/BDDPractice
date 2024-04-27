package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/tags",
		glue="stepdefinitions",
		tags="@Scenario2",
		//tags="@Scenario1 and @Scenario3", //Run the scenario which are tagged with both @Scenario1 and @Scenario3
		//tags="@Scenario1 or @Scenario3", // Run the scenario which are tagged with either @Scenario1 or @Scenario3
		//tags="not @Scenario3", //Except @Scenario3 all other scenarios will be executed
		monochrome=true
		)
public class CucumberTagsRunner extends AbstractTestNGCucumberTests{

}
