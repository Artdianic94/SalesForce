package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.GetNewAccountModel;

import java.io.IOException;

public class SuccessfulCreateAccountTest extends BaseTest {

    public static final String EMAIL = "dinozavrikkk-xrn7@force.com";
    public static final String PASSWORD = "200794juaza";

    @Test()
    public void checkSuccessfulCreateAccountTest() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        AlertMessagesPage alertMessagesPage = new AlertMessagesPage(driver);
        String actualAlertMessage = alertMessagesPage.alertMessageGetText();
        String expectedAlertMessage = "Account \"" + GetNewAccountModel.accountName + "\" was created.";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }
}
