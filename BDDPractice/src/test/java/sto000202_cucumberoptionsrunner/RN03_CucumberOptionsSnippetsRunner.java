package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions
(
	features="src/test/java/sto0002_cucumberoptionsft/01_CucumberOptionsPlugin.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	plugin={"pretty","summary"}, // Console Output will print in a good and color format
	snippets = SnippetType.CAMELCASE // This Will Suggest Method Name For StepDefination In CamelCase
) 
public class RN03_CucumberOptionsSnippetsRunner extends AbstractTestNGCucumberTests
{

}
