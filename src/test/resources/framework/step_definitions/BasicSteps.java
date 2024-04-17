package com.saucedemo.maven.step_definitions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicSteps {
    public static Scenario scenario;
    Config config;
    private BasicPOMAdapter pom;

    public BasicSteps() {
        config = Config.getConfig();
        pom = new BasicPOMAdapter();
    }

    @Before
    public void setUpScenario(Scenario scenario) {
        BasicSteps.scenario = scenario;
    }

    @BeforeStep
    public void beforeStep() {
        takeScreenshot();
    }

    @AfterStep
    public void afterStep() {
        takeScreenshot();
    }