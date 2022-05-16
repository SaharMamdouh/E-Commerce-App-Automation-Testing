package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class AddToCart {
    public WebElement selectProduct()
    {
        WebElement product= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img"));
        return product;
    }

    public WebElement cartBtn()
    {
        WebElement CartBtn=Hooks.driver.findElement(By.cssSelector("Button[id=\"add-to-cart-button-37\"]"));
        return CartBtn;
    }

    public WebElement confirmMsg()
    {
        WebElement ConfirmMSG=Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return ConfirmMSG ;
    }
    public WebElement cartItems()
    {
        WebElement CartItem=Hooks.driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]"));
        return CartItem;
    }
}
