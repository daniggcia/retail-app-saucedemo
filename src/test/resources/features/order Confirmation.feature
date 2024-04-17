Feature: Order Confirmation

  Scenario: Receiving order confirmation
    Given the user has completed the checkout process
    Then the user should receive an order confirmation email
