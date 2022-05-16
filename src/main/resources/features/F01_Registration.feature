@smoke
Feature: user create an account
 Scenario: signup with valid data
   Given user open the register page
    When user select the gender
    And insert personal data
    And insert the company name ,check on new sletter
    And write the password with the confirmation of it
    And click on the register button
    Then user signed up successfully
