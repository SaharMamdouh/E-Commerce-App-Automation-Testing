@smoke
Feature: user could login to the website
  Background: user open the browser and navigates to the login page
    Given user select login from the top right bar and navigate to the login page

  Scenario: user could login with valid data
    When user enter a valid email
    And enter a valid password
    And click on the login button
    Then user logged in successfully


  Scenario:user forgot the password
    When user enter a valid email
    And click on the forgot password anchor tag
    And insert the email again
    And Click on the recover button
    Then message says that the mail sent successfully appeared