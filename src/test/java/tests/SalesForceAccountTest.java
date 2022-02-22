package tests;

import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

public class SalesForceAccountTest extends BaseTest {

    public static final String EMAIL = "dinozavrikkk-xrn7@force.com";
    public static final String PASSWORD = "200794juaza";

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        System.out.println("");
    }
}
