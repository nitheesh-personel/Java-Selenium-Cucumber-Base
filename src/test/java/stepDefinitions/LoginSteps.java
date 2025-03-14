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

    @Given("I open the page")
    public void iOpenThePage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Then("I click the button")
    public void iClickTheButton() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();
    }

    @Then("I landed the page")
    public void iLandedThePage() {
        loginPage.verifyDashboard();
    }
}
