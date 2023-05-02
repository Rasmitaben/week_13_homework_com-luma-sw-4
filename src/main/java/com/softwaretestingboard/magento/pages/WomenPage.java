package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage extends Utility {
By womenMenu = By.cssSelector("a[id='ui-id-4'] span:nth-child(2)");
By tops = By.xpath("//a[@id='ui-id-9']");
By jackets = By.cssSelector("a[id='ui-id-11'] span");
By sortByFilterProductName = By.xpath("//select[@id='sorter']");

By productNameElements = By.xpath("//div[@class='product details product-item-details']//strong[@class='product name product-item-name']");

By SortByFilterPrice = By.cssSelector("#sorter");
By priceElements = By.xpath("//div[normalize-space()='Price']");

// //Mouse Hover on Women Menu
    public void  mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu );
    }
    //Mouse Hover on Tops
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    //Click on Jackets
    public void clickOnJackets(){
        clickOnElement(jackets );
    }
    //Select Sort By filter “Product Name”
    public void selectSortByFilterProductName(){
        selectByVisibleTextFromDropDown(sortByFilterProductName,"Product Name");
    }
    // Verify the products name display in alphabetical order
    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(productNameElements);
        return listOfElements;
    }
    // Select Sort By filter “Price”
    public void selectSortByFilterPrice(){
        selectByVisibleTextFromDropDown(SortByFilterPrice,"Price");
    }
    //Verify the products price display in Low to High

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(priceElements);
        return listOfElements;
    }



}
