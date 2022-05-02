package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.testbase.TestBase;
import com.x_cart.mobile.pages.HomePage;
import org.testng.annotations.Test;


public class TopMenuTest extends TestBase {

  HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homepage.clickOnShippingTab();
        homepage.verifyShippingTitle();
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homepage.clickOnNewTab();
        homepage.verifyNewTitle();
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homepage.clickOnComingSoonTab();
        homepage.verifyComingSoonTitle();
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homepage.clickOnContactUsTab();
        homepage.verifyContactUsTitle();
    }

}



