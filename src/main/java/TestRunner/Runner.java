package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\Sridhar\\eclipse-workspace\\CucumberPOM\\Features\\pom.feature",glue={"C:\\Users\\Sridhar\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\StepDefinitions\\Steps.java"}
//plugin= {"pretty","html:test-output"}
)
public class Runner {

}
