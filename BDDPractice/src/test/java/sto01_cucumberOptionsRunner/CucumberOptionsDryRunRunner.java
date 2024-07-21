package sto01_cucumberOptionsRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(
features="src/test/java/sto01_cucumberOptions/02_CucumberOptionsDryRun.feature",
glue="sto01_cucumberOptionsSD", //only mention package name
plugin={"pretty"}, // Console Output will print in a good and color format
dryRun=true
		) 
public class CucumberOptionsDryRunRunner extends AbstractTestNGCucumberTests
{

}
