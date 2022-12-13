package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;
 @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement actualText;

    public void clickOnForgotPasswordLink()
    {
        Reporter.log("Click on Forgot Password Link "+forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }
    public String getActualMessage()
    {
        Reporter.log("get Message After click on forgot password link "+actualText.toString());
        return getTextFromElement(actualText);
    }

}
