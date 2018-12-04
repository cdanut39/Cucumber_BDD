package util;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends TestBase {

    public static WebDriverWait wait;

    public static void waitUntilVisibilityOfElement(WebElement element){
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementToBeClickable(WebElement element){
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilTextToBePresentInElement(WebElement element, String text){
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }


}
