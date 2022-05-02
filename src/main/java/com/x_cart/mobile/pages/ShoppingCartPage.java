package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    By verifyShoppingMsg = By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
    By changeQuantity = By.xpath("//input[contains(@id, 'amount16')]");
    By verifyShoppingMsg2 = By.xpath("//h1[contains(text(),'Your shopping cart - 2 item')]");
    By verifySubTotal1 = By.xpath("//ul[@class='sums']//span[@class='part-integer'][normalize-space()='29']");
    By verifySubTotal2 = By.xpath("//ul[@class='sums']//span[@class='part-decimal'][normalize-space()='98']");
    By verifyTotal1 = By.xpath("//span[normalize-space()='36']");
    By verifyTotal2 = By.xpath("//span[normalize-space()='00']");
    By goToCheckout = By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]");
    By emptyYourCart = By.xpath("//a[normalize-space()='Empty your cart']");
    By verifyItemsDeleted = By.xpath("//li[contains(.,'Item(s) deleted from your cart')]");
    By verifyCartIsEmpty = By.xpath("//h1[contains(.,'Your cart is empty')]");


    public void verifyShoppingCartMSg() {
      mouseHoverToElement(verifyShoppingMsg);
    }
    public void verifyIfItemsDeleted() throws InterruptedException {
   mouseHoverToElement(verifyItemsDeleted);
    }

    public void verifyIfCartIsEmpty() throws InterruptedException {
        mouseHoverToElement(verifyCartIsEmpty);
    }

    public void clickOnGoToCheckout() {
        clickOnElement(goToCheckout);
    }

    public void verifyAlertMSg() throws InterruptedException {
        Thread.sleep(2000);
        String message = getTextAlert();


    }
    public String getErrorMessage() {
        return getTextFromElement( verifyItemsDeleted);
    }
    public void clickOnEmptyCart() {
        clickOnElement(emptyYourCart);
    }

    public void modifyQuantity() {
        sendTextToElement(changeQuantity, Keys.BACK_SPACE + "2");
    }

    public void verifyCart2ItemsMsg() {
       mouseHoverToElement(verifyShoppingMsg2);

    }

    public void verifySubTotal1() {
     mouseHoverToElement(verifySubTotal1);

    }

    public void verifySubTotal2() {
       mouseHoverToElement(verifySubTotal2);
    }

    public void verifyTotal1() {
      mouseHoverToElement( verifyTotal1);
    }

    public void verifyTotal2() {
     mouseHoverToElement(verifyTotal2);
    }
}

