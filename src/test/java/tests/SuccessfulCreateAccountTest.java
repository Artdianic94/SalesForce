package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import testdata.GetNewAccountModel;

import java.io.IOException;

public class SuccessfulCreateAccountTest extends BaseTest {

    public static final String EMAIL = "dissewouddauda-3563-4s6a@force.com";
    public static final String PASSWORD = "1234Artdianic";
    private static final Logger LOGGER = LogManager.getLogger(SuccessfulCreateAccountTest.class.getName());

    @Test()
    public void checkSuccessfulCreateAccountTest() throws IOException {
        LOGGER.info("'Check successful create account' test started");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        LOGGER.info("Attempt to login with username: " + EMAIL + "and password: " + PASSWORD);
        LOGGER.debug("Debugging of login" + EMAIL + "" + PASSWORD);
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.debug("Debugging tab switching");
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        LOGGER.debug("Debugging account creating" + createAccountPage.getClass().getName());
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        AlertMessagesPage alertMessagesPage = new AlertMessagesPage(driver);
        LOGGER.debug("Debugging alert message" + alertMessagesPage.getClass().getName());
        String actualAlertMessage = alertMessagesPage.alertMessageGetText();
        String expectedAlertMessage = "Account \"" + GetNewAccountModel.accountName + "\" was created.";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }
}
