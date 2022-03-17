package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class AlertMessagesPage extends BasePage {

    private By ALERT_XPATH = By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']");

    public AlertMessagesPage(WebDriver driver) {
        super(driver);
    }

    public void waitForElementIsDisplayed(WebElement element, long timeOutInSeconds) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        Function<WebDriver, Boolean> booleanFunction = driver -> element != null && element.isDisplayed();
        fluentWait.until(booleanFunction);
    }

    @Step("Get text from the alert message")
    public String alertMessageGetText() {
        waitForElementIsDisplayed(driver.findElement(ALERT_XPATH), 10);
        return driver.findElement(ALERT_XPATH).getText();
    }
}
