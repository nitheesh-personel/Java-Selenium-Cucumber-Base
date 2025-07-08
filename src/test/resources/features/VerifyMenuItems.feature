Feature: F1
  Background:
    Given user opens the Sauce Labs Page

    Scenario: Verification of the Sauce Labs Menu labels
      When user enters the username "standard_user"
      And user enters the password "secret_sauce"
      And user clicks on login button
      Then user verifies the landing tab
      And user opens the hamburger menu
      Then user waits for 5 seconds
      And user verifies the menu items
      And user clicks on the logout button
      Then user gets logged out

  Scenario: Verification of the Sauce Labs Menu clicks
    When user enters the username "problem_user"
    And user enters the password "secret_sauce"
    And user clicks on login button
    Then user verifies the landing tab
    And user opens the hamburger menu
    Then user waits for 5 seconds
    And user clicks on "All items" from menu
    And verifies the "All items" page
    And user clicks on "About" from menu
    And verifies the "About" page
    Then user clicks on navigate "back" button
    And user opens the hamburger menu
    Then user waits for 9 seconds
    And user clicks on the logout button
    Then user gets logged out


