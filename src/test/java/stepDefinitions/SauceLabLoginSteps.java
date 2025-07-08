package stepDefinitions;

import elementRepository.SauceLabLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class SauceLabLoginSteps {
    WebDriver driver = DriverManager.getDriver();
    SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);

    @Given("user opens the Sauce Labs Page")
    public void userOpensTheSauceLabsPage() {
        sauceLabLogin.openPageNew();
    }

    @When("user enters the username {string}")
    public void userEntersTheUsername(String username) {
        sauceLabLogin.enterSauceUsername(username);
    }

    @And("user enters the password {string}")
    public void userEntersThePassword(String password) {
        sauceLabLogin.enterSaucePassword(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        sauceLabLogin.clickLogin();
    }

    @Then("user verifies the landing tab")
    public void userVerifiesTheLandingTab() {
        sauceLabLogin.verifyLandingPage();
    }

    @Then("user verifies the login error message")
    public void userVerifiesTheLoginErrorMessage() {
        sauceLabLogin.verifyLoginError();
    }

    @And("user closes the invalid login error modal")
    public void userClosesTheInvalidLoginErrorModal() {
        sauceLabLogin.closeInvalidErrorModal();
    }

    @Then("user verifies the invalid login error modal is closed")
    public void userVerifiesTheInvalidLoginErrorModalIsClosed() {
        sauceLabLogin.verifyInvalidErrorModalClose();
    }

    @Then("user clicks on navigate {string} button")
    public void userClicksOnNavigateButton(String option) {
        if(Objects.equals(option, "back"))  driver.navigate().back();
        else driver.navigate().forward();
    }
}
