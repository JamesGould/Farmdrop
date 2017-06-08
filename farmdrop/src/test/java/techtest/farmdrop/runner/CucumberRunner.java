package techtest.farmdrop.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(format = { "pretty",
		"junit:target/cucumber-junit-report/allcukes.xml",
		"html:target/cucumber", "json:target/cucumberResults.json"}, 
		features={"src/test/java/techtest/farmdrop/features"},
		glue={"techtest.farmdrop"}
		)

public class CucumberRunner {

}