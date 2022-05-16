package org.example.stepDefinitions;

import org.example.Pages.SliderWrapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D09_SliderWrapperDef {
    SliderWrapper slide=new SliderWrapper();
    @When("user click on the first slider")
    public void clickOnFisrtSlider() throws InterruptedException {
        WebElement element=slide.FirstSlider("1");
        // i used here the action class as the element wasn't clickable without moving to it and performing the action
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(element).click().build().perform();
        Thread.sleep(2000);
    }
    @Then("relative product for first slider is displayed")
    public void relativeProductDisplayed()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://https://demo.nopcommerce.com/iphone-6s");
    }
    @When("user click on the second slider")
    public void clickOnSecondSlider() throws InterruptedException {
        slide.FirstSlider("2").click();
        Thread.sleep(2000);
    }
    @Then("relative product for second slider is displayed")
    public void relativeProductIsDisplayed()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
}
