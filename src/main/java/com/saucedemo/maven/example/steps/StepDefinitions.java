package com.saucedemo.maven.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        // Add code to navigate to the registration page
    }

    @When("the user fills in the registration form with valid details")
    public void the_user_fills_in_the_registration_form_with_valid_details() {
        // Add code to fill in the registration form with valid details
    }

    @When("the user submits the form")
    public void the_user_submits_the_form() {
        // Add code to submit the registration form
    }

    @Then("the user should receive a verification email")
    public void the_user_should_receive_a_verification_email() {
        // Add code to verify that the user receives a verification email
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Add code to navigate to the login page
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Add code to enter valid credentials into the login form
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        // Add code to click on the login button
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Add code to verify that the user is logged in successfully
         }

    }


