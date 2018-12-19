import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true,
features = {"D:/workspace/BDD Test Framework/src/main/java/features/SortByAvailability.feature"},
plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html"},
monochrome = true,
tags = {"@SortByAvailability"},
glue = { "stepDefinitions" })
public class Sortbyavailability01IT extends AbstractTestNGCucumberTests {
}
