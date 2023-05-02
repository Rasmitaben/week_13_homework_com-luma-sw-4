package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WomenTest extends BaseTest {
    WomenPage womenpage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter(){
    womenpage.mouseHoverOnWomenMenu();
    womenpage.mouseHoverOnTops();
    womenpage.clickOnJackets();
    womenpage.selectSortByFilterProductName();
        //Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenpage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenpage.returnListOfProductNamesElementsLocator());

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        womenpage.mouseHoverOnWomenMenu();
        womenpage.mouseHoverOnTops();
        womenpage.clickOnJackets();
        womenpage.selectSortByFilterPrice();

        //* Verify the products price display in Low to High
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenpage.returnListOfPriceElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenpage.returnListOfPriceElementsLocator());

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in low to high order");

    }
}
