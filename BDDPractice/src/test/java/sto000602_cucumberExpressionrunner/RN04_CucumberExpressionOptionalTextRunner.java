package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/java/sto0006_cucumberExpressionft/FT04_OptionalTextEx.feature",
	glue="sto000601_cucumberExpressionsd",  // Only Package Name Mention
	plugin="pretty"
)
public class RN04_CucumberExpressionOptionalTextRunner extends AbstractTestNGCucumberTests{

}
