package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "src/test/java/sto0002_cucumberoptionsft/04_AllCucumberOptionsUse.feature",
		glue = {"sto000201_cucumberOptionssd"}
)
public class RN04_AllCucumberOptionsUse extends AbstractTestNGCucumberTests
{

}
