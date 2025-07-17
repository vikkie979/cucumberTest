package cucumberproject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features="src/test/resources/features/login.feature",
  glue="SauceLoginSteps",
  plugin= {"pretty", "html:target/cucumber-report.html" },
  monochrome = true
)
public class Runnerclass {

}
