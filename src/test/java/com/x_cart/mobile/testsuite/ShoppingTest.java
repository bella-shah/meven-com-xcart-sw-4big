package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.junit.Test;

public class ShoppingTest extends TestBase {
    SalePage salePage = new SalePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginToYourAccountPage logInToYourAccount = new LoginToYourAccountPage();
    SecureCheckOutPage secureCheckoutPage = new SecureCheckOutPage();
    ThankYouPage thankYouPage = new ThankYouPage();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {
        salePage.navigateToSales();
        salePage.verifySaleTxt();
        salePage.sortAToZ();
        salePage.mouseHoverOnProduct();
        Thread.sleep(2000);
        salePage.addProductToCart();
        salePage.verifyProductAdded();
        salePage.clickOnX();
        salePage.clickOnYourCartBtn();
        salePage.clickOnViewCartBtn();

        shoppingCartPage.verifyShoppingCartMSg();
        shoppingCartPage.modifyQuantity();
        Thread.sleep(2000);
        shoppingCartPage.verifyCart2ItemsMsg();
        shoppingCartPage.verifySubTotal1();
        shoppingCartPage.verifySubTotal2();
        shoppingCartPage.verifyTotal1();
        shoppingCartPage.verifyTotal2();
        shoppingCartPage.clickOnGoToCheckout();

        logInToYourAccount.verifyLogInMsg();
        logInToYourAccount.enterEmail();
        logInToYourAccount.clickOnContinue();

        secureCheckoutPage.verifySecureMsg();
        secureCheckoutPage.inputFirstName();
        secureCheckoutPage.inputLastName();
        secureCheckoutPage.inputAddress();
        secureCheckoutPage.inputCity();
        secureCheckoutPage.selectCountry();
        secureCheckoutPage.inputState();
        secureCheckoutPage.inputZipCode();
        secureCheckoutPage.clickOnAccountForLater();
        secureCheckoutPage.enterPassword();
        secureCheckoutPage.selectLocalShipping();
        secureCheckoutPage.selectCodOption();
        secureCheckoutPage.verifyFinalTotal();
        Thread.sleep(2000);
        secureCheckoutPage.clickOnPlaceOrderBtn();
        Thread.sleep(2000);

        thankYouPage.verifyThankYouMsg();


    }
}
