Feature: Login in an account

  Scenario: login in amazon
    Given the user goes to login page
    When user put username and password
    Then user login successfully
