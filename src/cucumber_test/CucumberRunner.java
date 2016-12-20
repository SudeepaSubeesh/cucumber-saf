package cucumber_test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@Cucumber.Options(
		format = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-report.json"},
		features = "Feature",
		glue="step_defenition"
		)
 

public class CucumberRunner {

}
