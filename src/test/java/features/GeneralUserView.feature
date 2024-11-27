Feature: General View

  Scenario: Validate general user is able to view products without logging in
    Given User navigates to the Online Products page
    When User clicks on all of the shoes dropdowns
    Then User should be able to view the products