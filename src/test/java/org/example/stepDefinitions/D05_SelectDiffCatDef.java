package org.example.stepDefinitions;

import org.example.Pages.SelectCategories;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_SelectDiffCatDef {
    Hooks hooks=new Hooks();
    SelectCategories selectCategory=new SelectCategories();
    @When("user click on a certain category")
    public void selectCat() throws InterruptedException {
        //Creating object of an Actions class
        Actions action = new Actions(hooks.driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(selectCategory.selectCat()).perform();
        Thread.sleep(3000);

    }
        @And("choose the subcategory from it")
        public void chooseSubCat() throws InterruptedException {
            selectCategory.selectSubCat().click();
            Thread.sleep(2000);
        }
        @Then("a new page of detailed info about this sub cateogory is opened")
        public void detailedSubCat()
        {
            String ExpectedResult="https://demo.nopcommerce.com/cell-phones";
            String ActualResult=hooks.driver.getCurrentUrl();
            Assert.assertEquals(ActualResult,ExpectedResult);
        }
}
