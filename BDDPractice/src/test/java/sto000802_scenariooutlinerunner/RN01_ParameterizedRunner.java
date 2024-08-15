package sto000802_scenariooutlinerunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/sto0008_scenariooutlineft/FT01_Parameterized.feature",
		glue="sto000801_scenariooutlinesd",
		monochrome=true
		)
public class RN01_ParameterizedRunner extends AbstractTestNGCucumberTests{

}
