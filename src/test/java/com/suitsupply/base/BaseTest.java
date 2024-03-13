package com.suitsupply.base;

import com.microsoft.playwright.Page;
import com.suitSupply.PlaywrightFactory;
import com.suitSupply.pages.HomePage;
import com.suitSupply.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class BaseTest {
    PlaywrightFactory pf;
    Page page;
    Properties prop;

    protected HomePage homePage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        pf = new PlaywrightFactory();
        prop = pf.init_prop();
        page = pf.initBrowser(prop);
        homePage = new HomePage(page);
        homePage.acceptCookies();
    }

    @AfterMethod
    public void tearDown() {
        page.context().browser().close();
    }
}
