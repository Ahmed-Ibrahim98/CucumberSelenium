Feature: New User View

  Scenario: Validate New User Is Able To Register
    Given user navigate to the login page
    When user tries to register as a new user
    Then user should be able to view registration page