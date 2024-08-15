package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	// Want to Run Only Regular Expression Thats why mentioned the feature File
	// Otherwise it Will Execute All Feature File Present On that Package
	features="src/test/java/sto02_cucumberExpressionFT/01_RegularExpressionEx.feature",
	glue="sto02_cucumberExpressionSD",  // Only Package Name Mention
	plugin="pretty"
)
public class RegularExpressionRunner extends AbstractTestNGCucumberTests{

}
