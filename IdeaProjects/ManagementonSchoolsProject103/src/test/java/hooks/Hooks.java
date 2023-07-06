package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static utilities.BaseURL.setupBeforeAPI;

public class Hooks {

    @Before()
    public void setUp() {
        setupBeforeAPI();
    }

    @After("UI")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
        }
        Driver.closeDriver();
    }

}
