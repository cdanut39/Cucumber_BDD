package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/main/java/features",
        dryRun = false,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports", "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},
        tags = "@Sort_all")

public class SortByAvailabilityRunner extends AbstractTestNGCucumberTests {

}