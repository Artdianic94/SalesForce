package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrl;

public class AccountsPage extends BasePage {

    private By NEW_BUTTON = By.xpath("//div[text() = 'New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void openCreateAccountModel() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void openAccountsTab() {
        driver.get(WebUrl.SALESFORCE_ACCOUNTS);
    }
}
