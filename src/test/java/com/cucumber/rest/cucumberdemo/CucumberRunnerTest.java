package com.cucumber.rest.cucumberdemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.cucumber.rest.cucumberdemo.steps")
public class CucumberRunnerTest {
}
