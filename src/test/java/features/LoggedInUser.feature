Feature: LoggedIn User View

  Scenario Outline: Validate User Is Able To View After Login
    Given user navigate to the login page
    When user enters a valid <username> and <password>
    Then user should be able to view the product category page

    Examples:
    |username|password|
    |"autotester"|"password1"|
    |"tautester"|"password2"|

#  Scenario: Validate User Is Able To View After Login
#    Given user navigate to the login page
#    When user enters a valid credentials
#      |username|password|
#    Then user should be able to view the product category page