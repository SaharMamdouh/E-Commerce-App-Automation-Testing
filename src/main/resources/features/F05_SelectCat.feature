@smoke
Feature:logged user can select different category
  Background: user open the browser and navigates to the login page
    Given user select login from the top right bar and navigate to the login page
    When user enter a valid email
    And enter a valid password
    And click on the login button
    Then user logged in successfully

  Scenario: user select category and open subcategory
    When user click on a certain category
    And choose the subcategory from it
    Then a new page of detailed info about this sub cateogory is opened
