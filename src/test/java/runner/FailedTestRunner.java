package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedScenarios.txt",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 plugin={
						 "pretty","html:target/CucumberReports/CucumberReport.html",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 "timeline:test-output-thread/"})

public class FailedTestRunner {

}
