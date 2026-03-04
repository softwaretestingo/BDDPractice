package sto000902_UseofRegularExpressionAndCodeReusabilityRN;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features = "src/test/java/sto0009_UseofRegularExpressionAndCodeReusabilityFT/FT01_NormalFeatureFile.feature",
		glue= {"sto000901_UseofRegularExpressionAndCodeReusabilitySD"}
)
public class RN01_NormalFeatureFileRunner extends AbstractTestNGCucumberTests
{

}
