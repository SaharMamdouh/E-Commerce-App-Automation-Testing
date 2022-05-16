package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Currencies {
    public WebElement selectCurrencies()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]"));
    }
}
