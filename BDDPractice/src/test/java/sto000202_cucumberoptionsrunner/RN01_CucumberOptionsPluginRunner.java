package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	/**
	 * 1. You can define the package name for run all the feature files of that package
	 * 2. If you want to run specific feature file then you need to mention the file name as well
	 * 3. You can Define multiple feature file name separate by comma
	 */
	
	features="src/test/java/sto0002_cucumberoptionsft/01_CucumberOptionsPlugin.feature",
	glue="sto000201_cucumberOptionssd", //only mention package name
	plugin="pretty" // Console Output will print in a good and color format
) 
public class RN01_CucumberOptionsPluginRunner extends AbstractTestNGCucumberTests
{

}
