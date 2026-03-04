package sto000502_backgroundrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/sto0005_backgroundft",
		glue={"sto000501_backgroundsd","sto0004_hooksft"},
		tags = "@sanity",
		monochrome=true
		)
public class RN02_BackgroundRunnerWithHooks extends AbstractTestNGCucumberTests{

}
