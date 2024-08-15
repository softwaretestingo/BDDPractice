package sto000602_cucumberExpressionrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
	features="src/test/java/sto02_cucumberExpressionFT/07_CustomParameterEx.feature",
	glue= { "sto02_cucumberExpressionSD", "sto02_Types" }
)
public class CucumberExpressionCustomParamterRunner extends AbstractTestNGCucumberTests 
{

}