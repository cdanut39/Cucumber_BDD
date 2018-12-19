package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends GeneralActions {


    @FindBy(xpath = "//span[text()=' Contul meu ']")
    private WebElement contulMeuButton;

    @FindBy(xpath = "//div[@class='ph-dropdown-inner']//strong[text()='Salut, Cristea Danut']")
    private WebElement welcomeMessage;

    @FindBy(id = "searchboxTrigger")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default searchbox-submit-button']")
    private WebElement searchButton;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void hoverContulMeu() throws Exception {
        actionMove(contulMeuButton);
    }

    public String getWelcomeMessageText() throws Exception {
        hoverContulMeu();
        return welcomeMessage.getText();
    }


    public ResultsPage searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchButton.click();
        return new ResultsPage();

    }
}
