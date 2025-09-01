package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef {


    private TestContest testContest;

    public LoginStepDef(TestContest testContest){
        this.testContest = testContest;
    }

    @Given("launching the website")
    public void launchingTheWebsite(){
        testContest.pageObjectManager().getLoginPage().launchingWebsite(testContest.fileReaderManager().getPropertyFileReader().getProperty("url"));
    }

    @When("passing credentials")
    public void passingCredentials() {
        testContest.pageObjectManager().getLoginPage().passingCredentials("tomsmith","SuperSecretPassword!");
    }

    @And("User should be redirected to secure page")
    public void userShouldBeRedirectedToSecurePage() {
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String actualUrl = testContest.pageObjectManager().getLoginPage().gettingCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"URL validation failed!");
    }

    @Then("quit the browser")
    public void quitTheBrowser() {
        testContest.pageObjectManager().getLoginPage().quitTheDriver();
    }
}
