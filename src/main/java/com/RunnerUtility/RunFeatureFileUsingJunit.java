package com.RunnerUtility;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = ("src\\test\\resources"),glue=("src\\main\\java\\com\\stepdefinations\\cucumber"))
public class RunFeatureFileUsingJunit  {
// src\\main\\java\\com\\stepdefinations\\cucumber
}
