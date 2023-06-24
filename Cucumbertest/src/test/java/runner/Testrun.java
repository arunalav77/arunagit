package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/login.feature",glue= {"stepdefinition"},
//plugin= {"pretty","html:target/HtmlReports"}
plugin= {"pretty","json:target/JsonReports"}

		
		)
public class Testrun {

}
