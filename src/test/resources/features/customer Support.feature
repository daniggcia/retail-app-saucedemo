Feature: Customer Support

  Scenario: Contacting customer support
    Given the user needs assistance
    When the user clicks on the "Contact Us" link
    And fills out the support form
    Then the user should receive a response from customer support
