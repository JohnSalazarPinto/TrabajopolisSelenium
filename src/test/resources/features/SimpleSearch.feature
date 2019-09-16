Feature: Simple search

  @Bug @Search
  Scenario: Search for a job by a keyword
    When the user unregistered navigates to principal search page
    And the user searches for a job by "Cheft de cocina" keyword
    Then the job with the category "Cocina" is displayed in the results page

  @Acceptance @Search
  Scenario: Search for a job by a keyword, category, city, posted within number days and type of contract
    When the user unregistered navigates to principal search page
    And the user searches with the following characteristics
      | Palabra de busqueda | Ventas      |
      | Categoría           | Informática |
      | Ciudad              | La Paz      |
      | Contrato            | Full time   |
      | Publicado Dentro de | 30          |
    Then the job with the following information is displayed in the results page
