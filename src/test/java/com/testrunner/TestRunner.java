package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="CucumberFeature2",
	glue="com.Stepdefinition"
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
