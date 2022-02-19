package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Shree\\Desktop\\cucumber\\new clone may2020\\May2020\\bdd\\Feature\\dataDriven_test.feature"
 ,glue={"stepDefinitions"}
 
 )
public class TestRunner {

}
