package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/VerifySorting.feature",  // Path to feature files
        glue = {"stepDefinitions"},  // Package containing step definitions
        plugin = {
                "pretty",  // Prints Gherkin steps in console
                "html:target/cucumber-reports.html",  // Generates HTML report
                "json:target/cucumber-reports.json",  // Generates JSON report
                "junit:target/cucumber-reports.xml"   // Generates JUnit XML report
        },
        monochrome = true,  // Improves console output readability
        dryRun = false  // Set to true to check if steps are defined without running tests
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()  // Enables parallel execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
