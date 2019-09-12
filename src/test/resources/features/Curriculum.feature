Feature: creates curriculums

  Scenario: User create a curriculum with the minimum data required
    Given the user goes to login page
    And the user puts his username and password
    When the user navigates curriculum page
    And the user fill the data with the following characteristics
      | Nombre           | John            |
      | Apellido         | Salazar Pinto   |
      | Celular          | 78495135        |
      | Documento        | Pasaporte       |
      | Estado civil     | Soltero(a)      |
      | Numero documento | 10101010        |
      | Direccion        | Avenida america |
    Then the curriculum is created with and the following information is displayed in the curriculum page


