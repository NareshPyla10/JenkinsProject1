package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public boolean waitForPageLoad() {
        return false;
    }

    @FindBy(id = "username")
    WebElement userNameButton;

    @FindBy(id = "password")
    WebElement passwordButton;

    @FindBy(className = "radius")
    WebElement loginButton;

    public void launchingWebsite(String url){
        getWebLaunchCommands().openingBrowser(url);
    }

    public void passingCredentials(String userName, String password){
        getWebTextCommands().clearAndEnterText(userNameButton,userName);
        getWebTextCommands().clearAndEnterText(passwordButton,password);
        getWebClickCommands().clickElement(loginButton);
    }


    public String gettingCurrentUrl(){
        return getWebLaunchCommands().currentWindowUrl();
    }

    public void quitTheDriver(){
        getWebLaunchCommands().quitBrowser();
    }
}
