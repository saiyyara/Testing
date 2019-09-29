package testrunner;
import org.junit.runner.RunWith;
//import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",glue= "stepdefinitions",tags= 
{"@scenariowithDatatable"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html", 
		"html:target/cucumber-reports"}
,monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

}

