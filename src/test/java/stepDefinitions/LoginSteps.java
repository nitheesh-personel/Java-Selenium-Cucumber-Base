package stepDefinitions;

import elementRepository.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void beforeScenario(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }
    @After
    public void afterScenario(){
        driver.quit();    //closes the browser after login feature file steps
    }

    @Given("user opens the login page")
    public void iOpenThePage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Then("user enters username and password")
    public void iEnterNamePassword() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
    }

    @Then("user clicks login")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("user lands on the page")
    public void iLandedThePage() {
        loginPage.verifyDashboard();
    }

    @Then("user verifies the landing page messages")
    public void userVerifiesTheLandingPageMessages() {
        loginPage.verifyLandingPageMessages();
    }
}
