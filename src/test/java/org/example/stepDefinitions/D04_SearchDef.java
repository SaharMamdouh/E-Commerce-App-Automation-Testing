package org.example.stepDefinitions;

import org.example.Pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04_SearchDef {
    Search search=new Search();

    @When("user write the product name in the search bar")
    public void WriteProductName()
    {
     search.locateSearchBar().sendKeys("T-shirt");
    }

    @And("click on search button")
    public void clickSearchBtn() throws InterruptedException {
     search.clickOnSearchBtn().click();
     Thread.sleep(2000);
    }

    @Then("a new page that contain all products with that name will be displayed")
    public void displayProductPage()
    {
        String ActualResult=Hooks.driver.getCurrentUrl();
        String ExpectedResult="https://demo.nopcommerce.com/search?q=T-shirt";
        Assert.assertEquals(ActualResult,ExpectedResult);
    }

    @When("user write the product SKU in the search bar")
    public void serachSku()
    {
     search.locateSearchBar().sendKeys("EG_GEM_NL");
    }

    @Then("a new page that contain the product with that SKU will be displayed")
    public void displayProductSKUPage()
    {
        String ActualResult=Hooks.driver.getCurrentUrl();
        String ExpectedResult="https://demo.nopcommerce.com/search?q=EG_GEM_NL";
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
}
