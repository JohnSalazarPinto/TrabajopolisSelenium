Feature: Login in an account

  Scenario: login in amazon
    Given user go to login page
    When user put username and password
    Then user login succefuly
