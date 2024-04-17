Feature: Account Management

  Scenario: Updating user profile
    Given the user is logged in
    When the user updates their profile information
    Then the changes should be saved successfully

  Scenario: Viewing order history
    Given the user is logged in
    When the user navigates to the order history page
    Then the user should see a list of their previous orders
