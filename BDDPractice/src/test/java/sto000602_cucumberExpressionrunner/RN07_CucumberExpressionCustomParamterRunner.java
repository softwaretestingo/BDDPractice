package sto000602_cucumberExpressionrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto0006_cucumberExpressionft/FT07_CustomParameterEx.feature",
	glue= { "sto000601_cucumberExpressionsd", "sto000603_Types" }
)
public class RN07_CucumberExpressionCustomParamterRunner extends AbstractTestNGCucumberTests 
{

}