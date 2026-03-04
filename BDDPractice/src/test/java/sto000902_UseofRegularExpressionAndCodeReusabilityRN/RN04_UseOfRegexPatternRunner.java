package sto000902_UseofRegularExpressionAndCodeReusabilityRN;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features = "src/test/java/sto0009_UseofRegularExpressionAndCodeReusabilityFT/FT04_UseOfRegexPatterns.feature",
		glue= {"sto000901_UseofRegularExpressionAndCodeReusabilitySD"},
		dryRun = false
)
public class RN04_UseOfRegexPatternRunner extends AbstractTestNGCucumberTests
{

}
