package org.example.stepDefinitions;

import org.example.Pages.AddToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class D07_AddToCartDef {
    AddToCart addToCart=new AddToCart();
    int number;
    @When("user click on the image of the product")
    public void clickOnImg() throws InterruptedException {
        addToCart.selectProduct().click();
        Thread.sleep(2000);
    }
    @And("user click on the add to cart button")
    public void pressAddToCartButton() throws InterruptedException {
        //to scroll down use the javascript selector
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1000);
       addToCart.cartBtn().click();
        Thread.sleep(2000);
    }
    @Then("a new message displayed to confirm that adding")
    public void confirmAddingtoCart()
    {
        Assert.assertTrue(addToCart.confirmMsg().isDisplayed());

    }
    @And("user get the number of items in the shopping cart")
    public void itemsInCart() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        String text=addToCart.cartItems().getText();
        //remove brackets from text
        text=text.replaceAll("[^0-9]","");
        //convert the string into integer
        number=Integer.parseInt(text);
    }
    @Then("the number of items in the shopping cart increased")
    public void ItemsIncrement()
    {
        Assert.assertTrue(number>0);
    }
}
