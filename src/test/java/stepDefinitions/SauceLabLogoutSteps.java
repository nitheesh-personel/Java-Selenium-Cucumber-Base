package stepDefinitions;

import elementRepository.SauceLabMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SauceLabLogoutSteps {

    WebDriver driver = DriverManager.getDriver();
    SauceLabMainPage sauceLabMain = new SauceLabMainPage(driver);

    @And("user opens the hamburger menu")
    public void userOpensTheHamburgerMenu() {
        sauceLabMain.openMenu();
    }

    @And("user clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        sauceLabMain.clickLogout();
    }

    @Then("user gets logged out")
    public void userGetsLoggedOut() {
        sauceLabMain.verifyLogout();
    }
}
