package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features", glue= {"com.stepDefinition"}, monochrome=true, 
plugin= {"html:Reports\\htmlReport", "json:Reports\\JsonReports\\cucumber.json", "junit:Reports\\JunitRepoorts\\cucumber.xml"})

public class Runner {
	
}
