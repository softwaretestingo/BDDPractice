package sto001002_ParallelExecutionRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features="@target/failed-scenario.txt",
		glue="sto001001_ParallelExecutionSD",
		plugin="pretty"
)
public class RN04_ForRunningFailedScenarios extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
