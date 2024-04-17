Feature: Adding Products to Cart

  Scenario: Adding a product to the cart
    Given the user is viewing a product
    When the user clicks on the "Add to Cart" button
    Then the product should be added to the cart

  Scenario: Adjusting quantity in the cart
    Given the user has added a product to the cart
    When the user increases the quantity to 2
    Then the cart should show 2 of the producto
