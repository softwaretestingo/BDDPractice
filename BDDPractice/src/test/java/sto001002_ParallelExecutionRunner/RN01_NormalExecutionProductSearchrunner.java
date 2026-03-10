package sto001002_ParallelExecutionRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features="src/test/java/sto0010_ParallelExecutionFT",
		glue="sto001001_ParallelExecutionSD",
		plugin="pretty"
)
public class RN01_NormalExecutionProductSearchrunner extends AbstractTestNGCucumberTests
{

}
