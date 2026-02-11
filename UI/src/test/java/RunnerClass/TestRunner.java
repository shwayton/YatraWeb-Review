package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/features",          // path to your .feature files
        glue = "StepDefinition",            // package containing step definitions
        tags = "@smoke"
)
public class
TestRunner extends AbstractTestNGCucumberTests
{

}
