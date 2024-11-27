Feature: Successful Registration View

  Scenario: Validate user can register successfully with valid data
    Given User is on the register page
    When User submits valid credentials
    Then User should be ale to see Registration Successful view