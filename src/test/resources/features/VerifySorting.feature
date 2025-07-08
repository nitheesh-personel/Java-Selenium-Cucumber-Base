Feature: F1
  Background:
    Given user opens the Sauce Labs Page

  Scenario: Verification of the Sauce Labs Login
    When user enters the username "standard_user"
    And user enters the password "secret_sauce"
    And user clicks on login button
    Then user verifies the landing tab
    When user clicks on the sorting filter button
    Then user sorts "High to Low"
    When user clicks on the sorting filter button
    Then user sorts "Low to High"
    When user clicks on the sorting filter button
    Then user sorts "Z to A"