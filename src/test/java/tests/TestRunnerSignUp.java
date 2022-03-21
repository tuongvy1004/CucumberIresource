package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/signup.feature"},
        glue = {"steps"},
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true)
public class TestRunnerSignUp extends AbstractTestNGCucumberTests {

}
