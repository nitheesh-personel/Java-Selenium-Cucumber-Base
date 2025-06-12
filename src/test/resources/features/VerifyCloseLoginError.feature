Feature: F1
  Background:
    Scenario: Verification of the close button of invalid login error modal
      Given user opens the Sauce Labs Page
      When user enters the username "NG"
      When user enters the password "NJ"
      And user clicks on login button
      Then user verifies the login error message
      And user closes the invalid login error modal
      Then user verifies the invalid login error modal is closed

