package sto000602_cucumberExpressionrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	// Want to Run Only Regular Expression Thats why mentioned the feature File
	// Otherwise it Will Execute All Feature File Present On that Package
	features="src/test/java/sto0006_cucumberExpressionft/FT01_RegularExpressionEx.feature",
	glue="sto000601_cucumberExpressionsd",  // Only Package Name Mention
	plugin="usage"
)
public class RN01_RegularExpressionRunner extends AbstractTestNGCucumberTests{

}
