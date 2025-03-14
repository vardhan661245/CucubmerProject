package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Feature/Login.feature",
		glue="stepDefinition"   //name of package 
		
		)
public class TestRunner {

}
