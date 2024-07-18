package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".//Features" }, 
glue = "StepDefination", 
dryRun = false, monochrome = false,
plugin = {
		"pretty", "html:target/Cucumber-report/New.html" },

		tags = "@regression"

)

//the cucumber file will always be empty

public class Testrun {
	
	

}
