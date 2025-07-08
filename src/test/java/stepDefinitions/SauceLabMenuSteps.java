package stepDefinitions;

import elementRepository.SauceLabMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SauceLabMenuSteps {
    WebDriver driver = DriverManager.getDriver();
    SauceLabMenuPage sauceLabMenu = new SauceLabMenuPage(driver);

    @And("user verifies the menu items")
    public void userVerifiesTheMenuItems() {
        sauceLabMenu.verifyMenuItems();
    }

    @Then("user waits for {int} seconds")
    public void userWaitsForSeconds(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("user clicks on {string} from menu")
    public void userClicksOnFromMenu(String item) {
        sauceLabMenu.clickMenuItem(item);
    }

    @And("verifies the {string} page")
    public void verifiesThePage(String page) {
        sauceLabMenu.verifyPage(page);
    }
}
