package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.customlisteners.CustomListeners;
import com.orangehrmlive.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }


    @Test(groups = {"sanity","regression"})
    public void verifyUserCanLoginSuccessfullyWithValidCredential() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getWelcomeMessage(), "Dashboard");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserCanClickOnForgotPasswordLink() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        Assert.assertEquals(forgotPasswordPage.getActualMessage(), "Reset Password");
    }
}
