package stepDefinitions;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.DefaultPage;
import pages.EmailPage;
import pages.HomePage;
import pages.PasswordPage;

import java.io.IOException;

import static util.TestUtil.takeScreenShot;
import static util.TestUtil.takeScreenShotOnFAILURE;


public class LoginStepDef extends TestBase {
    DefaultPage defaultPage;
    EmailPage emailPage;
    PasswordPage passwordPage;
    HomePage homePage;


    @Given("^user is on eMAG page$")
    public void user_is_on_eMAG_page() {
        TestBase.intialization();
        defaultPage = new DefaultPage();
    }

    @When("^user wants to access his account$")
    public void user_wants_to_access_his_account() {
        emailPage = defaultPage.clickOnSignInButton();
    }

    @When("^user enters his email$")
    public void user_enters_his_credentials() {
        emailPage.insertEmail();
        passwordPage = emailPage.clickOnContinueButton();


    }

    @And("user enters the password")
    public void userEntersThePassword() {
        passwordPage.insertPassword();
    }

    @When("^user click on Login button$")
    public void user_click_on_Login_button() {
        homePage = passwordPage.clickOnContinuaButton();

    }

    @Then("^a new page with a welcome message is displayed$")
    public void a_new_page_with_a_welcome_message_is_displayed() {
        Assert.assertEquals(homePage.getWelcomeMessageText(), "Salut, Cristea Danut");

    }

//    @After
//    public void tearDown(Scenario scenario) throws IOException {
//        takeScreenShot(scenario);
//        driver.quit();
//    }


}
