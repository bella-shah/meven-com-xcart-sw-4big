package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By navigateToShipping = By.xpath("(//span[contains(text(),'Shipping')])[2]");
    By verifyShipping=By.xpath("//h1[@id='page-title']");
    By navigateToNew = By.xpath("(//span[contains(text(),'New!')])[2]");
    By verifyNew=By.xpath("//h1[@id='page-title']");
    By navigateToComingSoon = By.xpath("(//span[contains(text(),'Coming soon')])[2]");
    By verifyComingSoon=By.xpath("//h1[@id='page-title']");
    By navigateToContactUs = By.xpath("(//span[contains(text(),'Contact us')])[2]");
    By verifyContactUs=By.xpath("//h1[@id='page-title']");

    public void clickOnShippingTab(){
        clickOnElement(navigateToShipping);
    }
    public void clickOnNewTab(){
        clickOnElement(navigateToNew);
    }
    public void clickOnComingSoonTab(){
        clickOnElement(navigateToComingSoon);
    }
    public void clickOnContactUsTab(){
        clickOnElement(navigateToContactUs);
    }
    public void verifyShippingTitle(){
    mouseHoverToElement( verifyShipping);
    }
    public void verifyNewTitle(){
     mouseHoverToElement(verifyNew);
    }
    public void verifyComingSoonTitle(){
     mouseHoverToElement(verifyComingSoon);
    }
    public void verifyContactUsTitle(){
      mouseHoverToElement(verifyContactUs);
    }
}

