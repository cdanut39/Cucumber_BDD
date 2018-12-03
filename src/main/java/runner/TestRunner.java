package runner;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;


@CucumberOptions(
        features = "src/main/java/features", glue = {"stepDefinitions"}, plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},tags = "@MyTag")

public class TestRunner extends AbstractTestNGCucumberTests{
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));

    }
}