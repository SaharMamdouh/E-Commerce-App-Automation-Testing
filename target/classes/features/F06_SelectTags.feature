@smoke
Feature:logged user can select different tags
  Background: user open the browser and navigates to the login page
    Given user select login from the top right bar and navigate to the login page
    When user enter a valid email
    And enter a valid password
    And click on the login button
    Then user logged in successfully

  Scenario: user choose different tags after open a certain category
    When user choose any category and a new page that contains popular tags opened
    And user select a random tag
    Then all products with that tag will be displayed