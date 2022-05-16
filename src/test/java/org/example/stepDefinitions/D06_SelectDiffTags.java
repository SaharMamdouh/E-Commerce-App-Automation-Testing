package org.example.stepDefinitions;

import org.example.Pages.SelectTags;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D06_SelectDiffTags {
    Hooks hooks=new Hooks();
    SelectTags tags=new SelectTags();
    @When("user choose any category and a new page that contains popular tags opened")
    public void OpenCat() throws InterruptedException {
        tags.openCatPage().click();
        Thread.sleep(3000);
    }

    @And("user select a random tag")
    public void selectTag() throws InterruptedException {
        tags.chooseTag().click();
        Thread.sleep(3000);
    }

    @Then("all products with that tag will be displayed")
    public void Displayproducts() {
        String ExpectedResult = "https://demo.nopcommerce.com/cool";
        String ActualResult = hooks.driver.getCurrentUrl();
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
}
