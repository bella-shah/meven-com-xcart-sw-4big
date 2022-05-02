package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.ShoppingCartPage;
import com.x_cart.mobile.testbase.TestBase;
import org.junit.Test;

public class BestSellersTest extends TestBase{
    BestSellerPage bestSellersPage = new BestSellerPage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();


    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        bestSellersPage.clickOnBestSellers();
        bestSellersPage.verifyBestSellerTxt();
        bestSellersPage.selectAToZ();
        bestSellersPage.addProductToCart();
        bestSellersPage.verifyProductAddedMSg();
        bestSellersPage.clickOnXBtn();
        bestSellersPage.clickOnYourCart();
        bestSellersPage.clickOnViewCart();

        shoppingCartPage.verifyShoppingCartMSg();
        shoppingCartPage.clickOnEmptyCart();
        shoppingCartPage.verifyAlertMSg();
        shoppingCartPage.verifyIfItemsDeleted();
        shoppingCartPage.verifyIfCartIsEmpty();

    }
}

