package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/main/java/features", glue = {"stepDefinitions"},plugin = { "pretty", "html:target/cucumber-reports" },tags = "@Login")

public class LoginRunner extends AbstractTestNGCucumberTests{

}