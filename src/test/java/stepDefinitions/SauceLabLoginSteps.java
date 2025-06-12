package stepDefinitions;

import elementRepository.SauceLabLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("Alert accepted.");
        } catch (Exception e) {
            System.out.println("No alert present.");
        }
    }

    @Then("user verifies the landing page")
    public void userVerifiesTheLandingPage() {
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
}
