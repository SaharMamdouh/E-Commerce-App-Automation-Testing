@smoke
Feature:logged user can search for any product
  Background: user open the browser and navigates to the login page
    Given user select login from the top right bar and navigate to the login page
    When user enter a valid email
    And enter a valid password
    And click on the login button
    Then user logged in successfully
#
  Scenario: user search for any product by writing the name of it in the search bar
    When user write the product name in the search bar
    And click on search button
    Then a new page that contain all products with that name will be displayed

  Scenario: user search for any product by writing the SKU of it in the search bar
    When user write the product SKU in the search bar
    And click on search button
    Then a new page that contain the product with that SKU will be displayed