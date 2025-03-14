package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


features="./Feature/HooksFeature.feature",
	glue={"stepDefinition","applicationHooks"}   //name of package 
	
	)

public class TestRunner1 {

}
