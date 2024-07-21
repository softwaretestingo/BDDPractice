package sto02_cucumberExpressionRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// On a Single Scenario
@CucumberOptions
(
	features="src/test/java/sto02_cucumberExpressionFT/06_AlternativeTextEx.feature",
	glue="sto02_cucumberExpressionSD",  // Only Package Name Mention
	plugin="pretty"
)
public class CucumberExpressionAlternativeTextRunner2 extends AbstractTestNGCucumberTests{

}
