package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="BookFlight",glue={"flightBookingStepDefinition"})

public class FlightTestRunner {

}
