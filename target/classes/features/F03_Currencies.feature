@smoke
Feature:logged user can switch between currencies
  Background: user open the browser and navigates to the login page
   Given user select login from the top right bar and navigate to the login page
   When user enter a valid email
   And enter a valid password
   And click on the login button
   Then user logged in successfully

   Scenario: user switch between currencies
    When user click on the drop down menu in the top left and select the currency

