package sto000802_scenariooutlinerunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/sto0008_scenariooutlineft/FT02_parameterizedWithAnyDataType.feature",
		glue="sto000801_scenariooutlinesd",
		monochrome=true
		)
public class RN02_ParameterizedWithAnyDataTypeRunner extends AbstractTestNGCucumberTests{

}
