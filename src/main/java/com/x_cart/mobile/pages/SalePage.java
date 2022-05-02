package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalePage extends Utility {
    By hoverHotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By clickOnSale = By.xpath("(//span[contains(text(),'Sale')])[2]");
    By verifySaleText = By.xpath("//h1[@id='page-title']");
    By hoverSortBy = By.xpath("//span[@class='sort-by-label']");
    By clickAToZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By allProducts = By.xpath("//h5[@class='product-name']");
    By sortProducts =By.xpath("//a[normalize-space()='Name A - Z']");
    By hoverOnProduct = By.xpath("//a[@class='product-thumbnail next-previous-assigned']");
    By AddToCart = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')]//span[contains(text(),'Add to cart')]");
    By verifyProductAddedMsg = By.xpath("//li[@class='info']");
    By clickOnXSign = By.xpath("//a[@title='Close']");
    By clickOnYourCart = By.xpath("//div[@title='Your cart']");
    By clickOnViewCart = By.xpath("//span[contains(text(),'View cart')]");
    By productPrice = By.xpath("//li[@class='product-price-base']");
    By allProductRates = By.cssSelector(".stars-row.full");
    By clickOnRates = By.xpath("//a[normalize-space()='Rates']");
    By lowToHigh = By.xpath("//span[contains(text(),'Price Low - High')]");

    public void navigateToSales() {
        mouseHoverToElement(hoverHotDeals);
        clickOnElement(clickOnSale);
    }

    public void selectRates() {
        mouseHoverToElement(hoverSortBy);
        clickOnElement(clickOnRates);
    }

    public void selectLowToHigh() {
        mouseHoverToElement(hoverSortBy);
        clickOnElement(lowToHigh);
    }

    public void clickOnYourCartBtn() {
        clickOnElement(clickOnYourCart);
    }

    public void clickOnViewCartBtn() {
        clickOnElement(clickOnViewCart);
    }

    public void verifySaleTxt() {
    mouseHoverToElement( verifySaleText);
    }

    public void sortAToZ() {
        mouseHoverToElement(hoverSortBy);
        clickOnElement(clickAToZ);
    }

    public void verifyProductAdded() {
     mouseHoverToElement(verifyProductAddedMsg);
    }

    public void clickOnX() {
        clickOnElement(clickOnXSign);
    }


    public void mouseHoverOnProduct() {
        mouseHoverToElement(hoverOnProduct);
    }

    public void addProductToCart() {
        clickOnElement(AddToCart);
    }
    public void setSortProducts(){
        clickOnElement(sortProducts);
    }

    public void verifyAToZ() {
        List<WebElement> originalList = driver.findElements(allProducts);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);  // We sorted this list to alphabetical
        System.out.println(originalProductNameList);

        waitUntilVisibilityOfElementLocated(allProducts, 10);

        List<WebElement> afterSortingList = driver.findElements(allProducts);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(allProducts);
        System.out.println(afterSortingProductName);
       // Assert.assertEquals ("Product not sorted");
    }


    public void verifyLowToHigh() {
        List<WebElement> originalList = driver.findElements(productPrice);
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);

        List<WebElement> afterSortingList = driver.findElements(productPrice);
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
       // Assert.assertEquals(originalProductPriceList, afterSortingProductPrice);
    }

    public void verifyRates() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(allProductRates);
        List<Integer> originalProductRateList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductRateList.add(Integer.parseInt(product.getAttribute("style").substring(7, 9)));
        }
        originalProductRateList.sort(Collections.reverseOrder());
        System.out.println(originalProductRateList);
        waitUntilVisibilityOfElementLocated(allProductRates, 10);
        List<WebElement> afterSortList = driver.findElements(allProductRates);
        List<Integer> afterSortProductRates = new ArrayList<>();
        for (WebElement product : afterSortList) {
            afterSortProductRates.add(Integer.parseInt(product.getAttribute("style").substring(7, 9)));
        }
        System.out.println(afterSortProductRates);
        verifyProductAddedMsg("Products not sorted", originalProductRateList, afterSortProductRates);
    }

    private void verifyProductAddedMsg(String products_not_sorted, List<Integer> originalProductRateList, List<Integer> afterSortProductRates) {
    }
}

