package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/java/sto02_cucumberExpressionFT/04_OptionalTextEx.feature",
	glue="sto02_cucumberExpressionSD",  // Only Package Name Mention
	plugin="pretty"
)
public class CucumberExpressionOptionalTextRunner extends AbstractTestNGCucumberTests{

}
