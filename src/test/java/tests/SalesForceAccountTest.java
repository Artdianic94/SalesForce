package tests;

import models.SalesForceAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class SalesForceAccountTest extends BaseTest {

    public static final String EMAIL = "dissewouddauda-3563-4s6a@force.com";
    public static final String PASSWORD = "1234Artdianic";
    private static final Logger LOGGER = LogManager.getLogger(SalesForceAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LOGGER.info("'Create account' test started");
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info("Attempt to open " + loginPage.getClass().getName() + " page");
        loginPage.openLoginPage();
        LOGGER.info("Attempt to login with username: " + EMAIL + "and password: " + PASSWORD);
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info("Attempt to open " + accountsPage.getClass().getName() + " page");
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        SalesForceAccountModel salesForceAccountModel = GetNewAccountModel.getAccountWithAllFields();
        LOGGER.info("Attempt to create account with name " + salesForceAccountModel.getAccountName());
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        System.out.println("");
    }
}
