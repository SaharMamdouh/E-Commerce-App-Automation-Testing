@smoke
Feature:logged user can add products to shopping cart
  Background: user open the browser and navigates to the login page
    Given user select login from the top right bar and navigate to the login page
    When user enter a valid email
    And enter a valid password
    And click on the login button
    Then user logged in successfully
    When user choose any category and a new page that contains popular tags opened

  Scenario:  user select a certain product and add it to shopping cart
    When user click on the image of the product
     And user click on the add to cart button
     Then a new message displayed to confirm that adding

  Scenario: number of items in the shopping cart incremeneted after adding a new item to it
    When user click on the image of the product
    And user click on the add to cart button
    Then a new message displayed to confirm that adding
    And user get the number of items in the shopping cart
    Then the number of items in the shopping cart increased