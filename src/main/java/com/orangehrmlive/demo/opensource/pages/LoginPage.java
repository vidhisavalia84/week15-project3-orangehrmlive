package com.orangehrmlive.demo.opensource.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.opensource.customlisteners.CustomListeners;
import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement welcomeText;

    @FindBy(name = "username")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement getTextAfterLogin;

    public void enterUserName(String name) {
        Reporter.log("Enter username : " + userName.toString());
        sendTextToElement(userName, name);
        //CustomListeners.test.log("pass" + name);
    }

    public void enterPassword(String text) {
        Reporter.log("Enter password " + password.toString());
        sendTextToElement(password, text);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click On Login Button " + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getWelcomeMessage(){
        Reporter.log("Wel come message "+getTextAfterLogin.toString());
        return getTextFromElement(getTextAfterLogin);
    }
}
