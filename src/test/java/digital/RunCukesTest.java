package digital;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(
//        plugin = {"pretty"},
        plugin = {
                "com.github.kirlionik.cucumberallure.AllureReporter",
                "pretty", "json:build/Cucumber.json",
                "html:build/cucumber-html-report"
        },
//        features = "C:\\JavaRepo\\cucumber\\src\\test\\features\\drSandbox.feature",
//        features = "C:\\JavaRepo\\cucumber\\src\\test\\resources",
        format = {"html:target/cucumber-html-report"}
//        format = {"pretty", "html:target/cucumber-html-report"}
//        format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"}
)
public class RunCukesTest {
}
