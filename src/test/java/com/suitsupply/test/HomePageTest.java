package com.suitsupply.test;


import com.suitsupply.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseTest {


    @Test
    public void selectNewCollectionOption(){
        String actualNewCollectionPageTitle = homePage.selectNewCollectionOption();
        Assert.assertEquals(actualNewCollectionPageTitle, "New Arrivals - Luxury Suits, Jackets & Trousers for Men | SUITSUPPLY The Netherlands");
    }

    @Test
    public void selectWeddingCollectionOption(){
        String actualWeddingCollectionTitle = homePage.selectWeddingCollection();
        Assert.assertEquals(actualWeddingCollectionTitle, "Men's Wedding Assortment | SUITSUPPLY The Netherlands");
    }

//    @Test
//    public void doSearch(){
//        String actualSearchPageTitle = homePage.doSearch("jacket");
//        Assert.assertEquals(actualSearchPageTitle, "Men's Jackets & Blazers - Dress Jackets & Business Suits | SUITSUPPLY The Netherlands");
//    }


}
