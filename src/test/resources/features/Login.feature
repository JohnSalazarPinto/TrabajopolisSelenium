Feature: Login in an account

  Scenario: login in Trabajopolis
    Given the user goes to login page
    When the user puts his username and password
    Then user login successfully

#  Scenario: login in Trabajopolis
#    Given the user goes to login page
#    When the user puts his credentials as "administrator"
#    Then the user should be in the Home Page
#    When the user goes to their profile
#    Then the username should be displayed in the profile

#    And the username should be displayed in the user profile
#  @CaseCreation
#  Scenario: Look the account
#    Given the user goes to account page
#    Then user confirm his correct data successfully
