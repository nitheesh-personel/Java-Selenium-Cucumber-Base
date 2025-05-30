Feature: F1
  Background:
    Scenario: Verification of the login functionality
      Given user opens the login page
      When user enters username and password
      And user clicks login
      Then user lands on the page
      Then user verifies the landing page messages
