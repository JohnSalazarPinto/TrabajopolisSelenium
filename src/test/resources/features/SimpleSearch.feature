Feature: Simple search

  Scenario: Search for a job by a keyword
    When the user unregistered navigates to principal/search page
    And the user searches for a job by "Gerente en Ventas" keyword
    Then the job "Gerente en Ventas" is displayed in the results page

  Scenario: Search for a job by a keyword, category, city, posted within number days and type of contract
    When the user unregistered navigates to principal/search page
    And the user searches with the following characteristics
      | keyword                      | programer       |
      | Category                     | Informatica     |
      | City                         | La Paz          |
      | Posted within number in days | 30              |
      | Type of contract             | Tiempo Completo |
    Then the job with the following information is displayed in the results page
      | keyword                      | programer       |
      | Category                     | Informatica     |
      | City                         | La Paz          |
      | Posted within number in days | 30              |
      | Type of contract             | Tiempo Completo |

  Scenario: Search for a job by a keyword and city
    When the user unregistered navigates to principal/search page
    And the user searches with the following characteristics
      | keyword | Abogado |
      | City    | La Paz  |
    Then the job with the following information is displayed in the results page
      | keyword | Abogado |
      | City    | La Paz  |
