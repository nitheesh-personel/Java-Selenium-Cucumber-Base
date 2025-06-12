Feature: F1
  Background:
    Given user opens the Sauce Labs Page

    Scenario: Verification of the Sauce Labs Login
      When user enters the username "standard_user"
      And user enters the password "secret_sauce"
      And user clicks on login button
      Then user verifies the landing page

    Scenario: Verification of the Sauce Labs Invalid Login message
      When user enters the username "standard_use"
      And user enters the password "secret_sauc"
      And user clicks on login button
      Then user verifies the login error message

