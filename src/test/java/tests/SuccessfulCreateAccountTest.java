package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.GetNewAccountModel;

import java.io.IOException;

@Epic("Web test")
@Feature("Creating new accounts")
@Story("Creating new accounts and checking for a message about the successful creation of accounts")
public class SuccessfulCreateAccountTest extends BaseTest {

    public static final String EMAIL = "dissewouddauda-3563-4s6a@force.com";
    public static final String PASSWORD = "1234Artdianic";
    private static final Logger LOGGER = LogManager.getLogger(SuccessfulCreateAccountTest.class.getName());

    @Description("Checking for the massage that an account has been successfully created")
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
