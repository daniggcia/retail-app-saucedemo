Feature: Checkout Process

  Scenario: Completing the checkout process
    Given the user has added products to the cart
    And the user is on the checkout page
    When the user enters shipping and payment information
    And the user clicks on the "Place Order" button
    Then the order should be confirmed
