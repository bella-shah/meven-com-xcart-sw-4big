package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SecureCheckOutPage extends Utility {
    By verifyMsg = By.xpath("//h1[normalize-space()='Secure Checkout']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By address = By.xpath("//input[@id='shippingaddress-street']");
    By city = By.xpath("//input[@id='shippingaddress-city']");
    By selectCountry = By.xpath("//select[@id='shippingaddress-country-code']");
    By state = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By createAccountForLaterUse = By.xpath("//input[@id='create_profile']");
    By enterPassword = By.xpath("//input[@id='password']");
    By localShipping = By.id("method128");
    By selectCod = By.xpath("//span[normalize-space()='COD']");
    By verifyFinalTotal = By.xpath("//span[contains(text(),'$37.03')]");
    By placeOrderBtn = By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']");


    public void verifySecureMsg() {
     mouseHoverToElement(verifyMsg);
    }

    public void inputFirstName() {
        sendTextToElement(firstName, "Bella");
    }

    public void inputLastName() {
        sendTextToElement(lastName, "Shah");
    }

    public void inputAddress() {
        sendTextToElement(address, "54 Stocklake");
    }

    public void inputCity() {
       sendTextToElement(city, Keys.BACK_SPACE + "London");
    }

    public void selectCountry() {
        selectByVisibleTextFromDropDown(selectCountry, "United Kingdom");
    }

    public void inputState() {
        sendTextToElement(state, "London");
    }

    public void inputZipCode() {
      sendTextToElement(zipCode, Keys.BACK_SPACE + "3");
    }

    public void clickOnAccountForLater() {
        clickOnElement(createAccountForLaterUse);
    }

    public void enterPassword() {
        sendTextToElement(enterPassword, "Prime123");
    }

    public void selectLocalShipping() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(localShipping);
    }

    public void selectCodOption() {
        clickOnElement(selectCod);
    }

    public void verifyFinalTotal() {
      mouseHoverToElement(verifyFinalTotal);

    }

    public void clickOnPlaceOrderBtn() {
        clickOnElement(placeOrderBtn);
    }
}

