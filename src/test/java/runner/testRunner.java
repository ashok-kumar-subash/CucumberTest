package runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumber"},
        features = {"src/test/java/feature"},
        tags={"@run","~@wip"},
        glue = {"stepdef"})

public class testRunner {


}

