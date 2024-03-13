package com.suitsupply.test;

import com.suitsupply.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageNavigationTest() {
        loginPage = homePage.navigateToLoginPage();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "My Account | SUITSUPPLY The Netherlands");
    }
}
