@smoke
Feature:guest user can add product to wishlist

  Scenario: user add the chosen product to the wishlist
    When user click on add to wish button
    Then a new message displayed to confirm that adding to the wishing list

  Scenario: the number of items in the wishlist incremented after adding the selected item to it
    When user click on add to wish button
    And user get the number of wishlist item after adding the product
    Then number of wishlist items increased