@smoke
Feature: guest user can redirected to different links through the home page
  Scenario: user click on facebook icon and navigated to the facebook page
    When user click on facebook font awesome icon
    Then facebook link is opened in a new tap

  Scenario: user click on twitter icon and navigated to the twitter page
    When user click on twitter font awesome icon
    Then twitter link is opened in a new tap

  Scenario: user click on rss icon and navigated to the twitter page
    When user click on rss font awesome icon
    Then rss link is opened in a new tap

  Scenario: user click on youtube icon and navigated to the twitter page
    When user click on youtube font awesome icon
    Then youtube link is opened in a new tap