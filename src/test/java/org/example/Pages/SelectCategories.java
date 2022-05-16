package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class SelectCategories {
    public WebElement selectCat()
    {
        WebElement cat= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        return cat;
    }

    public WebElement selectSubCat()
    {
        WebElement subCat= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a"));
        return subCat;
    }
}
