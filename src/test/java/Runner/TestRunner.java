package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature/test.feature"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {"src/test/java/Steps/"})
public class TestRunner {

}
