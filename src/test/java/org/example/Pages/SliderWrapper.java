package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SliderWrapper {
    public WebElement FirstSlider(String sliderNum)
    {
       return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a["+sliderNum+"]"));
    }
}
