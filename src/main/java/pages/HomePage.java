package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends TestBase {
    @FindBy(xpath = "//span[text()=' Contul meu ']")
    private WebElement contulMeu_button;

    @FindBy(xpath = "//div[@class='ph-dropdown-inner']//strong[text()='Salut, Cristea Danut']")
    private WebElement welcomeMessage;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void hoverContulMeu() {
        wait.until(ExpectedConditions.visibilityOf(contulMeu_button));
        Actions actions = new Actions(driver);
        actions.moveToElement(contulMeu_button).build().perform();
    }

    public String getWelcomeMessageText() {
        hoverContulMeu();
        return welcomeMessage.getText();
    }
}
