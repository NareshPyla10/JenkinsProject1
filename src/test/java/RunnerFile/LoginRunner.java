package RunnerFile;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\nares\\IdeaProjects\\JenkinsPractice\\src\\test\\resources\\features\\logon.feature",
        glue = {"StepDefinition"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
