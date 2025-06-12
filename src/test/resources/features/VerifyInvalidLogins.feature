Feature: F1
  Background:
    Scenario Outline: Verification of the Invalid login functionality of sauce labs
      Given user opens the Sauce Labs Page
      When user enters the username <username>
      When user enters the password <password>
      And user clicks on login button
      Then user verifies the login error message
      Examples:
        | username | password   |
        | "admin"  | "admin123" |
        | "user1"  | "wrongpwd" |
