package com.saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
         features = {"src/test/java/com/saucedemo/features"},
                plugin = {"pretty", "json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/Pretty-cucumber"},
                glue = {"com/saucedemo/hooks", "com/saucedemo/stepdefinitions"}
        )

public class TestRunner {
}
