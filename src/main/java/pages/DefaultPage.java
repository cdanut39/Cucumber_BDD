package pages;


import base.TestBase;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DefaultPage extends GeneralActions {
    @FindBy(xpath = "//a[contains(@href,'homepage')]")
    private WebElement inapoiInSite_link;
    @FindBy(xpath = "//span[text()='Contul meu ']")
    private WebElement contulMeu_button;
    @FindBy(xpath = "//a[text()='Intra in cont']")
    private WebElement intraInCont_button;
    @FindBy(xpath = "//span[contains(text(),'Favorite')]")
    private WebElement favorite_button;
    @FindBy(xpath = "//span[contains(text(),'Cosul meu')]")
    private WebElement cosulMeu_button;


    private DefaultPage defaultPage;

    public DefaultPage() {
        PageFactory.initElements(driver, this);
    }

    public EmailPage clickOnSignInButton() throws Exception {

        waitAndClickElement(inapoiInSite_link);
        actionMove(contulMeu_button);
        waitAndClickElement(intraInCont_button);
        return new EmailPage();
    }

    public void mouseHoverContulMeu(DataTable items) throws Exception {
        actionMove(contulMeu_button);
    }

}


