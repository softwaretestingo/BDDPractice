package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/hooks",
		glue={"stepdefinitions","hooks"},
		monochrome=true, //In Console Result There is no difference If You Use
		//plugin= {"pretty"}, //If you use Pretty Then With Each StepOutput it will show you the StepDefination Details Also
		//plugin= {"pretty", "html: target/cucumber_report.html"} //this will generate HTML report and Store in target folder
		plugin= {"pretty", "json: target/cucumber_JSON_report.json"}
		)
public class ReportRunner extends AbstractTestNGCucumberTests{

}