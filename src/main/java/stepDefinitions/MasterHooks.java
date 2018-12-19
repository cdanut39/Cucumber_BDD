package stepDefinitions;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;

import java.io.IOException;

import static util.TestUtil.takeScreenShot;

public class MasterHooks extends TestBase {
    @After()
    public void takeScreenshotOnFailure(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            System.out.println("Before taking screenshot..");
            takeScreenShot(scenario);
            System.out.println("Screenshot taken!");
        }
    }
}
