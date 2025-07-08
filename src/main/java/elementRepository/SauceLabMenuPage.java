package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SauceLabMenuPage {

    WebDriver driver;

    public SauceLabMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    public By MenuLink1 = By.linkText("All Items");
    public By MenuLink2 = By.linkText("About");
    public By MenuLink3 = By.linkText("Logout");
    public By MenuLink4 = By.linkText("Reset App State");

    // Methods

    public void verifyMenuItems() {
        WebElement link1 = driver.findElement(MenuLink1);
        WebElement link2 = driver.findElement(MenuLink2);
        WebElement link3 = driver.findElement(MenuLink3);
        WebElement link4 = driver.findElement(MenuLink4);

        Assert.assertTrue(link1.isDisplayed() && link2.isDisplayed() && link3.isDisplayed() && link4.isDisplayed());
    }

    public void clickMenuItem(String item){
        switch (item) {
            case "All Items":
                driver.findElement(MenuLink1).click();
                break;
            case "About":
                driver.findElement(MenuLink2).click();
                break;
            default:
                System.out.println("No such option available");
        }
    }

    public void verifyPage(String page){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        switch (page) {
            case "All Items":
                String pageText1 = driver.findElement(MenuLink2).getText();
                System.out.println(pageText1);
                break;
            case "About":
                String pageText2 = driver.findElement(By.xpath("//div[@class='MuiStack-root css-1aknf2c']/div[@class='MuiBox-root css-1exdpgr']")).getText();
                System.out.println(pageText2);
                break;
            default:
                // default code block
        }
    }
}