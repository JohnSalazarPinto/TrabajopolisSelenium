Feature: Add and delete things at cart

  Scenario: Add a laptop to cart
    Given the user goes to  the principal page
    When user searches specific thing
    And user adds a thing to cart
    Then the cart contains the thing that was added

    Scenario: Delete a thing from the cart
    Given the user goes to cart page
    When user delete a thing from cart
    Then the cart not contains the thing that was deleted