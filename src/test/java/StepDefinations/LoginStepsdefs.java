/**
 * @Author:Otosun Tarih :08/11/2020
 */
package StepDefinations;

import Pages.LoginContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepsdefs {
    WebDriver driver;
    LoginContent loginContent = new LoginContent();

    @Given("^Navigate to basqar webpage$")
    public void navigateToBasqarWebpage() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\" and click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton(String arg0, String arg1) {
        loginContent.findElementAndSendKeysFunction("username", arg0);
        loginContent.findElementAndSendKeysFunction("password", arg1);
        loginContent.findElementAndClickFunction("loginButton");
        if (loginContent.cookieConsent.isDisplayed()) {
            loginContent.findElementAndClickFunction("gotItBtn");
        }


    }

    @Then("^User must login successfully$")
    public void userMustLoginSuccessfully() {
        loginContent.findElementAndVerifyDisplayed("dashboard");
    }
}
