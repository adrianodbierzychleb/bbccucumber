package com.spartaglobal.bbctests;

import static org.junit.Assert.assertTrue;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"pretty"},
            features = "C:\\Users\\Adrian Odbierzychleb\\Documents\\engineering43\\bbccucumber\\src\\test\\resources\\features",
            glue = "com.spartaglobal.stepdefs")
    public class CucumberTestRunner
{



}
