package sto000102_firstprogrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		/**
		 * 1. You can define the package name for run all the feature files of that package
		 * 2. If you want to run specific feature file then you need to mention the file name as well
		 * 3. You can Define multiple feature file name separate by comma
		 * 
		 * Features: Define Where Your Feature File Is Located 
		 * Glue: Define where where step definitions & hooks are located, multiple glue = {"stepdefs", "hooks", "utils"}
		 * Tags: Controls which scenarios will executed [Same As TestNG Groups]
		 * Plugin: Used For Reporting and output format
		 * Monochrome: Cleaner console output, Removes unreadable ANSI color characters in console/logs.
		 * dryRun: Checks step-definition mapping without executing tests
		 * 		   Use when:
		 * 				you want to verify missing step definitions
						you don’t want browser/API execution
					Output:
						Missing step definitions only
			Publish: Publish execution report to Cucumber Cloud
			
		 */

		features="src/test/java/sto0001_firstprogft",
		glue="sto000101_firstprogsd", //only mention package name
		plugin="usage",
		monochrome=false
)
public class FirstProgramRunner extends AbstractTestNGCucumberTests
{

}
