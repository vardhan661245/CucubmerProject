package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


features="./Features/HooksFeature.feature",
	glue={"stepDefinition","applicationHooks"},   //name of package 
	plugin={"json:target/cucumberJsonRep.json"}
	)

public class TestRunner1 {

}
