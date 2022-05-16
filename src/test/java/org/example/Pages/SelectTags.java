package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class SelectTags {
    public WebElement openCatPage()
    {
        WebElement openCat= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a"));
        return openCat;
    }

    public WebElement chooseTag()
    {
        WebElement subCat= Hooks.driver.findElement(By.linkText("cool"));
        return subCat;
    }
}
