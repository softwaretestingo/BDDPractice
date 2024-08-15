package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// On a Single Scenario
@CucumberOptions
(
	features="src/test/java/sto0006_cucumberExpressionft/FT06_AlternativeTextEx.feature",
	glue="sto000601_cucumberExpressionsd",  // Only Package Name Mention
	plugin="pretty"
)
public class RN06_CucumberExpressionAlternativeTextRunner2 extends AbstractTestNGCucumberTests{

}
