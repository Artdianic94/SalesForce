package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrl;

public class LoginPage extends BasePage {
    private By EMAIL_INPUT = By.xpath("//input[@id='username']");
    private By PWD_INPUT = By.xpath("//input[@id='password']");
    private By LOG_BUTT = By.xpath("//input[@id='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open login page")
    public void openLoginPage() {
        driver.get(WebUrl.SALESFORCE);
    }

    @Step("Login")
    public void makeLogin(String email, String pwd) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
        driver.findElement(PWD_INPUT).sendKeys(pwd);
        driver.findElement(LOG_BUTT).click();
    }
}