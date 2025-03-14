package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    public By usernameField = By.id("username");
    public By passwordField = By.id("password");
    public By loginButton = By.cssSelector("button[type='submit']");
    public By successMessage = By.cssSelector(".flash.success");

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public void verifyDashboard() {
        WebElement successMsg = driver.findElement(successMessage);
    }
}
