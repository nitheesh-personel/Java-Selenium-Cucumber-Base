Feature: F1
  Background:
    Given user opens the Sauce Labs Page

    Scenario: Verification of the Sauce Labs Logout
      When user enters the username "standard_user"
      And user enters the password "secret_sauce"
      And user clicks on login button
      Then user verifies the landing page
      And user opens the hamburger menu
      And user clicks on the logout button
      Then user gets logged out


