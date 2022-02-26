package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Shree\\eclipse-workspace\\cucumber-maven\\src\\test\\resources\\functionalTest\\tagDemo.feature",
				glue= {"stepdefinition"},
			    tags= "@SmokeTest or @RegressionTest"
		)
public class TestRunner {

}
