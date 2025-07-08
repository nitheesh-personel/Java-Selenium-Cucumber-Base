package stepDefinitions;

import elementRepository.SauceLabMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SauceLabMainPageSteps {
    WebDriver driver = DriverManager.getDriver();
    SauceLabMainPage sauceLabMain = new SauceLabMainPage(driver);

    @When("user clicks on the sorting filter button")
    public void userClicksOnTheSortingFilterButton() {
        sauceLabMain.clickSortingFilter();
    }

    @Then("user sorts {string}")
    public void userSorts(String sort) {
        sauceLabMain.sortFilter(sort);
    }
}
