package factorydriver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import staticdata.WebTimeouts;

import java.util.concurrent.TimeUnit;

public abstract class DriverManager {
    public WebDriver driver;
    private WebDriverWait wait;

    public abstract void createDriver();

    public WebDriver getDriver() {
        return driver;
    }

    public void setTimeout() {
        driver.manage().timeouts().setScriptTimeout(WebTimeouts.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(WebTimeouts.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void quitDriver() {
        driver.quit();
    }
}
