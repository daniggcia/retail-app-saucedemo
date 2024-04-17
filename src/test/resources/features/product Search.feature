Feature: Product Search

  Scenario: Searching for a product
    Given the user is on the home page
    When the user enters "shoes" in the search bar
    And the user clicks on the search button
    Then the user should see a list of shoes

  Scenario: Filtering search results
    Given the user has searched for "shoes"
    When the user applies the "sports" filter
    Then the user should see only sports shoes in the results

