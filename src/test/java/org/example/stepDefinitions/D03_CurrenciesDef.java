package org.example.stepDefinitions;

import org.example.Pages.Currencies;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class D03_CurrenciesDef {
  Currencies selectCur=new Currencies();

    @When("user click on the drop down menu in the top left and select the currency")
    public void clickOnCurrency() throws InterruptedException {
        Select drpCurrency = new Select(selectCur.selectCurrencies());
        drpCurrency.selectByVisibleText("US Dollar");
        Thread.sleep(2000);

        drpCurrency.selectByVisibleText("Euro");
        Thread.sleep(2000);

    }
}
