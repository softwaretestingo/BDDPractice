package sto02_cucumberExpressionRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/java/sto02_cucumberExpressionFT/03_ParameterTypesEx.feature",
	glue="sto02_cucumberExpressionSD",  // Only Package Name Mention
	plugin="pretty"
)
public class CucumberExpressionParameterTypesRunner extends AbstractTestNGCucumberTests{

}
