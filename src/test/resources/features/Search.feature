Feature: Basic and Advance search

  Scenario: Search a job by keyword
    Given the user goes principal page
    When user search a specific keyword
    Then the result conteins in his category this keyword

#  Scenario: Advance search by city
#    Given the user goes principal page
#    When user search by a specific city
#    Then the result contains the city in the location field
