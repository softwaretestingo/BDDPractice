package sto001002_ParallelExecutionRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features="src/test/java/sto0010_ParallelExecutionFT",
		glue="sto001001_ParallelExecutionSD",
		plugin="pretty"
)
public class RN02_ParallelExecutionProductSearchrunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
