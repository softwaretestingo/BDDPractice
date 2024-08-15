package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Two Different Scenario
@CucumberOptions
(
	features="src/test/java/sto0006_cucumberExpressionft/FT05_AlternativeTextEx.feature",
	glue="sto000601_cucumberExpressionsd",  // Only Package Name Mention
	plugin="pretty"
)
public class RN05_CucumberExpressionAlternativeTextRunner extends AbstractTestNGCucumberTests{

}
