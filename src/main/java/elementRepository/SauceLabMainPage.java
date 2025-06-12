package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabMainPage {

    WebDriver driver;

    public SauceLabMainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    public By menuButton = By.id("react-burger-menu-btn");
    public By logoutButton = By.id("logout_sidebar_link");

    // Methods
    public void openMenu(){
        driver.findElement(menuButton).click();
    }

    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }

    public void verifyLogout(){
        System.out.println("Reached");
    }
}