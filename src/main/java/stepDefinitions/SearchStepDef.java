package stepDefinitions;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.velocity.runtime.log.NullLogChute;
import org.testng.Assert;
import pages.*;

import java.io.IOException;

import static util.TestUtil.takeScreenShot;


public class SearchStepDef extends TestBase {

    DefaultPage defaultPage;
    EmailPage emailPage;
    PasswordPage passwordPage;
    HomePage homePage;
    ResultsPage resultsPage;


    @Given("^user is logged in$")
    public void user_is_logged_in() throws Exception {
        TestBase.intialization();
        defaultPage = new DefaultPage();
        emailPage = defaultPage.clickOnSignInButton();
        emailPage.insertEmail();
        passwordPage = emailPage.clickOnContinueButton();
        passwordPage.insertPassword();
        homePage = passwordPage.clickOnContinuaButton();

    }


    @When("^user search for \"(.*)\"$")
    public void user_search_for_product(String productName) {
        resultsPage = homePage.searchProduct(productName);
//        resultsPage.clickOnFirstProductCategory();

    }

    @Then("^a page with (.*) is displayed$")
    public void a_page_with_expected_product_is_displayed(String categoryName) {
        for (boolean flag : resultsPage.containsProductsName(categoryName)) {
            Assert.assertTrue(flag);
        }
    }



}
