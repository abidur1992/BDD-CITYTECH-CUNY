package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/Adilmarjana2011/Documents/workspace/BehaviorDrivenDevelopment/Feature/Login_Test.feature"
   ,glue = "stepDefinition"
   ,dryRun=false
   )



public class TestRunner {
	
	
}
