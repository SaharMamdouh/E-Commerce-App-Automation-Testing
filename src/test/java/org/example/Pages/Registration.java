package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration {
    //create method to declare the gender locator
    public WebElement chooseGenderMale()
    {
        WebElement genderMale= Hooks.driver.findElement(By.id("gender-male"));
        return genderMale;
    }

    public WebElement chooseGenderFemale()
    {
        WebElement genderFemale= Hooks.driver.findElement(By.id("gender-female"));
        return genderFemale;
    }

    public WebElement FirstName()
    {
        WebElement firstname=Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }

    public WebElement LastName()
    {
        WebElement lastname=Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement Email()
    {
        WebElement email=Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public By DayOfBirth()
    {
        return By.name("DateOfBirthDay");
    }
    public By MonthOfBirth() { return By.name("DateOfBirthMonth");}
    public By YearOfBirth()
    {
        return By.name("DateOfBirthYear");
    }

    public WebElement Company()
    {
        WebElement company=Hooks.driver.findElement(By.id("Company"));
        return company;
    }
    public WebElement Password()
    {
        WebElement password=Hooks.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement ConfirmPassword()
    {
        WebElement confirmPassword=Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPassword;
    }

    public WebElement regButton()
    {
        WebElement submitReg=Hooks.driver.findElement(By.id("register-button"));
        return submitReg ;
    }

    public WebElement regText()
    {
        WebElement ActualMsg=Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        return ActualMsg;
    }

}
