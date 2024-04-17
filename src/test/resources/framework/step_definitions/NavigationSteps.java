package com.saucedemo.maven.step_definitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationSteps {
    Config config;
    private BasicPOMAdapter pom;

    public NavigationSteps() {
        config = Config.getConfig();
        pom = new BasicPOMAdapter();
    }

    @Before
    public void setUpScenario(Scenario scenario) {
        BasicSteps.scenario = scenario;
    }

    @BeforeStep
    public void beforeStep() {
        BasicSteps.takeScreenshot();
    }

    @AfterStep
    public void afterStep() {
        BasicSteps.takeScreenshot();
    }