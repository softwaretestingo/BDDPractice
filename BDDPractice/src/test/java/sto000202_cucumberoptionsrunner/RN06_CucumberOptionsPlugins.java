package sto000202_cucumberoptionsrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features = "src/test/java/sto0002_cucumberoptionsft/04_AllCucumberOptionsUse.feature",
		glue = {"sto000201_cucumberOptionssd"},
		//plugin= {"pretty"} // Print the logs in Color Format
		//plugin= {"pretty", "html: target/cucumber_report.html"} //this will generate HTML report and Store in target folder
		//plugin= {"pretty", "json: target/cucumber_JSON_report.json"}
		plugin= {
			  "pretty",
			  "html:target/cucumber-report.html",
			  "json:target/cucumber.json",
			  "junit:target/cucumber.xml"
			}

)
public class RN06_CucumberOptionsPlugins extends AbstractTestNGCucumberTests
{

}
