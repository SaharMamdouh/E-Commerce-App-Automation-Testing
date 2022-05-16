package org.example.stepDefinitions;

import org.example.Pages.AddToWishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D08_AddToWishListDef {
    Hooks hooks=new Hooks();
    AddToWishList addToWishlist=new AddToWishList();
    int number;

    @When("user click on add to wish button")
    public void clickOnWishBtn() throws InterruptedException {
        addToWishlist.wishBtn().click();
        Thread.sleep(2000);
    }
    @Then("a new message displayed to confirm that adding to the wishing list")
    public void displayMsg()
    {
        addToWishlist.dispMsg().isDisplayed();
//        String ExpectedResult="The product has been added to your wishlist";
//        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    @And("user get the number of wishlist item after adding the product")
    public void CountWishlistItems()
    {
        String text=addToWishlist.CountWishItems().getText();
        //remove the bracket() from the text
        text=text.replaceAll("[^0-9]","");
        //convert the string into integer
        number=Integer.parseInt(text);
    }
    @Then("number of wishlist items increased")
    public void itemsIncremented()
    {
       Assert.assertTrue(number>0);
    }
}
