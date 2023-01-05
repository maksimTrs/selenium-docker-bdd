package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true,
        glue = {"com.test.stepdefs"},
        tags = "@End2End",
        plugin = {"pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber-reports/Cucumber.json"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
