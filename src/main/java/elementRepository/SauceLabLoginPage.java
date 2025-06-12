package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SauceLabLoginPage {

    WebDriver driver;

    public SauceLabLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Locators
    public By userNameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By loginButton = By.xpath("//input[@id='login-button']");
    public By loginError = By.xpath("//h3[@data-test='error']");
    public By loginErrorClose = By.xpath("//h3[@data-test='error']/button");

    // Methods

    public void openPageNew(){
        driver.get("https://www.saucedemo.com/");
    }
    public void enterSauceUsername(String name){
        driver.findElement(userNameField).sendKeys(name);
    }

    public void enterSaucePassword(String pass){
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void verifyLandingPage(){
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        String expectedHeader = "Swag Labs";
        String actualHeader = driver.findElement(By.cssSelector(".app_logo")).getText();

        Assert.assertEquals(actualURL,expectedURL);
        Assert.assertTrue(actualHeader.contains(expectedHeader));
    }

    public void verifyLoginError(){
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String loginErrorMessage = driver.findElement(loginError).getText();
        Assert.assertTrue(loginErrorMessage.contains(expectedErrorMessage));
    }

    public void closeInvalidErrorModal(){
        driver.findElement(loginErrorClose).click();
    }

    public void verifyInvalidErrorModalClose(){
        List<WebElement> elements = driver.findElements(loginError);
        boolean isDisplayed = !elements.isEmpty();
        Assert.assertFalse(isDisplayed, "Element is unexpectedly visible on the page");
    }
}