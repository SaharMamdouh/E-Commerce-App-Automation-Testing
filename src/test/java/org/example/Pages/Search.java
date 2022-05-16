package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search {
    public WebElement locateSearchBar()
    {
        WebElement searchBar= Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
        return searchBar;
    }

    public WebElement clickOnSearchBtn()
    {
        WebElement searchBtn= Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        return searchBtn;
    }
}
