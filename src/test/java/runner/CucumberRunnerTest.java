package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefs",
        /*tags = "@firstTag",*/
        plugin = {"pretty", "html:target/cucumber.html"},
        snippets = CAMELCASE,
        monochrome = true
)
public class CucumberRunnerTest {
}