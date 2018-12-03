package pages;


import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DefaultPage extends TestBase {

    @FindBy(xpath = "//span[text()='Contul meu ']")
    private WebElement contulMeu_button;
    @FindBy(xpath = "//a[text()='Intra in cont']")
    private WebElement intraInCont_button;

    private DefaultPage defaultPage;

    public DefaultPage() {
        PageFactory.initElements(driver, this);
    }

    public EmailPage clickOnSignInButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(contulMeu_button).build().perform();
        wait.until(ExpectedConditions.visibilityOf(intraInCont_button));
        intraInCont_button.click();
        return new EmailPage();
    }
}


