package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0002_cucumberoptionsft/04_AllCucumberOptionsUse.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	tags = "@smoke or @sanity",
	plugin={"pretty","summary"}, // Console Output will print in a good and color format
	monochrome = true,
	dryRun = false,
	publish = true
) 
public class RN10_AllCucumberOptions extends AbstractTestNGCucumberTests
{

}
