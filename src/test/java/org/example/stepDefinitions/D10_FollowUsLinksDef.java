package org.example.stepDefinitions;

import org.example.Pages.FollowUsLinks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class D10_FollowUsLinksDef {
    FollowUsLinks follow=new FollowUsLinks();
    @When("user click on facebook font awesome icon")
    public void clickOnFb() throws InterruptedException {

        follow.fbIcon().click();
        Thread.sleep(2000);
    }
    @Then("facebook link is opened in a new tap")
    public void OpenNewTap()
    {   ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    @When("user click on twitter font awesome icon")
    public void clickOnTwitter() throws InterruptedException {
        follow.twitterIcon().click();
        Thread.sleep(2000);
    }
    @Then("twitter link is opened in a new tap")
    public void openTwitterTap()
    {   ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
    }
    @When("user click on rss font awesome icon")
    public void clickOnRss() throws InterruptedException {

        follow.rssIcon().click();
        Thread.sleep(2000);
    }
    @Then("rss link is opened in a new tap")
    public void OpenRssTap()
    {   ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        //error here is due to opening in the same tap
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/news/rss/1");
    }
    @When("user click on youtube font awesome icon")
    public void clickOnYoutube() throws InterruptedException {

        follow.youtubeIcon().click();
        Thread.sleep(2000);
    }
    @Then("youtube link is opened in a new tap")
    public void OpenYoutubeTap()
    {   ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }

}
