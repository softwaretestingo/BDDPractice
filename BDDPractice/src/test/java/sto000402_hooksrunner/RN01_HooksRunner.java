package sto000402_hooksrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/sto0004_hooksft/FT01_hooks.feature",
		glue={"sto000401_hooksd","sto0004_hooksft"},
		monochrome=true //In Console Result There is no difference If You Use
		)
public class RN01_HooksRunner extends AbstractTestNGCucumberTests{

}