package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {

    public WebElement enterEmail()
    {
        WebElement email= Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement enterPassword()
    {
        WebElement password= Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement loginButton()
    {
        WebElement logButton= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        return logButton;
    }

    public WebElement forgotPassword()
    {
        WebElement forgotpassword= Hooks.driver.findElement(By.linkText("Forgot password?"));
        return forgotpassword;
    }

    public WebElement clickRecoverBtn()
    {
        WebElement recoverBTN= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));
        return recoverBTN;
    }

}
