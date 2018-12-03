package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestUtil;
import util.WebEventListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener webEventListener;
    public static Properties prop;
    public static WebDriverWait wait;
    public static final String PROPERTIES_PATH = "D:\\workspace\\BDD Test Framework\\src\\main\\java\\config\\config.properties";

    public TestBase() {
        try {

            prop = new Properties();
            FileInputStream fis = new FileInputStream(PROPERTIES_PATH);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void intialization() {
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome driver/chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/firefox driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListenerHandler to register it with EventFiringWebDriver
        webEventListener = new WebEventListener();
        e_driver.register(webEventListener);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
