package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By gearMenu = By.xpath("//a[@id='ui-id-6']//span[contains(text(),'Gear')]");
By bags = By.xpath("//a[@id='ui-id-25']");
By overNightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");
By overNightDuffleText = By.xpath("//span[@class='base']");

By changeQtyTo3 = By.xpath("//input[@id='qty']");
By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
By addedOvernightDuffleText = By.xpath("//div[@class='message-success success message']");
By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
By productNameDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
By qty3Text = By.xpath("//input[@title='Qty']");
By price$135 = By.xpath("(//span[@class='cart-price']//span)[2]");
By changeQtyTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
By updatedShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
By price$225Text = By.xpath("(//span[@class='cart-price']//span)[2]");





   public void mouseHoverOnGearMenu(){
   mouseHoverToElement(gearMenu);
   }
   public void clickOnBags(){
   clickOnElement(bags);
   }
   public void ClickOnProductNameOvernightDuffle(){
   clickOnElement(overNightDuffle);
   }
   public String getOvernightDuffleText(){
      return getTextFromElement(overNightDuffleText);
   }
public void changeQuantityTo3(){
      clearValueFromTextBox(changeQtyTo3);
      sendTextToElement(changeQtyTo3,"3");
}
public void clickOnAddToCartButton(){
      clickOnElement(addToCart);
}
public String getOvernightDuffelToShoppingCart(){
      return getTextFromElement(addedOvernightDuffleText);
}
public void clickOnShoppingCartLink(){
      clickOnElement(shoppingCartLink);
}
public String getProductNameOvernightDuffle(){
      return getTextFromElement( productNameDuffle);
}
public String getQuantity3(){
      return getTextFromElement(qty3Text);
}
public String getProductPrize$135(){
      return getTextFromElement( price$135 );
}
public void changeQuantityTo5(){
   clearValueFromTextBox(changeQtyTo5);
   sendTextToElement(changeQtyTo5,"5");
   }

   public void clickOnUpdatedShoppingCartButton(){
      clickOnElement(updatedShoppingCart);
   }
   public String getProductPrice$225(){
      return getTextFromElement(price$225Text);
   }

}
