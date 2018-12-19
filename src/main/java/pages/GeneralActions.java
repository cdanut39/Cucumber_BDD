package pages;

import base.TestBase;
import config.Constants;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.WebEventListener;

import java.util.concurrent.TimeUnit;

public class GeneralActions extends TestBase {

    static Logger log = Logger.getLogger(WebEventListener.class);
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public GeneralActions() {
        this.wait = new WebDriverWait(driver, 15);
        js = ((JavascriptExecutor) driver);
    }

    /**********************************************************************************
     **CLICK METHODS
     **********************************************************************************/
    public void waitAndClickElement(WebElement element) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
            } catch (Exception e) {
                Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
            }

        }

    public void waitAndClickElementsUsingByLocator(By by) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(by)).click();
                System.out.println("Successfully clicked on the element using by locator: " + "<" + by.toString() + ">");
            } catch (Exception e) {
                System.out.println("Unable to wait and click on the element using the By locator, Exception: " + e.getMessage());
                Assert.fail("Unable to wait and click on the element using the By locator, element: " + "<" + by.toString() + ">");
            }

        }


    /**********************************************************************************
     **SEND KEYS METHODS /
     **********************************************************************************/
    public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
            System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }


    /**********************************************************************************
     **ACTION METHODS
     **********************************************************************************/
    public void actionMoveAndClick(WebElement element) throws Exception {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            action.moveToElement(element).click().build().perform();
            System.out.println("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();
            if (elementPresent == true) {
                action.moveToElement(elementToClick).click().build().perform();
                System.out.println("(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
        } catch (Exception e) {
            System.out.println("Unable to Action Move and Click on the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());
        }
    }

    public void actionMove(WebElement element) throws Exception {
        Actions action = new Actions(driver);
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            action.moveToElement(element).build().perform();
            System.out.println("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();
            if (elementPresent == true) {
                action.moveToElement(elementToClick).build().perform();
                System.out.println("(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
        } catch (Exception e) {
            System.out.println("Unable to Action Move and Click on the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());
        }
    }


    /**********************************************************************************
     **WAIT METHODS
     **********************************************************************************/
    public boolean WaitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean WaitUntilWebElementIsVisibleUsingByLocator(By element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            System.out.println("Element is visible using By locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT visible, using By locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
            return false;
        }
    }


    /**********************************************************************************
     **JS METHODS & JS SCROLL
     **********************************************************************************/
    public void scrollToElementByWebElementLocator(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
            js.executeScript("arguments[0].scrollIntoView();", element);
//            js.executeScript("window.scrollBy(0, -400)");
            System.out.println("Succesfully scrolled to the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to scroll to the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to scroll to the WebElement, Exception: " + e.getMessage());
        }
    }

    public void jsClick(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }


    /**********************************************************************************
     **GET TEXT
     **********************************************************************************/
    public String getTextFromElement(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText();
        } catch (Exception e) {
            System.out.println("Unable to get text from the WebElement, using locator: " + "<" + element.toString() + ">");
            return null;
        }
    }

    public String getTextUsingGetAttributeValue(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return element.getAttribute("value");
        } catch (Exception e) {
            System.out.println("Unable to get text(using getAttribute- value) from the WebElement, using locator: " + "<" + element.toString() + ">");
            return null;
        }
    }

    public String getTextUsingGetAttributeTextContent(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return element.getAttribute("textContent");
        } catch (Exception e) {
            System.out.println("Unable to get text (using getAttribute-textContent) from the WebElement, using locator: " + "<" + element.toString() + ">");
            return null;
        }
    }

    public String getTextUsingGetAttributeInnerHTML(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            return element.getAttribute("innerHTML");
        } catch (Exception e) {
            System.out.println("Unable to get text (using getAttribute-innerHTML) from the WebElement, using locator: " + "<" + element.toString() + ">");
            return null;
        }
    }

}
