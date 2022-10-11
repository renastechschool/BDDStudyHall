package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //this is for features files path
        glue = "renastech/StepDefinitions", //this is for steps path
        tags = "@ScenarioOutlineExample",
        dryRun = false, //when it is true, it will check if there is any undefined steps
        plugin={"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"}
)


public class TestRunner {
}
