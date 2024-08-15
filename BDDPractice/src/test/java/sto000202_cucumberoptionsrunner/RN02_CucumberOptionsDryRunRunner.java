package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions
(
	features="src/test/java/sto0002_cucumberoptionsft/02_CucumberOptionsDryRun.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	plugin={"pretty"}, // Console Output will print in a good and color format
	monochrome=true, //In Console Result There is no difference If You Use
	dryRun=true
) 
public class RN02_CucumberOptionsDryRunRunner extends AbstractTestNGCucumberTests
{

}
