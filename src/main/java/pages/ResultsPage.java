package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends GeneralActions {
    @FindBy(xpath = "//h1/span[contains(text(),'rezultate')]")
    private WebElement header;

    @FindBy(xpath = "(//div[@class='listing-grid-group-scroller-inner']//div)[1]")
    private WebElement firstCategoryLink;

    @FindBys({@FindBy(xpath = "//h2/a")})
    private List<WebElement> resultsList;

    @FindBy(xpath = "//a[@class='ph-label']")
    private WebElement disponibilitate;

    public ResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getHeader() {
        return header.getText();
    }

    public void clickOnFirstProductCategory() {
        firstCategoryLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Boolean> containsProductsName(String phoneName) {
        List<Boolean> titlesList = new ArrayList<>();
        System.out.println(resultsList.size());
        for (WebElement element : resultsList) {
            titlesList.add(element.getText().contains(phoneName));
        }

        return titlesList;
    }

    public void clickOnSortingCategory(String category) throws InterruptedException {
        waitAndClickElementsUsingByLocator(By.xpath("//a[@data-name='"+category+"']"));
    }
    public String checkResultsForAvailabilitySorting(){
        return getTextFromElement(disponibilitate);
    }
}
