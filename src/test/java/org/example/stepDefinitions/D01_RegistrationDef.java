package org.example.stepDefinitions;

import org.example.Pages.Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_RegistrationDef {
    WebDriver driver=null;
    Registration register=new Registration();

    @Given("user open the register page")
    public void openRegPage() throws InterruptedException {
        Hooks.driver.findElement(By.linkText("Register")).click();
        String ExpectedResult = "https://demo.nopcommerce.com/register";
        String ActualResult = Hooks.driver.getCurrentUrl();
        System.out.println(ActualResult);
        Thread.sleep(3000);
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @When("user select the gender")
    public void SelectGender()
    { // boolean check= register.chooseGenderFemale().isSelected();
        //if(check==false)
        register.chooseGenderFemale().click();
    }
    @And("insert personal data")
    public void enterUserName() throws InterruptedException {
     register.FirstName().sendKeys("Sahar");
     register.LastName().sendKeys("Mamdouh");
     register.Email().sendKeys("SaharMamdouh2026@gmail.com");
        //select the day of date of birth
        Select drpDay = new Select(Hooks.driver.findElement(register.DayOfBirth()));
        drpDay.selectByValue("31");
        //select the month of date of birth
        Select drpMonth = new Select(Hooks.driver.findElement(register.MonthOfBirth()));
        drpMonth.selectByVisibleText("August");
        //select the month of date of birth
        Select drpYear = new Select(Hooks.driver.findElement(register.YearOfBirth()));
        drpYear.selectByValue("1990");
     Thread.sleep(3000);
    }
    @And("insert the company name ,check on new sletter")
    public void insertCompanyName()
    {
     register.Company().sendKeys("ITIDA");
        if(Hooks.driver.findElement(By.id("Newsletter")).isSelected())
        {}
        else
            Hooks.driver.findElement(By.id("Newsletter")).click();
    }
    @And("write the password with the confirmation of it")
    public void insertPassword()
    {
     register.Password().sendKeys("Sahar@1993");
     register.ConfirmPassword().sendKeys("Sahar@1993");
    }
    @And("click on the register button")
    public void submit() throws InterruptedException {
        register.regButton().click();
        Thread.sleep(3000);
    }

    @Then("user signed up successfully")
    public void successSubmition() throws InterruptedException {
        String ActualMsg=register.regText().getText();
        String ExpectedMsg="Your registration completed";
        Assert.assertEquals(ActualMsg,ExpectedMsg);
        Thread.sleep(3000);
    }

}
