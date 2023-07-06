package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,
        features = "@target/failed_scenarios.txt",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false
)

public class FailedRunner {
}
