package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class AddToWishList {
    public WebElement wishBtn() {
        // WebElement WishBtn=driver.findElement(By.cssSelector("Button[id=\"add-to-wishlist-button-18\"]"));
        WebElement WishBtn = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return WishBtn;
    }

    public WebElement dispMsg() {
        WebElement DISPMSG = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return DISPMSG;
    }

    public WebElement CountWishItems()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }
}
