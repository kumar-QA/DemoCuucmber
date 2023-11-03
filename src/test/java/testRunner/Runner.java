package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\EclipseWorkpace\\DemoCucumber\\src\\test\\java\\Features",
		glue= {"stepdefination"}		
		)


public class Runner {
}
