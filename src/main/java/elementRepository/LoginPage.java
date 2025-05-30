package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
    public By successMessage2 = By.xpath("//div[@class='example']/h2");
    public By successMessage3 = By.xpath("//div[@class='example']/h4");

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
        System.out.println(successMsg);
    }

    public void verifyLandingPageMessages() {
        String expectMessage1 = "You logged into a secure area!";
        String expectMessage2 = "Secure Area";
        String expectMessage3 = "Welcome to the Secure Area. When you are done click logout below.";
        WebElement successMsg1 = driver.findElement(successMessage);
        WebElement successMsg2 = driver.findElement(successMessage2);
        WebElement successMsg3 = driver.findElement(successMessage3);
        Assert.assertTrue(successMsg1.getText().contains(expectMessage1), "wrong success message");
        Assert.assertTrue(successMsg2.getText().contains(expectMessage2), "wrong success message");
        Assert.assertTrue(successMsg3.getText().contains(expectMessage3), "wrong success message");
    }
}