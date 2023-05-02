package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    // Mouse Hover on Men Menu
    By menMenu = By.cssSelector("a[id='ui-id-5'] span:nth-child(2)");
    // Mouse Hover on Bottoms
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    // Click on Pants
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By colourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    By CronusYogaPantAddedText =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
   // Click on ‘shopping cart’ Link into message
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    // Verify the text ‘Shopping Cart.'
    By shoppingCartText = By.xpath("//span[@class='base']");
    // Verify the product name ‘Cronus Yoga Pant’
    By cronusYogaPantProduct = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    // Verify the product size ‘32’
    By size32Product = By.xpath("//dd[contains(text(),'32')]");
    // Verify the product colour ‘Black’
    By blackColourProduct = By.xpath("//dd[contains(text(),'Black')]");

public void mouseHoverOnMenMenu(){
    mouseHoverToElement(menMenu );
}
public void mouseHoverOnBottoms(){
    mouseHoverToElement(bottoms);
}
public void clickOnPants(){
    clickOnElement(pants);
}
public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize32(){
    mouseHoverToElementAndClick(size32);
}
public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack(){
    mouseHoverToElementAndClick( colourBlack);
}
public void  mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton(){
    mouseHoverToElementAndClick(addToCart );
}
public String getCronusYogaPantAddedToYourShoppingCartText(){
    return getTextFromElement(CronusYogaPantAddedText);
}
public void clickOnShoppingCartLink(){
    clickOnElement(shoppingCartLink );
}
public String getShoppingCartText(){
    return getTextFromElement(shoppingCartText);
}
public String getCronusYogaPantProductName(){
    return getTextFromElement(cronusYogaPantProduct);
}
public String getProductSize32(){
    return getTextFromElement(size32Product);
}
public String getProductColourBlack(){
    return getTextFromElement(blackColourProduct);
}


}
