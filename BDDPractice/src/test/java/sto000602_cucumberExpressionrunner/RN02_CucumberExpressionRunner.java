package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/java/sto0006_cucumberExpressionft/FT03_ParameterTypesEx.feature",
	glue="sto000601_cucumberExpressionsd",  // Only Package Name Mention
	plugin="pretty"
)
public class RN02_CucumberExpressionRunner extends AbstractTestNGCucumberTests{

}
