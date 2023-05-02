package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearpage = new GearPage();
    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        gearpage.mouseHoverOnGearMenu();
        gearpage.clickOnBags();
        gearpage.ClickOnProductNameOvernightDuffle();
        // Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearpage.getOvernightDuffleText();
        Assert.assertEquals(expectedText,actualText,"Error message");
        gearpage.changeQuantityTo3();
        gearpage.clickOnAddToCartButton();
        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gearpage.getOvernightDuffelToShoppingCart();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        gearpage.clickOnShoppingCartLink();
        // Verify the product name ‘Overnight Duffle’
        String expectedProduct = "Overnight Duffle";
        String actualProduct = gearpage.getProductNameOvernightDuffle();
        Assert.assertEquals(expectedProduct,actualProduct,"Error message");
        //Verify the Qty is ‘3’
        Thread.sleep(2000);
        String expectedQuantity = "3";
        String actualQuantity = gearpage.getQuantity3();
        Assert.assertEquals(expectedQuantity,actualQuantity,"Error message");
        // Verify the product price ‘$135.00’
        String expectedPrice = "$135.00";
        String actualPrice = gearpage.getProductPrize$135();
        Assert.assertEquals(expectedPrice,actualPrice,"Error message");
        gearpage.changeQuantityTo5();
        gearpage.clickOnUpdatedShoppingCartButton();
        Thread.sleep(2000);
        // Verify the product price ‘$225.00’
        String expectedProductPrice = "$225.00";
        String actualProductPrice = gearpage.getProductPrice$225();
        Assert.assertEquals(expectedProductPrice,actualProductPrice,"Error message");

    }
}