package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {
    By verifyThankYou = By.xpath("//h1[contains(.,'Thank you for your order')]");

    public void verifyThankYouMsg(){
       mouseHoverToElement(verifyThankYou);

    }
}

