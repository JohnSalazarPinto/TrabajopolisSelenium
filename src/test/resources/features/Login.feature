Feature: Login in an account

  Scenario: login in Trabajopolis
    Given the user goes to login page
    When the user puts his username and password
    Then user login successfully

  Scenario: Look the account
    Given the user goes to account page
    Then user confirm his correct data successfully
