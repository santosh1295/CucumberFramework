package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Search.feature",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 plugin={
						 "pretty","html:target/CucumberReports/CucumberReport.html",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 "timeline:test-output-thread/",
						 "rerun:target/failedScenarios.txt"})
public class TestRunner {
	
	

}
