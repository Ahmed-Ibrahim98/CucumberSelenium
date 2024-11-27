Feature: Formal Shoe List View

  Scenario: Validate logged in user is able to view the formal shoe list
    Given User is already logged in
    When User tries to view the formal shoe collection
    Then User should be able to see the formal shoe list page