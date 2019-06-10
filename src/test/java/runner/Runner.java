package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Features/sample1.feature",
@CucumberOptions(features= {"@rerun/failedscenario.txt"},
                  glue="Kannada",
                  //tags= {"login"})
                  plugin= {"html:C:\\Python\\Challenger\\htmlreports",
                  "rerun:rerun/failedscenario.txt"})
                  //plugin="json:C:\\Python\\Challenger\\jsonreports.json")
                  //plugin="junit:C:\\Python\\Challenger\\junitreports.xml")
public class Runner {

}
