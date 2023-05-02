package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menpage = new MenPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        menpage.mouseHoverOnMenMenu();
        menpage.mouseHoverOnBottoms();
        menpage.clickOnPants();
        menpage.mouseHoverOnProductNameCronusYogaPantAndClickOnSize32();
        menpage.mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack();
        menpage.mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton();
        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menpage.getCronusYogaPantAddedToYourShoppingCartText();
        Assert.assertEquals(expectedText,actualText,"Error message");
        menpage.clickOnShoppingCartLink();

        // Verify the text ‘Shopping Cart.'
        String expectedText1 = "Shopping Cart.";
        String actualText1 = menpage.getShoppingCartText();
        Assert.assertEquals(expectedText1,actualText1,"Error message");

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedProduct = "Cronus Yoga Pant";
        String actualProduct = menpage.getCronusYogaPantProductName();
        Assert.assertEquals(expectedProduct,actualProduct,"Error message");

        // Verify the product size ‘32’
        String expectedSize = "32";
        String actualSize = menpage.getProductSize32();
        Assert.assertEquals(expectedSize,actualSize,"Error message");

        // Verify the product colour ‘Black’
        String expectedColour = "32";
        String actualColour = menpage.getProductSize32();
        Assert.assertEquals(expectedColour,actualColour,"Error message");
    }
}
