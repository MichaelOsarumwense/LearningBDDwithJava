package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/sanmi/LearningBDDwithJava/src/test/java/Michael/login.feature",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:test-output"}
)

public class TestRunner {
}
