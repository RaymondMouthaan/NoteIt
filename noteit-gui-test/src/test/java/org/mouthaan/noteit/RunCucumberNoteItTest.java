package org.mouthaan.noteit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this code will only look into "features/" folder for features
        features = {"classpath:features/"},
        glue = {"org.mouthaan.noteit.steps", "org.mouthaan.noteit.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports/htmp-report", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@working"}
)
public class RunCucumberNoteItTest {

}
