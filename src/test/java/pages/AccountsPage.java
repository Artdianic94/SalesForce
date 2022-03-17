package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrl;

public class AccountsPage extends BasePage {

    private By NEW_BUTTON = By.xpath("//div[text() = 'New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on the tab to create accounts")
    public void openCreateAccountModel() {
        driver.findElement(NEW_BUTTON).click();
    }

    @Step("Open the tab to create accounts")
    public void openAccountsTab() {
        driver.get(WebUrl.SALESFORCE_ACCOUNTS);
    }
}
