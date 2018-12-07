import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true,
features = {"D:/workspace/BDD Test Framework/src/main/java/features/Search.feature"},
plugin = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html"},
monochrome = true,
tags = {},
glue = { "stepDefinitions" })
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
