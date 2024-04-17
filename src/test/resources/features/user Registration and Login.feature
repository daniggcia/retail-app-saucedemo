Feature: User Registration and Login

  Scenario: User registration
    Given the user is on the registration page
    When the user fills in the registration form with valid details
    And the user submits the form
    Then the user should receive a verification email

  Scenario: User login
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks on the login button
    Then the user should be logged in successfully
