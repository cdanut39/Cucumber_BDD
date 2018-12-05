import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true,
features = {"D:/workspace/BDD Test Framework/src/main/java/features/Login.feature"},
plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html"},
monochrome = true,
tags = {},
glue = { "stepDefinitions" })
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
