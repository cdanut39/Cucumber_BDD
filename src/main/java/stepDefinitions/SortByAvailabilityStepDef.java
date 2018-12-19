package stepDefinitions;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.ResultsPage;

import java.util.ArrayList;
import java.util.List;

public class SortByAvailabilityStepDef extends TestBase {
    ResultsPage resultsPage;

    @When("^user choose category no (\\d+) from list and a page with corresponding results should be displayed$")
    public void user_choose_category_no_from_list(int categoryNo, DataTable list) throws Throwable {
        List<List<String>> data = list.raw();
        resultsPage = new ResultsPage();
        resultsPage.clickOnSortingCategory(data.get(0).get(categoryNo));
        Thread.sleep(1500);
        Assert.assertTrue(resultsPage.checkResultsForAvailabilitySorting().contains(data.get(0).get(categoryNo)));
    }

    @When("^user choose a category from list then a page with corresponding results should be displayed$")
    public void user_choose_each_category_from_list(DataTable list) throws Throwable {
        SoftAssert assertion = new SoftAssert();
        List<List<String>> data = list.raw();
        resultsPage = new ResultsPage();
        for (int i = 0; i < data.get(0).size(); i++) {
            try {
                resultsPage.clickOnSortingCategory(data.get(0).get(i));
                Thread.sleep(1500);
                String actualData = resultsPage.checkResultsForAvailabilitySorting();
                int index = actualData.lastIndexOf(" ");
                String actual = resultsPage.checkResultsForAvailabilitySorting().substring(0, index);
                System.out.println(actual);
                assertion.assertEquals(actual, data.get(0).get(i));
            } catch (Error e) {
                assertion.fail();
            }
        }
        assertion.assertAll();
    }

}
