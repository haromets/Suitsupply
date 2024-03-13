package com.suitSupply.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;

    //1. String Locators
    private String hamburgerButton = ".Header_header-icon__aRMOj.susu-icon-menu";
    private String searchField = "input[placeholder=\"Search, suits, coats, etc\"]";
    private String searchButton = ".ClientMenu_menu__corner-button__search__Zlfia.menu__search-button";
    private String acceptCookies = "div>#onetrust-accept-btn-handler";
    private String newCollectionOption = "body > main > div.HomepageSections_section__xadLq.homepage-sections--hero-banner > div > div.HeroBannerWithLinksBlock_hero-banner__links__jJjmf > ul > li:nth-child(1) > a";
    private String weddingCollectionOption = "//*[contains(text(),'Wedding Collection')]/parent::div";

    private String profileIcon = "span.Header_header__btn___Lak6.account-btn > a > span.Header_header-icon__aRMOj";

    //2. page constructor
    public HomePage(Page page){
        this.page = page;
    }

    //3. page actions/methods

    public String selectWeddingCollection(){
        page.click(weddingCollectionOption);
        String title = page.title();
        System.out.println("Wedding Collection title: " + title);
        return title;
    }

    public String selectNewCollectionOption(){
        page.click(newCollectionOption);
        String title = page.title();
        System.out.println("New Collection title: " + title);
        return title;
    }

    public void acceptCookies() {
        page.click(acceptCookies);
    }

    public String doSearch(String productName){
        page.click(hamburgerButton);
        page.click(searchButton);
        page.fill(searchField, productName);
        page.keyboard().press("Enter");
        page.waitForURL("https://suitsupply.com/en-nl/men/jackets");
        String title = page.title();
        System.out.println("search title: " + title);
        return title;
    }

    public LoginPage navigateToLoginPage(){
        page.click(profileIcon);
        return new LoginPage(page);
    }


}
