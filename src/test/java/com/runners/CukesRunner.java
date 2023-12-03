package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/cucumber-reports.html",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/feature",
            glue = "src/test/java/com/brainPop/step_definitions",
            dryRun = false,
            tags = "@wip"

    )

    public class CukesRunner {}

