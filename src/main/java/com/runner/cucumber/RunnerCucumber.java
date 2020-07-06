package com.runner.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources", glue = "com\\stepdefinations\\cucumber",tags = {"@smoke"},
plugin={"pretty","html:target/Reports"})
public class RunnerCucumber extends AbstractTestNGCucumberTests {

}
