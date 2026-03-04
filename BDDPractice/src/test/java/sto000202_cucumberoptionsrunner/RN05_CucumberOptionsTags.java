package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features = "src/test/java/sto0002_cucumberoptionsft/04_AllCucumberOptionsUse.feature",
		glue = {"sto000201_cucumberOptionssd"},
		//tags = "@smoke" // This Will Run Only Smoke Tags
		//tags ="@guest and @smoke" // This Will Only run those scenario which have tagged with both smoke & guest
		tags = "@smoke or @sanity" //This will Execute all the scenarios which have marked smoke or sanity
		//tags ="not @test" // Except Test tag all other tags scenarios will be executed
)
public class RN05_CucumberOptionsTags extends AbstractTestNGCucumberTests
{

}
