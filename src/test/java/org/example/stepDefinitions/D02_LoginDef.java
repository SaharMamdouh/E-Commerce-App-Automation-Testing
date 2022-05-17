package org.example.stepDefinitions;

import org.example.Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D02_LoginDef {
    Login login = new Login();

    @Given("user select login from the top right bar and navigate to the login page")
    public void NavigateToLogin() throws InterruptedException {
        Hooks.driver.findElement(By.linkText("Log in")).click();
        String ExpectedResult = "https://demo.nopcommerce.com/login";
        String ActualResult = Hooks.driver.getCurrentUrl();
        System.out.println(ActualResult);
        Thread.sleep(3000);
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @When("user enter a valid email")
    public void EnterMail() {
        login.enterEmail().sendKeys("SaharMamdouh2026@gmail.com");
    }

    @And("enter a valid password")
    public void EnterPass() {
        login.enterPassword().sendKeys("Sahar@1993");
    }

    @And("click on the login button")
    public void loginBtn() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(3000);
    }

    @Then("user logged in successfully")
    public void SuccessfullLogin()
    {
        String actualResult=Hooks.driver.getCurrentUrl();
        String ExpectedResult="https://demo.nopcommerce.com/";
        //Assert.assertTrue(actualResult.contains(ExpectedResult));
        Assert.assertEquals(actualResult,ExpectedResult);
    }

    @And("click on the forgot password anchor tag")
    public void clickForgotPw() throws InterruptedException {
     login.forgotPassword().click();
     Thread.sleep(2000);
    }

    @And("insert the email again")
    public void EnterMailAgain() {
        login.enterEmail().sendKeys("SaharMamdouh2026g@gmail.com");
    }

    @And("Click on the recover button")
    public void recoverBtn() throws InterruptedException {
     login.clickRecoverBtn().click();
     Thread.sleep(3000);
    }

    @Then("message says that the mail sent successfully appeared")
    public void mailSent() throws InterruptedException {
        String ActualResult= Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
        String ExpectedResult="Email with instructions has been sent to you.";
        Assert.assertEquals(ActualResult,ExpectedResult);
        Thread.sleep(3000);
    }

}
