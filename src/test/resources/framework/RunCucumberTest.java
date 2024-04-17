package com.saucedemo.maven.framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "json:target/cucumber-reports/cucumber.json",
        "html:target/cucumber-reports/cucumber.html",
        "junit:target/cucumber-junit-report",
        "usage:target/cucumber-usage.json"
},
        glue = {
                "com/saucedemo/maven/framework/step_definitions"
        },
        features = {
                "src/test/resources/features/"
        })

public class RunCucumberTest {

}