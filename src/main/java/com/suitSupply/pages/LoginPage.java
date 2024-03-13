package com.suitSupply.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    //1. String Locators
    private String loginInputField = "#login-form-email";
    private String continueButton = "#login-continue-button";


    public LoginPage(Page page){
        this.page = page;
    }

    public String getLoginPageTitle(){
        return page.title();
    }

    public String doLogin(String appUserName){
        page.fill(loginInputField, appUserName);
        page.click(continueButton);
        String title =  page.title();
        return title;
    }

}
