Feature: Added To Cart Successfully View

  Scenario: Validate user can add an item from formal shoe list successfully to cart
    Given A logged in user is already on the formal shoe list page
    When User adds Classic Cheltenham shoe to cart
    Then User should be able to see a success message