package digital;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "com.github.kirlionik.cucumberallure.AllureReporter",
                "pretty", "json:build/Cucumber.json",
                "html:build/cucumber-html-report"
        },
        format = {"html:target/cucumber-html-report"}
)
public class RunCukesTest {
}
