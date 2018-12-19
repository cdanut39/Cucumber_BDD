package pages;


import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EmailPage extends GeneralActions {
    @FindBy(id = "email")
    private WebElement email_input;
    @FindBy(xpath = "//button[contains(text(),'Continua')]")
    private WebElement continua_button;

    public EmailPage() {
        PageFactory.initElements(driver, this);
    }

    public void insertEmail() throws Exception {

        sendKeysToWebElement(email_input, prop.getProperty("email"));
    }

    public PasswordPage clickOnContinueButton() {
        continua_button.click();
        return new PasswordPage();
    }
}
